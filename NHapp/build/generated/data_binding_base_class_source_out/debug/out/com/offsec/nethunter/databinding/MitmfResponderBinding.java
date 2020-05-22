// Generated by data binding compiler. Do not edit!
package com.offsec.nethunter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.offsec.nethunter.MITMFViewModel;
import com.offsec.nethunter.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MitmfResponderBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox mitmfResponder;

  @NonNull
  public final CheckBox mitmfResponderAnalyze;

  @NonNull
  public final CheckBox mitmfResponderFingerprint;

  @NonNull
  public final CheckBox mitmfResponderLM;

  @NonNull
  public final CheckBox mitmfResponderNBTNS;

  @NonNull
  public final CheckBox mitmfResponderWPAD;

  @NonNull
  public final CheckBox mitmfResponderWREDIR;

  @Bindable
  protected MITMFViewModel mViewModel;

  protected MitmfResponderBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox mitmfResponder, CheckBox mitmfResponderAnalyze, CheckBox mitmfResponderFingerprint,
      CheckBox mitmfResponderLM, CheckBox mitmfResponderNBTNS, CheckBox mitmfResponderWPAD,
      CheckBox mitmfResponderWREDIR) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mitmfResponder = mitmfResponder;
    this.mitmfResponderAnalyze = mitmfResponderAnalyze;
    this.mitmfResponderFingerprint = mitmfResponderFingerprint;
    this.mitmfResponderLM = mitmfResponderLM;
    this.mitmfResponderNBTNS = mitmfResponderNBTNS;
    this.mitmfResponderWPAD = mitmfResponderWPAD;
    this.mitmfResponderWREDIR = mitmfResponderWREDIR;
  }

  public abstract void setViewModel(@Nullable MITMFViewModel viewModel);

  @Nullable
  public MITMFViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static MitmfResponderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mitmf_responder, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MitmfResponderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MitmfResponderBinding>inflateInternal(inflater, R.layout.mitmf_responder, root, attachToRoot, component);
  }

  @NonNull
  public static MitmfResponderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mitmf_responder, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MitmfResponderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MitmfResponderBinding>inflateInternal(inflater, R.layout.mitmf_responder, null, false, component);
  }

  public static MitmfResponderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MitmfResponderBinding bind(@NonNull View view, @Nullable Object component) {
    return (MitmfResponderBinding)bind(component, view, R.layout.mitmf_responder);
  }
}
