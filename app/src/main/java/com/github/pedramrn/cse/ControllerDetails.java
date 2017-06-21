package com.github.pedramrn.cse;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.github.pedramrn.cse.databinding.ControllerDetailsBinding;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2017-05-09
 */

public class ControllerDetails extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        ControllerDetailsBinding binding = ControllerDetailsBinding.inflate(inflater, container, false);

        binding.imageView.setTransitionName("shared");
        return binding.getRoot();
    }
}
