package com.androideduio.activity_lifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val ON_CREATE_TAG = "ON_CREATE"
    val ON_POST_CREATE_TAG = "ON_POST_CREATE"
    val ON_START_TAG = "ON_START"
    val ON_PAUSE_TAG = "ON_PAUSE"
    val ON_RESUME_TAG = "ON_RESUME"
    val ON_POST_RESUME_TAG = "ON_POST_RESUME"
    val ON_STOP_TAG = "ON_STOP"
    val ON_RESTART_TAG = "ON_RESTART"
    val ON_DESTROY_TAG = "ON_DESTROY"
    val ON_BACK_PRESSED_TAG = "ON_BACK_PRESSED"
    val ON_CONTENT_CHANGED_TAG = "ON_CONTENT_CHANGED"
    val ON_RESTORE_TAG = "ON_RESTORE_INSTANCE"
    val ON_ATTACHED_TO_WINDOW_TAG = "ON_ATTACHED_TO_WINDOW"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(ON_CREATE_TAG,"Log")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.e(ON_POST_CREATE_TAG,"Log")
    }

    override fun onStart() {
        super.onStart()
        Log.e(ON_START_TAG,"Log")
    }

    override fun onPause() {
        super.onPause()
        Log.e(ON_PAUSE_TAG,"Log")
    }

    override fun onResume() {
        super.onResume()
        Log.e(ON_RESUME_TAG,"Log")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.e(ON_POST_RESUME_TAG,"Log")
    }

    override fun onStop() {
        super.onStop()
        Log.e(ON_STOP_TAG,"Log")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(ON_RESTART_TAG,"Log")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(ON_DESTROY_TAG,"Log")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e(ON_BACK_PRESSED_TAG,"Log")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e(ON_CONTENT_CHANGED_TAG,"Log")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(ON_RESTORE_TAG,"Log" )
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e(ON_ATTACHED_TO_WINDOW_TAG, "Log")
    }

    // onCreateOptionsMenu()
    // onPrepareOptionsMenu()
    // onSaveInstanceState()
    // onUserInteraction()
    // onUserLeaveHint()
    // onActivityResult()
    // onAttachFragment()
    // onConfigurationChanged()
}
