package me.j360.dubbo.biz.test.manager;

import com.dangdang.ddframe.rdb.sharding.api.HintManager;
import me.j360.dubbo.manager.UserManager;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManagerTest extends AbstractManagerTest {

    @Autowired
    private UserManager userManager;

    @Test
    public void addUserTest(){
        //UserInfoResult tree = userManager.bind(new UserDTO());
        //print(tree);
        HintManager hintManager = HintManager.getInstance();
        hintManager.setMasterRouteOnly();
        userManager.count();

        //userManager.list();
    }


}
