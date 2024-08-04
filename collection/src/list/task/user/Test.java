package list.task.user;

public class Test {

	public static void main(String[] args) {
		UserField userField = new UserField();

		// 사용자 등록 테스트
		User newUser = new User("용호중", "yhh725", "1234", "1234-1234");
		userField.join(newUser);
		System.out.println("사용자 등록됨: " + newUser);

		// 로그인 테스트
		User loginUser = new User("용호중", "yhh725", "1234", "1234-1234");
		User loggedInUser = userField.login(loginUser);
		if (loggedInUser != null) {
			System.out.println("로그인 성공: " + loggedInUser);
		} else {
			System.out.println("로그인 실패. 잘못된 자격 증명.");
		}

		// 비밀번호 업데이트 테스트
		String newPassword = "7645";
		userField.update("용호중", newPassword);
		System.out.println("사용자 '용호중'의 비밀번호가 업데이트됨.");

		// 사용자 ID로 사용자 찾기 테스트
		String userIdToFind = "용호중";
		User foundUser = userField.findByUserId(userIdToFind);
		if (foundUser != null) {
			System.out.println("사용자 ID '" + userIdToFind + "'로 사용자 찾음: " + foundUser);
		} else {
			System.out.println("사용자 ID '" + userIdToFind + "'로 사용자를 찾을 수 없음.");
		}

		// 인증 번호 보내기 테스트
		String phoneNumber = "01012345678"; // 테스트를 위한 유효한 전화번호로 교체
		String certNumber = userField.sendCertificatedNumber(phoneNumber);
		System.out.println(phoneNumber + "로 인증 번호 전송됨: " + certNumber);

		// 사용자 정보 업데이트 테스트
		User updatedUser = new User("용호중", "yhh725", "12345", "1234-1234");
		userField.update(updatedUser);
		System.out.println("사용자 '용호중'의 정보가 업데이트됨.");

		// 추가 테스트 케이스는 필요에 따라 추가 가능
	}
}