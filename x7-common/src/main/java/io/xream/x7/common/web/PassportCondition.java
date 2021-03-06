/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.xream.x7.common.web;

import java.io.Serializable;

public class PassportCondition implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3614725530323252344L;

	private String passportId;
	private long subId;
	private String name;
	private String token;
	private String passportType;
	private String device;
	public long getPassportId() {
		return Long.valueOf(passportId);
	}
	public void setPassportId(String id) {
		this.passportId = id;
	}
	public String getPassportName(){
		return this.passportId;
	}
	public long getSubId() {
		return subId;
	}
	public void setSubId(long subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getType() {
		return passportType;
	}
	public void setType(String type) {
		this.passportType = type;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	@Override
	public String toString() {
		return "PassportCondition [id=" + passportId + ", subId=" + subId + ", name=" + name + ", token=" + token + ", type="
				+ passportType + ", device=" + device + "]";
	}
}
