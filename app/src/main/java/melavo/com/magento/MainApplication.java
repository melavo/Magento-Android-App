package melavo.com.magento;
import android.app.Application;
import com.squareup.leakcanary.LeakCanary;
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
