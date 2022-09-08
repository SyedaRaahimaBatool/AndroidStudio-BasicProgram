// Generated by view binder compiler. Do not edit!
package com.example.broadcast_listener.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.broadcast_listener.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBrecever2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar pbOutput;

  @NonNull
  public final TextView tvOutput;

  private ActivityBrecever2Binding(@NonNull LinearLayout rootView, @NonNull ProgressBar pbOutput,
      @NonNull TextView tvOutput) {
    this.rootView = rootView;
    this.pbOutput = pbOutput;
    this.tvOutput = tvOutput;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBrecever2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBrecever2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_brecever2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBrecever2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pb_output;
      ProgressBar pbOutput = ViewBindings.findChildViewById(rootView, id);
      if (pbOutput == null) {
        break missingId;
      }

      id = R.id.tv_output;
      TextView tvOutput = ViewBindings.findChildViewById(rootView, id);
      if (tvOutput == null) {
        break missingId;
      }

      return new ActivityBrecever2Binding((LinearLayout) rootView, pbOutput, tvOutput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
