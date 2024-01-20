package SpringBoot.VotingSystem.service;

import SpringBoot.VotingSystem.entity.Candidate;

import java.util.*;
import java.util.stream.Collectors;

public class VotingService {

    private static Map<String, Candidate> candidates = new HashMap<>();
    private static int max=(int)(-1e10);

    public static void enterCandidate(String name) {
        if(!candidates.containsKey(name)) candidates.put(name, new Candidate(name, 0));
    }

    public static int castVote(String name) {
        if (candidates.containsKey(name)) {
            Candidate candidate = candidates.get(name);
            candidate.setVote(candidate.getVote() + 1);
            return candidate.getVote();
        } else {
            throw new IllegalArgumentException("Invalid candidate");
        }
    }

    public static int countVote(String name) {
        if (candidates.containsKey(name)) {
            return candidates.get(name).getVote();
        } else {
            throw new IllegalArgumentException("Invalid candidate");
        }
    }

    public static Map<String, Integer> listVote() {
        Map<String, Integer> voteCounts = new HashMap<>();
        for (Candidate candidate : candidates.values()) {
            voteCounts.put(candidate.getName(), candidate.getVote());
        }
        return voteCounts;
    }

    public static List<String> getWinner() {
        for(Candidate ele:candidates.values()) max=Math.max(max,ele.getVote());
        if (!candidates.isEmpty()) {
            return candidates.keySet().stream().filter(ele->candidates.get(ele).getVote()==max).collect(Collectors.toList());
        } else {
            throw new IllegalStateException("No candidates");
        }
    }

}

