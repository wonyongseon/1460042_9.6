package com.example.a512.a1460042_96;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btName;
    public TextView txName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txName=(TextView)findViewById(R.id.txName);
        btName=(Button)findViewById(R.id.btName);

        btName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txName.setText("Won yong seon");
                Toast.makeText(getApplicationContext(),"Won",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
