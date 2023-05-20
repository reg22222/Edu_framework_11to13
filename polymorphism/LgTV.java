package jeonggeun.spring.polymorphism;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Resource(name="sony")
	private Speaker speaker;
	


	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	public LgTV() {
		System.out.println("LgTV ��ü ����");

	}

	@Override
	public void powerOn() {
		System.out.println("LgTV ������ Ų��.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV ������ ����.");
	}

}
