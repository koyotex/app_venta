package com.example.my_app_comision.clases;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class datepickerfragment extends DialogFragment {

    private DatePickerDialog.OnDateSetListener listener;





    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        final Calendar c= Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener) getActivity(), year, month, day);
    }


}
