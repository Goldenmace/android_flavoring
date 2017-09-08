package com.gmits.flavors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link SecondActivity} is a sample activity which shows Premium dummy data
 * <p>
 * Created by vhpatoliya on 12,May,2017.
 * GoldenMace IT Solutions
 */
public class SecondActivity extends AppCompatActivity {

    RecyclerView rlPaidView;
    List<String> mPaidList;
    RecycleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Set your current theme
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        premiumList = (RecyclerView) findViewById(R.id.premiumList);

        mPremium = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mPremium.add("Premium" + i);
        }
        mAdapter = new RecycleAdapter(mPremium);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        premiumList.setLayoutManager(mLayoutManager);
        premiumList.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
