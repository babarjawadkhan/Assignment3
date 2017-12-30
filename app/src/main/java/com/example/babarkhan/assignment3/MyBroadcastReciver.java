package com.example.babarkhan.assignment3;

import android.content.Context;
import android.content.Intent;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by Babar KHan on 12/12/2017.
 */

class MyBroadcastReciver extends android.content.BroadcastReceiver {
    boolean b;
    Switch aSwitch;

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Broadcast triger ", Toast.LENGTH_SHORT).show();

    }

}
