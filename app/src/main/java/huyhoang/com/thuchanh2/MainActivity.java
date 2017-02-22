package huyhoang.com.thuchanh2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button save =(Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText name = (EditText) findViewById(R.id.name);
                EditText address =(EditText) findViewById(R.id.addr);
                String infor= "Name: " + name.getText().toString()+ "     " +
                        "       "+"address:     " +address.getText().toString();
                Toast.makeText(MainActivity.this,infor,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
