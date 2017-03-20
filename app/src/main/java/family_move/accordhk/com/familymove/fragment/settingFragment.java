package family_move.accordhk.com.familymove.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import family_move.accordhk.com.familymove.R;
import family_move.accordhk.com.familymove.setting.accountChangePwActivity;
import family_move.accordhk.com.familymove.setting.readTermsActivity;
import family_move.accordhk.com.familymove.setting.thanksActivity;

public class settingFragment extends Fragment {

    static String TAG = "settingFragment";
    Button read_terms,thanks,account;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.setting, container, false);
        read_terms = (Button) view.findViewById(R.id.read_terms);
        read_terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(getActivity(),readTermsActivity.class);
                startActivity(nextActivity);
            }
        });

        thanks = (Button) view.findViewById(R.id.thanks);
        thanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(getActivity(),thanksActivity.class);
                startActivity(nextActivity);
            }
        });

        account = (Button) view.findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextActivity = new Intent(getActivity(),accountChangePwActivity.class);
                startActivity(nextActivity);
            }
        });

        return view;


    }


}
