package project.rr.fb88appchinhref.common.presentation.dashboard

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import project.rr.fb88appchinhref.R
import project.rr.fb88appchinhref.databinding.FragmentMainBinding


class MainFragment : Fragment(), View.OnClickListener {


    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        onClickMainButtons()
        requestOrientation()

        return binding.root
    }

    private fun requestOrientation() {

        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }

    private fun onClickMainButtons() {

        binding.webView.setOnClickListener(this)
        binding.miniGame.setOnClickListener(this)
        binding.privacyView.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v) {

            binding.webView -> findNavController().navigate(R.id.action_mainFragment_to_displayFragment)
            binding.privacyView -> findNavController().navigate(R.id.action_mainFragment_to_privacyFragment)
            binding.miniGame -> findNavController().navigate(R.id.action_mainFragment_to_slotMachineFragment)

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}