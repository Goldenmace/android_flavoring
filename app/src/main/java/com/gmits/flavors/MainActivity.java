/*
 *   Copyright (C) 2017 Goldenmace IT Solutions
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.gmits.flavors;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * {@link MainActivity} is a sample activity which redirect to different flavors
 * <p>
 * Created by vhpatoliya on 25,May,2017.
 * GoldenMace IT Solutions
 */
public class MainActivity extends AppCompatActivity {

    TextView simpleTextFree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Set your current theme
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        simpleTextFree = (TextView) findViewById(R.id.txtLabel);
        Typeface typeFont = Typeface.createFromAsset(getAssets(), "gothic.ttf");
        simpleTextFree.setTypeface(typeFont);
    }

    /**
     * Redirect to different flavours activity
     *
     * @param view
     */
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
