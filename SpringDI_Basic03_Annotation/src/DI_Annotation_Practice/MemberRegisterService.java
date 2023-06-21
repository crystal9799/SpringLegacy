package DI_Annotation_Practice;

public class MemberRegisterService {
	private MemberDao memberDao;
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
