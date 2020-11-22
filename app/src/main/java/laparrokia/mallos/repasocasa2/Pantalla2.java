package laparrokia.mallos.repasocasa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        Button btn = findViewById(R.id.act_pant2_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarDeActivity();
            }
        });


        Button btnLst = findViewById(R.id.act_pant2_btnLst);
        btnLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarALista();
            }
        });
    }

    private void cambiarALista() {
        Intent intent2 = new Intent(this, AdaterActivity.class);
        startActivity(intent2);
    }

    private void cambiarDeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}