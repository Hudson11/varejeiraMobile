package com.varejeira.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    private Button entrar;

    private EditText nomeUsuario;
    private EditText senhaUsuario;

    private TextView criarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.entrar = findViewById(R.id.entrar);

        this.nomeUsuario = findViewById(R.id.nomeusuario);
        this.senhaUsuario = findViewById(R.id.senhausuario);

        this.criarConta = findViewById(R.id.criarconta);

        // Button Entrar onCLick
        this.entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Button criar conta
        this.criarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    // optional criar método para autenticação....
}
