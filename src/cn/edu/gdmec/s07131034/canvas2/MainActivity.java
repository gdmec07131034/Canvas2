package cn.edu.gdmec.s07131034.canvas2;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {
	private List<PointF> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    private class MyView extends View {
    	Paint paint = new Paint();

		public MyView(Context context) {
			super(context);
			// TODO 自动生成的构造函数存根
			list = new ArrayList<PointF>();
			
			paint.setColor(Color.BLACK);
			paint.setStrokeWidth(5);
		}
		
		@Override
		protected void onDraw(Canvas canvas) {
			// TODO 自动生成的方法存根
			for(PointF f : list) {
				canvas.drawPoint(f.x, f.y, paint);
			}
		}
		
		@Override
		public boolean onTouchEvent(MotionEvent event) {
			// TODO 自动生成的方法存根
			PointF point = new PointF(event.getX(), event.getY());
			
			list.add(point);
			
			invalidate();
			return true;
		}
    }
   
    
}
