package ca.bcit.comp2052.a00643427.fahrenheit2celsiusconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button by id and create a var of type Button
        Button buttonWidget = (Button)findViewById(R.id.button4);
        Button buttonWidget1 = (Button)findViewById(R.id.button5);


// Implement button click event handler
        buttonWidget.setOnClickListener(new android.view.View.OnClickListener() {
            // onClick method is defined in the OnClickListener interface,
            // we override it and implement our own functionality
            @Override
            // onClick method entry point
            public void onClick(View arg0) {
                // Find the EditText by id and create a var of type EditText
                EditText editTextWidget_F = (EditText)findViewById(R.id.editText_F);
                // Find the TextView by id and create a var of type TextView
                TextView textViewWidget = (TextView)findViewById(R.id.textView);
                //add result--textview
                EditText editTextWidget_C = (EditText)findViewById(R.id.editText_C);
                //TextView textViewWidget1 = (TextView)findViewById(R.id.textView_Result);

                // Read text from the EditText widget, store in inputString var
                String inputString = editTextWidget_F.getText().toString();
                // Create a new float var, initialize it to 0.0f[loat]
                float inputFloat = 0.0f;
                // Try a risky operation which is not guaranteed to work
                try {
                    // Try parsing the user input and assigning the value to inputFloat var
                    inputFloat = Float.parseFloat(inputString);
                    // Catch the exception, if any, do not crash!
                } catch (Exception e) {
                    // Parse FAILURE, get the error message from the exception object,
                    // show in the TextView widget
                    textViewWidget.setText(e.getMessage());
                    // Abort the execution, we cannot proceed without a valid float.
                    return;
                }
                // Parse SUCCESS, increment inputFloat by 5
                inputFloat = (inputFloat - 32)*5/9;
                // Show the result in TextView, format it to show only 2 decimal places
                editTextWidget_C.setText( String.format("%.2f", inputFloat));
                textViewWidget.setText("("+ inputString + "°F-32) x 5/9 = " + String.format("%.2f", inputFloat) + "°C");
            }
        });

        buttonWidget1.setOnClickListener(new android.view.View.OnClickListener() {
            // onClick method is defined in the OnClickListener interface,
            // we override it and implement our own functionality
            @Override
            // onClick method entry point
            public void onClick(View arg0) {
                // Find the EditText by id and create a var of type EditText
                EditText editTextWidget_F = (EditText)findViewById(R.id.editText_F);
                // Find the TextView by id and create a var of type TextView
                TextView textViewWidget = (TextView)findViewById(R.id.textView);
                //add result--textview
                EditText editTextWidget_C = (EditText)findViewById(R.id.editText_C);
                //TextView textViewWidget1 = (TextView)findViewById(R.id.textView_Result);

                // Read text from the EditText widget, store in inputString var
                String inputString = editTextWidget_C.getText().toString();
                // Create a new float var, initialize it to 0.0f[loat]
                float inputFloat = 0.0f;
                // Try a risky operation which is not guaranteed to work
                try {
                    // Try parsing the user input and assigning the value to inputFloat var
                    inputFloat = Float.parseFloat(inputString);
                    // Catch the exception, if any, do not crash!
                } catch (Exception e) {
                    // Parse FAILURE, get the error message from the exception object,
                    // show in the TextView widget
                    textViewWidget.setText(e.getMessage());
                    // Abort the execution, we cannot proceed without a valid float.
                    return;
                }
                // Parse SUCCESS, increment inputFloat by 5
                //inputFloat = (inputFloat - 32)*5/9;
                inputFloat = (inputFloat*9/5) + 32;
                // Show the result in TextView, format it to show only 2 decimal places
                editTextWidget_F.setText( String.format("%.2f", inputFloat));
                textViewWidget.setText("("+ inputString + "°C x 9/5) + 32 = " + String.format("%.2f", inputFloat) + "°F");
            }
        });

    }
}
