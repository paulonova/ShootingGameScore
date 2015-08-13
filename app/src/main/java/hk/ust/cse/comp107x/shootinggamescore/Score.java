package hk.ust.cse.comp107x.shootinggamescore;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;


public class Score {

    private Paint paint;
    private int score;
    float x;
    float y;

    // Constructor
    public Score(int color) {
        paint = new Paint();
        // Set the font face and size of drawing text
        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextSize(24);
        paint.setColor(color);

        // TODO initialize score
        score = 0;
    }

    public void incrementScore() {
        // TODO Increment score
        score ++;
    }


    public void decrementScore() {
        // TODO Decrement score
            score --;

    }

    public int getScore() {
        return score;
    }

    public void draw(Canvas canvas) {

        // TODO use drawText(String, x co-ordinate, y-coordinate, paint) to
        // draw text on the canvas. Position the text at (10,30).
        canvas.drawText("Score: " + getScore(), 10, 30, paint);
    }
}
