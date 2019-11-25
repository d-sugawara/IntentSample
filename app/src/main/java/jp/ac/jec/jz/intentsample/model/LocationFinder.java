package jp.ac.jec.jz.intentsample.model;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/**
 * 現在位置の情報を取得するクラス
 * https://qiita.com/hotdrop_77/items/c8098bba9542a7898faf
 */
public class LocationFinder {

    public static Location getCurrentLocation(Activity activity) {
        FusedLocationProviderClient client = LocationServices.getFusedLocationProviderClient(activity);


    }
}
