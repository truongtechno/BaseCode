package me.com.basecode.base.delegate;


import me.com.basecode.base.network.CoreResponse;

/**
 * Created by xuan on 19/02/2017.
 */

public interface ModelDelegate {
     void callBack(CoreResponse response, boolean isSuccess);
}
