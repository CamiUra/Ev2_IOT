package com.example.ev2_iot_camila_diaz;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductList extends AppCompatActivity {
    private Products products;
    TextView txtProd3, txtPrice3, txtCant3, txtDesc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        products = (Products) getIntent().getSerializableExtra("Producto");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtProd3 = findViewById(R.id.txtProd3);
        txtCant3 = findViewById(R.id.txtCant3);
        txtPrice3 = findViewById(R.id.txtPrice3);
        txtDesc3 = findViewById(R.id.txtDesc3);


        if (products != null){
            txtProd3.setText(products.getName());
            txtCant3.setText(String.valueOf(products.getQuantity()));
            txtPrice3.setText(String.valueOf(products.getPrice()));
            txtDesc3.setText(products.getDesc());
        } else {
            txtProd3.setText("Sin datos");
            txtCant3.setText("Sin datos");
            txtPrice3.setText("Sin datos");
            txtDesc3.setText("Sin datos");
        }

    }
}