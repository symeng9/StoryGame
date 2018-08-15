package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DramaActivity extends BaseGameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drama);
    }

    public void checkItOut(View view){
        Intent intent = new Intent(this, Drama1_1Activity.class);
        startActivity(intent);
        finish();
    }
}
