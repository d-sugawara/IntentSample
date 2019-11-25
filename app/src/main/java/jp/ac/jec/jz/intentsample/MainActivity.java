package jp.ac.jec.jz.intentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /// constant ///
    public static final String TAG = "MainActivityDEBUG:";

    /// variable ///
    public Button buttonIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Log.d(TAG, "onCreate: インテント：" + intent.toString());
        Log.d(TAG, "onCreate: パッケージ名：" + intent.getPackage());
        initViews();
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
