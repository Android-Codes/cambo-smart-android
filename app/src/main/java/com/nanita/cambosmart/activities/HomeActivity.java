package com.nanita.cambosmart.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.nanita.cambosmart.R;
import com.nanita.cambosmart.fragments.AccountFragment;
import com.nanita.cambosmart.fragments.ChangePasswordFragment;
import com.nanita.cambosmart.fragments.HomeFragment;
import com.nanita.cambosmart.fragments.LanguageFragment;
import com.nanita.cambosmart.fragments.MyAdsFragment;
import com.nanita.cambosmart.fragments.PostAdsFragment;
import com.nanita.cambosmart.fragments.SaveAdsFragment;
import com.nanita.cambosmart.fragments.SetMapFragment;
import com.nanita.cambosmart.fragments.SettingFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_home) {
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,homeFragment,"Home Fragment").commit();

        } else if (id == R.id.nav_past_ads) {
            PostAdsFragment postAdsFragment = new PostAdsFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,postAdsFragment,"Post Ads Fragment").commit();

        } else if (id == R.id.nav_my_ads) {
            MyAdsFragment myAdsFragment = new MyAdsFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,myAdsFragment,"My Ads Fragment").commit();
            
        } else if (id == R.id.nav_save_ads) {
            SaveAdsFragment saveAdsFragment = new SaveAdsFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,saveAdsFragment,"Save Ads Fragment").commit();

        } else if (id == R.id.nav_account) {
            AccountFragment accountFragment = new AccountFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,accountFragment,"Account Fragment").commit();

        } else if (id == R.id.nav_set_map) {
            SetMapFragment setMapFragment = new SetMapFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,setMapFragment,"SetMap Fragment").commit();

        }else if(id == R.id.nav_change_password){
            ChangePasswordFragment changePasswordFragment  = new ChangePasswordFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,changePasswordFragment,"ChangePassword Fragment").commit();

        }else if(id == R.id.nav_language){
            LanguageFragment languageFragment = new LanguageFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,languageFragment,"Language Fragment").commit();

        }else if(id == R.id.nav_setting){
            SettingFragment settingFragment = new SettingFragment();
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container,settingFragment,"Setting Fragment").commit();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
