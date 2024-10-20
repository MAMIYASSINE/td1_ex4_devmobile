package com.example.td1_ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;  // Ajout de l'import correct

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private CheckBox checkBoxSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des composants
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        checkBoxSpace = findViewById(R.id.checkBoxSpace);
    }

    public void concat(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        if (text1.isEmpty() || text2.isEmpty()) {
            Toast.makeText(this, "Champs vides", Toast.LENGTH_SHORT).show();
        } else {
            String result = checkBoxSpace.isChecked() ? text1 + " " + text2 : text1 + text2;
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        }
    }
}
