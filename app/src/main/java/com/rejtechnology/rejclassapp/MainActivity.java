package com.rejtechnology.rejclassapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得控件
        WebView mw = (WebView) findViewById(R.id.myweb);
        // 调用成员函数访问网页，加载资源
        mw.loadUrl("https://rejstudios.github.io/deving.html");
        // //系统默认会通过手机浏览器打开网页，为了能够直接通过WebView显示网页，则必须设置
        mw.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 重写WebViewClient的shouldOverrideUrlLoading()方法
                //使用WebView加载显示url
                view.loadUrl(url);
                //返回true
                return true;
            }
        });

    }
}
