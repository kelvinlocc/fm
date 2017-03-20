package family_move.accordhk.com.familymove.fragment;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import family_move.accordhk.com.familymove.R;

public class chooseAgeFragment extends Fragment {
    Button age_below_button, age_above_button, next_button;
    ImageView age_below_tick, age_above_tick;
    static String TAG = "chooseAgeFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.chose_age, container, false);
        age_below_button = (Button) view.findViewById(R.id.age_below_button);
        age_below_tick = (ImageView) view.findViewById(R.id.age_below_tick);

        age_above_button = (Button) view.findViewById(R.id.age_above_button);
        age_above_tick = (ImageView) view.findViewById(R.id.age_above_tick);

        next_button = (Button) view.findViewById(R.id.next);        
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: next_button");
            }
        });
        age_below_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: age_below_layout");

                // user click age below
                age_below_tick.setVisibility(View.VISIBLE);
                age_above_tick.setVisibility(View.INVISIBLE);

                age_below_button.setBackground(getResources().getDrawable(R.drawable.button_selected));
                age_above_button.setBackground(getResources().getDrawable(R.drawable.button_unselected));
            }
        });

        age_above_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: age_below_layout");

                // user click age below
                age_below_tick.setVisibility(View.INVISIBLE);
                age_above_tick.setVisibility(View.VISIBLE);

                age_below_button.setBackground(getResources().getDrawable(R.drawable.button_unselected));
                age_above_button.setBackground(getResources().getDrawable(R.drawable.button_selected));
            }
        });


        return view;


    }


}
