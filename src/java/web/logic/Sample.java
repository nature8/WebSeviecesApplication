
/*package web.logic;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Sample")
public class Sample {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}*/
package web.logic;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "Sample")
public class Sample
{
    @WebMethod(operationName="getMessage")
    public String getMessage()
    {
        return "Hello India";    
    }    
    @WebMethod(operationName="getDynaMessage")
    public String getDynaMessage(String arg){
        return arg;
    }
    @WebMethod(operationName="checkLogin")
    public String checkLogin(String id, String pass){
        if(id.equals("abc")&&pass.equals("abc")){
            return "Welcome";
        }
        else{
            return "Invalid id/password";
        }
    }
    @WebMethod(operationName="loadProduct")
    public ArrayList loadProduct(){
        ArrayList list = new ArrayList();
        list.add("laptop");
        list.add("earbuds");
        return list;
    }
}
