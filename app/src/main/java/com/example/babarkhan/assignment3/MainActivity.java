package com.example.babarkhan.assignment3;

import android.content.BroadcastReceiver;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Switch;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver broadcastReceiver;
    WifiManager wifiManager;
    Switch Airplane;
    EventBus eventBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Airplane = (Switch) findViewById(R.id.Airplane_switch);
        EventBus.getDefault().register(this);

        //CustomEvent customEvent = new CustomEvent();
        //customEvent.setaBoolean(state);
        // EventBus.getDefault().post(customEvent);
        // broadcastReceiver = new MyBroadcastReciver();
        //IntentFilter intentFilter = new IntentFilter();
        //intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        //registerReceiver(broadcastReceiver, intentFilter
    }


    @Subscribe
    public void MyCustomEvent(CustomEvent event) {
        Boolean b = event.getaBoolean();
        Airplane.setChecked(true);
    }
}
/
