package family_move.accordhk.com.familymove;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentContainer;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import family_move.accordhk.com.familymove.fragment.beginFragment;
import family_move.accordhk.com.familymove.fragment.chooseAgeFragment;
import family_move.accordhk.com.familymove.fragment.chooseLevelFragment;
import family_move.accordhk.com.familymove.fragment.recordFragment;
import family_move.accordhk.com.familymove.fragment.settingFragment;

/**
 * Created by Owner on 3/16/2017.
 */

public class mainActivity extends Activity {
    static String TAG = "mainActivity";
    Button age_btn, level_btn, begin_btn, setting_btn;

    android.app.FragmentTransaction transaction;

    chooseAgeFragment choose_age_fragment;
    chooseLevelFragment choose_level_fragment;
    beginFragment begin_fragment;
    recordFragment record_fragment;
    settingFragment setting_fragment;
    FrameLayout frameLayoutOne,frameLayoutTwo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup();
        set_listener();


        choose_age_fragment = new chooseAgeFragment();
//        new_fragment.setArguments(bundle);
        transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, choose_age_fragment).commit();

    }

    public void setup() {
        setContentView(R.layout.main_activity);
        frameLayoutOne = (FrameLayout) findViewById(R.id.fragment_container);
        frameLayoutTwo = (FrameLayout) findViewById(R.id.fragment_container_two);
        frameLayoutTwo.setVisibility(View.GONE);
        age_btn = (Button) findViewById(R.id.age_btn);
        level_btn = (Button) findViewById(R.id.level_btn);
        begin_btn = (Button) findViewById(R.id.begin_btn);
        setting_btn = (Button) findViewById(R.id.setting_btn);
        reset_all_button();
        //one time:
        age_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        age_btn.setTextColor(getResources().getColor(R.color.button_text_color));
        age_btn.setPaintFlags(age_btn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void set_listener() {
        age_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset_all_button();
                age_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                age_btn.setTextColor(getResources().getColor(R.color.button_text_color));
                age_btn.setPaintFlags(age_btn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

                choose_age_fragment = new chooseAgeFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, choose_age_fragment).commit();
            }
        });

        level_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset_all_button();
                level_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                level_btn.setTextColor(getResources().getColor(R.color.button_text_color));
                level_btn.setPaintFlags(level_btn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

                choose_level_fragment = new chooseLevelFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, choose_level_fragment).commit();
            }
        });

        begin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset_all_button();
                begin_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                begin_btn.setTextColor(getResources().getColor(R.color.button_text_color));
                begin_btn.setPaintFlags(begin_btn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

                begin_fragment = new beginFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, begin_fragment).commit();
            }
        });

        setting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset_all_button();
                setting_btn.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                setting_btn.setTextColor(getResources().getColor(R.color.button_text_color));
                setting_btn.setPaintFlags(setting_btn.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

                frameLayoutTwo.setVisibility(View.VISIBLE);

                setting_fragment = new settingFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container_two, setting_fragment).commit();

                record_fragment = new recordFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, record_fragment).commit();

            }
        });


    }

    public void reset_all_button() {
        frameLayoutTwo.setVisibility(View.GONE);

        age_btn.setBackgroundColor(getResources().getColor(R.color.my_btn_default));
        level_btn.setBackgroundColor(getResources().getColor(R.color.my_btn_default));
        begin_btn.setBackgroundColor(getResources().getColor(R.color.my_btn_default));
        setting_btn.setBackgroundColor(getResources().getColor(R.color.my_btn_default));


        age_btn.setTextColor(getResources().getColor(android.R.color.white));
        level_btn.setTextColor(getResources().getColor(android.R.color.white));
        begin_btn.setTextColor(getResources().getColor(android.R.color.white));
        setting_btn.setTextColor(getResources().getColor(android.R.color.white));

        age_btn.setPaintFlags(setting_btn.getPaintFlags() & (~Paint.UNDERLINE_TEXT_FLAG));
        level_btn.setPaintFlags(setting_btn.getPaintFlags() & (~Paint.UNDERLINE_TEXT_FLAG));
        begin_btn.setPaintFlags(setting_btn.getPaintFlags() & (~Paint.UNDERLINE_TEXT_FLAG));
        setting_btn.setPaintFlags(setting_btn.getPaintFlags() & (~Paint.UNDERLINE_TEXT_FLAG));
    }



}
