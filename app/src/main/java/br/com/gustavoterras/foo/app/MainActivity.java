package br.com.gustavoterras.foo.app;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import br.com.gustavoterras.foo.lib.core.network.ConsumerService;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.mainViewModel = new MainViewModel(this);

        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVariable(BR.viewModel, mainViewModel);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mainViewModel != null && !mainViewModel.visibility.get())
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mainViewModel.visibility.set(true);
                }
            }, 1000);
    }
}
