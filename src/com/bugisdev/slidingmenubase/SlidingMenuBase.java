package com.bugisdev.slidingmenubase;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

import android.os.Bundle;

public class SlidingMenuBase extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSlidingMenu().setMode(SlidingMenu.LEFT);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        setContentView(R.layout.activity_sliding_menu_base);

        setBehindContentView(R.layout.activity_menu);
        getSlidingMenu().setBehindOffset(100);

	}

}
