package com.github.pedramrn.cse;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.support.RouterPagerAdapter;
import com.github.pedramrn.cse.databinding.ControllerViewpagerBinding;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2017-05-09
 */

public class ControllerViewPager extends Controller {

    private final RouterPagerAdapter routerPagerAdapter;

    public ControllerViewPager() {
        routerPagerAdapter = new RouterPagerAdapter(this) {

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public void configureRouter(@NonNull Router router, int position) {
                if (!router.hasRootController()) {
                    switch (position) {
                            // TODO: 2017-06-21 Adding it in second position prodkuces different behavior.
                        case 0:
                            // router.setRoot(RouterTransaction.with(new Controller2()));
                            router.setRoot(RouterTransaction.with(new ControllerHome()));
                            break;
                        case 1:
                            // router.setRoot(RouterTransaction.with(new ControllerHome()));
                            router.setRoot(RouterTransaction.with(new Controller2()));
                            break;
                        case 2:
                            router.setRoot(RouterTransaction.with(new Controller3()));
                            break;
                    }
                }
            }
        };
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        ControllerViewpagerBinding binding = ControllerViewpagerBinding.inflate(inflater, container, false);

        binding.viewPager.setAdapter(routerPagerAdapter);

        return binding.getRoot();

    }
}