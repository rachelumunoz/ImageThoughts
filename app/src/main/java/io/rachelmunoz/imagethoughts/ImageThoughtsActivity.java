package io.rachelmunoz.imagethoughts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImageThoughtsActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new ImageThoughtsFragment();
	}
}
