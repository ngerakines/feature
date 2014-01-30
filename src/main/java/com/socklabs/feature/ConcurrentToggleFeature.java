package com.socklabs.feature;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * An implementation of the {@link com.socklabs.feature.ToggleFeature} interface
 * that uses an {@link java.util.concurrent.atomic.AtomicBoolean} to manage
 * local state.
 */
public class ConcurrentToggleFeature implements ToggleFeature {

	private final String id;
	private final AtomicBoolean state;

	public ConcurrentToggleFeature(final String id) {
		this(id, true);
	}

	public ConcurrentToggleFeature(final String id, final boolean initialValue) {
		this.id = id;
		this.state = new AtomicBoolean(initialValue);
	}

	/** {@inheritDoc} */
	@Override
	public boolean getValue() {
		return state.get();
	}

	/** {@inheritDoc} */
	@Override
	public void enable() {
		state.set(true);
	}

	/** {@inheritDoc} */
	@Override
	public void disable() {
		state.set(false);
	}

	/** {@inheritDoc} */
	@Override
	public String getId() {
		return id;
	}

}
