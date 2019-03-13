package com.bawei.day20.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Author：陈冲
 * @E-mail： 1586503085@qq.com
 * @Date：2019/3/7 10:21
 * @Description：描述信息
 */
public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(bindLayout(),container,false);
    }
    protected abstract int bindLayout();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initEvent();
    }
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initEvent();
}
