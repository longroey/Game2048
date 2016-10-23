package com.ibm.longrory.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

/**
 * Created by Administrator on 2016/10/23.
 */

public class GridBlock extends GridLayout {
    private Card[][] cards = new Card[4][4];

    public GridBlock(Context context) {
        super(context);
    }

    public GridBlock(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridBlock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean addCard(){

        return true;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int cardWidth = Math.min(w, h)/4;
        for (int y=0;y<4;y++){
            for (int x=0;x<4;x++){
                cards[x][y] = new Card(getContext());
                this.addView(cards[x][y],cardWidth,cardWidth);

            }
        }
    }
}
