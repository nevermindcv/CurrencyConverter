package com.example.nevermindcv.currencyconverter20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText euros, dollars, pesos, dollarscan, pound,franc, real, amount;
    Button bt1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euros = (EditText)findViewById(R.id.poundET);
        dollars = (EditText)findViewById(R.id.dollarET);
        bt1 = (Button) findViewById(R.id.convertB);
        pesos = (EditText)findViewById(R.id.pesoET);
        dollarscan = (EditText)findViewById(R.id.dollarcanET);
        pound = (EditText)findViewById(R.id.poundET);
        franc = (EditText)findViewById(R.id.francET);
        real = (EditText)findViewById(R.id.realET);
        amount = (EditText)findViewById(R.id.amountET);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoeuro=amount.getText().toString();
                Double Euro=Double.parseDouble(textoeuro);

                Double Dollars=Euro*1.24;
                String textodollars=String.valueOf(Dollars);
                dollars.setText(textodollars);

                Double Pesos = Euro*24.5;
                String textopesos= String.valueOf(Pesos);
                pesos.setText(textopesos);

                Double Dollarcan = Euro*1.56;
                String textodollarcan= String.valueOf(Dollarcan);
                dollarscan.setText(textodollarcan);

                Double Pound = Euro/1.12;
                String textopound= String.valueOf(Pound);
                pound.setText(textopound);

                Double Franc = Euro*1.15;
                String textofranc= String.valueOf(Franc);
                franc.setText(textofranc);

                Double Real = Euro*4.03;
                String textoreal= String.valueOf(Real);
                real.setText(textoreal);

            }
        });





    }
}
