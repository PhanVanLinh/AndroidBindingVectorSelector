package toong.vn.androidbindingvectorselector;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;

/**
 * Created by PhanVanLinh on 13/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public final class BindingUtils {

    @BindingAdapter(value = {
            "srcCompatPressed", "srcCompatDisable"
    }, requireAll = false)
    public static void setSrcCompat(ImageView imageView, Drawable drawablePressed,
            Drawable drawableDisable) {
        imageView.setClickable(true);
        StateListDrawable stateList = new StateListDrawable();
        stateList.addState(new int[] { -android.R.attr.state_enabled }, drawableDisable);
        stateList.addState(new int[] { android.R.attr.state_pressed }, drawablePressed);
        stateList.addState(new int[] {}, imageView.getDrawable());
        stateList.addState(new int[] {}, drawableDisable);
        imageView.setImageDrawable(stateList);
    }
}
