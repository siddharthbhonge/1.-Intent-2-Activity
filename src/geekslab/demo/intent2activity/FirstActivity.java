package geekslab.demo.intent2activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn2SecondActivity = (Button)findViewById(R.id.button1);
        btn2SecondActivity.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2SecondActivity = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(intent2SecondActivity);
			}
		});
    }
}