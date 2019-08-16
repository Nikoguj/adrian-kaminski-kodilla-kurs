package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> list = new ArrayList<>();

    public Forum()
    {
        list.add(new ForumUser(001, "Alesiety", 'M', LocalDate.of(2000, Month.JANUARY, 4), 543));
        list.add(new ForumUser(002, "Roctorts", 'M', LocalDate.of(1997, Month.MARCH, 21), 123));
        list.add(new ForumUser(003, "Talklofter", 'F', LocalDate.of(1967, Month.OCTOBER, 16), 251));
        list.add(new ForumUser(004, "SlashJuz", 'M', LocalDate.of(1964, Month.NOVEMBER, 6), 50));
        list.add(new ForumUser(005, "Xangoldient", 'F', LocalDate.of(1942, Month.SEPTEMBER, 26), 10));
        list.add(new ForumUser(006, "KatTman", 'F', LocalDate.of(1955, Month.JANUARY, 13), 153));
        list.add(new ForumUser(007, "RawFun", 'M', LocalDate.of(1970, Month.JUNE, 25), 0));
    }

    public List<ForumUser> getUserList()
    {
        return list;
    }

}
