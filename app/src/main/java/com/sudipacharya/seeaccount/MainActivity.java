package com.sudipacharya.seeaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private String url1 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit1.html";
    private String url2 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit2.html";
    private String url3 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit3.html";
    private String url4 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit4.html";
    private String url5 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit5.html";
    private String url6 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit6.html";
    private String url7 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit7.html";
    private String url8 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit8.html";
    private String url9 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit9.html";
    private String url10 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit10.html";
    private String url11 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit11.html";
    private String url12 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/SEE%20Account/e1Unit12.html";


    private String title1 = "Report";
    private String title2 = "Filing";
    private String title3 = "Trade";
    private String title4 = "Financial Institution";
    private String title5 = "Trial Balance";
    private String title6 = "Final Accounts";
    private String title7 = "Government Accounting";
    private String title8 = "Journal Voucher";
    private String title9 = "Budget Sheet";
    private String title10 = "Monthly Statement";
    private String title11 = "Bank Cash Book";
    private String title12 = "Petty Cash Book";


    private InterstitialAd interstitialAd;

    String interstital1 = "";
    String interstital2 = "";
    String interstital3 = "";
    String interstital4 = "";
    String interstital5 = "";
    String interstital6 = "";
    String interstital7 = "";
    String interstital8 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("SEE Principle Of Accountancy");


        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "849230902490109_849230985823434");
        interstitialAd.loadAd();


        TextView btntxt1 = (TextView) findViewById(R.id.btntxt1);
        TextView btntxt2 = (TextView) findViewById(R.id.btntxt2);
        TextView btntxt3 = (TextView) findViewById(R.id.btntxt3);
        TextView btntxt4 = (TextView) findViewById(R.id.btntxt4);
        TextView btntxt5 = (TextView) findViewById(R.id.btntxt5);
        TextView btntxt6 = (TextView) findViewById(R.id.btntxt6);
        TextView btntxt7 = (TextView) findViewById(R.id.btntxt7);
        TextView btntxt8 = (TextView) findViewById(R.id.btntxt8);
        TextView btntxt9 = (TextView) findViewById(R.id.btntxt9);
        TextView btntxt10 = (TextView) findViewById(R.id.btntxt10);
        TextView btntxt11 = (TextView) findViewById(R.id.btntxt11);
        TextView btntxt12 = (TextView) findViewById(R.id.btntxt12);

        btntxt1.setText(title1);
        btntxt2.setText(title2);
        btntxt3.setText(title3);
        btntxt4.setText(title4);
        btntxt5.setText(title5);
        btntxt6.setText(title6);
        btntxt7.setText(title7);
        btntxt8.setText(title8);
        btntxt9.setText(title9);
        btntxt10.setText(title10);
        btntxt11.setText(title11);
        btntxt12.setText(title12);

        CardView card1 = (CardView) findViewById(R.id.card1);
        CardView card2 = (CardView) findViewById(R.id.card2);
        CardView card3 = (CardView) findViewById(R.id.card3);
        CardView card4 = (CardView) findViewById(R.id.card4);
        CardView card5 = (CardView) findViewById(R.id.card5);
        CardView card6 = (CardView) findViewById(R.id.card6);
        CardView card7 = (CardView) findViewById(R.id.card7);
        CardView card8 = (CardView) findViewById(R.id.card8);
        CardView card9 = (CardView) findViewById(R.id.card9);
        CardView card10 = (CardView) findViewById(R.id.card10);
        CardView card11 = (CardView) findViewById(R.id.card11);
        CardView card12 = (CardView) findViewById(R.id.card12);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url1);
                i.putExtra("title", title1);
                i.putExtra("ads1", interstital1);
                i.putExtra("ads2", interstital8);
                startActivity(i);

            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url2);
                i.putExtra("title", title2);
                i.putExtra("ads1", interstital2);
                i.putExtra("ads2", interstital7);
                startActivity(i);

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url3);
                i.putExtra("title", title3);
                i.putExtra("ads1", interstital3);
                i.putExtra("ads2", interstital6);
                startActivity(i);

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url4);
                i.putExtra("title", title4);
                i.putExtra("ads1", interstital4);
                i.putExtra("ads2", interstital5);
                startActivity(i);

            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url5);
                i.putExtra("title", title5);
                i.putExtra("ads1", interstital1);
                i.putExtra("ads2", interstital8);
                startActivity(i);

            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url6);
                i.putExtra("title", title6);
                i.putExtra("ads1", interstital2);
                i.putExtra("ads2", interstital7);
                startActivity(i);

            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url7);
                i.putExtra("title", title7);
                i.putExtra("ads1", interstital3);
                i.putExtra("ads2", interstital6);
                startActivity(i);

            }
        });


        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url8);
                i.putExtra("title", title8);
                i.putExtra("ads1", interstital4);
                i.putExtra("ads2", interstital5);
                startActivity(i);

            }
        });


        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url9);
                i.putExtra("title", title9);
                i.putExtra("ads1", interstital1);
                i.putExtra("ads2", interstital2);
                startActivity(i);

            }
        });


        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url10);
                i.putExtra("title", title10);
                i.putExtra("ads1", interstital3);
                i.putExtra("ads2", interstital4);
                startActivity(i);
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url11);
                i.putExtra("title", title11);
                i.putExtra("ads1", interstital5);
                i.putExtra("ads2", interstital6);
                startActivity(i);

            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Webview.class);
                i.putExtra("epuzzle", url12);
                i.putExtra("title", title12);
                i.putExtra("ads1", interstital7);
                i.putExtra("ads2", interstital8);
                startActivity(i);

            }
        });


    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()) {
            interstitialAd.show();
        }
        super.onBackPressed();
    }
}