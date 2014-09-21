package com.example.helenlau.photogalley;

import android.support.v4.app.Fragment;

/**
 * Created by helenlau on 9/20/14.
 */
public class PhotoGalleryActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new PhotoGalleryFragment();
    }
}
