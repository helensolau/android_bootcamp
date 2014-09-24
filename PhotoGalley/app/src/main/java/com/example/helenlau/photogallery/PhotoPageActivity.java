package com.example.helenlau.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by helenlau on 9/23/14.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
