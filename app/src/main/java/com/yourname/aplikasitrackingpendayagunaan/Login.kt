package com.yourname.aplikasitrackingpendayagunaan
//identitas file
import android.content.Intent   // buat pindah halaman
import android.os.Bundle //buat nyimepn state/data activity
import android.widget.Button //buat bisa mengenali komponen button
import androidx.activity.enableEdgeToEdge //buat tampilan full layar
import androidx.appcompat.app.AppCompatActivity //kelas induk acitivy

class Login : AppCompatActivity() { //  class login itu nama activity , AppCompatActivity() itu artinya class login itu turunan dtoolbar dari AppCompactActivity
    //AppCompatActivity kelas bawaan android yg menyediakan semua fungsi dasar spt button, tombol back, toolbar dll
    override fun onCreate(savedInstanceState: Bundle?) {
    //override : menimpa / memodifikasi fungsi yg udah ada di AppCompat diatas
    //fun onCreate : dipanggil pertama kali saat halaman dibuka
    //savedInstanceState: Bundle? : nyimpen data kalau activity diputar/direstart, tanda ? artinya boleh null/kosong
        super.onCreate(savedInstanceState)
        //menjalankan onCreate dari parent (AppCompactAcitivy)
        enableEdgeToEdge()
        //bikin tampilan full sampai ke tepi layar
        setContentView(R.layout.activity_login)
        //pasang tampilan xml ke halaman ini

        val btnLogin = findViewById<Button>(R.id.btn_register)
        //val deklarasi variable yg nilainya tetap
        btnLogin.setOnClickListener {
        //dengerin kalau tombol diclick
        // {} kode didalam dijalankan saat tombol di click
            goToMainActivity()
            //memanggil funksi pindah halaman
        }
    }

    private  fun goToMainActivity () {
    //fungsi private yg cuma bisa diakses di file Login.kt
        val intent = Intent(this, MainActivity::class.java)
        // memanggil inten(objek untuk berpindah halaman) , berpindah dari halaman ini ke halaman Main
        startActivity(intent)
        //eksekusi pindah halaman
        finish()
        //tutup halaman login agar tidak bisa di-back
    }

}