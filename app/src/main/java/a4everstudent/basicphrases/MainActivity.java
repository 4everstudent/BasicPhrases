package a4everstudent.basicphrases;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void buttonTapped(View view){
        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
