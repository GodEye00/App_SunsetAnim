package andriod.bignerdranch.sunset;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class SunSetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SunSetFragment.newInstance();
    }


}