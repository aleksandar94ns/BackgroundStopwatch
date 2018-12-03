package archon.solutions.com.backgroundstopwatch.ui.activity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import archon.solutions.com.backgroundstopwatch.R;
import archon.solutions.com.backgroundstopwatch.ui.fragment.DurationsFragment;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.FragmentById;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

@SuppressLint("Registered")
@EActivity(R.layout.activity_route)
@OptionsMenu(R.menu.menu_route_activity_settings)
public class DurationsActivity extends AppCompatActivity {

    @FragmentById(R.id.routesFragment)
    DurationsFragment durationsFragment;

    @OptionsItem
    void settings() {
        Toast.makeText(this, getText(R.string.app_name), Toast.LENGTH_SHORT).show();
    }
}
