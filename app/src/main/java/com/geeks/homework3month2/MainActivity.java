package com.geeks.homework3month2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int x,y;
    private boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*EdgeToEdge.enable(this);*/
        setContentView(R.layout.activity_main);
            /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });*/
        textView = findViewById(R.id.textView);
        initClickButton();

    }

    private void initClickButton() {

        findViewById(R.id.btn_zero).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_one).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_two).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_three).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_four).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_five).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_six).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_seven).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_eght).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_nine).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_clear).setOnClickListener(view -> {
            onNumberClick(view);
        });

        findViewById(R.id.btn_plus).setOnClickListener(view -> {
            onOperationClick(view);
        });

        findViewById(R.id.btn_minus).setOnClickListener(view -> {
            onOperationClick(view);
        });

        findViewById(R.id.btn_multiplication).setOnClickListener(view -> {
            onOperationClick(view);
        });

        findViewById(R.id.btn_division).setOnClickListener(view -> {
            onOperationClick(view);
        });

        findViewById(R.id.btn_equal).setOnClickListener(view -> {
            onOperationClick(view);

        });
    }

    private void onNumberClick (View view){
       String text = ((MaterialButton)view).getText().toString();
       if (text.equals("AC")) {
           textView.setText("0");
           x= 0;
           y = 0;
       } else if (textView.getText().toString().equals("0" ) || isOperationClick){
           textView.setText(text);
       }else {
           textView.append(text);
       }
        isOperationClick = false;
    }

    private  void onOperationClick (View view){
        if(view.getId() == R.id.btn_plus){
            x = Integer.parseInt(textView.getText().toString());
            operation = "+";
        } else if (view.getId() == R.id.btn_minus) {
            x = Integer.parseInt(textView.getText().toString());
            operation = "-";
        }else if (view.getId() == R.id.btn_multiplication) {
            x = Integer.parseInt(textView.getText().toString());
            operation = "X";
        }else if (view.getId() == R.id.btn_division ) {
            x = Integer.parseInt(textView.getText().toString());
            operation = "/";
        } else if (view.getId() == R.id.btn_equal) {
            y = Integer.parseInt(textView.getText().toString());
            int result  = 0;
            switch (operation){
                case "+":
                    result = x+y;
                    break;
                case "-":
                    result = x-y;
                    break;
                case "X":
                    result = x*y;
                    break;
                case "/":
                    result = x / y;
                    break;
            }

            textView.setText(String.valueOf(result));
        }

        isOperationClick = true;
    }


}