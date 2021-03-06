package com.sureping.controller.ui;

import android.app.Application;

import com.pgyersdk.crash.PgyCrashManager;
import com.sureping.controller.base.util.MsgConfig;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.util.HashMap;

/**
 * @author sureping
 * @create 19-4-21.
 */
public class ControllerApplication extends Application {
    private MsgConfig config;
    private static ControllerApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        config = new MsgConfig();

    }

    public static MsgConfig getConfig() {
        return instance.config;
    }

    public static ControllerApplication getInstance() {
        return instance;
    }
}
