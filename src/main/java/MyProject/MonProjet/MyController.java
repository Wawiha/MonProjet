package MyProject.MonProjet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

        @RequestMapping("/")
        @ResponseBody
        public String helloGFG()
        {
            return "Hello GeeksForGeeks";
        }

}
