package com.bignerdranch.android.criminalintent;
import android.support.v4.app.Fragment;

/**
 * Created by ilyankou on 10/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
