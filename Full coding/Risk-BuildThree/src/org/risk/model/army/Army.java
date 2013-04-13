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

package org.risk.model.army;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * The instance of this class represents Army.
 * 
 * @author Arij
 *
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD) 
public class Army {
	
	private int armyStrength;
	private static String armyName;
	private static int numberOfStates;
	/**
	 * The method returns army name.
	 * 
	 * @return : Name of Army Type 
	 */
	public String armyName(){
		return armyName;
	} 
	/**
	 * The method sets the army name type.
	 * 
	 * @param armyName : Army name type.
	 */
	protected void setArmyName(String armyName){
		Army.armyName = armyName;
	}
	/**
	 * The method returns army strength.
	 * 
	 * @return :  Strength of the army type.
	 */
	public int armyStrength(){
		return armyStrength;
	}
	/**
	 * The method sets the army type strength.
	 * 
	 * @param armyStrength : Strength of the army type.
	 */
	public void setArmyStrength(int armyStrength){
		this.armyStrength = armyStrength;
	}
	/**
	 * The method returns the number of states for army to be produced.
	 * 
	 * @return :  Number of states.
	 */
	protected static int numberOfStates(){
		return Army.numberOfStates;
	}
	/**
	 * The method sets the number of states for army to be produced
	 * 
	 * @param noOfStates : Number of states.
	 */
	public static void setNumberOfStrength(int noOfStates){
		Army.numberOfStates = noOfStates;
	}
	/**
	 * This method assigns army to the state object
	 * @param stateName
	 * @param armyDetail
	 */
	public void addArmyDetail(String stateName, ArmyDetail armyDetail) {
		if (getClass().equals(Aircraft.class)) {
			Aircraft aircraft = new Aircraft(stateName);
			aircraft.setArmyStrength(armyDetail.getAircraft().armyStrength()
					+ armyStrength());
			armyDetail.setAircraft(aircraft);
		} else if (getClass().equals(Artillery.class)) {
			Artillery artillery = new Artillery(stateName);
			artillery.setArmyStrength(armyDetail.getArtillery().armyStrength()
					+ armyStrength());
			armyDetail.setArtillery(artillery);
		} else if (getClass().equals(Conscript.class)) {
			Conscript conscript = new Conscript(stateName);
			conscript.setArmyStrength(armyDetail.getArtillery().armyStrength()
					+ armyStrength());
			armyDetail.setConscript(conscript);
		} else if (getClass().equals(HeavyPrecisionArtillery.class)) {
			HeavyPrecisionArtillery heavyPrecisionArtillery = new HeavyPrecisionArtillery(
					stateName);
			heavyPrecisionArtillery.setArmyStrength(armyDetail
					.getHeavyPrecisionArtillery().armyStrength()
					+ armyStrength());
			armyDetail.setHeavyPrecisionArtillery(heavyPrecisionArtillery);
		} else if (getClass().equals(MechanizedInfantry.class)) {
			MechanizedInfantry mechanizedInfantry = new MechanizedInfantry(
					stateName);
			mechanizedInfantry.setArmyStrength(armyDetail
					.getMechanizedInfantry().armyStrength() + armyStrength());
			armyDetail.setMechanizedInfantry(mechanizedInfantry);
		} else if (getClass().equals(NuclearMissile.class)) {
			NuclearMissile nuclearMissile = new NuclearMissile(stateName);
			nuclearMissile.setArmyStrength(armyDetail.getNuclearMissile()
					.armyStrength() + armyStrength());
			armyDetail.setNuclearMissile(nuclearMissile);
		} else if (getClass().equals(ProfessionalSoldier.class)) {
			ProfessionalSoldier professionalSoldier = new ProfessionalSoldier(
					stateName);
			professionalSoldier.setArmyStrength(armyDetail
					.getProfessionalSoldier().armyStrength() + armyStrength());
			armyDetail.setProfessionalSoldier(professionalSoldier);
		} else if (getClass().equals(SpecialOperationsSoldier.class)) {
			SpecialOperationsSoldier specialOperationsSoldier = new SpecialOperationsSoldier(
					stateName);
			specialOperationsSoldier.setArmyStrength(armyDetail
					.getSpecialOperationsSoldier().armyStrength()
					+ armyStrength());
			armyDetail.setSpecialOperationsSoldier(specialOperationsSoldier);
		} else if (getClass().equals(TacticalMissile.class)) {
			TacticalMissile tacticalMissile = new TacticalMissile(stateName);
			tacticalMissile.setArmyStrength(armyDetail.getTacticalMissile()
					.armyStrength() + armyStrength());
			armyDetail.setTacticalMissile(tacticalMissile);
		} else if (getClass().equals(Volunteer.class)) {
			Volunteer volunteer = new Volunteer(stateName);
			volunteer.setArmyStrength(armyDetail.getVolunteer().armyStrength()
					+ armyStrength());
			armyDetail.setVolunteer(volunteer);
		}
	}
}
