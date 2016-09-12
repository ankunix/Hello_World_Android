package tech.ankush.helloworldandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {
    private EditText enteredName;
    private TextView printedName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
    public void sayHello(View v){
        Button helloButton = (Button) v;
        enteredName = (EditText) findViewById(R.id.editText);
        printedName = (TextView) findViewById(R.id.printMsg);
        printedName.setText("Hello " + enteredName.getText());
        printedName.setVisibility(View.VISIBLE);

    }

    public void sayGoodbye(View v){
        Button goodbyeButton = (Button) v;
        enteredName = (EditText) findViewById(R.id.editText);
        printedName = (TextView) findViewById(R.id.printMsg);
        printedName.setText("Goodbye " + enteredName.getText());
        printedName.setVisibility(View.VISIBLE);

    }


}
