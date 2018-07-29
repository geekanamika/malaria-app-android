package com.peacecorps.malaria.ui.user_medicine_setting;

import com.peacecorps.malaria.ui.base.MvpPresenter;
import com.peacecorps.malaria.ui.base.MvpView;

public interface MedicineSettingContract {
    interface View extends MvpView {
        void startMainActivity();
        void setSelectedTime(String theTime);
        void enableDoneButton();
    }

    interface Presenter<V extends View> extends MvpPresenter<V> {
        void checkInitialAppInstall();
        void setUserAndMedicationPreference(int hour, int minute, int drugPickedNo);
        void convertToTwelveHours(int hours, int mins);
    }
}
