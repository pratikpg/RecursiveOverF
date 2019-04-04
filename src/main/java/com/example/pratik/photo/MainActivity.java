package com.example.pratik.photo;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String CIP = null;
    public static final int imgreq=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void captureimage(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager())!= null);
        {
            File IF = null;
            try {
                IF = getIF();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(IF != null)
            {
                Uri imguri = FileProvider.getUriForFile(this,"com.example.android.fileprovider", IF);

                intent.putExtra(MediaStore.EXTRA_OUTPUT,imguri);
                startActivityForResult(intent,imgreq);

            }

        }



    }


    public void disImg(View view)
    {
        Intent intent = new Intent(this, displayimg.class);
        intent.putExtra("IF",CIP);
        startActivity(intent);
    }

    private File getIF() throws IOException {

        String timestamp = new SimpleDateFormat("yyyymmdd_HHmmss").format(new Date());
        String imagename = "jpg_"+timestamp+"_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File IF = File.createTempFile(imagename,".jpg",storageDir);
        CIP = IF.getAbsolutePath();
        Toast.makeText(MainActivity.this, ""+IF ,Toast.LENGTH_LONG).show();
        return IF;
    }
}
