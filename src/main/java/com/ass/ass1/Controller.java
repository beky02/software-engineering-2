package com.ass.ass1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by kalu on 3/23/2018.
 */

public class Controller extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    EditText editText;
    TextView textView;
    Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =  (EditText) findViewById(R.id.editText);
        textView =  (TextView) findViewById(R.id.textView2);
        spinner = (Spinner)findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.converter,android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                try{
                    Double amount = Double.parseDouble(editText.getText().toString());
                    String value = spinner.getSelectedItem().toString();
                    switch(value) {
                        case ("Birr to Dollar"):
                            textView.setText(String.format( " %.2f",model.birr_to_dollar(amount)).toString() + "$");
                            break;
                        case ("Birr to Pound"):
                            textView.setText(String.format( " %.2f", model.birr_to_pound(amount)).toString() + " Pound");
                            break;
                        case ("Yen to Birr"):
                            textView.setText(String.format( " %.2f", model.yen_to_birr(amount)).toString() + " Birr");
                            break;
                        case ("Dollar to Birr"):

                            textView.setText(String.format( " %.2f", model.dollar_to_birr(amount)).toString() + " Birr");
                            break;
                        case ("Dollar to Pound"):

                            textView.setText(String.format( " %.2f", model.dollar_to_pound(amount)).toString() +  " Pound");
                            break;
                        case ("euro to Birr"):
                            textView.setText(String.format( " %.2f",model.euro_to_birr(amount)).toString() + " Birr");
                            break;
                        case ("euro to pound"):
                            textView.setText(String.format( " %.2f", model.euro_to_pound(amount)).toString() + " Pound");
                            break;
                        default:
                            textView.setText(String.format( " %.2f", model.defualt(amount)).toString() + "$");;
                    }


                } catch (NumberFormatException e){
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
