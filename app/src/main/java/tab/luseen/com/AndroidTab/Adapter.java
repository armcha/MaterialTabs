package tab.luseen.com.AndroidTab;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TextView;

/**
 * Created by Chatikyan on 27.07.2015.
 */
public class Adapter extends FragmentPagerAdapter {
    final int page = 2;
    private String[] tabtitle = new String[]{"Tab", "Tab2"};
    private Context context;

    public Adapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            FragmentFirst fragmentFirst = new FragmentFirst();
            return fragmentFirst;
        } else if (position == 1) {
            FragmentSecond fragmentSecond = new FragmentSecond();
            return fragmentSecond;
        }
        return null;
    }

    @Override
    public int getCount() {
        return page;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }

}
