package com.example.ev2_iot_camila_diaz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText etxtName, etxtPrice, etxtQuantity, etxtDesc;
    MaterialButton btnCommit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtName = findViewById(R.id.etxtName);
        etxtPrice = findViewById(R.id.etxtPrice);
        etxtQuantity = findViewById(R.id.etxtQuantity);
        etxtDesc = findViewById(R.id.etxtDesc);

        btnCommit = findViewById(R.id.btnCommit);

    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etxtName.getText().toString();
                int price = Integer.parseInt(etxtPrice.getText().toString());
                int cantid = Integer.parseInt(etxtQuantity.getText().toString());
                String desc = etxtDesc.getText().toString();

                Products products = new Products(name, price, cantid, desc);
                Intent intent = new Intent(MainActivity.this, ProductList.class);
                intent.putExtra("Producto", products);
                startActivity(intent);
            }
        });

    }
}