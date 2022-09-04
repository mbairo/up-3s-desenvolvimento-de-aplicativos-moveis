package br.com.up.whatsapp_message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText input_edit_text_phone;
    private TextInputEditText input_edit_text_msg;

    private Button btn_send_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_edit_text_phone = findViewById(R.id.input_edit_text_phone);
        input_edit_text_msg = findViewById(R.id.input_edit_text_msg);
        btn_send_message = findViewById(R.id.btn_send_message);

        btn_send_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMsg();
            }
        });
    }

    private void sendMsg(){
        String phone = input_edit_text_phone.getText().toString();
        String msg = input_edit_text_msg.getText().toString();

        Uri webpage = Uri.parse("https://api.whatsapp.com/send/?phone="+phone+"&text="+msg);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}
