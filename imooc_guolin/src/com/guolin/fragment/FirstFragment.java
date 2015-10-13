package com.guolin.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.guolin.ContactsActivity;
import com.guolin.PullToFreshActivity;
import com.guolin.R;
import com.guolin.RenrenSlideMenuActivity;
import com.guolin.RotatePicBrowserActivity;
import com.guolin.SlidingLayoutActivity;
import com.guolin.SlidingViewSwitcherActivity;
import com.guolin.ThreeDSlidingLayoutActivity;
import com.guolin.WeChatActivity;
import com.guolin.view.SlidingSwitcherView;

public class FirstFragment extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first, container, false);
		view.findViewById(R.id.btn_Contacts).setOnClickListener(this);
		view.findViewById(R.id.btn_PullToRefresh).setOnClickListener(this);
		view.findViewById(R.id.btn_RenrenSlideMenu).setOnClickListener(this);
		view.findViewById(R.id.btn_RotatePicBrowser).setOnClickListener(this);
		view.findViewById(R.id.btn_WeChat).setOnClickListener(this);
		view.findViewById(R.id.btn_SlidingLayout).setOnClickListener(this);
		view.findViewById(R.id.btn_SlidingSwitcherView).setOnClickListener(this);
		view.findViewById(R.id.btn_3dslidinglayout).setOnClickListener(this);
		return view;

	}

	@Override
	public void onClick(View v) {
		Intent intent=null;
		switch (v.getId()) {
		case R.id.btn_Contacts:
			intent=new Intent(getActivity(), ContactsActivity.class);
			break;
		case R.id.btn_PullToRefresh:
			intent=new Intent(getActivity(), PullToFreshActivity.class);
			break;
		case R.id.btn_RenrenSlideMenu:
			intent=new Intent(getActivity(), RenrenSlideMenuActivity.class);
			break;
		case R.id.btn_RotatePicBrowser:
			intent=new Intent(getActivity(), RotatePicBrowserActivity.class);
			break;
		case R.id.btn_WeChat:
			intent=new Intent(getActivity(), WeChatActivity.class);
			break;
		case R.id.btn_SlidingLayout:
			intent=new Intent(getActivity(), SlidingLayoutActivity.class);
			break;
		case R.id.btn_SlidingSwitcherView:
			intent=new Intent(getActivity(), SlidingViewSwitcherActivity.class);
			break;
		case R.id.btn_3dslidinglayout:
			intent=new Intent(getActivity(), ThreeDSlidingLayoutActivity.class);
			break;

		default:
			break;
		}
		startActivity(intent);
	}
}
