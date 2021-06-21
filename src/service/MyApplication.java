package service;

import javax.annotation.Resource;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * short description
 * <p>
 * M426
 *
 * @author TODO
 * @version 1.0
 * @since 21.06.21
 */

@ApplicationPath("/resource")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet hashSet = new HashSet();
        hashSet.add(M426.class);
        return hashSet;
    }

}
