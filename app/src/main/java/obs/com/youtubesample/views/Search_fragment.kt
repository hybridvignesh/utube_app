package obs.com.youtubesample.views


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import obs.com.youtubesample.R


/**
 * A simple [Fragment] subclass.
 */
class Search_fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_fragment, container, false)
    }

}// Required empty public constructor
