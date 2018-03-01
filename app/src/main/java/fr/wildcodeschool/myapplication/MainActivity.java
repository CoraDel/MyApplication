package fr.wildcodeschool.myapplication;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox cb = findViewById(R.id.cb);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    EditText firstname = findViewById(R.id.firstname);
                    firstname.setEnabled(true);
                    EditText lastname = findViewById(R.id.lastname);
                    lastname.setEnabled(true);
                    Button button_accept = findViewById(R.id.button_accept);
                    button_accept.setEnabled(true);
                } else {
                    EditText firstname = findViewById(R.id.firstname);
                    firstname.setEnabled(false);
                    EditText lastname = findViewById(R.id.lastname);
                    lastname.setEnabled(false);
                    Button button_accept = findViewById(R.id.button_accept);
                    button_accept.setEnabled(false);


                }
            }
        });
        Button accept = findViewById(R.id.button_accept);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstnamevalue = findViewById(R.id.firstname);
                String firstname = firstnamevalue.getText().toString();
                EditText lastnamevalue = findViewById(R.id.lastname);
                String lastname = lastnamevalue.getText().toString();


                if (firstname.matches("") | (lastname.matches(""))) {
                    Toast.makeText(MainActivity.this, "Please fill your first name and lastname", Toast.LENGTH_SHORT).show();
                }

                else {
                    TextView congrats = findViewById(R.id.text_invisible);
                    congrats.setText(String.format("%s%s %s", getString(R.string.congratulation), firstname, lastname));
                }
            }

        });
    }
}


/** CheckBox poulpe = findViewById(R.id.checkBox_test);
 poulpe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
@Override
public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
if (isChecked) {
Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
}
**/

/** textViwToChange **/



