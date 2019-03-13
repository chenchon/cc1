package com.bawei.day20;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.bawei.day20.base.BaseActivity;
import com.bawei.day20.frag.frag1;
import com.bawei.day20.frag.frag2;
import com.bawei.day20.frag.frag3;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
//122121121121
//sfasfsaf
    private FrameLayout fram;
    private RadioGroup group;
    private Button btn;

    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        fram = bindView(R.id.fram);
        group = bindView(R.id.group);
        btn = bindView(R.id.button);
        final frag1 frag1 = new frag1();
        final frag2 frag2 = new frag2();
        final frag3 frag3 = new frag3();

        final FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fram,frag1)
                .add(R.id.fram,frag2)
                .add(R.id.fram,frag3)
                .show(frag1)
                .hide(frag2)
                .hide(frag3)
                .commit();
    group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            FragmentTransaction transaction1 = fragmentManager.beginTransaction();
            switch (checkedId){
                case R.id.button:
                    transaction1.show(frag1)
                            .hide(frag2)
                            .hide(frag3);
                    break;case R.id.button1:
                    transaction1.show(frag2)
                            .hide(frag1)
                            .hide(frag3);
                    break;case R.id.button2:
                    transaction1.show(frag3)
                            .hide(frag2)
                            .hide(frag1);
                    break;
            }
            transaction1.commit();
        }
    });
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}
