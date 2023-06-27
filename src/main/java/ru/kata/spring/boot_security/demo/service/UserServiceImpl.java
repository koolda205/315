package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public void saveUser (User user) {
        userDao.saveUser (user);
    }

    @Override
    public User getUserByID(Long id) {
        return userDao.getUserByID(id);
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Transactional
    @Override
    public void deleteUserByID(Long id) {
        userDao.deleteUserByID(id);
    }

//    @Transactional
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        Optional<User> user = userRepository.findByUsername(username);
//
//        if (user.isEmpty()) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new UsersDetails(user.get());
//        return null;

//    }
}


