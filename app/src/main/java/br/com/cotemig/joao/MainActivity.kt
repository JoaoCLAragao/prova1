package br.com.cotemig.joao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_eua.setOnClickListener {
            calculaDolar()
        }

        btn_mexiconaousaeurodirceu.setOnClickListener {
            calculaMexicoNaoUsaEuroDirceu()
        }

        btn_rasputin.setOnClickListener {
            calculaRublo()
        }

        btn_arabia_saudita.setOnClickListener {
            calculaDirra()
        }

        btn_japao.setOnClickListener {
            calculaIene()
        }

        btn_india.setOnClickListener {
            calculaRupia()
        }

    }

    fun calculaDolar() {
        conversao_em.text = resources.getString(R.string.convers_o_em_dolar)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 0.18
        valor_moeda.text = String.format("US$ %.2f",conversao)
    }

    fun calculaMexicoNaoUsaEuroDirceu() {
        conversao_em.text = resources.getString(R.string.convers_o_em_euro)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 0.15
        valor_moeda.text = String.format("%.2f €",conversao)
    }

    fun calculaRublo() {
        conversao_em.text = resources.getString(R.string.convers_o_em_rublo)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 13.53
        valor_moeda.text = String.format("%.2f ₱",conversao)
    }

    fun calculaDirra() {
        conversao_em.text = resources.getString(R.string.convers_o_em_dirra)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 1.49
        valor_moeda.text = String.format("%.2f Dirham",conversao)
    }

    fun calculaIene() {
        conversao_em.text = resources.getString(R.string.convers_o_em_iene)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 20.30
        valor_moeda.text = String.format("¥ %.2f",conversao)
    }

    fun calculaRupia() {
        conversao_em.text = resources.getString(R.string.convers_o_em_rupia)
        var valor = e_txt_valor.text.toString().toDouble()
        var conversao = valor * 13.18540
        valor_moeda.text = String.format("%.2f INR",conversao)
    }

}