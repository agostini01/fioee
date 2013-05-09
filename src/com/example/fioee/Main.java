package com.example.fioee;

import dados.Comodo;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity implements OnClickListener {

    private EditText editArea;
	private EditText editPerimetro;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
        
        editArea = (EditText)  findViewById(R.id.editArea);
        editPerimetro = (EditText)  findViewById(R.id.editPerimetro);
        
        Button botao = (Button) findViewById(R.id.button1);
        botao.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		Comodo comodo01 = new Comodo();
		comodo01.area = Double.parseDouble(editArea.getText().toString());
		comodo01.perimetro = Double.parseDouble(editPerimetro.getText().toString());
		Log.d("USER","Iluminação: " +comodo01.getPotenciaDeIluminacao()+"VA");
		
	}
    
}
