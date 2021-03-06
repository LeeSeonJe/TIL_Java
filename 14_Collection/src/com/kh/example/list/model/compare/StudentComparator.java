package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.movel.vo.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		
		// comparator
		// compare
		
		// comparable
		// compareTo
		
		
		// 점수 오름차순
		// 비교 주체가 비교 대상보다 크면 양수
		// 비교 주체가 비교 대상보다 작으면 음수
		// 비교 주체가 비교 대상과 같으면 0 반환

		String standardName = o1.getName();
		String objectName = o2.getName();

		int standard = o1.getScore(); // 주체
		int object = o2.getScore(); // 대상
		if (standard > object) {
			return 1;
		} else if (standard == object) {
			return standardName.compareTo(objectName);
		} else {
			return -1;
		}
	}
}
