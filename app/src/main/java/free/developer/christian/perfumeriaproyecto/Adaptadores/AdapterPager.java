package free.developer.christian.perfumeriaproyecto.Adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import free.developer.christian.perfumeriaproyecto.Fragmentos.tab1;
import free.developer.christian.perfumeriaproyecto.Fragmentos.tab2;
import free.developer.christian.perfumeriaproyecto.Fragmentos.tab3;


/**
 * Created by Christian on 17/07/2016.
 */
public class AdapterPager extends FragmentStatePagerAdapter {

    int tabCount;

    //Constructor to the class
    public AdapterPager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount= tabCount;
    }
    @Override
    public int getCount() {
        return tabCount;
    }
    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            default:
                return null;
        }
    }
}
