package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserApi {
    private UserBl userBl;

    @Autowired
    public UserApi(UserBl userBl){this.userBl = userBl;}

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest findById(){return userBl.userProfileInfo(1);}
}
