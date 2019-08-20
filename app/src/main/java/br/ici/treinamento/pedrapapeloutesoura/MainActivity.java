package br.ici.treinamento.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada(0);
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada(1);

    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada(2);

    }

    public void opcaoSelecionada(int escolhaUsuario){

        ImageView imageResultado = (ImageView) findViewById(R.id.imageResultado);
        TextView textResultado = (TextView) findViewById(R.id.textResultado);
        Integer numero = new Random().nextInt(3);
        Integer escolhaApp = numero;

        switch (escolhaApp){

            case 0:
                imageResultado.setImageResource(R.drawable.pedra);
            break;
            case 1:
                imageResultado.setImageResource(R.drawable.papel);
            break;
            case 2:
                imageResultado.setImageResource(R.drawable.tesoura);
            break;
        }

        if((escolhaUsuario==0 && escolhaApp ==2) || (escolhaUsuario==1 && escolhaApp==0) || (escolhaUsuario==2 && escolhaApp==1) ){
            textResultado.setText("Você Venceu!");
        }else if ((escolhaUsuario==2 && escolhaApp ==0) || (escolhaUsuario==0 && escolhaApp==1) || (escolhaUsuario==1 && escolhaApp==2)){
            textResultado.setText("Você Perdeu!");
        }else{
            textResultado.setText("Empatamos!");        }

        Toast.makeText(MainActivity.this, "jogue novamente !!", Toast.LENGTH_SHORT).show();
    }
}
