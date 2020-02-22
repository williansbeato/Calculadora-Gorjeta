package com.example.calculadora_gorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

        fun cal(view : View){
            val valorConta : String = txtValorConta.text.toString()
            val gorjeta : String = txtGorjetaPorc.text.toString()


            var resul : Double

            resul = (gorjeta.toDouble() * valorConta.toDouble())

            var resulGorjeta : Double

            var divisor = 100

            resulGorjeta = (resul / divisor)

            var textGorjeta = "Gorjeta (R$): $resulGorjeta"

            oResul.setText(textGorjeta)

            var totalCont = (resulGorjeta + valorConta.toDouble())

            var textTotalConta = "Total da Conta: $totalCont"

            totalConta.setText(textTotalConta)

            val quantiPessoa : String = totalPessoas.text.toString()

            var valorPorPessoa = (totalCont / quantiPessoa.toDouble())

            var resulPessoa = " Total de $valorPorPessoa por pessoa"

            valorPessoa.setText(resulPessoa)

        }


}
