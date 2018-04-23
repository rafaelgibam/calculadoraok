package br.com.desdev.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {
    var valor1 : Double = 0.0
    var valor2 : Double = 0.0
    var total : Double = 0.0

    lateinit var operador : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        telavalor.setText("")

        limparc.setOnClickListener{
            var txttela = telavalor.text.toString()
            if(txttela.length > 0){
                telavalor.setText(txttela.substring(0,txttela.length - 1))
            }
        }

        limparce.setOnClickListener {
            telavalor.setText("")
        }

        /**********************************************************************************
         *  Chamada de Valor do botão
         **********************************************************************************/

        um.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + um.text.toString())
        }

        dois.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + dois.text.toString())
        }

        tres.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + tres.text.toString())
        }

        quatro.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + quatro.text.toString())
        }

        cinco.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + cinco.text.toString())
        }

        seis.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + seis.text.toString())
        }

        sete.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + sete.text.toString())
        }

        oito.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + oito.text.toString())
        }

        nove.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + nove.text.toString())
        }

        zero.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + zero.text.toString())
        }

        ponto.setOnClickListener{
            telavalor.setText(telavalor.text.toString() + ponto.text.toString())
        }

        /**********************************************************************************
         *  Chamada de Operador do Botão
         **********************************************************************************/

        igual.setOnClickListener{
            //Segundo valor que foi pego da calculadora
            this.valor2 = telavalor.text.toString().toDouble()

            //Teste para conta de somar
            if(operador.equals("+")){
                this.total = this.valor1 + this.valor2 // faz a operação de soma e retorna o valor em total
                telavalor.setText(total.toString()) // atribui valor final a telavalor : TextView

            // Teste para conta de multiplicar
            }else if(operador.equals("*")){
                this.total = this.valor1 * this.valor2 // faz a operação de multiplicação e retorna o valor em total
                telavalor.setText(this.total.toString()) // atribui valor final a telavalor : TextView

            // Teste para conta de dividir
            }else if(operador.equals("/")){
                this.total = this.valor1 / this.valor2 // faz a operação de dividir e retorna o valor em total
                telavalor.setText(this.total.toString()) // atribui valor final a telavalor : TextView

            // Teste para conta de potencia
            }else if(operador.equals("p")){
                this.total = pow(this.valor1, this.valor2) // faz a operação de potencia e retorna o valor em total
                telavalor.setText(this.total.toString()) // atribui valor final a telavalor : TextView

            // Teste para conta subtração
            }else{
                this.total = this.valor1 - this.valor2  // faz a operação de subtração e retorna o valor em total
                telavalor.setText(total.toString())  // atribui valor final a telavalor : TextView
            }
        }

        soma.setOnClickListener{
            this.valor1 = telavalor.text.toString().toDouble()
            telavalor.setText("")
            operador = "+"
        }

        menos.setOnClickListener{
            this.valor1 = telavalor.text.toString().toDouble()
            telavalor.setText("")
            operador = "-"
        }

        vezes.setOnClickListener{
            this.valor1 = telavalor.text.toString().toDouble()
            telavalor.setText("")
            operador = "*"
        }

        dividir.setOnClickListener{
            this.valor1 = telavalor.text.toString().toDouble()
            telavalor.setText("")
            operador = "/"
        }

        raiz.setOnClickListener{
            this.valor1 = sqrt(telavalor.text.toString().toDouble())
            telavalor.setText(this.valor1.toString())
            operador = "r"
        }

        potencia.setOnClickListener{
            this.valor1 = telavalor.text.toString().toDouble()
            telavalor.setText("")
            operador = "p"
        }

    }

}
