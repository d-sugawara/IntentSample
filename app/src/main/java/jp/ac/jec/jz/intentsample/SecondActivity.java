package jp.ac.jec.jz.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import jp.ac.jec.jz.intentsample.model.LocationFinder;

/**
 * 2つ目の画面
 * お試し画面なので気にしない
 */
public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivityDEBUG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        Log.d(TAG, "onResume: インテント：" + intent.toString());
        Log.d(TAG, "onResume: パッケージ名：" + intent.getPackage());

    }
}
