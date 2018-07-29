package com.peacecorps.malaria.ui.play;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peacecorps.malaria.R;
import com.peacecorps.malaria.ui.base.BaseFragment;
import com.peacecorps.malaria.utils.ToastLogSnackBarUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Anamika Tripathi on 18/7/18.
 */
public class PlayFragment extends BaseFragment {

    private OnPlayFragmentListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_play, container, false);
        // butter knife binding
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected int getContentResource() {
        return R.layout.fragment_play;
    }

    // listener for badge button in play fragment
    @OnClick(R.id.btn_badge_screen)
    public void badgeScreenListener(View view) {
        listener.replacePlayFragment(R.id.btn_badge_screen);
    }

    // listener for badge button in play fragment
    @OnClick(R.id.btn_myth_vs_fact)
    public void mythVsFactListener(View view) {
        // calls interface method which is implemented by mainActivity - replaces play fragment with MythVsFactFragment
        listener.replacePlayFragment(R.id.btn_myth_vs_fact);
    }

    // listener for rapid fire button in play fragment
    @OnClick(R.id.btn_rapid_fire)
    public void rapidFireListener(View view) {
        // replaces play fragment with RapidFireFragment
        listener.replacePlayFragment(R.id.btn_rapid_fire);
    }

    @OnClick(R.id.btn_medicine_store)
    public void medicineStoreListener(View view) {
        // replaces play fragment with MedicineStore Fragment
        listener.replacePlayFragment(R.id.btn_medicine_store);
    }

    @Override
    protected void init() {

    }

    // it needs to be implemented by main activity
    public interface OnPlayFragmentListener {
        void replacePlayFragment(int id);
    }

    // Container Activity must implement this interface
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        if (context instanceof OnPlayFragmentListener) {
            listener = (OnPlayFragmentListener) context;
        } else {
            // Show error Log for debugging & display snackbar to user
            ToastLogSnackBarUtil.showErrorLog(context.toString() + " must implement OnPlayFragmentListener");
            if(getActivity()!=null) {
                ToastLogSnackBarUtil.showSnackBar(context, getActivity().findViewById(android.R.id.content),
                        "Something went wrong!");
            }
        }
    }

    // setting null values to the listener, presenter
    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    //Todo Kept for reference for showing dialog for playing the games, need to discuss in work session
    /*

     * This method is used to show the help dialog for a game.
     * To reduce code redundancy, the different alerts for different games were combined,
     * and can be used with the below parameter.
     * @param gameID Enter the gameID (R.integer.MythFactGame for MythFactGame and R.integer.RapidFireGame for RapidFireGame) to show the dialog.

    public void showHelpDialog(final int gameID) {

        String strHowToPlay = "", strGameInfo = "";
        if (gameID == getResources().getInteger(R.integer.RapidFireGame)) {
            strHowToPlay = getString(R.string.help_rapid_fire_how_to_play);
            strGameInfo = getString(R.string.help_rapid_fire_info);
        } else if (gameID == getResources().getInteger(R.integer.MythFactGame)) {
            strHowToPlay = getString(R.string.help_myth_fact_how_to_play);
            strGameInfo = getString(R.string.help_myth_fact_info);
        }

        final Dialog helpDialog = new Dialog(context, android.R.style.Theme_DeviceDefault_Dialog_NoActionBar);
        helpDialog.setContentView(R.layout.game_help_dialog);

        TextView howToPlay = (TextView) helpDialog.findViewById(R.id.helpGameDialogHowToPlay);
        TextView gameInfo = (TextView) helpDialog.findViewById(R.id.helpGameDialogInfo);
        final CheckBox showNextTime = (CheckBox) helpDialog.findViewById(R.id.helpGameDialogShowNextTime);
        Button start = (Button) helpDialog.findViewById(R.id.helpGameDialogButtonStart);

        howToPlay.setText(strHowToPlay);
        gameInfo.setText(strGameInfo);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (showNextTime.isChecked()) {
                    if (gameID == getResources().getInteger(R.integer.RapidFireGame))
                        editor.putBoolean(getString(R.string.shared_prefs_rapid_fire_game), true);
                    else if (gameID == getResources().getInteger(R.integer.MythFactGame))
                        editor.putBoolean(getString(R.string.shared_prefs_myth_fact_game), true);
                } else {
                    if (gameID == getResources().getInteger(R.integer.RapidFireGame))
                        editor.putBoolean(getString(R.string.shared_prefs_rapid_fire_game), false);
                    else if (gameID == getResources().getInteger(R.integer.MythFactGame))
                        editor.putBoolean(getString(R.string.shared_prefs_myth_fact_game), false);
                }
                editor.commit();
                helpDialog.dismiss();
            }
        });
        helpDialog.show();
    }
     */

}
