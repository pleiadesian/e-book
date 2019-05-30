package wzl.ebook.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.multipart.MultipartFile;
import wzl.ebook.entity.User;
import wzl.ebook.entity.UserInfo;

import java.util.List;

public interface UserService {

    User handleLogin(String username, String password);

    boolean handleRegister(String username, String password, String mail);

    List<User> findAllUser();

    List<User> changeUserAuth(int id, boolean auth);

    void saveUserInfo(int id, String address, String gender, String telephone, String img);

    UserInfo getUserInfo(int id);

    void saveUserAvatar(MultipartFile file, int userId);
}
