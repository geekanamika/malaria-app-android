package com.peacecorps.malaria.data.prefs;

public interface PreferencesHelper {
    boolean hasUserSetPreferences();
    void setUserPreferences(boolean value);
    int getUserScore();
    void setUserScore(int score);
    int getGameScore();
    void setGameScore(int score);
    String getDrugPicked();
    void setDrugPicked(String drug);
    long getFirstRunTime();
    void setFirstRunTime(long value);
    int getDrugAcceptedCount();
    void setDrugAcceptedCount(int value);
    boolean isDosesWeekly();
    void setDoseWeekly(boolean value);
    int checkDosesDaily();
    int getDayWeekly();
    void setDosesDaily(int value);
    void setDayWeekly(int value);
    int checkDosesWeekly();
    void setDosesWeekly(int value);
    int getMedicineStoreValue();
    void setMedicineStoreValue(int value);
    String getMedicineLastTakenTime();
    void setMedicineLastTakenTime(String time);
    boolean getMythFactGame();
    void setMythFactGame(boolean val);
    boolean getRapidFireGame();
    void setRapidFireGame(boolean val);
    String getToneUri();
    void setToneUri(String uri);
    String getTripDate();
    void setTripDate(String date);
    String getTripLocation();
    void setTripLocation(String location);
    String getUserName();
    String getUserEmail();
    int getUserAge();
    void setUserName(String name);
    void setUserEmail(String email);
    void setUserAge(int age);
    boolean isFirstRun();
    void setFirstRun(boolean val);
    boolean isDrugTaken();
    void setDrugTaken(boolean value);
    int getAlertNumberDaysOrWeeks();
    void setAlertNumberDaysOrWeeks(int value);
    String getReminderMessageForTrip();
    void setReminderMessageForTrip(String messageForTrip);
    void setLongWeeklyDate(long value);
    long getLongWeeklyDate();
    void setDateDrugTaken(long value);
    long getDateDrug();
    void setWeeklyDrugTaken(boolean value);
    boolean isWeeklyDrugTaken();
    void setDailyDrugTaken(boolean value);
    boolean isDailyDrugTaken();
    int getDrugRejectedCount();
    void setDrugRejectedCount(int value);

}
