package com.doanbvph31058.lab2_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);


        TextView txtResult = findViewById(R.id.txtResult);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtID = findViewById(R.id.edtID);
        EditText edtAge = findViewById(R.id.edtAge);
        RadioButton rdoMen = findViewById(R.id.rdoMen);
        RadioButton rdoGirl = findViewById(R.id.rdoGirl);
        CheckBox chkFootball = findViewById(R.id.chkFootball);
        CheckBox chkGame = findViewById(R.id.chkGame);
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String  id = edtID.getText().toString();
                String  age = edtAge.getText().toString();

                String gender = rdoGirl.isChecked()
                        ? rdoGirl.getText().toString()
                        : rdoMen.isChecked()
                        ? rdoMen.getText().toString()
                        : "Chưa lựa chọn giới tính";
                String interest = chkFootball.isChecked() && chkGame.isChecked()
                        ?"Đá bóng và chơi game"
                        : chkFootball.isChecked()
                        ? chkFootball.getText().toString()
                        : chkGame.isChecked()
                        ? chkGame.getText().toString()
                        :"Không thích gì cả";
                txtResult.setText("Tôi tên: " + name + "\n"
                                    + "MSV:" + id + "\n"
                                    + "Tuổi:" + age + "\n"
                                    + "Giới tính: " + gender + "\n"
                                    + "Sở thích: " + interest );


            }
        });
    }
}