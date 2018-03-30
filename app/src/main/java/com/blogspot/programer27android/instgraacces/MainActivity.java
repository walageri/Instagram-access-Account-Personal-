package com.blogspot.programer27android.instgraacces;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.security.acl.AclNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void klik(View v){
        Uri uri=Uri.parse("https://www.instagram.com/gerywalageri");
        Intent Instgram=new Intent(Intent.ACTION_VIEW,uri);
        Instgram.setPackage("com.instagram.android");
        try{
            startActivity(Instgram);
        }catch (ActivityNotFoundException e){
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/gerywalageri")));
        }
    }
}
