package SpringBoot.VotingSystem.controller;

import SpringBoot.VotingSystem.service.VotingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/voting")
public class VotingController {

    @PostMapping("/entercandidate")
    public void enterCandidate(@RequestParam String name) {
        VotingService.enterCandidate(name);
    }

    @PostMapping("/castvote")
    public int castVote(@RequestParam String name) {
        return VotingService.castVote(name);
    }

    @GetMapping("/countvote")
    public int countVote(@RequestParam String name) {
        return VotingService.countVote(name);
    }

    @GetMapping("/listvote")
    public Map<String, Integer> listVote() {
        return VotingService.listVote();
    }

    @GetMapping("/getwinner")
    public List<String> getWinner() {
        return VotingService.getWinner();
    }
}
