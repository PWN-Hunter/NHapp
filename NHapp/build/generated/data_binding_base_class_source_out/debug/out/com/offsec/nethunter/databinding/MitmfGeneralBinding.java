// Generated by data binding compiler. Do not edit!
package com.offsec.nethunter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.offsec.nethunter.MITMFViewModel;
import com.offsec.nethunter.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MitmfGeneralBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox mitmfAppPoison;

  @NonNull
  public final CheckBox mitmfBrowserprofile;

  @NonNull
  public final CheckBox mitmfFerretng;

  @NonNull
  public final CheckBox mitmfFilepwn;

  @NonNull
  public final Spinner mitmfInterface;

  @NonNull
  public final CheckBox mitmfJskey;

  @NonNull
  public final EditText mitmfScreenInterval;

  @NonNull
  public final CheckBox mitmfScreenshotter;

  @NonNull
  public final CheckBox mitmfSmb;

  @NonNull
  public final CheckBox mitmfSmbTrap;

  @NonNull
  public final CheckBox mitmfSslstrip;

  @NonNull
  public final CheckBox mitmfUpsidedown;

  @NonNull
  public final TextView textView17;

  @Bindable
  protected MITMFViewModel mViewModel;

  protected MitmfGeneralBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox mitmfAppPoison, CheckBox mitmfBrowserprofile, CheckBox mitmfFerretng,
      CheckBox mitmfFilepwn, Spinner mitmfInterface, CheckBox mitmfJskey,
      EditText mitmfScreenInterval, CheckBox mitmfScreenshotter, CheckBox mitmfSmb,
      CheckBox mitmfSmbTrap, CheckBox mitmfSslstrip, CheckBox mitmfUpsidedown,
      TextView textView17) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mitmfAppPoison = mitmfAppPoison;
    this.mitmfBrowserprofile = mitmfBrowserprofile;
    this.mitmfFerretng = mitmfFerretng;
    this.mitmfFilepwn = mitmfFilepwn;
    this.mitmfInterface = mitmfInterface;
    this.mitmfJskey = mitmfJskey;
    this.mitmfScreenInterval = mitmfScreenInterval;
    this.mitmfScreenshotter = mitmfScreenshotter;
    this.mitmfSmb = mitmfSmb;
    this.mitmfSmbTrap = mitmfSmbTrap;
    this.mitmfSslstrip = mitmfSslstrip;
    this.mitmfUpsidedown = mitmfUpsidedown;
    this.textView17 = textView17;
  }

  public abstract void setViewModel(@Nullable MITMFViewModel viewModel);

  @Nullable
  public MITMFViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static MitmfGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mitmf_general, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MitmfGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MitmfGeneralBinding>inflateInternal(inflater, R.layout.mitmf_general, root, attachToRoot, component);
  }

  @NonNull
  public static MitmfGeneralBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.mitmf_general, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MitmfGeneralBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MitmfGeneralBinding>inflateInternal(inflater, R.layout.mitmf_general, null, false, component);
  }

  public static MitmfGeneralBinding bind(@NonNull View view) {
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
  public static MitmfGeneralBinding bind(@NonNull View view, @Nullable Object component) {
    return (MitmfGeneralBinding)bind(component, view, R.layout.mitmf_general);
  }
}
