package com.virtualpet.virtualpetspring;

import static com.virtualpet.virtualpetspring.Box.DEFAULT_DIRTYNESS;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CageTest {

	@Test
	public void shouldHaveDirtynessLevelDefault() {
		Cage underTest = new Cage();
		int dirtyness = underTest.getDirtyness();
		assertThat(dirtyness, is(DEFAULT_DIRTYNESS));
	}

	@Test
	public void shouldHaveDirtynessLevelBe69() {
		Cage underTest = new Cage(69);
		int dirtyness = underTest.getDirtyness();
		assertThat(dirtyness, is(69));
	}

	@Test
	public void shouldCleanCage() {
		Cage underTest = new Cage(69);
		underTest.clean();
		int dirtyness = underTest.getDirtyness();
		assertThat(dirtyness, is(0));
	}

}
