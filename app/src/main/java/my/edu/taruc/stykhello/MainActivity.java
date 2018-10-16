package my.edu.taruc.stykhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg; //a module level variable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate is = main() function
        //super = superclass to create
        super.onCreate(savedInstanceState);

        //to display UI, R = resources class
        //layout is a folder name
        setContentView(R.layout.activity_main);
        //Linking UI to program
        //need to define an instance of the class
        textViewMsg = findViewById(R.id.textViewMessage);
    }
    //View is a class
    //v = an instance of a class
    public void showMessage(View v){
        textViewMsg.setText("Hello, Yong Kang");
    }

    public void clearScreen(View v){
        textViewMsg.setText("");
    }
}
