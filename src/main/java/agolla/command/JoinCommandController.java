package agolla.command;

import agolla.domain.Join;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/command")
public class JoinCommandController {

    @PutMapping("event/join")
    public Join join() {
        return new Join();
    }

}
