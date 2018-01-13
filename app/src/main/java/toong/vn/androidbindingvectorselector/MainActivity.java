package toong.vn.androidbindingvectorselector;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import toong.vn.androidbindingvectorselector.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.buttonEnableDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.imageView.setEnabled(!binding.imageView.isEnabled());
            }
        });

        //        AppCompatImageView image = (AppCompatImageView) binding.imageView;
        //        if (image != null) {
        //            VectorDrawableCompat vcAccept = VectorDrawableCompat.create(getResources(), R.drawable.ic_android_blue, getTheme());
        //            VectorDrawableCompat vcAcceptWhite = VectorDrawableCompat.create(getResources(), R.drawable.ic_android_red, getTheme());
        //
        //            StateListDrawable stateList = new StateListDrawable();
        //            stateList.addState(new int[]{android.R.attr.state_pressed}, vcAcceptWhite);
        //            stateList.addState(new int[]{}, vcAccept);
        //
        //            image.setImageDrawable(stateList);
        //        }

    }
}
