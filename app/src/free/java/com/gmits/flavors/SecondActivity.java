package com.gmits.flavors;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * {@link SecondActivity} is a sample activity which shows different images
 * <p>
 * Created by vhpatoliya on 25,May,2017.
 * GoldenMace IT Solutions
 */
public class SecondActivity extends AppCompatActivity {
    TextView mUpgradePlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Set your current theme
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mUpgradePlan = (TextView) findViewById(R.id.upgradePlan);
        mUpgradePlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aView) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
                builder.setTitle(getString(R.string.dialog_title));
                builder.setMessage(getString(R.string.dialog_message));

                String positiveText = getString(android.R.string.ok);
                builder.setPositiveButton(positiveText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // positive button logic
                                dialog.dismiss();
                            }
                        });

                String negativeText = getString(android.R.string.cancel);
                builder.setNegativeButton(negativeText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // negative button logic
                                dialog.dismiss();
                            }
                        });

                AlertDialog dialog = builder.create();
                // display dialog
                dialog.show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
