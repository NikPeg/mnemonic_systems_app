package ru.dewhilefor.mnemonicsystems.ui.ds;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DSViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DS fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}