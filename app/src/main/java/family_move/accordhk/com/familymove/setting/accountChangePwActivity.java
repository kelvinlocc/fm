package family_move.accordhk.com.familymove.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import family_move.accordhk.com.familymove.R;

/**
 * Created by Owner on 3/16/2017.
 */

public class accountChangePwActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.change_pw);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
