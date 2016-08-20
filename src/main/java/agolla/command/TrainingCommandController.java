package agolla.command;

import agolla.domain.Training;
import agolla.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/command/training")
public class TrainingCommandController {

    private final TrainingCommandService service;

    public TrainingCommandController(TrainingCommandService service) {
        this.service = service;
    }

    @PostMapping("open")
    public String open(@RequestParam Training training) {
        service.openTraining(training);
        return "redirect:/";
    }

    @PostMapping("join")
    public String join(@RequestParam Training training,
                       @RequestParam User user) {
        service.joinTraining(training, user);
        return "redirect:/";
    }

}
