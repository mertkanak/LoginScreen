package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginscreen.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    // ViewBinding değişkenini tanımla
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Binding'i initialize et
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Giriş butonuna tıklama olayını handle et
        binding.loginButton.setOnClickListener {
            // Kullanıcı adı ve şifre metinlerini al
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            // Kullanıcı adı veya şifre boş ise uyarı mesajı göster
            if (username.isBlank() || password.isBlank()) {
                Toast.makeText(this, "Kullanıcı adı ve şifre alanı boş bırakılamaz!", Toast.LENGTH_LONG).show()
            } else {
                // Giriş başarılı olduğunda yapılacak işlemler (Örnek)
                login(username, password)
            }
        }
    }

    // Giriş işlemini simüle eden fonksiyon
    private fun login(username: String, password: String) {
        // Giriş işlemi burada simüle edilmiştir, gerçek bir backend ile entegre edilmelidir.
        Toast.makeText(this, "$username ile giriş yapıldı.", Toast.LENGTH_SHORT).show()
    }
}
