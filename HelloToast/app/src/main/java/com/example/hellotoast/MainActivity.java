package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variable qui stocke la valeur du compteur
    private int totalClicks = 0;

    // Référence vers le TextView qui affiche le compteur
    private TextView valueDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Lier le fichier XML à cette activité
        setContentView(R.layout.activity_main);

        // Récupérer les éléments de l'interface
        valueDisplay = findViewById(R.id.valueDisplay);
        Button btnAction = findViewById(R.id.btnAction);
        Button btnIncrement = findViewById(R.id.btnIncrement);

        // Action du bouton TOAST
        // Affiche un message temporaire à l'écran
        btnAction.setOnClickListener(v ->
                Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        );

        // Action du bouton COUNT
        // Incrémente le compteur et met à jour l'affichage
        btnIncrement.setOnClickListener(v -> {
            totalClicks++; // ajouter 1
            valueDisplay.setText(String.valueOf(totalClicks)); // afficher la valeur
        });
    }
}