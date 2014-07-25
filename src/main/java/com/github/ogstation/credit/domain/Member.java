package com.github.ogstation.credit.domain;

public class Member
{
    private String id;
    private String identityCard;
    private String telephone;
    private String email;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getIdentityCard()
    {
        return identityCard;
    }

    public void setIdentityCard(String identityCard)
    {
        this.identityCard = identityCard;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
