package pl.michalz.hideonscrollexample;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by ziyang0621 on 7/16/15.
 */
public class FrameLayoutBehavior extends CoordinatorLayout.Behavior<FrameLayout> {

    public FrameLayoutBehavior(Context context, AttributeSet attrs) {
        super();
//        this.toolbarHeight = Utils.getToolbarHeight(context);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, FrameLayout child, View dependency) {
        return true;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, FrameLayout child, View dependency) {
        boolean returnValue = super.onDependentViewChanged(parent, child, dependency);

//        if (dependency instanceof AppBarLayout) {
//            CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
//            int fabBottomMargin = lp.bottomMargin;
//            int distanceToScroll = fab.getHeight() + fabBottomMargin;
//            float ratio = (float)dependency.getY()/(float)toolbarHeight;
//            fab.setTranslationY(-distanceToScroll * ratio);
//        }

        child.setBackgroundColor(Color.GREEN);

        return returnValue;
    }
}
