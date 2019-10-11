package tp_LOTR;

import java.util.List;

public class Party {
	
	private String name;
	private Character leader;
	private List<Character> members;
	
	public Party(String name, Character leader, List<Character> members) {
		super();
		this.name = name;
		this.leader = leader;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getLeader() {
		return leader;
	}

	public void setLeader(Character leader) {
		this.leader = leader;
	}

	public List<Character> getMembers() {
		return members;
	}

	public void setMembers(List<Character> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Party [name=" + name + ", leader=" + leader + ", members=" + members + "]";
	}
	

	
}
