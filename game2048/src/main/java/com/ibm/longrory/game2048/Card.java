package com.ibm.longrory.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/10/23.
 */

public class Card extends LinearLayout {
    private TextView textView;
    private int number;

    public Card(Context context) {
        super(context);
        initCard();
    }

    public Card(Context context, AttributeSet attrs) {
        super(context, attrs);
        initCard();
    }

    public Card(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initCard();
    }

    private void initCard() {
        textView = new TextView(getContext());
        number = 0;
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(24);
        if (number != 0) {
            textView.setText(this.number + "");
        }
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(10, 10, 0, 0);
        textView.setLayoutParams(layoutParams);
        this.setCardBackground();
        this.setBackgroundColor(getResources().getColor(R.color.colorback));
        this.addView(textView);

    }


    public void setCardBackground() {
        if (number == 0) {
            textView.setBackgroundColor((getResources().getColor(R.color.background)));
        }
        if (number == 2) {
            textView.setBackgroundColor(getResources().getColor(R.color.background2));
        }
        if (number == 4) {
            textView.setBackgroundColor(getResources().getColor(R.color.background4));
        }
        if (number == 8) {
            textView.setBackgroundColor(getResources().getColor(R.color.background8));
        }
        if (number == 16) {
            textView.setBackgroundColor(getResources().getColor(R.color.background16));
        }
        if (number == 32) {
            textView.setBackgroundColor(getResources().getColor(R.color.background32));
        }
        if (number >= 64) {
            textView.setBackgroundColor(getResources().getColor(R.color.background64));
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
