package com.example.indiapaytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ipay.ctsaar.helpers.mChequeScan;

public class IndiaPayScanActivity extends AppCompatActivity {

    private Button btnScanCheque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_pay_scan);
        btnScanCheque = findViewById(R.id.scan_cheque_button);
        btnScanCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChequeScan clsScan = new mChequeScan();
                clsScan.ScanCheque(IndiaPayScanActivity.this, "101", "KboltUser", "BALIC", "Hyd", "f736ghdbgdye41", "B5060-D2B5-974AB-B116-232D-CC9D0", "testIMEI", "testOS", "testAPKVer", "108", "", "309621010", "1000", "29/11/2021");
            }
        });
    }
}