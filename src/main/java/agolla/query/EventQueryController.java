package agolla.query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventQueryController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("joinEvent");
    }

}
