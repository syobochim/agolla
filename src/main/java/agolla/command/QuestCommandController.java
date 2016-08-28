package agolla.command;

import agolla.domain.Quest;
import agolla.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/command/quest")
public class QuestCommandController {

    private final QuestCommandService service;

    public QuestCommandController(QuestCommandService service) {
        this.service = service;
    }

    @PostMapping("open")
    public String open(@RequestParam Quest quest) {
        service.openQuest(quest);
        return "redirect:/";
    }

    @PostMapping("join")
    public String join(@RequestParam Quest quest,
                       @RequestParam User user) {
        service.joinQuest(quest, user);
        return "redirect:/";
    }

}
