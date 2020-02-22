package com.example.calculadora_gorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.net.Authenticator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

        fun cal(view : View){


            val valorConta : String = txtValorConta.text.toString()
            val gorjeta : String = txtGorjetaPorc.text.toString()
            val quantiPessoa : String = totalPessoas.text.toString()


            if(TextUtils.isEmpty(valorConta) or TextUtils.isEmpty(gorjeta) or TextUtils.isEmpty(quantiPessoa) ){

                txtValorConta.error = "Campo Obrigatorio"
                txtGorjetaPorc.error = "Campo Obrigatorio"
                totalPessoas.error = "Campo Obrigatorio"
            }
            else{

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

                var valorPorPessoa : Double = (totalCont / quantiPessoa.toDouble())

                var resulPessoa = " Total de R$ $valorPorPessoa por pessoa"

                valorPessoa.setText(resulPessoa)

            }

        }

}
