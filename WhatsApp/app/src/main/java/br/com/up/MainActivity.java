package br.com.up;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutFone;
    private TextInputLayout inputLayoutMsg;

    private TextInputEditText inputEditTextFone;
    private TextInputEditText inputEditTextMsg;

    private Button btnEnviaMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutFone = findViewById(R.id.input_fone_layout);
        inputLayoutMsg = findViewById(R.id.Input_text_layout);

        inputEditTextFone = findViewById(R.id.edit_number_fone);
        inputEditTextMsg = findViewById(R.id.input_text_msg);

        btnEnviaMsg = findViewById(R.id.btn_envia_msg);
        btnEnviaMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { enviaMsg();
            }
        });
    }

    private void enviaMsg() {

        String fone = inputEditTextFone.getText().toString();
        String msg = inputEditTextMsg.getText().toString();

        Uri webpage = Uri.parse("https://api.whatsapp.com/send/?phone="+fone+"&text="+msg);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}







