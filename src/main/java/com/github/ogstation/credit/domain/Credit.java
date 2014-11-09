package com.github.ogstation.credit.domain;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Credit
{
    @NotNull
    private Member member;
    @NotNull
    private GasStation gasStation;
    @NotNull
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
