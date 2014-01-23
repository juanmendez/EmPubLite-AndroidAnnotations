//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package com.commonsware.empublite;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import org.androidannotations.api.sharedpreferences.EditorHelper;
import org.androidannotations.api.sharedpreferences.SharedPreferencesHelper;
import org.androidannotations.api.sharedpreferences.StringPrefEditorField;
import org.androidannotations.api.sharedpreferences.StringPrefField;

public final class DownloadPrefs_
    extends SharedPreferencesHelper
{

    private Context context_;

    public DownloadPrefs_(Context context) {
        super(PreferenceManager.getDefaultSharedPreferences(context));
        this.context_ = context;
    }

    public DownloadPrefs_.DownloadPrefsEditor_ edit() {
        return new DownloadPrefs_.DownloadPrefsEditor_(getSharedPreferences());
    }

    public StringPrefField pendingUpdateDir() {
        return stringField("pendingUpdateDir", "");
    }

    public StringPrefField previousUpdateDir() {
        return stringField("previousUpdateDir", "");
    }

    public StringPrefField updateDir() {
        return stringField("updateDir", "");
    }

    public final static class DownloadPrefsEditor_
        extends EditorHelper<DownloadPrefs_.DownloadPrefsEditor_>
    {


        DownloadPrefsEditor_(SharedPreferences sharedPreferences) {
            super(sharedPreferences);
        }

        public StringPrefEditorField<DownloadPrefs_.DownloadPrefsEditor_> pendingUpdateDir() {
            return stringField("pendingUpdateDir");
        }

        public StringPrefEditorField<DownloadPrefs_.DownloadPrefsEditor_> previousUpdateDir() {
            return stringField("previousUpdateDir");
        }

        public StringPrefEditorField<DownloadPrefs_.DownloadPrefsEditor_> updateDir() {
            return stringField("updateDir");
        }

    }

}