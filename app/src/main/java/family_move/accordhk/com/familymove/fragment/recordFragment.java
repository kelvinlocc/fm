package family_move.accordhk.com.familymove.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import family_move.accordhk.com.familymove.R;
import family_move.accordhk.com.familymove.adapter.markListViewAdapter;
import family_move.accordhk.com.familymove.adapter.recordListViewAdapter;

public class recordFragment extends Fragment {
    static String TAG = "recordFragment";

    recordListViewAdapter recordAdapter;
    markListViewAdapter markAdapter;
    private ArrayList<String> nameDataList_recent;
    private ArrayList<String> markDataList_recent;
    private ArrayList<String> nameDataList_mark;
    private ArrayList<String> markDataList_mark;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.record, container, false);

        nameDataList_recent = new ArrayList<>();
        markDataList_recent = new ArrayList<>();
        nameDataList_mark = new ArrayList<>();
        markDataList_mark = new ArrayList<>();
        createDummy();
        recordAdapter = new recordListViewAdapter(getActivity(), nameDataList_recent, markDataList_recent);
        markAdapter = new markListViewAdapter(getActivity(),nameDataList_mark,markDataList_mark);

        ListView recentListView = (ListView) view.findViewById(R.id.recent_list_view);
        recentListView.setDivider(null);
        recentListView.setAdapter(recordAdapter);

        ListView markListView = (ListView) view.findViewById(R.id.mark_list_view);
        markListView.setDivider(null);
        markListView.setAdapter(markAdapter);
        return view;


    }

    public void createDummy() {
        for (int i = 0; i < 3; i++) {
            nameDataList_recent.add(Integer.toString(i));
            markDataList_recent.add(Integer.toString(i));
        }

        for (int i = 0; i < 5; i++) {
            nameDataList_mark.add('第'+Integer.toString(i+1)+"名");
            markDataList_mark.add(Integer.toString(i));
        }

    }


}
