package com.okbucktesting;

import java.util.List;

public interface UiItemAdapter {

    List<? extends Object> adapt(List<? extends Object> pagerItems);

}