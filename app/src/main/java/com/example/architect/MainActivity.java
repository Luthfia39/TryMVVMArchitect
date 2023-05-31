package com.example.architect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtWidth, edtHeight, edtLength;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWidth = findViewById(R.id.edt_width);
        edtHeight = findViewById(R.id.edt_height);
        edtLength = findViewById(R.id.edt_length);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String width = edtWidth.getText().toString();
                String height = edtHeight.getText().toString();
                String length = edtLength.getText().toString();

                if (width.isEmpty()){
                    edtWidth.setError("Kosong");
                }else if (height.isEmpty()){
                    edtWidth.setError("Kosong");
                } else if (length.isEmpty()){
                    edtWidth.setError("Kosong");
                } else{
                    calculate(width, height, length);
                }
            }
        });
    }

    // without viewmodel
    private void calculate(String width, String height, String length){
        int result = Integer.parseInt(width) * Integer.parseInt(height) * Integer.parseInt(length);
        tvResult.setText(String.valueOf(result));
    }
}