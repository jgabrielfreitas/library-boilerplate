package br.com.boilerplate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import com.jgabrielfreitas.boilerplate.Boilerplate;
import com.jgabrielfreitas.boilerplate.Foo;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

  private TextView mTextMessage;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mTextMessage = (TextView) findViewById(R.id.message);
    BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(this);
  }

  @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      case R.id.navigation_home:
        mTextMessage.setText(Boilerplate.returnHelloWorld());
        return true;
      case R.id.navigation_dashboard:

        List<Foo> someoneFoos = new ArrayList<>();
        for (int i = 0; i < 10; i++)
          someoneFoos.add(new SomeoneFoo(format("Foo %02d", i + 1), format("subtitle: %02d\n", i + 1)));

        Boilerplate.setFooList(someoneFoos);
        mTextMessage.setText(Boilerplate.getFooList().toString());
        return true;
      case R.id.navigation_notifications:
        mTextMessage.setText(R.string.title_notifications);
        return true;
    }
    return false;
  }
}
