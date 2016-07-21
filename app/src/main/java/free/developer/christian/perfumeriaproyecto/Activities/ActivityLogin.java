package free.developer.christian.perfumeriaproyecto.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import free.developer.christian.perfumeriaproyecto.R;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener {

    private Button Ingresar;
    private Button IngresarFacebook;
    private EditText Correo;
    private EditText Contrasena;
    private TextView RecordarContrasena;
    private TextView RegistrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmento_login);

        Ingresar = (Button) findViewById(R.id.btnIngresar);
        IngresarFacebook = (Button) findViewById(R.id.btnFacebook);
        Correo = (EditText)findViewById(R.id.Email);
        Contrasena = (EditText)findViewById(R.id.Contrasena);
        RecordarContrasena = (TextView)findViewById(R.id.txtOlvidarContrasena);
        RegistrarUsuario = (TextView)findViewById(R.id.txtCrearCuentas);

        Ingresar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if(view == Ingresar){
            Intent intent = new Intent(ActivityLogin.this,MainActivity.class);
            startActivity(intent);
        }

    }
}
