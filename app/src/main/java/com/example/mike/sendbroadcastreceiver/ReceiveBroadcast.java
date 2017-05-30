package com.example.mike.sendbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

//look for reciever in android manifest
//create intent filter and action name
//paste key made in other app for this app to listen specifically for that one

public class ReceiveBroadcast extends BroadcastReceiver {
    public ReceiveBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //creates a little popup
        Toast.makeText(context, "Broadcast has been received!", Toast.LENGTH_LONG).show();
    }
}
