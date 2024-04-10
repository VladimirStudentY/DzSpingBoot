package ru.netology.dzspringboot.profile;

import ru.netology.dzspringboot.interfase.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}