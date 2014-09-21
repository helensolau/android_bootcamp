package com.example.helenlau.photogalley;

/**
 * Created by helenlau on 9/20/14.
 */
public class GalleryItem {
    private String _mCaption;
    private String _mId;
    private String _mUrl;

    public String getmCaption() {
        return _mCaption;
    }

    public void setmCaption(String mCaption) {
        _mCaption = mCaption;
    }

    public String getmId() {
        return _mId;
    }

    public void setmId(String mId) {
        _mId = mId;
    }

    public String getmUrl() {
        return _mUrl;
    }

    public void setmUrl(String mUrl) {
        _mUrl = mUrl;
    }

    public String toString() {
        return _mCaption;
    }
}
