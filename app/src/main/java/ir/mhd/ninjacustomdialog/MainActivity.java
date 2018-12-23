package ir.mhd.ninjacustomdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import ir.mhd.ninjadialog.NinjaAlertDialog;
import ir.mhd.ninjadialog.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        NinjaAlertDialog dialog = new NinjaAlertDialog.Builder()
                .setTitle("test title")
                .setSubtitle("test subtitle")
                .setTitleTextColor(getResources().getColor(R.color.orange600))
                .setSubtitleTextColor(getResources().getColor(R.color.orange600))
                .setPositiveText("positive text")
                .setPositiveButtonClickListener(new OnClickListener.OnPositiveButtonClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "positive button clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeText("negative text")
                .setNegativeButtonClickListener(new OnClickListener.OnNegativeButtonClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "negative button clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveBackground(R.drawable.test)
                .setNegativeBackground(R.drawable.negative_background)
                .setCancellable(true)
                .build();

        dialog.show(getSupportFragmentManager(), null);
    }
}
