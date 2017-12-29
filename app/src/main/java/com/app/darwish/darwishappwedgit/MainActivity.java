package com.app.darwish.darwishappwedgit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;

import static android.provider.MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
       //create new Intent
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);


        // start the Video Capture Intent
        //startActivity(intent);


    }

    @Override
    protected void onResume() {
        super.onResume();
       /// startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE),100);
    }


}
