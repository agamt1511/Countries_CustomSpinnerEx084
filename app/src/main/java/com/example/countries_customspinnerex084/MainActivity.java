package com.example.countries_customspinnerex084;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView info;
    Spinner choice;
    int place;
    int[] flag = {R.drawable.empty1,R.drawable.israel, R.drawable.greece, R.drawable.belgium, R.drawable.germany, R.drawable.austrlia, R.drawable.italy,R.drawable.russia};
    String[] state = {"Country","Israel", "Greece", "Belgium", "Germany", "Australia", "Italy", "Russia"};
    String[] capital = {"","Jerusalem", "Athens", "Amsterdam", "Brussels", "Canberra", "Rome", "Moscow"};
    String [] anthem = {"","The Hope", "Hymn to Liberty", "The Brabantian", "Song of Germany", "Advance Australia Fair", "The Song of the Italians", "State Anthem of the Russian Federation"};
    String [] population = {"","9,423,740", "10,718,565", "17,653,700", "11,492,641", "25,892,000", "60,317,116", "146,171,015"};
    String [] languages = {"","Hebrew", "Greek", "Dutch, French & German", "German", "English", "Italian", "Russian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.info);
        choice =(Spinner) findViewById(R.id.choice);

        CustomAdapter adp = new CustomAdapter(this,state,capital,flag);
        choice.setAdapter(adp);
        choice.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position != 0) {
            info.setText(
                    "Country:\n" + state[position] + "\n\n" +
                            "Capital\n" + capital[position] + "\n\n" +
                            "Anthem:\n" + anthem[position] + "\n\n" +
                            "Population Size:\n" + population[position] + "\n\n" +
                            "Official languages:\n" + languages[position]
            );
        }
        if (position == 0){
            info.setText("");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}