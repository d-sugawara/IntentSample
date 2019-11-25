package jp.ac.jec.jz.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import jp.ac.jec.jz.intentsample.model.LocationFinder;

public class MainActivity extends AppCompatActivity {
    /// constant ///
    public static final String TAG = "MainActivityDEBUG:";

    /// variable ///
    public Button buttonIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        Log.d(TAG, "onResume: インテント：" + intent.toString());
        Log.d(TAG, "onResume: パッケージ名：" + intent.getPackage());
        if (intent.getPackage() != null) {
            // Qmote からの起動
            // サーバに位置・時刻・デバイスIDを送信
        } else {
            // 通常起動
        }
        // 試しにLocationFinder で位置情報を取得してみる(本当は上のif文の中で行う)
        LocationFinder.getCurrentLocation(this);
    }

    private void initViews() {
        buttonIntent = findViewById(R.id.buttonIntent);
        buttonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
