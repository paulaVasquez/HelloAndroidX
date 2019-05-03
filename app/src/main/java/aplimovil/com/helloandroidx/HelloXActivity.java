/**
 *
 * Applications development for mobile devices
 * -------------------------------------------
 *
 * This HelloWorld example implements an application that
 * simply displays a button that updates the current date and time
 * when pushed. It uses XML Layouts applying the inflation concept.
 *
 * @author Francisco Martinez
 *
 *
 */

package aplimovil.com.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class HelloXActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Button variable to hold the object extracted from XML Layout via inflation
     */
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set up the interface according to activity_hello_x XML layout
        setContentView(R.layout.activity_hello_x);
        //Get an instance of the button via inflation
        button = (Button) findViewById(R.id.button);
        //Set up a listener for listening button events (click)
        button.setOnClickListener(this);
        //Call this method to update the button text with current date and time
        updateTime();
    }

    /**
     * This method updates the button text with current date and time
     */
    private void updateTime() {
        button.setText(new Date().toString());
    }

    /**
     * This method handles the button events
     *
     * @param view The view generating the events (button's click)
     */
    @Override
    public void onClick(View view) {
        //When user presses the button, the button text is updated with the current date and time
        updateTime();
    }
}
