package bean;

public class UniversalUser {
	private String name;
	private int id;    //�û�id
	private int type;  //���ͣ�1����ͨ�û���2��ͼ�����Ա��3��ϵͳ����Ա
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
