package com.okbucktesting;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RandomKotlinClass random = new RandomKotlinClass();
        random.helloKotlin();
    }



    private View randomViewFunction(View view) {
        return new View(getBaseContext());
    }

    private UiItemAdapter adapter() {
        return MainActivity::adaptListUiItemsForCampaignListSelection;
    }

    public static List<Object> adaptListUiItemsForCampaignListSelection(List<? extends Object> pagerItems) {
        return new ArrayList<>();
    }
}
