package top.suiyueran.mark.model;

import javax.annotation.PostConstruct;

public class TestBean {

	public TestBean() {

	}

	@PostConstruct
	public void init() {
		System.out.println("TestBean init……");
	}

	public void doSomeThing() {

	}
}