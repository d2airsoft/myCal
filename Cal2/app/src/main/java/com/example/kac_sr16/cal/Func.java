package com.example.kac_sr16.cal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;


public class Func extends ActionBarActivity {

    private TextView display;

    Button buttonLn, buttonLog, buttonPi, buttonFa, button4, button5, button6, button7, button9, button8, buttonDecimal;
    Button buttonTan, buttonCos, buttonSin, buttonSquareRoot, buttonPower, buttonMod, buttonfuc, buttonClear, buttonE;

    double currentNum = 0;
    double total = 0;
    double saveNum = 0;

    boolean isPressed = false;
    boolean powerPressed=false;
    boolean piPressed=false;
    String saveOperator = ("");
    String currentOperator = ("");

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        currentNum = intent.getDoubleExtra("currentNum", 0.0);
        saveNum = intent.getDoubleExtra("saveNum", 0.0);
        total = intent.getDoubleExtra("total", 0.0);
        powerPressed=intent.getBooleanExtra("powerPressed", false);
        saveOperator=intent.getStringExtra("saveOperator");
        piPressed=intent.getBooleanExtra("piPressed", false);
        isPressed = intent.getBooleanExtra("isPressed", false);

        display = (TextView) findViewById(R.id.textView2);

        display.setText(String.valueOf(total));

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // System.out.print("fuck");
                display.setText("0");
                currentNum = 0;
                saveNum = 0;
                isPressed = false;

                total = 0;
                saveOperator = ("");
                piPressed =false;
                powerPressed=false;
            }
        });

        buttonfuc = (Button) findViewById(R.id.buttonFunction);
        buttonfuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Func.this, MainActivity.class);

                intent2.putExtra("currentNum", currentNum);
                intent2.putExtra("saveNum", saveNum);
                //intent2.putExtra("saveOperator",saveOperator);
                intent2.putExtra("total", total);
                intent2.putExtra("isPressed", isPressed);
                intent2.putExtra("powerPressed",powerPressed);
                intent2.putExtra("piPressed",piPressed);
                intent2.putExtra("saveOperator", saveOperator);

                startActivity(intent2);


            }
        });


        buttonTan = (Button) findViewById(R.id.buttonTangent);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.tan(currentNum);
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));


            }
        });
        buttonSin = (Button) findViewById(R.id.buttonSine);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.sin(currentNum);
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));


            }
        });


        buttonCos = (Button) findViewById(R.id.buttonCosine);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.cos(currentNum);
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));




            }
        });


        buttonSquareRoot = (Button) findViewById(R.id.buttonSquareRoot);
        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.sqrt(currentNum);
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));



            }
        });

        buttonPower = (Button) findViewById(R.id.buttonPower);
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               powerPressed =true;
                currentNum = Double.parseDouble(display.getText().toString());
                 saveNum=currentNum;
                isPressed=false;



            }
        });

        buttonLn = (Button) findViewById(R.id.buttonLn);
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = (Math.log1p(currentNum));
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));



            }
        });

        buttonMod = (Button) findViewById(R.id.buttonMod);
        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        buttonLog = (Button) findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.log(currentNum) ;
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));



            }
        });

        buttonE = (Button) findViewById(R.id.buttonE);
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = Math.exp(currentNum) ;
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));



            }
        });

        buttonFa= (Button) findViewById(R.id.buttonFa);
        buttonFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = Double.parseDouble(display.getText().toString());

                total = fab(currentNum) ;
                saveNum = total;
                isPressed = false;
                display.setText(String.valueOf(total));



            }
        });

        buttonPi= (Button) findViewById(R.id.buttonPi);
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piPressed=true;
                display.setText(String.valueOf(3.141592653));
                currentNum = Double.parseDouble(display.getText().toString());


                isPressed = false;



            }
        });




    }

    public double fab(double num) {

       if (num==1){
           return 1;
       }

        else {

           return num * fab(num-1);
       }



}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_func, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
