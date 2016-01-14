package ar.com.tast.checksplitter;

import android.app.Dialog;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NoDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog checkDetailChooserDialog = new Dialog(NoDataActivity.this);
                checkDetailChooserDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                // TODO: extract text string to strings.xml
                checkDetailChooserDialog.setContentView(R.layout.check_detail_chooser_activity);
                checkDetailChooserDialog.show();

                // TODO: investigate the "final" keyword
                // Create RadioGroup object to represent the detail options, then create the two
                // buttons object so that we can set the onClickListeners that determine the
                // behavior of the app when those buttons are pressed.
                final RadioGroup detailOptions = (RadioGroup) checkDetailChooserDialog.findViewById(R.id.detail_options);
                Button buttonSetDetail = (Button) checkDetailChooserDialog.findViewById(R.id.button_set_detail);
                Button buttonCancel = (Button) checkDetailChooserDialog.findViewById(R.id.button_cancel);

                buttonSetDetail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer selectedDetail = detailOptions.getCheckedRadioButtonId();
                        RadioButton selected = (RadioButton) detailOptions.findViewById(selectedDetail);
                        Toast.makeText(getApplicationContext(), selected.getText(), Toast.LENGTH_SHORT).show();
                        checkDetailChooserDialog.dismiss();
                    }
                });

                buttonCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkDetailChooserDialog.dismiss();
                    }
                });
            }
        });
    }
}
