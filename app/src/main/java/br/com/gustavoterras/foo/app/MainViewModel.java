package br.com.gustavoterras.foo.app;

import android.app.Activity;
import android.content.Intent;
import android.databinding.ObservableBoolean;
import android.os.Handler;

import br.com.gustavoterras.foo.lib.common.CommonActivity;

public class MainViewModel {

    private Activity activity;
    public ObservableBoolean visibility = new ObservableBoolean(true);

    public MainViewModel(Activity activity) {
        this.activity = activity;
    }

    public void bang() {

        visibility.set(!visibility.get());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                activity.startActivity(new Intent(activity, CommonActivity.class));
            }
        }, 1000);
    }
}
