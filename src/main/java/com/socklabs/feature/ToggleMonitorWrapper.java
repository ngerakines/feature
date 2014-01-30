package com.socklabs.feature;

import com.netflix.servo.monitor.AbstractMonitor;
import com.netflix.servo.monitor.Monitor;
import com.netflix.servo.monitor.MonitorConfig;

/**
 * A Servo {@link com.netflix.servo.monitor.Monitor} that wraps a
 * {@link com.socklabs.feature.ToggleFeature} to be exposed as a monitor.
 */
public class ToggleMonitorWrapper extends AbstractMonitor<Boolean> implements Monitor<Boolean> {

	private final ToggleFeature toggleFeature;

	protected ToggleMonitorWrapper(final MonitorConfig config, final ToggleFeature toggleFeature) {
		super(config);
		this.toggleFeature = toggleFeature;
	}

	@Override
	public Boolean getValue() {
		return toggleFeature.getValue();
	}

}
