package com.wordpress.kadekadityablog.tesku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int penjumlahan = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        display(penjumlahan);
        displayPrice(5*penjumlahan);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int price){
        TextView quantityTextView = (TextView) findViewById(R.id.idnyangka);
        quantityTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.angkayangberubah);
        quantityTextView.setText(" " + number);

    }
    public void increment(View view){
        penjumlahan = penjumlahan+1;
        display(penjumlahan);
    }

    public void decrement(View view){
        penjumlahan = penjumlahan-1;
        display(penjumlahan);
    }
}
