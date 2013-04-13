/*
* Copyright (C) 2013 author Arij,Omer
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.risk.model;

public class Player {
	private int countryTurn;

	public Player(int countryTurn) {
		this.countryTurn = countryTurn;
	}

	public int getCountryTurn() {
		return countryTurn;
	}

	public void setCountryTurn(int countryTurn) {
		this.countryTurn = countryTurn;
	}

	/**
	 * The method returns the Country turn
	 * 
	 * @param countryId
	 *            represents the countryID
	 * @return returns int value which represents the country turn
	 */
	public int getCountryTurn(int countryId) {
		int countryTurn = 0;
		for (int i = 0; i < GameEngine.countryTurnSequence.size(); i++) {
			if (countryId == GameEngine.countryTurnSequence.get(i).getCountryID()) {
				countryTurn = i + 1;
				break;
			}
		}
		return countryTurn;
	}
}