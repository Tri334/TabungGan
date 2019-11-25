package com.example.tabungangan;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import android.os.Bundle;

public class Wishlist extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private TextView tvDateResult;
    private Button btDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy" , Locale.US);
        tvDateResult = (TextView) findViewById(R.id.startDateT);
        btDatePicker = (Button) findViewById(R.id.startDate);
        btDatePicker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showDateDialog();
            }
        });

    }


private void showDateDialog(){

    //Get Tanggal sekarang
    Calendar newCalendar = Calendar.getInstance();

    //initiasi DatePicker dialog

}}
