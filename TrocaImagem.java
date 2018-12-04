// Pedro Henrique Fortunato Silva Mariano

package com.example.pedroMariano.trocaimg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgOne;
    private int[] imagens= {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgOne=findViewById(R.id.imgOne);
    }

    public void trocarImagem(View view){

        Random random= new Random();

        imgOne.setImageResource(imagens[random.nextInt(5)]);
    }
}