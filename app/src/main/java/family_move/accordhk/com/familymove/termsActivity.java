package family_move.accordhk.com.familymove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Owner on 3/16/2017.
 */

public class termsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        //Remove title bar
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //Remove notification bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //set content view AFTER ABOVE sequence (to avoid crash)

        super.onCreate(savedInstanceState);

        setContentView(R.layout.accept_terms);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(termsActivity.this,loginActivity.class);
                startActivity(nextActivity);
                finish();

            }
        });

    }
}
