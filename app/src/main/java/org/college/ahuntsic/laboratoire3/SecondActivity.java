package org.college.ahuntsic.laboratoire3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText editFirstname;
    EditText editName;
    EditText editPhone;
    EditText editMail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editFirstname = findViewById(R.id.editTextFirstName);
        editName = findViewById(R.id.editTextName);
        editPhone = findViewById(R.id.editTextPhone);
        editMail = findViewById(R.id.editTextMail);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_second, menu);
        //getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.save:
                if(!validate()){
                    Toast.makeText(this,"Missing info",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(this,"Saved info",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this,"delete icon selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
    }

    boolean validate(){
        if(TextUtils.isEmpty(editFirstname.getText())||TextUtils.isEmpty(editName.getText())
                || TextUtils.isEmpty(editPhone.getText())||TextUtils.isEmpty(editMail.getText()))
            return false;

        return true;
    }
}
