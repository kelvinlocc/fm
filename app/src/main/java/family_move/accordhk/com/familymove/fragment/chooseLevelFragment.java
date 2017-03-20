package family_move.accordhk.com.familymove.fragment;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import family_move.accordhk.com.familymove.R;

public class chooseLevelFragment extends Fragment {
    View view;
    Button next;
    Button level_01, level_02, level_03;
    ImageView level_01_tick, level_02_tick,level_03_tick;
    static String TAG = "chooseLevelFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.chose_level, container, false);
        setUp();
        setListener();


        return view;


    }

    public void setUp(){

        next = (Button) view.findViewById(R.id.next);

        level_01 = (Button) view.findViewById(R.id.level_01);
        level_02 = (Button) view.findViewById(R.id.level_02);
        level_03 = (Button) view.findViewById(R.id.level_03);
        level_01_tick = (ImageView) view.findViewById(R.id.level_01_tick);
        level_02_tick = (ImageView) view.findViewById(R.id.level_02_tick);
        level_03_tick = (ImageView) view.findViewById(R.id.level_03_tick);

    }

    public void setListener(){
        level_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                level_01_tick.setVisibility(View.VISIBLE);
                level_01.setBackground(getResources().getDrawable(R.drawable.button_selected));
            }
        });

        level_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                level_02_tick.setVisibility(View.VISIBLE);
                level_02.setBackground(getResources().getDrawable(R.drawable.button_selected));
            }
        });

        level_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAllButton();
                level_03_tick.setVisibility(View.VISIBLE);
                level_03.setBackground(getResources().getDrawable(R.drawable.button_selected));
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog();
            }
        });




    }

    public void resetAllButton(){
        level_01_tick.setVisibility(View.INVISIBLE);
        level_02_tick.setVisibility(View.INVISIBLE);
        level_03_tick.setVisibility(View.INVISIBLE);
        level_01.setBackground(getResources().getDrawable(R.drawable.button_unselected));
        level_02.setBackground(getResources().getDrawable(R.drawable.button_unselected));
        level_03.setBackground(getResources().getDrawable(R.drawable.button_unselected));
    }

    public void createDialog(){
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.reminder);
        Button button = (Button) dialog.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });



//        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
//        text.setText(msg);

//        Button dialogButton = (Button) dialog.findViewById(R.id.btn_dialog);
//        dialogButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//            }
//        });

        dialog.show();
    }


}
