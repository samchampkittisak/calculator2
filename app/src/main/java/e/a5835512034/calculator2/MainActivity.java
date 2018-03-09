package e.a5835512034.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double ans, t1, t2;
    private int in1 = 0, type = 0, com = 1;
    private TextView tv1, goshow, datasave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        goshow = findViewById(R.id.goshow);
        datasave = findViewById(R.id.datasave);
    }

    public void dot(View view) {
        if (tv1.getText().toString() == "") {
            tv1.setText("0.");
        } else {
            tv1.setText(tv1.getText().toString() + ".");
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
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '-') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == 'X') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
        } else if (tv1.getText().toString().charAt(tv1.getText().toString().length() - 1) == '/') {
            in1 = 0;
            tv1.setText(tv1.getText().toString().substring(0, tv1.getText().toString().length() - 1));
            type = 0;
        } else {
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
}
