package com.okbucktesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private UiItemAdapter adapter() {
        return MainActivity::adaptListUiItemsForCampaignListSelection;
    }

    public static List<Object> adaptListUiItemsForCampaignListSelection(List<? extends Object> pagerItems) {
        return new ArrayList<>();
    }
}
