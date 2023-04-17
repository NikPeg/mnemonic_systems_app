package ru.dewhilefor.mnemonicsystems.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import java.io.FileInputStream;
import java.io.IOException;

import ru.dewhilefor.mnemonicsystems.R;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentDictionaryBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentMmsBinding;
import ru.dewhilefor.mnemonicsystems.databinding.FragmentNumbersBinding;
import ru.dewhilefor.mnemonicsystems.ui.mms.MMSViewModel;

public class DictionaryFragment extends Fragment {
    private final static String FILE_NAME = "dict.txt";

    private void setDict(TextView textView) {
//        FileInputStream fin = null;
//        try {
//            fin = getActivity().openFileInput(FILE_NAME);
//            byte[] bytes = new byte[fin.available()];
//            fin.read(bytes);
//            String text = new String(bytes);
//            textView.setText(text);
//        } catch (NullPointerException ex) {
//            Toast.makeText(getActivity(), "There is no activity: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
//        } catch (IOException ex) {
//            Toast.makeText(getActivity(), "There is no file: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dictionary, container, false);
        TextView textView = view.findViewById(R.id.text_dictionary);
        setDict(textView);
        return view;
    }
}