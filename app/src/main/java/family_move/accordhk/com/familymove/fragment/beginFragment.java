package family_move.accordhk.com.familymove.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import family_move.accordhk.com.familymove.R;
import family_move.accordhk.com.familymove.special_activity.youtube_activity;

public class beginFragment extends Fragment {
    View view;
    ImageButton ex1,ex2,ex3,ex4,ex5,ex6;
    Button startButton;
    static String TAG = "chooseAgeFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.begin, container, false);
        setUp();
        setListener();

        return view;


    }
    public void setUp(){
        ex1 = (ImageButton) view.findViewById(R.id.ex1);
        ex2 = (ImageButton) view.findViewById(R.id.ex2);
        ex3 = (ImageButton) view.findViewById(R.id.ex3);
        ex4 = (ImageButton) view.findViewById(R.id.ex4);
        ex5 = (ImageButton) view.findViewById(R.id.ex5);
        ex6 = (ImageButton) view.findViewById(R.id.ex6);
        startButton = (Button) view.findViewById(R.id.next);


    }

    public void setListener(){
        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex1.setImageResource(R.drawable.play_1_on);

            }
        });
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex2.setImageResource(R.drawable.play_2_on);

            }
        });
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex3.setImageResource(R.drawable.play_2_on);

            }
        });
        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex4.setImageResource(R.drawable.play_2_on);

            }
        });
        ex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex5.setImageResource(R.drawable.play_2_on);

            }
        });
        ex6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                ex6.setImageResource(R.drawable.play_2_on);

            }
        });
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));
                Intent intent = new Intent(getActivity(),youtube_activity.class);

                startActivity(intent);
                Log.i("Video", "Video Playing....");
            }
        });


    }

    public void resetAllButton(){
        ex1.setImageResource(R.drawable.play_1_off);
        ex2.setImageResource(R.drawable.play_2_off);
        ex3.setImageResource(R.drawable.play_2_off);
        ex4.setImageResource(R.drawable.play_2_off);
        ex5.setImageResource(R.drawable.play_2_off);
        ex6.setImageResource(R.drawable.play_2_off);


    }


}
