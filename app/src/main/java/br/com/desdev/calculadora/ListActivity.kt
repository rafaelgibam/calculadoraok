package br.com.desdev.calculadora

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import br.com.desdev.calculadora.R.id.list_view
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        var menu = listOf("Calculadora", "Jogo Cara ou Coroa", "Sons dos Animais", "Lista dos Signos")

            list_view.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, menu)


        list_view.setOnItemClickListener { parent, view, position, id ->
            if(position == 0){
                var it = Intent(this, MainActivity::class.java)
                startActivity(it)
            }
        }
    }
}
