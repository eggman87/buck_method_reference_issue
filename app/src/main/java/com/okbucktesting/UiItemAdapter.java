package com.okbucktesting;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import rx.functions.Func1;
import rx.functions.Func2;

public interface UiItemAdapter extends Serializable {

    List<? extends Object> adapt(List<? extends Object> pagerItems);

    class Adapters {

        public static <U extends Object, P extends Object> List<U> adaptOneToOne(
                @NonNull List<P> pagerItems, @NonNull Func1<P, U> adapter) {

            List<U> pagerUiItems = new ArrayList<>(pagerItems.size());

            for (P pagerItem : pagerItems) {
                pagerUiItems.add(adapter.call(pagerItem));
            }

            return pagerUiItems;
        }

        public static <U extends Object, P extends Object> List<U> adaptOneToOne(
                @NonNull List<P> pagerItems,
                @LayoutRes int layoutResId,
                @NonNull Func2<P, Integer, U> adapter) {
            return adaptOneToOne(pagerItems, pagerItem -> adapter.call(pagerItem, layoutResId));
        }

        private Adapters() {}
    }
}