package com.kumouri.msltitanscheduler.battleresult;

import com.kumouri.msltitanscheduler.element.EElement;
import com.kumouri.msltitanscheduler.titan.Titan;
import lombok.Data;

@Data
public class BattleResult {
    private Titan titan;
    private EElement playerTeamElement;
    private Integer playerTeamIndex;
    private Integer playerDamageDone;
}
