package ar.com.tast.checksplitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TotalPriceCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_price_calculator);
        Intent totalPriceCalculatorIntent = getIntent();
        String radio_button_id = totalPriceCalculatorIntent.getStringExtra("SELECTED_RADIO_BUTTON");
        Toast.makeText(getApplicationContext(), radio_button_id, Toast.LENGTH_SHORT).show();
    }
}
