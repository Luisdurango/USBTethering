package com.example.usbtethering;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

public void onEnableTetheringClicked(View view){
    UsbPcTethering usbPcTethering = new UsbPcTethering(this);
    usbPcTethering.enableTethering();
}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}