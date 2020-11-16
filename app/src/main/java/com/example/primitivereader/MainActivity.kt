package com.example.primitivereader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.ui.LibraryFragment

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_main)

        initLibraryFragment()
    }

    private fun initLibraryFragment() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.mainFragmentContainer)

        if(currentFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.mainFragmentContainer, LibraryFragment.getInstance())
                .commit()
        }
    }
}