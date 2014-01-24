package com.socklabs.feature;

import java.util.concurrent.atomic.AtomicBoolean;

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

	@Override
	public boolean getValue() {
		return state.get();
	}

	@Override
	public void enable() {
		state.set(true);
	}

	@Override
	public void disable() {
		state.set(false);
	}

	@Override
	public String getId() {
		return id;
	}

}
