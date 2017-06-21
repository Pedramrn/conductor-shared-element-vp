package com.github.pedramrn.cse;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

/**
 * @author : Pedramrn@gmail.com
 *         Created on: 2017-05-09
 */

public class Controller3 extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.controller_3, container, false);
    }
}
