package pdp.patterns.proxy;

import com.sun.deploy.net.proxy.DynamicProxyManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain {

    public static class MyDynamicProxy implements InvocationHandler {
        CommonProxyInterface target;

        public MyDynamicProxy(CommonProxyInterface target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("бугагашенька)) лан, лови своего клевого обьекта(");
            if("run".equalsIgnoreCase(method.getName())) {
                target.run();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        CustomObject unrepeatableOriginal = new CustomObject();
        CommonProxyInterface object = (CommonProxyInterface) Proxy.newProxyInstance(ProxyMain.class.getClassLoader(), new Class<?>[]{CommonProxyInterface.class}, new MyDynamicProxy(unrepeatableOriginal));
        object.run();
    }
}
