package com.bernal.gilberto.obd_example;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.UUID;

public class obdConnect extends AppCompatActivity {

    private static final String TAG = "zeoconnect";
    private ByteBuffer localByteBuffer;
    private InputStream in;
    byte[] arrayOfByte = new byte[4096];
    int bytes;


    public BluetoothDevice mDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obd_connect);

        try {
            //setup();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
        } //catch (Exception e) {
            // TODO Auto-generated catch block
           //e.printStackTrace();
        }
    }
/*
    private void setup() throws ZeoMessageException, ZeoMessageParseException  {
        // TODO Auto-generated method stub

        getApplicationContext().registerReceiver(receiver,
                new IntentFilter(BluetoothDevice.ACTION_ACL_CONNECTED));
        getApplicationContext().registerReceiver(receiver,
                new IntentFilter(BluetoothDevice.ACTION_ACL_DISCONNECTED));

        BluetoothDevice zee = BluetoothAdapter.getDefaultAdapter().
                getRemoteDevice("**:**:**:**:**:**");// add device mac adress

        try {
            sock = zee.createRfcommSocketToServiceRecord(
                    UUID.fromString("*******************")); // use unique UUID
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        Log.d(TAG, "++++ Connecting");
        try {
            sock.connect();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Log.d(TAG, "++++ Connected");


        try {
            in = sock.getInputStream();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        Log.d(TAG, "++++ Listening...");

        while (true) {

            try {
                bytes = in.read(arrayOfByte);
                Log.d(TAG, "++++ Read "+ bytes +" bytes");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            Log.d(TAG, "++++ Done: test()");

        }}




    private static final LogBroadcastReceiver receiver = new LogBroadcastReceiver();
    public static class LogBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent) {
            Log.d("ZeoReceiver", paramAnonymousIntent.toString());
            Bundle extras = paramAnonymousIntent.getExtras();
            for (String k : extras.keySet()) {
                Log.d("ZeoReceiver", "    Extra: "+ extras.get(k).toString());
            }
        }


    };

    private BluetoothSocket sock;
    @Override
    public void onDestroy() {
        getApplicationContext().unregisterReceiver(receiver);
        if (sock != null) {
            try {
                sock.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        super.onDestroy();
    }
    } }  */
