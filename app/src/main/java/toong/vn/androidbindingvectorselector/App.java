package toong.vn.androidbindingvectorselector;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by PhanVanLinh on 13/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
