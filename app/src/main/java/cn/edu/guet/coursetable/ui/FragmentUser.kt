package cn.edu.guet.coursetable.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import cn.edu.guet.coursetable.LoginActivity
import cn.edu.guet.coursetable.databinding.FragmentUserBinding
import cn.edu.guet.coursetable.viewmodel.DBViewModel
import cn.edu.guet.coursetable.viewmodel.DataViewModel


/**
 * 用户中心，基本上没写
 */
class FragmentUser:Fragment() {


    companion object{
        var fragment:Fragment?=null
        fun getInstance():Fragment{
            return fragment?: synchronized(this){
                val ins=FragmentUser()
                fragment=ins
                ins
            }
        }
    }

    lateinit var mView: FragmentUserBinding
    lateinit var dbViewModel: DBViewModel
    lateinit var dataViewModel: DataViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView=FragmentUserBinding.inflate(inflater,container,false)
        dbViewModel=ViewModelProvider(requireActivity()).get(DBViewModel::class.java)
        dataViewModel=ViewModelProvider(requireActivity()).get(DataViewModel::class.java)
        return mView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mView.gotoLogin.setOnClickListener {
            startActivity(Intent(context,LoginActivity::class.java))
        }
        mView.test.setOnClickListener{
            startActivity(Intent(context,CoursePlanActivity::class.java))
        }
        dbViewModel.account.observe(viewLifecycleOwner, Observer {
            mView.headerUsername.text=it.name
            mView.headerNumber.text=it.stid
        })
        dataViewModel.account.observe(viewLifecycleOwner, Observer {
            Log.d("TAG", "onViewCreated: ${it==null}")
            mView.headerUsername.text=it.name
            mView.headerNumber.text=it.stid
        })
    }
}