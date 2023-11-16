package container_fragment_main

import adapter_fragment.TableAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.petprojectgsansan.databinding.ActivityMainBinding
import com.example.petprojectgsansan.databinding.PreloaderContentBinding


class ContainerFragment : Fragment() {



    private lateinit var binding: PreloaderContentBinding
//    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{
        binding = PreloaderContentBinding.inflate(inflater, container, false)



        val recyclerView = binding.rvRecyclerView
        val layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.layoutManager = layoutManager

        val adapter = TableAdapter()
        recyclerView.adapter = adapter

        return binding.root
    }
}

