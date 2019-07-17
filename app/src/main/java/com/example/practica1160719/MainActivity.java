package com.example.practica1160719;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv8,tv9,tv7;
    EditText et1,et2,et3;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv7=(TextView)findViewById(R.id.TV7);
        tv8=(TextView)findViewById(R.id.TV8);
        tv9=(TextView)findViewById(R.id.TV9);
        et1=(EditText) findViewById(R.id.ET1);
        et2=(EditText) findViewById(R.id.ET2);
        et3=(EditText) findViewById(R.id.ET3);
    }
    public void ordenar(View view) {
        int a, b, c, d, e, f, aux;

        a = Integer.parseInt(et1.getText().toString());
        b = Integer.parseInt(et2.getText().toString());
        c = Integer.parseInt(et3.getText().toString());
        d = Integer.parseInt(et1.getText().toString());
        e = Integer.parseInt(et2.getText().toString());
        f = Integer.parseInt(et3.getText().toString());
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        tv7.setText("menor es" + a);
        tv8.setText("medio es" + b);
        tv9.setText("mayor es" + c);
        Toast.makeText(this, "Se ordenaron los numeros", Toast.LENGTH_LONG).show();
        if (d == e)
            Toast.makeText(this, "Hay dos elementos repetidos son 1 y 2 son iguales", Toast.LENGTH_LONG).show();
        if (e == f)
            Toast.makeText(this, "Hay dos elementos repetidos son 2 y 3 son iguales", Toast.LENGTH_LONG).show();
        if (d == f)
            Toast.makeText(this, "Hay dos elementos repetidos son 1 y 3 son iguales", Toast.LENGTH_LONG).show();
        if ((d == e) && (e == f))
            Toast.makeText(this, "Hay tres elementos repetidos son 1, 2 y 3 son iguales", Toast.LENGTH_LONG).show();
    }
}
