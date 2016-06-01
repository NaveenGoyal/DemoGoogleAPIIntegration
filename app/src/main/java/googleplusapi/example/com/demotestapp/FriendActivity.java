package googleplusapi.example.com.demotestapp;

/**
 * Created by n.goyal on 5/31/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class FriendActivity extends AppCompatActivity {

    List<String> list = new ArrayList<String>();
    List<String> img_list= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        Intent intent = getIntent();
        list = intent.getStringArrayListExtra("friendsName");
        img_list = intent.getStringArrayListExtra("friendsPic");
        setListView();
    }

    private void setListView(){

        MyFriendListAdapter adapter=new MyFriendListAdapter(this,list,img_list);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }

}
