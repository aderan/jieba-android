package io.github.jieba.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import io.github.jieba.JiebaSegmenter;
import io.github.jieba.demo.widget.CustomBottomSheetDialog;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> wordList = JiebaSegmenter.getJiebaSegmenterSingleton()
                    .getDividedString(editText.getText().toString());

                CustomBottomSheetDialog sheetDialog = new CustomBottomSheetDialog(
                    MainActivity.this,
                    wordList
                );
                sheetDialog.show();
            }
        });
    }
}
