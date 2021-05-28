package com.example.happylife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.happylife.databinding.ActivityTalkTalkBinding

class TalkTalkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTalkTalkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTalkTalkBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.talktalkTitle.text = intent.getStringExtra("title").toString()
        binding.talktalkTimestamp.text = intent.getStringExtra("timestamp").toString()
        binding.talktalkUserName.text = intent.getStringExtra("nickname").toString()
        binding.talktalkContext.text = intent.getStringExtra("context").toString()
        binding.talktalkTag1.text = intent.getStringExtra("commutag").toString()

        // 공감 버튼 클릭
        binding.btnLikeContext.setOnClickListener {
            binding.btnLikeContext.setBackgroundResource(R.drawable.heart_purple)
            binding.tvHeartCountTalkTalk.text = 3.toString()
            binding.tvHeartCountTalkTalk.setTextColor(
                ContextCompat.getColor(
                    this,
                    R.color.main_color
                )
            )
            binding.relativelayoutHeartTalkTalk.setBackgroundResource(R.drawable.purple_circle)
        }

        // 뒤로가기 버튼 클릭
        binding.btnBackTalkTalk.setOnClickListener {
            finish()
        }

        // 완료버튼 클릭
        binding.btnFinishTalkTalk.setOnClickListener {
            // Todo: db에 댓글 저장, 댓글 띄우기
        }
    }
}