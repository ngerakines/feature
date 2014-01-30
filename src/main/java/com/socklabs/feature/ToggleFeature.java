package com.socklabs.feature;

/**
 * A type of feature that is can be toggled.
 */
public interface ToggleFeature extends Feature {

	/**
	 * Returns the on/off state of the Feature.
	 * @return True if the feature has been toggled on, false otherwise.
	 */
	boolean getValue();

	/**
	 * Toggles the feature on.
	 */
	void enable();

	/**
	 * Toggles the feature off.
	 */
	void disable();

}
