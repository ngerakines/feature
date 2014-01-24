package com.socklabs.feature;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nick.gerakines on 1/24/14.
 */
public class ToggleFeatureTest {

	@Test
	public void basic() {
		final ToggleFeature toggleFeature = new ConcurrentToggleFeature("test");
		Assert.assertTrue(toggleFeature.getValue());
		toggleFeature.disable();
		Assert.assertFalse(toggleFeature.getValue());
	}

}
