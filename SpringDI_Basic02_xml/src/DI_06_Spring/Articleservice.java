package DI_06_Spring;

public class Articleservice {
	//Articleservice �� ArticleDao �����Ѵ�.
	//Articleservice �� ArticleDao �� �ּҰ� �ʿ��ϴ�.
	
	//2���� (������ , setter) ����
	private ArticleDao articledao;
	public Articleservice(ArticleDao articledao) {	//oracledao , mysqldao ������
		this.articledao = articledao;
		System.out.println("Articleservice ������ ȣ��");
	}
	
	//�۾��� ���� ����
	public void write(Article article) {
		this.articledao.insert(article);
	}
}
