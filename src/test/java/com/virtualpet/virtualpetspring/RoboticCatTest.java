package com.virtualpet.virtualpetspring;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticCatTest {

	@Test
	public void shouldHaveName() {
		RoboticCat underTest = new RoboticCat("Joey", "");
		String name = underTest.getName();
		assertThat(name, is("Joey"));
	}

	@Test
	public void shouldHaveDescription() {
		RoboticCat underTest = new RoboticCat("Joey", "Cool");
		String description = underTest.getDescription();
		assertThat(description, is("Cool"));
	}

	@Test
	public void shouldHaveDryness80() {
		RoboticCat underTest = new RoboticCat("Joey", "Cool", 20, 80);
		int dryness = underTest.getDryness();
		assertThat(dryness, is(80));
	}

	@Test
	public void shouldHaveBoredom20() {
		RoboticCat underTest = new RoboticCat("Joey", "Cool", 20, 80);
		int boredom = underTest.getBoredom();
		assertThat(boredom, is(20));
	}

	@Test
	public void shouldHaveHealth100() {
		RoboticCat underTest = new RoboticCat("Joey", "Cool", 0, 0);
		int health = underTest.getHealth();
		assertThat(health, is(100));
	}

	@Test
	public void shouldBeDeadIfHealthIsZero() {
		RoboticCat underTest = new RoboticCat("Joey", "Cool", 200, 0);
		underTest.tick();
		boolean status = underTest.isAlive();
		assertThat(status, is(false));
	}
}