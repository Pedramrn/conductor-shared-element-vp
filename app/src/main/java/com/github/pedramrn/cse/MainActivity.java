package com.github.pedramrn.cse;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.github.pedramrn.cse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Router router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        router = Conductor.attachRouter(this, binding.container, savedInstanceState);

        if (!router.hasRootController()) {
            // TODO: 2017-06-21 comment this line and uncomment second line to see the issue.
            // router.setRoot(RouterTransaction.with(new ControllerHome()));
            router.setRoot(RouterTransaction.with(new ControllerViewPager()));
        }
    }


    @Override
    public void onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed();
        }
    }
}
