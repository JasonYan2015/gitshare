package com.easy.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		
		//����
		List<String> list = new ArrayList<String>();
			//<>�б�ʾList�е��������ͣ��������β���int����Ϊ����Ӧ�����������Ͷ�int�ǻ�������
		list.add("Tom");
		list.add("Lily");
		list.add("Jim");
		
		for (int i = 0; i < list.size(); i++) {					//����

			System.out.println(list.get(i));
		}
	}
}