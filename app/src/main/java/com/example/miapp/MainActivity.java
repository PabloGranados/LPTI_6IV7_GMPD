package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mat1, mat2, mat3, mat4, mat5, mat6, mat7, mat8, mat9, mat10, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();

        mat1=(EditText)findViewById(R.id.txt1);
        mat2=(EditText)findViewById(R.id.txt2);
        mat3=(EditText)findViewById(R.id.txt3);
        mat4=(EditText)findViewById(R.id.txt4);
        mat5=(EditText)findViewById(R.id.txt5);
        mat6=(EditText)findViewById(R.id.txt6);
        mat7=(EditText)findViewById(R.id.txt7);
        mat8=(EditText)findViewById(R.id.txt8);
        mat9=(EditText)findViewById(R.id.txt9);
        mat10=(EditText)findViewById(R.id.txt10);
        res=(EditText)findViewById(R.id.prom);

    }

    public Void promedio(View view){

        String materia1=mat1.getText().toString();
        String materia2=mat2.getText().toString();
        String materia3=mat3.getText().toString();
        String materia4=mat4.getText().toString();
        String materia5=mat5.getText().toString();
        String materia6=mat6.getText().toString();
        String materia7=mat7.getText().toString();
        String materia8=mat8.getText().toString();
        String materia9=mat9.getText().toString();
        String materia10=mat10.getText().toString();


        double mate1-Double.parseDouble(materia1);
        double mate2-Double.parseDouble(materia2);
        double mate3-Double.parseDouble(materia3);
        double mate4-Double.parseDouble(materia4);
        double mate5-Double.parseDouble(materia5);
        double mate6-Double.parseDouble(materia6);
        double mate7-Double.parseDouble(materia7);
        double mate8-Double.parseDouble(materia8);
        double mate9-Double.parseDouble(materia9);
        double mate10-Double.parseDouble(materia10);

        double promedio=(mate1+mate2+mate3+mate4+mate5+mate6+mate7+mate8+mate9+mate10)/10;

        resu.setText(promedio);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();

    }
}