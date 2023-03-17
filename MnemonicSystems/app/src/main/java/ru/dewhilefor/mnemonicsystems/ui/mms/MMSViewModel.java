package ru.dewhilefor.mnemonicsystems.ui.mms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MMSViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MMSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is MMS fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}