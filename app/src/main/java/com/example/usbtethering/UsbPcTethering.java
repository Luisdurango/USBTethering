package com.example.usbtethering;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;



public class UsbPcTethering {


private Context context;
private static final String USB_TETHERING_ACTION = "com.android.server.connectivity.UsbTethering.action.TETHER_STATE_CHANGED";
private static final String USB_TETHERING_EXTRA_ACTIVE = "active";

public UsbPcTethering(Context context){
    this.context = context;
}

public void enableTethering(){
    Intent usbTetherIntent = new Intent();
    usbTetherIntent.setAction(USB_TETHERING_ACTION);
    usbTetherIntent.putExtra(USB_TETHERING_EXTRA_ACTIVE, true);
    context.sendBroadcast(usbTetherIntent);

}
}
