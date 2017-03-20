package family_move.accordhk.com.familymove.setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import family_move.accordhk.com.familymove.R;
import family_move.accordhk.com.familymove.mainActivity;

/**
 * Created by Owner on 3/16/2017.
 */

public class thanksActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.thanks);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
