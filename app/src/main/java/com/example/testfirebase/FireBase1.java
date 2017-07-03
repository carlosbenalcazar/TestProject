package com.example.testfirebase;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by desarrollo on 5/5/2017.
 */

public class FireBase1 extends FirebaseInstanceIdService {
    private static final String TAG = "MyActivity";
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken);
        // Write a message to the database

        //DatabaseReference myRef = database.getReference("users");
        //myRef.child("1").child("id").setValue(refreshedToken);

    }
}
