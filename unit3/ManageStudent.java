package unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageStudent {
    List<Candidate> candidates = new ArrayList<Candidate>();
    public void addCandidate(Candidate candidate){
        this.candidates.add(candidate);
    }
    public void showCandidate(){
        for (Candidate candidate : candidates) {
            System.out.println(candidate.toString());
        }
    }
    public List<Candidate> searchCandidateByID(String id){
        return this.candidates.stream().filter(c -> c.getId().equals(id)).collect(Collectors.toList());
    }
}
