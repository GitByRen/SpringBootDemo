package com.example.mapper;

import com.example.bean.Department;

public interface DepartmentMapper {

//	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int insertDept(Department department);

	public Department selectDept(Integer id);

}
