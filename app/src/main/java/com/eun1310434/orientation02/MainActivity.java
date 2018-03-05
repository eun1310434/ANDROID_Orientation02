/**
 * 05.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) Do it android programming
 */

package com.eun1310434.orientation02;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log = (TextView) findViewById(R.id.log);
        printLog("onCreate");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            printLog("orientation : LANDSCAPE");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            printLog("orientation : PORTRAIT");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        printLog("onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        printLog("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printLog("onDestroy()");
    }

    public void printLog(String logStr) {
        log.append(logStr+"\n");
    }

}
