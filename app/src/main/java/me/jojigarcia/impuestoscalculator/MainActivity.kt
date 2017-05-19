package me.jojigarcia.impuestoscalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var btCalculateIVA: Button? = null
    private var btSubIVA: Button? = null
    private var conceptoField: EditText? = null
    private var moneyText: TextView? = null
    private var saldo: Double = 0.0
    private var saldoIntroducido: Double = 0.0
    private var IVA: Double = 0.79

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalculateIVA = findViewById(R.id.btCalculateIVA) as Button
        btSubIVA = findViewById(R.id.btSubIVA) as Button
        conceptoField = findViewById(R.id.conceptoField) as EditText
        moneyText = findViewById(R.id.moneyText) as TextView

        moneyText!!.text = "0.0€"
        saldoIntroducido = java.lang.Double.parseDouble(conceptoField.toString())

        btCalculateIVA!!.setOnClickListener {
            saldo = saldoIntroducido / IVA
            moneyText!!.text = saldo.toString()
        }
    }
}
