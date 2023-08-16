
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Demo{
    @GetMapping("/welcome")
    public String display(){
        return "Welcome";
    }


}
