package auction.front.joinService;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinServiceImpl implements JoinService{

	@Autowired
	private SqlSession sql;
	
	@Override
	public int addMember(HashMap<String, Object> param) {
		return sql.insert("addMember", param);
	}

	@Override
	public List<HashMap<String, Object>> getMemberList(HashMap<String, Object> param) {
		return sql.selectList("getMemberList", param);
	}

}
