package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleBroadband:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_TIME_TICK == intent?.action) {
            Toast.makeText(context, "Time Update", Toast.LENGTH_SHORT).show()
        }else if (ConnectivityManager.CONNECTIVITY_ACTION == intent?.action) {
            val booleanExtra = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false)

            if (booleanExtra) {
                Toast.makeText(context, " Internet Connected", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(context, " Internet Disconnected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}