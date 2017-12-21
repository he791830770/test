package cn.hexl.test;

public abstract class Test1 {

	private int a;
	public static void main(String[] args) {
		User user = new User();
		user.setAge(12);
		user.setName("张三");
		User user2 = changUser(user);
		System.out.println(user == user2);
		System.out.println(user.getName());
		System.out.println(user.getAge());
	}

	public static User changUser(User user) {
		user.setName("李四");
		user.setAge(13);
		return user;
	}
}
