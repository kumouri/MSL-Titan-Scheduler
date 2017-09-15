package com.kumouri.msltitanscheduler.clan;

import com.kumouri.msltitanscheduler.player.Player;
import lombok.Data;

import java.util.List;

@Data
public class Clan {
    private String name;
    private Integer maxTitanDefeated;
    private List<Player> members;
    private List<Player> officers;
    private Player leader;
}
