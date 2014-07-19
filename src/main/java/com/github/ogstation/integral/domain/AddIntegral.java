package com.github.ogstation.integral.domain;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class AddIntegral
{
    @NotNull(message = "{integral.member.not.empty}")
    private Member member;
    @NotNull(message = "{integral.gasstation.not.empty}")
    private GasStation gasStation;
    @NotNull(message = "{integral.amount.not.empty}")
    private BigDecimal amount;

    public Member getMember()
    {
        return member;
    }

    public void setMember(Member member)
    {
        this.member = member;
    }

    public GasStation getGasStation()
    {
        return gasStation;
    }

    public void setGasStation(GasStation gasStation)
    {
        this.gasStation = gasStation;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }
}
