package com.frame;

import java.util.ArrayList;
import java.util.Map;

public interface Dao<K1, K2, V> { //K1: STRING, K2: INTEGER
        public void insert(V v) throws Exception;
        public int delete1(K1 k) throws Exception;
        public int delete2(K2 k) throws Exception;
        public int update(V v) throws Exception;
        public V select1(K1 k) throws Exception;
        public V select2(K2 k) throws Exception;
        public ArrayList<V> selectall() throws Exception;
        public ArrayList<V> shop_select(K1 k) throws Exception;
        public ArrayList<V> bookingselect_shop(K1 k) throws Exception;                 // 가게 이름 중심으로 예약리스트 출력
        public ArrayList<V> shop_hotplace_select(K1 k) throws Exception;				//핫플 기준으로 가게출력
        public void shop_hitcnt(K1 k) throws Exception;		
        public ArrayList<V> review_select(K1 k) throws Exception;
        public int shop_score_avg(K1 k) throws Exception;
        public ArrayList<V> bookingget_searcher(K1 k) throws Exception;                        //searcher id로 예약 리스트 출력
}

