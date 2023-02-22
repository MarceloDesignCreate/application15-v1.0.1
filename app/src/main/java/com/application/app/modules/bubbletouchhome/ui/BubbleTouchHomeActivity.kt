package com.application.app.modules.bubbletouchhome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.appcomponents.facebookauth.FacebookHelper
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.ActivityBubbleTouchHomeBinding
import com.application.app.modules.bubbletouchhome.`data`.model.ListgrouptwentynineRowModel
import com.application.app.modules.bubbletouchhome.`data`.viewmodel.BubbleTouchHomeVM
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BubbleTouchHomeActivity :
    BaseActivity<ActivityBubbleTouchHomeBinding>(R.layout.activity_bubble_touch_home) {
  private val viewModel: BubbleTouchHomeVM by viewModels<BubbleTouchHomeVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgrouptwentynineAdapter =
    ListgrouptwentynineAdapter(viewModel.listgrouptwentynineList.value?:mutableListOf())
    binding.recyclerListgrouptwentynine.adapter = listgrouptwentynineAdapter
    listgrouptwentynineAdapter.setOnItemClickListener(
    object : ListgrouptwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgrouptwentynineRowModel) {
        onClickRecyclerListgrouptwentynine(view, position, item)
      }
    }
    )
    viewModel.listgrouptwentynineList.observe(this) {
      listgrouptwentynineAdapter.updateData(it)
    }
    binding.bubbleTouchHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearRowwhatsapp.setOnClickListener {
      LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
      facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
        override fun onSuccess(result: LoginResult?) {
        }
        override fun onError(error: FacebookException?) {
        }
        override fun onCancel() {
        }
        })
      }
    }

    fun onClickRecyclerListgrouptwentynine(
      view: View,
      position: Int,
      item: ListgrouptwentynineRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "BUBBLE_TOUCH_HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, BubbleTouchHomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
