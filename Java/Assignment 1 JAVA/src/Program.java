import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name ="sale";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name ="marketing";
		
		Department department3 = new Department();
		department3.id = 3;
		department3.name ="driector";
		
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = "Dev";
		
		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = "Test";
		
		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = "PM";
		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "abc1@gmail.com";
		account1.userName = "nhokipo1";
		account1.fullName = "son1";
		account1.createDate = new Date("2000/11/30");
		account1.department= department1;
		account1.position = position1;
		
		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "abc2@gmail.com";
		account2.userName = "nhokipo2";
		account2.fullName = "son2";
		account2.createDate = new Date("2000/12/30");
		account2.department= department2;
		account2.position = position2;
		
		Account account3 = new Account();
		account3.accountID = 3;
		account3.email = "abc3@gmail.com";
		account3.userName = "nhokipo3";
		account3.fullName = "son3";
		account3.createDate = new Date("2000/1/30");
		account3.department= department3;
		account3.position = position3;
		
		Group group1 = new Group();
		group1.id = 1;
		group1.groupName = "group1";
		group1.createDate = new Date  ("2020/1/1");	
		
		Group group2 = new Group();
		group2.id = 2;
		group2.groupName = "group2";
		group2.createDate = new Date  ("2020/2/2");	
		
		Group group3 = new Group();
		group3.id = 3;
		group3.groupName = "group3";
		group3.createDate = new Date  ("2020/3/3");	
		
		GroupAccount groupaccount1  = new GroupAccount();
		groupaccount1.group = group1;
		groupaccount1.account = account1;
		groupaccount1.joinDate = new Date ();
		
		GroupAccount groupaccount2  = new GroupAccount();
		groupaccount2.group = group2;
		groupaccount2.account = account1;
		groupaccount2.joinDate = new Date ();
		
		GroupAccount groupaccount3  = new GroupAccount();
		groupaccount3.group = group3;
		groupaccount3.account = account2;
		groupaccount3.joinDate = new Date ();
		
		GroupAccount[] groupAccounts = {groupaccount1, groupaccount2, groupaccount3};
		account1.groups = groupAccounts;
		
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeID = 1;
		typeQuestion1.typeName = TypeQues.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeID = 2;
		typeQuestion2.typeName = TypeQues.MUlTI_CHOICE;
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeID = 3;
		typeQuestion3.typeName = TypeQues.MUlTI_CHOICE;
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryID = 1;
		categoryQuestion1.categoryName = "cau hoi 1";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryID = 2;
		categoryQuestion2.categoryName = "cau hoi 2";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryID = 3;
		categoryQuestion3.categoryName = "cau hoi 3";
		
		Question question1 = new Question();
		question1.questionID = 1;
		question1.Content = " java la` gi`";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creatorID = 1;
		question1.creatorDate = new Date ("2020/10/17");
		
		Question question2 = new Question();
		question2.questionID = 2;
		question2.Content = " php la` gi`";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creatorID = 2;
		question2.creatorDate = new Date ("2020/10/18");
		
		Question question3 = new Question();
		question3.questionID = 3;
		question3.Content = " c++ la` gi`";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion3;
		question3.creatorID = 3;
		question3.creatorDate = new Date ("2020/10/19");
		
		Question[]question = {question1, question2, question3};
		
		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "java la 1 ngon ngu lap trinh`";
		answer1.question = question1;
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "php la 1 ngon ngu lap trinh`";
		answer2.question = question2;
		answer2.isCorrect = true;
		
		Answer answer3 = new Answer();
		answer3.answerID = 3;
		answer3.content = "c++ khong la 1 ngon ngu lap trinh`";
		answer3.question = question3;
		answer3.isCorrect = false;
		
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "c00";
		exam1.title = "thi hoc ki 1";
		exam1.category = categoryQuestion1;
		exam1.duration = 180;
		exam1.questions = question;
		
		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "c01";
		exam2.title = "thi hoc ki 2";
		exam2.category = categoryQuestion2;
		exam2.duration = 90;
		exam2.questions = question;
		
		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "c02";
		exam3.title = "thi hoc ki 3";
		exam3.category = categoryQuestion3;
		exam3.duration = 60;
		exam3.questions = question;
}
