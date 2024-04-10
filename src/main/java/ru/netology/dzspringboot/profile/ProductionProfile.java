package ru.netology.dzspringboot.profile;

import ru.netology.dzspringboot.interfase.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}