/*
* generated by Xtext
*/
package com.holycityaudio.spincad;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpinCADStandaloneSetup extends SpinCADStandaloneSetupGenerated{

	public static void doSetup() {
		new SpinCADStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

