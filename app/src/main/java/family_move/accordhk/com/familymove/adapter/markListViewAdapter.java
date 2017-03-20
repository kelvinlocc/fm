package family_move.accordhk.com.familymove.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import family_move.accordhk.com.familymove.R;

public class markListViewAdapter extends BaseAdapter {

    private LayoutInflater myInflater;
    CharSequence[] list = null;
    private ArrayList<String> nameDataList;
    private ArrayList<String> markDataList;

    public markListViewAdapter(Context context, ArrayList<String> nameData, ArrayList<String> markData){

        myInflater = LayoutInflater.from(context);
        nameDataList = new ArrayList<>();
        markDataList = new ArrayList<>();
        nameDataList = nameData;
        markDataList = markData;
    }

    @Override
    public int getCount()
    {
        return nameDataList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return nameDataList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        //自訂類別，表達個別listItem中的view物件集合。
//        ViewTag viewTag;

        if(convertView == null){
            //取得listItem容器 view
            convertView = myInflater.inflate(R.layout.single_row, null);
            TextView name= (TextView) convertView.findViewById(R.id.name);
            name.setText(nameDataList.get(position));
            TextView mark= (TextView) convertView.findViewById(R.id.mark);
            mark.setText(markDataList.get(position));
            //建構listItem內容view
//            viewTag = new ViewTag(
//                    (ImageView)convertView.findViewById(
//                            R.id.MyAdapter_ImageView_icon),
//                    (TextView) convertView.findViewById(
//                            R.id.MyAdapter_TextView_title),
//                    (CheckBox) convertView.findViewById(
//                            R.id.MyAdapter_CheckBox_checkBox)
//            );
//
//            //設置容器內容
//            convertView.setTag(viewTag);
        }


        //設定內容圖案
//        switch(position){
//            case MyListView.MyListView_camera:
//                viewTag.icon.setBackgroundResource(R.drawable.ic_launcher_camera);
//                break;
//            case MyListView.MyListView_album:
//                viewTag.icon.setBackgroundResource(R.drawable.ic_launcher_gallery);
//                break;
//            case MyListView.MyListView_map:
//                viewTag.icon.setBackgroundResource(R.drawable.ic_launcher_maps);
//                break;
//        }
        //設定內容文字
//        viewTag.title.setText(list[position]);

        return convertView;
    }

    //自訂類別，表達個別listItem中的view物件集合。
//    class ViewTag{
//        ImageView icon;
//        TextView title;
//        CheckBox cbx;
//
//        public ViewTag(ImageView icon, TextView title, CheckBox cbx){
//            this.icon = icon;
//            this.title = title;
//            this.cbx = cbx;
//        }
//    }
}