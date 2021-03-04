package com.wizz.gift.controller;

import com.wizz.gift.annotation.PassToken;
import com.wizz.gift.commonUtils.R;
import com.wizz.gift.entity.Gift;
import com.wizz.gift.mapper.GiftMapper;
import com.wizz.gift.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/gift/rank")
public class RankController {
    @Autowired
    GiftMapper giftMapper;

    @PassToken
    @GetMapping("/boy")
    public R boyRank2(){
        ArrayList<Gift> boyRank = giftMapper.getBoyRank();
        return R.ok().data("boyRank",boyRank);
    }
    @PassToken
    @GetMapping("/girl")
    public R girlRank2(){
        ArrayList<Gift> girlRank = giftMapper.getGirlRank();
        return R.ok().data("girlRank",girlRank);
    }


}
