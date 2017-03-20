package family_move.accordhk.com.familymove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Owner on 3/16/2017.
 */

public class splashScreenActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.splashScreenTheme);
        super.onCreate(savedInstanceState);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.splash_screen);
        Intent NextActivity = new Intent(splashScreenActivity.this, termsActivity.class);
        startActivity(NextActivity);
        finish();

    }
}
