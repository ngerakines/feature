package com.socklabs.feature;

import com.netflix.servo.monitor.AbstractMonitor;
import com.netflix.servo.monitor.Monitor;
import com.netflix.servo.monitor.MonitorConfig;

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
