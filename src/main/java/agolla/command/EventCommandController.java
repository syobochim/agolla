package agolla.command;

import agolla.domain.Event;
import agolla.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/command/event")
public class EventCommandController {

    private final EventCommandService service;

    public EventCommandController(EventCommandService service) {
        this.service = service;
    }

    @PostMapping("open")
    public String open(@RequestParam Event event) {
        service.openEvent(event);
        return "redirect:/";
    }

    @PostMapping("join")
    public String join(@RequestParam Event event,
                       @RequestParam User user) {
        service.joinEvent(event, user);
        return "redirect:/";
    }

}
