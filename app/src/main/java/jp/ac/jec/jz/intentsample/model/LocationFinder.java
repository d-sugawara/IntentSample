package jp.ac.jec.jz.intentsample.model;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/**
 * 現在位置の情報を取得するクラス
 * https://qiita.com/hotdrop_77/items/c8098bba9542a7898faf
 */
public class LocationFinder {
    private static final String TAG = "LocationFinder";

    public static void getCurrentLocation(Activity activity) {
        FusedLocationProviderClient client = LocationServices.getFusedLocationProviderClient(activity);
        client.getLastLocation().addOnCompleteListener(activity, new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                if (task.isSuccessful() && task.getResult() != null) {
                    // 位置情報を取得できた場合
                    Log.d(TAG, "onComplete: 緯度：" + task.getResult().getLatitude());
                    Log.d(TAG, "onComplete: 経度：" + task.getResult().getLongitude());
                    // この後、現在時刻も取得してサーバにJSONで送る

                } else {
                    // 取得に失敗した場合
                    Log.d(TAG, "onComplete: " + task.getException().getMessage());
                }
            }
        });
    }
}
