package com.duanjiefei.github.share;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.duanjiefei.componentbase.ServiceFactory;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share();
    }

    private void share() {
        if (ServiceFactory.getInstance().getiAccountService().isLogin()){
            Toast.makeText(this,"分享成功",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"分享失败，用户未登录",Toast.LENGTH_LONG).show();
        }
    }
}
