package com.kumouri.msltitanscheduler.player;

import com.kumouri.msltitanscheduler.battleresult.BattleResult;
import com.kumouri.msltitanscheduler.clan.Clan;
import lombok.Data;

import java.util.List;

@Data
public class Player {
    private String name;
    private Integer level;
    private Clan clan;
    private List<BattleResult> battleResultMap;
}
