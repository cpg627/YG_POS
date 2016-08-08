package com.ppro.p_choi.vkr_autotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ppro.p_choi.vkr_autotest.R;

public class MainActivity extends AppCompatActivity {

    Button btn_1_1, btn_1_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //버튼에 리스너 달기기
        btn_1_1=(Button)findViewById(R.id.btn_1_1);
        btn_1_2=(Button)findViewById(R.id.btn_1_2);

        Button.OnClickListener listener = new Button.OnClickListener(){
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.btn_1_1:
                        System.out.println("1_1 눌림");
                        break;
                    case R.id.btn_1_2:
                        System.out.println("1_2 눌림");
                        break;
                }
            }
        };//이부분에서 세미콜론;을 찍는것을잊어서는안된다
        btn_1_1.setOnClickListener(listener);
        btn_1_2.setOnClickListener(listener);

    }
    //이벤트 핸들러

}
