package com.github.pedramrn.cse;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.github.pedramrn.cse.changehandler.ArcFadeMoveChangeHandler;
import com.github.pedramrn.cse.databinding.ControllerHomeBinding;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2017-05-09
 */

public class ControllerHome extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        ControllerHomeBinding binding = ControllerHomeBinding.inflate(inflater, container, false);
        binding.imageView.setTransitionName("shared");

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRouter().pushController(RouterTransaction.with(new ControllerDetails())
                        .pushChangeHandler(new ArcFadeMoveChangeHandler())
                        .popChangeHandler(new ArcFadeMoveChangeHandler()));
            }
        });

        return binding.getRoot();

    }
}