package com.app.darwish.darwishappwedgit;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.RemoteViews;

/**
 * Created by Darwish on 12/24/2017.
 */

public class AppWedgitHome extends AppWidgetProvider {
    private Button camera,gallary,vedio;
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int N = appWidgetIds.length;

        // Perform this loop procedure for each App Widget that belongs to this provider
        for (int i=0; i<N; i++) {
            int appWidgetId = appWidgetIds[i];

            // Create an Intent to launch ExampleActivity
            Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            /*******************************pendin intent for gallary*************************************/
            Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            PendingIntent pendingIntent2 = PendingIntent.getActivity(context, 0, intent2, 0);
            /**********************************vedio mediaplayer*****************/
            Intent intent3 = new Intent();
            PendingIntent pendingIntent3 = PendingIntent.getActivity(context, 0, intent3, 0);



            // Get the layout for the App Widget and attach an on-click listener
            // to the button
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.example_appwidget);
            views.setOnClickPendingIntent(R.id.vedio , pendingIntent);
            views.setOnClickPendingIntent(R.id.camera , pendingIntent2);



            // Tell the AppWidgetManager to perform an update on the current app widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds);

    }
}
