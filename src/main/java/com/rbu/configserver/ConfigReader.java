package com.rbu.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigReader {
	@Value("${adminapp-adminapi.dev.dbprop.driver}")
	private String drivername;
	@Value("${adminapp-adminapi.dev.dbprop.url}")
	private String url;

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ConfigReader [drivername=" + drivername + ", url=" + url + "]";
	}

	

}
