package com.sudipacharya.seeaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

import java.util.ArrayList;

public class Webview extends AppCompatActivity {

    WebView webView;
    private InterstitialAd interstitialAd,interstitialAd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");
        String titleweb = intent.getExtras().getString("title");
        String interstitals1 = intent.getExtras().getString("ads1");
        String interstitals2 = intent.getExtras().getString("ads2");

        getSupportActionBar().setTitle(titleweb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, interstitals1);
        interstitialAd.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, interstitals2);
        interstitialAd1.loadAd();


        webView = (WebView) this.findViewById(R.id.webview);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCachePath(Webview.this.getCacheDir().getPath());
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(easyPuzzle);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error){
                //Your code to do
                ImageView imageView = findViewById(R.id.noconnect);

                imageView.setVisibility(View.VISIBLE);
                Toast.makeText(Webview.this, "!!!Problem in Your Internet Connection!! " , Toast.LENGTH_LONG).show();
            }
        });

        if (interstitialAd1.isAdLoaded()){
            interstitialAd1.show();
        }

    }



    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }

}