package tech.ankush.helloworldandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {
    private EditText enteredName;
    private TextView printHello;
    private TextView printBye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
    public void sayHello(View v){
        Button helloButton = (Button) v;
        enteredName = (EditText) findViewById(R.id.editText);
        printHello = (TextView) findViewById(R.id.printHello);
        printHello.setText("Hello " + enteredName.getText());
        printHello.setVisibility(View.VISIBLE);

    }

    public void sayGoodbye(View v){
        Button goodbyeButton = (Button) v;
        enteredName = (EditText) findViewById(R.id.editText);
        printBye = (TextView) findViewById(R.id.printBye);
        printBye.setText("Goodbye " + enteredName.getText());
        printBye.setVisibility(View.VISIBLE);

    }


}
