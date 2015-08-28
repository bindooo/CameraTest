package net.sourceforge.zbar.android.CameraTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by egerbin on 8/28/2015.
 */
public class CameraTestResult extends Activity
{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.result);

        Intent i = getIntent();
        String resultString = i.getStringExtra("extra_resultString");

        TextView resultText;

        resultText = (TextView)findViewById(R.id.resultText);
        resultText.setTextSize(20);
        resultText.setText(resultString);

    }

    public void onBackPressed(){
        Intent i = new Intent(CameraTestResult.this, CameraTestActivity.class);
        finish();
        startActivity(i);
    }

}