package com.example.mohsen.salamatbashid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class WeightCheckupActivity extends AppCompatActivity {

    int weight = 60;
    float height = 160, bmi;
    ImageView userBodyImageView, normalBodyImageView;
    RadioButton maleRadioButton, femaleRadioButton;
    RadioGroup radioGroupGender;
    int lastImage,
            gender_body1 = R.drawable.body_1,
            gender_body2 = R.drawable.body_2,
            gender_body3 = R.drawable.body_3,
            gender_body4 = R.drawable.body_4,
            gender_body5 = R.drawable.body_5;

    NumberPicker weightNumberPicker, heightNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_checkup);
        initViews();
        setDefaultNumberPickers();
        normalBodyImageView.setAlpha(0f);
        normalBodyImageView.animate().alpha(1f).setDuration(1000);

        radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                lastImage = -1;
                changePhotoGender(checkedId);
            }
        });

        weightNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                weight = newVal;
                computeBmi();
            }
        });
        heightNumberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                height = (float) newVal / 100;
                computeBmi();
            }
        });
    }

    private void changePhotoGender(int checkedId) {

        if (checkedId == R.id.radioButton_male) {
            normalBodyImageView.setImageResource(R.drawable.body_2);
            gender_body1 = R.drawable.body_1;
            gender_body2 = R.drawable.body_2;
            gender_body3 = R.drawable.body_3;
            gender_body4 = R.drawable.body_4;
            gender_body5 = R.drawable.body_5;
            computeBmi();

        }
        if (checkedId == R.id.radioButton_female) {
            normalBodyImageView.setImageResource(R.drawable.fbody_2);
            gender_body1 = R.drawable.fbody_1;
            gender_body2 = R.drawable.fbody_2;
            gender_body3 = R.drawable.fbody_3;
            gender_body4 = R.drawable.fbody_4;
            gender_body5 = R.drawable.fbody_5;
            computeBmi();
        }
    }

    private void setDefaultNumberPickers() {
        weightNumberPicker.setMaxValue(200);
        weightNumberPicker.setMinValue(2);
        weightNumberPicker.setValue(60);
        heightNumberPicker.setMaxValue(270);
        heightNumberPicker.setMinValue(20);
        heightNumberPicker.setValue(160);
    }

    private void computeBmi() {
        bmi = weight / (height * height);
        if (bmi < 18.5 && lastImage != 1) {
            userBodyImageView.setAlpha(0f);
            userBodyImageView.setImageResource(gender_body1);
            userBodyImageView.animate().alpha(1f).setDuration(1000);
            lastImage = 1;
        } else if (bmi >= 18.5 && bmi < 25 && lastImage != 2) {
            userBodyImageView.setAlpha(0f);
            userBodyImageView.setImageResource(gender_body2);
            userBodyImageView.animate().alpha(1f).setDuration(1000);
            lastImage = 2;
        } else if (bmi >= 25 && bmi < 30 && lastImage != 3) {
            userBodyImageView.setAlpha(0f);
            userBodyImageView.setImageResource(gender_body3);
            userBodyImageView.animate().alpha(1f).setDuration(1000);
            lastImage = 3;
        } else if (bmi >= 30 && bmi < 35 && lastImage != 4) {
            userBodyImageView.setAlpha(0f);
            userBodyImageView.setImageResource(gender_body4);
            userBodyImageView.animate().alpha(1f).setDuration(1000);
            lastImage = 4;
        } else if (bmi >= 35 && lastImage != 5) {
            userBodyImageView.setAlpha(0f);
            userBodyImageView.setImageResource(gender_body5);
            userBodyImageView.animate().alpha(1f).setDuration(1000);
            lastImage = 5;
        }
    }

    private void initViews() {
        userBodyImageView = findViewById(R.id.user_body);
        heightNumberPicker = findViewById(R.id.height_number_picker);
        weightNumberPicker = findViewById(R.id.weight_number_picker);
        userBodyImageView = findViewById(R.id.user_body);
        maleRadioButton = findViewById(R.id.radioButton_male);
        femaleRadioButton = findViewById(R.id.radioButton_female);
        normalBodyImageView = findViewById(R.id.normal_body_image);
        radioGroupGender = findViewById(R.id.radio_gender);
    }

}
