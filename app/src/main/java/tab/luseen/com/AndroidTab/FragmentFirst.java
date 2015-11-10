package tab.luseen.com.AndroidTab;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tab.luseen.com.tab4.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentFirst extends Fragment {

    public FragmentFirst() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText("Hello");
        return view;
    }
}
