
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Demo{
    @GetMapping("/Welcome")
    public String display(){
        return "Welcome";
    }


}