package kg.mega.kulikovmobileappv1.service.impl;

import jakarta.transaction.Transactional;
import kg.mega.kulikovmobileappv1.model.User;
import kg.mega.kulikovmobileappv1.repository.UserRepo;
import kg.mega.kulikovmobileappv1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        User updatedUser = userRepo.findById(user.getId()).get();
        updatedUser.setPhone(user.getPhone());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setEmail(user.getEmail());
        return updatedUser;
    }
}