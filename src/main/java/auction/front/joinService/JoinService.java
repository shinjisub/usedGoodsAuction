package auction.front.joinService;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

public interface JoinService {
	
	public int addMember(HashMap<String, Object> param);
	
	public List<HashMap<String, Object>> getMemberList(HashMap<String, Object> param);
	
}
