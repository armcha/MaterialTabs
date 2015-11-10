package tab.luseen.com.AndroidTab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tab.luseen.com.tab4.R;

public class FragmentSecond extends Fragment {


    public FragmentSecond() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText("World");
        return view;
    }


}
