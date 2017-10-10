package com.moon_rocks_dev.aThousandWords;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class ImageThoughtsActivity extends SingleFragmentActivity implements ImageThoughtsFragment.Callbacks {
	private static final String EXTRA_IMAGE_THOUGHT_ID = "io.rachelmunoz.imagethoughts.extra_imagethought_id";

	@Override
	public Fragment createFragment() {
		UUID id = (UUID) getIntent().getSerializableExtra(EXTRA_IMAGE_THOUGHT_ID);
		ImageThoughtsFragment fragment = ImageThoughtsFragment.newInstance(id);

		return fragment;
	}

	public static Intent newIntent(Context context, UUID id){
		Intent intent = new Intent(context, ImageThoughtsActivity.class);
		intent.putExtra(EXTRA_IMAGE_THOUGHT_ID, id);
		return intent;
	}

	@Override
	public void onImageThoughtUpdated(ImageThought imageThought) {
			//
	}

	@Override
	public void onImageThoughtDeleted() {
		finish();
	}
}

