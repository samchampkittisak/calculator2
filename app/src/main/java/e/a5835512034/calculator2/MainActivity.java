package e.a5835512034.calculator2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double ans, t1, t2;
    private int in1 = 0, type = 0, com = 1,dot = 0;
    private TextView tv1, goshow, datasave;
    private String datatext;
    private Button bt00,bt01,bt02,bt03,bt04,bt05,bt06,bt07,bt08,bt09,btdot,btdel,btcross,btslash,btminus,btadd,btcal,btclr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        goshow = findViewById(R.id.goshow);
        datasave = findViewById(R.id.datasave);
        bt00 = findViewById(R.id.bt00);
        bt01 = findViewById(R.id.bt01);
        bt02 = findViewById(R.id.bt02);
        bt03 = findViewById(R.id.bt03);
        bt04 = findViewById(R.id.bt04);
        bt05 = findViewById(R.id.bt05);
        bt06 = findViewById(R.id.bt06);
        bt07 = findViewById(R.id.bt07);
        bt08 = findViewById(R.id.bt08);
        bt09 = findViewById(R.id.bt09);
        btdot = findViewById(R.id.btdot);
        btdel = findViewById(R.id.btdel);
        btcross = findViewById(R.id.btcross);
        btslash = findViewById(R.id.btslash);
        btminus = findViewById(R.id.btminus);
        btadd = findViewById(R.id.btadd);
        btcal = findViewById(R.id.btcal);
        btclr = findViewById(R.id.btclr);
    }

    public void dot(View view) {
        if (dot < 1) {
            if (tv1.getText().toString().length() == 0) {
                tv1.setText("0.");
                dot++;
            } else {
                tv1.setText(tv1.getText().toString() + ".");
                dot++;
            }
        }
    }

    public void zero(View view) {
        tv1.setText(tv1.getText().toString() + "0");
    }

    public void delete(View view) {
        if (tv1.getText().toString().length() == 0) {
            tv1.setText("");
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '+') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
            if (tv1.getText().toString().contains(".")){
                dot++;
            }
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '-') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
            if (tv1.getText().toString().contains(".")){
                dot++;
            }
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == 'X') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
            if (tv1.getText().toString().contains(".")){
                dot++;
            }
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '/') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
            if (tv1.getText().toString().contains(".")){
                dot++;
            }
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '.') {
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            dot = 0;
        }
        else {
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
        }
    }

    public void slash(View view) {
        if (in1 >= 1) {
        } else if (tv1.getText().toString().length() == 0) {
        } else {
            t1 = Double.parseDouble(tv1.getText().toString());
            tv1.setText(tv1.getText().toString() + "/");
            in1 += 1;
            type = 4;
            dot = 0;
        }
    }

    public void minus(View view) {
        if (in1 >= 1) {
        } else if (tv1.getText().toString().length() == 0) {
        } else {
            t1 = Double.parseDouble(tv1.getText().toString());
            tv1.setText(tv1.getText().toString() + "-");
            in1 += 1;
            type = 2;
            dot = 0;
        }
    }

    public void one(View view) {
        tv1.setText(tv1.getText().toString() + "1");
    }

    public void two(View view) {
        tv1.setText(tv1.getText().toString() + "2");
    }

    public void three(View view) {
        tv1.setText(tv1.getText().toString() + "3");
    }

    public void cross(View view) {
        if (in1 >= 1) {
        } else if (tv1.getText().toString().length() == 0) {
        } else {
            t1 = Double.parseDouble(tv1.getText().toString());
            tv1.setText(tv1.getText().toString() + "X");
            in1 += 1;
            type = 3;
            dot = 0;
        }
    }

    public void four(View view) {
        tv1.setText(tv1.getText().toString() + "4");
    }

    public void five(View view) {
        tv1.setText(tv1.getText().toString() + "5");
    }

    public void six(View view) {
        tv1.setText(tv1.getText().toString() + "6");
    }

    public void seven(View view) {
        tv1.setText(tv1.getText().toString() + "7");
    }

    public void eight(View view) {
        tv1.setText(tv1.getText().toString() + "8");
    }

    public void nine(View view) {
        tv1.setText(tv1.getText().toString() + "9");
    }

    public void add(View view) {
        if (in1 >= 1) {
        } else if (tv1.getText().toString().length() == 0) {
        } else {
            t1 = Double.parseDouble(tv1.getText().toString());
            in1 += 1;
            type = 1;
            tv1.setText(tv1.getText().toString() + "+");
            dot = 0;
        }
    }

    public void cal(View view) {
        if (type == 1) {
            t2 = Double.parseDouble(tv1.getText().toString().substring(tv1.getText().toString().lastIndexOf('+') + 1));
            ans = t1 + t2;
            goshow.setText("=" + ans);
            datasave.setText("data "+com+" : "+t1 + "+" + t2 + "=" + ans + "\n" + datasave.getText().toString());
            com++;
        } else if (type == 2) {
            t2 = Double.parseDouble(tv1.getText().toString().substring(tv1.getText().toString().lastIndexOf('-') + 1));
            ans = t1 - t2;
            goshow.setText("=" + ans);
            datasave.setText("data "+com+" : "+t1 + "-" + t2 + "=" + ans + "\n" + datasave.getText().toString());
            com++;
        } else if (type == 3) {
            t2 = Double.parseDouble(tv1.getText().toString().substring(tv1.getText().toString().lastIndexOf('X') + 1));
            ans = t1 * t2;
            goshow.setText("=" + ans);
            datasave.setText("data "+com+" : "+t1 + "*" + t2 + "=" + ans + "\n" + datasave.getText().toString());
            com++;
        } else if (type == 4) {
            t2 = Double.parseDouble(tv1.getText().toString().substring(tv1.getText().toString().lastIndexOf('/') + 1));
            ans = t1 / t2;
            goshow.setText("=" + ans);
            datasave.setText("data "+com+" : "+t1 + "/" + t2 + "=" + "\n" + ans + datasave.getText().toString());
            com++;
        }
    }

    public void clr(View view) {
        in1 = 0;
        type = 0;
        tv1.setText("");
        goshow.setText("=");
    }

    public void clear(View view) {
        datasave.setText("");
        com = 0;
    }

    public void shownotedata(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.cbshow:
                if (checked){
                    datasave.setVisibility(View.VISIBLE);
                }
                else{
                    datasave.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void choise(View view) {
        boolean swit = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case  R.id.RB01:
                if (swit){
                    bt00.setBackgroundResource(R.drawable.shape_button1);
                    bt01.setBackgroundResource(R.drawable.shape_button1);
                    bt02.setBackgroundResource(R.drawable.shape_button1);
                    bt03.setBackgroundResource(R.drawable.shape_button1);
                    bt04.setBackgroundResource(R.drawable.shape_button1);
                    bt05.setBackgroundResource(R.drawable.shape_button1);
                    bt06.setBackgroundResource(R.drawable.shape_button1);
                    bt07.setBackgroundResource(R.drawable.shape_button1);
                    bt08.setBackgroundResource(R.drawable.shape_button1);
                    bt09.setBackgroundResource(R.drawable.shape_button1);
                    btdot.setBackgroundResource(R.drawable.shape_button);
                    btdel.setBackgroundResource(R.drawable.shape_button);
                    btcross.setBackgroundResource(R.drawable.shape_button);
                    btslash.setBackgroundResource(R.drawable.shape_button);
                    btadd.setBackgroundResource(R.drawable.shape_button);
                    btminus.setBackgroundResource(R.drawable.shape_button);
                    btcal.setBackgroundResource(R.drawable.shape_button);
                    btclr.setBackgroundResource(R.drawable.shape_button);
                    bt00.setTextColor(Color.argb(255,0,0,0));
                    bt01.setTextColor(Color.argb(255,0,0,0));
                    bt02.setTextColor(Color.argb(255,0,0,0));
                    bt03.setTextColor(Color.argb(255,0,0,0));
                    bt04.setTextColor(Color.argb(255,0,0,0));
                    bt05.setTextColor(Color.argb(255,0,0,0));
                    bt06.setTextColor(Color.argb(255,0,0,0));
                    bt07.setTextColor(Color.argb(255,0,0,0));
                    bt08.setTextColor(Color.argb(255,0,0,0));
                    bt09.setTextColor(Color.argb(255,0,0,0));
                    btdot.setTextColor(Color.argb(255,0,0,0));
                    btdel.setTextColor(Color.argb(255,0,0,0));
                    btcross.setTextColor(Color.argb(255,0,0,0));
                    btslash.setTextColor(Color.argb(255,0,0,0));
                    btadd.setTextColor(Color.argb(255,0,0,0));
                    btminus.setTextColor(Color.argb(255,0,0,0));
                    btcal.setTextColor(Color.argb(255,0,0,0));
                    btclr.setTextColor(Color.argb(255,0,0,0));
                }
                break;
            case R.id.RB02:
                if (swit){
                    bt00.setBackgroundResource(R.drawable.darkcolors);
                    bt01.setBackgroundResource(R.drawable.darkcolors);
                    bt02.setBackgroundResource(R.drawable.darkcolors);
                    bt03.setBackgroundResource(R.drawable.darkcolors);
                    bt04.setBackgroundResource(R.drawable.darkcolors);
                    bt05.setBackgroundResource(R.drawable.darkcolors);
                    bt06.setBackgroundResource(R.drawable.darkcolors);
                    bt07.setBackgroundResource(R.drawable.darkcolors);
                    bt08.setBackgroundResource(R.drawable.darkcolors);
                    bt09.setBackgroundResource(R.drawable.darkcolors);
                    btdot.setBackgroundResource(R.drawable.buttonbcleardata);
                    btdel.setBackgroundResource(R.drawable.buttonbcleardata);
                    btcross.setBackgroundResource(R.drawable.buttonbcleardata);
                    btslash.setBackgroundResource(R.drawable.buttonbcleardata);
                    btadd.setBackgroundResource(R.drawable.buttonbcleardata);
                    btminus.setBackgroundResource(R.drawable.buttonbcleardata);
                    btcal.setBackgroundResource(R.drawable.buttonbcleardata);
                    btclr.setBackgroundResource(R.drawable.buttonbcleardata);
                    bt00.setTextColor(Color.argb(255,255,255,255));
                    bt01.setTextColor(Color.argb(255,255,255,255));
                    bt02.setTextColor(Color.argb(255,255,255,255));
                    bt03.setTextColor(Color.argb(255,255,255,255));
                    bt04.setTextColor(Color.argb(255,255,255,255));
                    bt05.setTextColor(Color.argb(255,255,255,255));
                    bt06.setTextColor(Color.argb(255,255,255,255));
                    bt07.setTextColor(Color.argb(255,255,255,255));
                    bt08.setTextColor(Color.argb(255,255,255,255));
                    bt09.setTextColor(Color.argb(255,255,255,255));
                    btdot.setTextColor(Color.argb(255,255,255,255));
                    btdel.setTextColor(Color.argb(255,255,255,255));
                    btcross.setTextColor(Color.argb(255,255,255,255));
                    btslash.setTextColor(Color.argb(255,255,255,255));
                    btadd.setTextColor(Color.argb(255,255,255,255));
                    btminus.setTextColor(Color.argb(255,255,255,255));
                    btcal.setTextColor(Color.argb(255,255,255,255));
                    btclr.setTextColor(Color.argb(255,255,255,255));




                }
                break;
        }
    }
}
