package model;

import java.util.*;

public interface Itodayable {

    void today(Date date, String record);

    Map<Integer, String> map = new HashMap<Integer, String>();
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();



}
