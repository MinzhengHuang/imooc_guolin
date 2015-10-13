package com.guolin.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.guolin.FragmentActivity;
import com.guolin.PhotoWallFallsActivity;
import com.guolin.PhotosWallActivity;
import com.guolin.R;

public class SecondFragment extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_second, container, false);
		view.findViewById(R.id.btn_PhotoWall).setOnClickListener(this);
		view.findViewById(R.id.btn_PhotoWallFull).setOnClickListener(this);
		view.findViewById(R.id.btn_fragment).setOnClickListener(this);
		return view;

	}

	@Override
	public void onClick(View v) {
		Intent intent=null;
		switch (v.getId()) {
		case R.id.btn_PhotoWall:
			intent=new Intent(getActivity(), PhotosWallActivity.class);
			break;
		case R.id.btn_PhotoWallFull:
			intent=new Intent(getActivity(), PhotoWallFallsActivity.class);
			break;
		case R.id.btn_fragment:
			intent=new Intent(getActivity(), FragmentActivity.class);
			break;

		default:
			break;
		}
		startActivity(intent);
	}
}
