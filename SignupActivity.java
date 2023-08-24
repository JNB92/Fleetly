package com.example.fleetmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    private EditText nameEditText,emailEditText, phoneEditText, passwordEditText;
    private Button signupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        setViewIds();

        signupButton.setOnClickListener(view ->
        {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String phone = phoneEditText.getText().toString();
            String password = passwordEditText.getText().toString();


            if (name.length() < 3 || !name.matches("[a-zA-Z]+")) {
                Toast.makeText(SignupActivity.this, "Invalid Name", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!isValidEmail(email)) {
                Toast.makeText(SignupActivity.this,"Invalid Email Address", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!isValidPhone(phone)) {
                Toast.makeText(SignupActivity.this,"Invalid Phone Number", Toast.LENGTH_SHORT).show();
                return;
            }
            if (password.length() < 5) {
                Toast.makeText(SignupActivity.this,"Password must be at least 5 Characters", Toast.LENGTH_SHORT)
                        .show();
                return;
            }
            // Success!
            Toast.makeText(SignupActivity.this, "Signup successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignupActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void setViewIds()
    {
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signupButton = findViewById(R.id.signupButton);
    }

    private boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(regex);
    }

    private boolean isValidPhone(String phone)
            {
        String regex = "^[0-9]{10}$";
        return phone.matches(regex);
    }
}