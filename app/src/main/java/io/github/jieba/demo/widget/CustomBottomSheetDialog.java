package io.github.jieba.demo.widget;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import io.github.jieba.demo.R;
import java.util.ArrayList;

public class CustomBottomSheetDialog extends BottomSheetDialog {

    private DivideCard divideCard;

    public CustomBottomSheetDialog(@NonNull Context context, ArrayList<String> targetItems) {
        super(context);
        initViews();
        setDividedWords(targetItems);
    }

    private void initViews() {
        View bottomSheetView = getLayoutInflater().inflate(R.layout.divided_sentence_layout, null);
        setContentView(bottomSheetView);

        View parent = (View) bottomSheetView.getParent();
        parent.setBackgroundColor(
            getContext().getResources().getColor(R.color.transparent));

        divideCard = bottomSheetView.findViewById(R.id.divide_layout);
        BottomSheetBehavior.from(parent).setState(BottomSheetBehavior.STATE_EXPANDED);
    }

    public void setDividedWords(ArrayList<String> words) {
        divideCard.setWords(words);
    }

}