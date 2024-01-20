package SpringBoot.VotingSystem.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Candidate {
    private String name;
    private int vote;
}
