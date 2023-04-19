package com.example.menuoptions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    val viewFragment = ViewFragment()
    val editFragment = EditFragment()
    val updateFragment = UpdateFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewFragment = ViewFragment()
        val editFragment = EditFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.MainFrag, editFragment)
            commit()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 ->
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.MainFrag, viewFragment)
                    commit()
                }

            R.id.item2 ->
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.MainFrag, editFragment)
                    commit()
                }

            R.id.item3 ->
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.MainFrag, updateFragment)
                    commit()
                }
            }



        return true;
    }
}