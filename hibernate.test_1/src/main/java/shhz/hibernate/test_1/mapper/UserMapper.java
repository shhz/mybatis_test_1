package shhz.hibernate.test_1.mapper;

import java.util.List;

import shhz.hibernate.test_1.pojo.User;

public interface UserMapper {
	void save(User user);

	boolean update(User user);

	boolean delete(int id);

	User findById(int id);

	List<User> findAll();
}
