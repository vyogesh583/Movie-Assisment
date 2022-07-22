package com.app.yogesh_verma_movie.movie_module.screens.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.yogesh_verma_movie.R
import com.app.yogesh_verma_movie.base.BaseFragment
import com.app.yogesh_verma_movie.databinding.FragmentFavouriteBinding
import com.app.yogesh_verma_movie.databinding.FragmentMovieBinding

class FavouriteFragment : BaseFragment() {

    companion object {
        var TAG = BaseFragment::class.java.simpleName

        fun getInstance():FavouriteFragment{
            return FavouriteFragment()
        }
    }

    private var _viewBinder: FragmentFavouriteBinding? = null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _viewBinder = FragmentFavouriteBinding.inflate(inflater, container, false)
        return _viewBinder?.root
    }


    override fun initViewModels() {

    }

    override fun onViewClick(view: View?) {

    }

    override fun initView(view: View) {


    }

    override fun setListeners() {

    }

    override fun setObservers() {

    }

}