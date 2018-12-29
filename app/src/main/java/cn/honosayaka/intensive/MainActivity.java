package cn.honosayaka.intensive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static TextView[] textViews = new TextView[25];
    final String[] number = new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13",
            "14","15","16","17","18","19","20","21","22","23","24","25"};
    List<String> list = Arrays.asList(number);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getTextViews();
        reSort();
    }

    public void getTextViews(){
        textViews [ 0 ] = findViewById(R.id.textView1 );
        textViews [ 1 ] = findViewById(R.id.textView2 );
        textViews [ 2 ] = findViewById(R.id.textView3 );
        textViews [ 3 ] = findViewById(R.id.textView4 );
        textViews [ 4 ] = findViewById(R.id.textView5 );
        textViews [ 5 ] = findViewById(R.id.textView6 );
        textViews [ 6 ] = findViewById(R.id.textView7 );
        textViews [ 7 ] = findViewById(R.id.textView8 );
        textViews [ 8 ] = findViewById(R.id.textView9 );
        textViews [ 9 ] = findViewById(R.id.textView10 );
        textViews [ 10 ] = findViewById(R.id.textView11 );
        textViews [ 11 ] = findViewById(R.id.textView12 );
        textViews [ 12 ] = findViewById(R.id.textView13 );
        textViews [ 13 ] = findViewById(R.id.textView14 );
        textViews [ 14 ] = findViewById(R.id.textView15 );
        textViews [ 15 ] = findViewById(R.id.textView16 );
        textViews [ 16 ] = findViewById(R.id.textView17 );
        textViews [ 17 ] = findViewById(R.id.textView18 );
        textViews [ 18 ] = findViewById(R.id.textView19 );
        textViews [ 19 ] = findViewById(R.id.textView20 );
        textViews [ 20 ] = findViewById(R.id.textView21 );
        textViews [ 21 ] = findViewById(R.id.textView22 );
        textViews [ 22 ] = findViewById(R.id.textView23 );
        textViews [ 23 ] = findViewById(R.id.textView24 );
        textViews [ 24 ] = findViewById(R.id.textView25 );
    }

    public void reSort(){
        Collections.shuffle(list);
        String[] strings = new String[list.size()];
        String[] array = list.toArray(strings);
        for(int i=0;i<25;i++){
            textViews[i].setText(array[i]);
        }
    }
    public void click(View view){
        reSort();
    }

    long now;
    boolean isStart = false;
    public void timer(View view){
        Button timer = findViewById(R.id.starts);
        TextView timepanel = findViewById(R.id.timepanel);
        if(!isStart){
            isStart = true;
            now = System.currentTimeMillis();
            timer.setText("结束");
            timepanel.setText("计时中！");
        }else if(isStart){
            long result = System.currentTimeMillis() - now;
            timepanel.setText("共计："+result+"ms");
            timer.setText("开始");
            isStart = false;
        }
    }
}
