package com.demo.javasychnronizers.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class AssignedTaskManagerTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch countDownLatch = new CountDownLatch(2);
		
		DevTeam devTeamA = new DevTeam(countDownLatch, "dev-A");
		DevTeam devTeamB = new DevTeam(countDownLatch, "deb-B");
		
		devTeamA.start();
		devTeamB.start();
		
		countDownLatch.await();
		
		QATeam qaTeam = new QATeam("QA team");
		qaTeam.start();
	}

}
