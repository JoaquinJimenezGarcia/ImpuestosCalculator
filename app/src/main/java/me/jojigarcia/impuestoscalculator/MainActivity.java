package me.jojigarcia.impuestoscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btCalculateIVA, btSubIVA;
    private EditText conceptoField;
    private TextView moneyText;
    private int saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalculateIVA = (Button) findViewById(R.id.btCalculateIVA);
        btSubIVA = (Button) findViewById(R.id.btSubIVA);
        conceptoField = (EditText) findViewById(R.id.conceptoField);
        moneyText = (TextView) findViewById(R.id.moneyText);

        moneyText.setText("0.0€");

        btCalculateIVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saldo = Integer
            }
        });
    }
}
