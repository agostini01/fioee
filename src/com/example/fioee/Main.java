package com.example.fioee;

import dados.Banheiro;
import dados.Comodo;
import dados.Cozinha;
import dados.Dormitorio;
import dados.Outros;
import dados.Varanda;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Main extends Activity implements OnClickListener {

	private EditText editArea;
	private EditText editPerimetro;
	private Button botao01;
	private RadioGroup seletorDeComodo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		editArea = (EditText) findViewById(R.id.editArea);
		editPerimetro = (EditText) findViewById(R.id.editPerimetro);

		botao01 = (Button) findViewById(R.id.button1);
		seletorDeComodo = (RadioGroup) findViewById(R.id.ComodosRadioGroup);

		botao01.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if (v == botao01) {
			Comodo comodo01;
			switch (seletorDeComodo.getCheckedRadioButtonId()) {
			default:
			case R.id.CozinhaRB:
				comodo01 = new Cozinha();				
				break;
			case R.id.DormitorioRB:
				comodo01 = new Dormitorio();
				break;
			case R.id.VarandaRB:
				comodo01 = new Varanda();
				break;
			case R.id.BanheiroRB:
				comodo01 = new Banheiro();
				break;
			case R.id.OutroRB:
				comodo01 = new Outros();
				break;					
			}
			comodo01.area = Double.parseDouble(editArea.getText().toString());
			comodo01.perimetro = Double.parseDouble(editPerimetro.getText().toString());
			Log.d("USER", comodo01.getTipo()+" - Iluminação: " + comodo01.getPotenciaDeIluminacao()+ "VA - No de Tomadas:" + comodo01.getTug());
			
		}

	}
}
