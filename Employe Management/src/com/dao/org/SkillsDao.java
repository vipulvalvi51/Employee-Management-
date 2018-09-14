package com.dao.org;

import java.util.List;

import com.pojo.org.Skills;

public interface SkillsDao {
	public List<Skills> getSkillsByUser_id(int user_id);
	public boolean setSkillsByUser_id(Skills skills);
	public boolean deleteSkills(int id);
}
