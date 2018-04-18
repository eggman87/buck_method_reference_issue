package com.okbucktesting;

import java.io.Serializable;
import java.util.List;

public interface UiItemAdapter extends Serializable {

    List<? extends Object> adapt(List<? extends Object> pagerItems);

}