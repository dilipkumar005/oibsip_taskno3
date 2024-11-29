package com.dk.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btndivide, btnmultiply, btnminus, btnplus, btnpercent, btndot;
    Button btnequal, btnac, btnc;
    TextView inputtxt,outputtxt;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputtxt = findViewById(R.id.inputtxt);
        outputtxt = findViewById(R.id.outputtxt);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btndivide = findViewById(R.id.btndivide);
        btnmultiply = findViewById(R.id.btnmultiply);
        btnminus = findViewById(R.id.btnminus);
        btnplus = findViewById(R.id.btnplus);
        btnpercent = findViewById(R.id.btnpercent);
        btndot = findViewById(R.id.btndot);

        btnc = findViewById(R.id.btnc);
        btnac = findViewById(R.id.btnac);
        btnequal = findViewById(R.id.btnequal);



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                inputtxt.setText(data+"9");
            }
        });


        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + "+");
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + "-"); }
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + "×");
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + "÷");
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + ".");
                }
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();
                if (data.isEmpty() || !isLastCharacterSymbol(data)) {
                    inputtxt.setText(data + "%");
                }
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtxt.setText("");
                outputtxt.setText("");

            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = inputtxt.getText().toString();
                if (data.length() > 0) {
                    data = data.substring(0, data.length() - 1);
                    inputtxt.setText(data);
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtxt.getText().toString();

                // Toast.makeText(MainActivity.this,  "" +data, Toast.LENGTH_SHORT).show();
                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult="";

                Scriptable scriptable=rhino.initSafeStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data, "Javascript",1,null).toString();

                outputtxt.setText(finalResult);

            }
        });


    }
    private boolean isLastCharacterSymbol(String data) {
        if (data.isEmpty()) {
            return false;
        }
        char lastChar = data.charAt(data.length() - 1);
        return lastChar == '-' || lastChar == '+' || lastChar == '×' || lastChar == '÷' || lastChar == '%';
    }
}