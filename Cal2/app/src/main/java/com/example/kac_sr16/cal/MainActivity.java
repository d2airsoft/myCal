package com.example.kac_sr16.cal;

import android.support.v7.app.ActionBarActivity;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.*;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {
    private TextView display;
    String show;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button9, button8, buttonDecimal;
    Button buttonClear, buttonAdd, buttonSub, buttonDiv, buttonMult, buttonEqual, buttonFuc;
    double currentNum = 0;
    double total = 0;
    double saveNum = 0;

    boolean isPressed = false;
    boolean powerPressed=false;
    boolean piPressed=false;
    String saveOperator = "";
    String currentOperator="";
    boolean equalPressed=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.textView1);
//        final DecimalFormat dFormat = new DecimalFormat();
//        dFormat.setMaximumIntegerDigits(11);
//        dFormat.setMinimumFractionDigits(1);
          Intent intent=getIntent();
         currentNum=intent.getDoubleExtra("currentNum", 0.0);
        saveNum=intent.getDoubleExtra("saveNum", 0.0);
        total=intent.getDoubleExtra("total", 0.0);
       if (intent.getStringExtra("saveOperator")==null){

       }
        else
           saveOperator=intent.getStringExtra("saveOperator");

        isPressed=intent.getBooleanExtra("isPressed", false);
        powerPressed=intent.getBooleanExtra("powerPressed", false);
        piPressed=intent.getBooleanExtra("piPressed", false);


        //saveOperator=intent.getStringExtra("saveOperator");



     if(piPressed){
         display.setText(String.valueOf(currentNum));

     }
         else {
         display.setText(String.valueOf(total));
     }

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false) {
                    display.setText("0");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        if (display.getText().toString().startsWith("0"))
                            display.append("");
                        else
                            display.append("0");
                    }
                }
            }

        });


        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("1");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("1");
                    }
                }

            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("2");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("2");
                    }
                }
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("3");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("3");
                    }
                }

            }

        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("4");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("4");
                    }
                }
            }

        });


        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("5");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("5");
                    }
                }
            }

        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("6");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("6");
                    }
                }
            }
        });


        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("7");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("7");
                    }
                }
            }

        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("8");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("8");
                    }
                }
            }


        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    display.setText("9");
                    isPressed = true;
                } else {
                    if (display.length() > 12) {
                    } else {
                        display.append("9");
                    }
                }
            }
        });

        buttonDecimal = (Button) findViewById(R.id.buttonDecimalPoint);
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPressed == false || display.getText().toString().startsWith("0")) {
                    if (!display.getText().toString().contains(".")) {
                        display.setText("0.");
                        isPressed = true;
                    }
                } else {
                    if (display.getText().toString().contains(".")) {


                    } else {
                        display.append(".");

                    }
                }
            }
        });

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
                equalPressed=false;

            }
        });




        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation(saveOperator);
                saveOperator ="+";

            }
        });

        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(saveOperator);
                saveOperator = ("-");


            }
        });

        buttonMult = (Button) findViewById(R.id.buttonMultiply);
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(saveOperator);

                saveOperator = ("x");

            }
        });

        buttonDiv= (Button) findViewById(R.id.buttonDivide);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation(saveOperator);
                saveOperator = ("Div");



            }
        });

        buttonEqual= (Button) findViewById(R.id.buttonEquals);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation(saveOperator);

                isPressed = false;
                piPressed =false;
                powerPressed=false;
                equalPressed=true;
                display.setText(String.valueOf(total));
                saveNum = total;

            }
        });
        buttonFuc= (Button) findViewById(R.id.buttonFunction);
        buttonFuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, Func.class);

                intent2.putExtra("currentNum",currentNum);
                intent2.putExtra("saveNum",saveNum);
                intent2.putExtra("total",total);
                intent2.putExtra("isPressed",isPressed);
                intent2.putExtra("powerPressed",powerPressed);
                intent2.putExtra("piPressed",piPressed);
                intent2.putExtra("saveOperator", saveOperator);
                startActivity(intent2);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void operation(String saveOperator) {

           if( equalPressed){
               isPressed = false;
                equalPressed=false;
           }

        else {
               if (powerPressed) {
                   currentNum = Double.parseDouble(display.getText().toString());
                   total = Math.pow(saveNum, currentNum);
                   saveNum = total;
                   isPressed = false;
                   display.setText(String.valueOf(total));
                   powerPressed = true;

               } else if (saveOperator.equalsIgnoreCase("+")) {
                   currentNum = Double.parseDouble(display.getText().toString());
                   total = saveNum + currentNum;
                   saveNum = total;
                   isPressed = false;
                   display.setText(String.valueOf(total));


               } else if (saveOperator.equalsIgnoreCase("-")) {
                   currentNum = Double.parseDouble(display.getText().toString());
                   total = saveNum - currentNum;
                   saveNum = total;
                   isPressed = false;
                   display.setText(String.valueOf(total));


               } else if (saveOperator.equalsIgnoreCase("x")) {
                   currentNum = Double.parseDouble(display.getText().toString());

                   total = currentNum * saveNum;
                   saveNum = total;
                   isPressed = false;
                   display.setText(String.valueOf(total));


               } else if (saveOperator.equalsIgnoreCase("Div")) {
                   currentNum = Double.parseDouble(display.getText().toString());
                   if (currentNum != 0) {
                       total = saveNum / currentNum;
                       saveNum = total;
                       isPressed = false;
                       display.setText(String.valueOf(total));
                   } else {

                       display.setText("Undefined");
                       currentNum = 0;
                       saveNum = 0;
                       isPressed = false;
                       total = 0;
                       saveOperator = ("");
                       currentOperator = ("");

                   }


               } else if (saveOperator.equalsIgnoreCase("")) {
                   currentNum = Double.parseDouble(display.getText().toString());

                   total = currentNum;
                   saveNum = total;
                   isPressed = false;
                   display.setText(String.valueOf(total));


               }
           }
    }

}