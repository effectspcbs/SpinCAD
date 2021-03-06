/* SpinCAD Builder - DSP Development Tool for the Spin FV-1 
 * SpinCADTestGenerator.xtend
 * This file supplies template code generation for the Bool data type.
 * This turns into a Java boolean.
 * 
 * Copyright (C) 2015 - Gary Worsham 
 * 
 *   This program is free software: you can redistribute it and/or modify 
 *   it under the terms of the GNU General Public License as published by 
 *   the Free Software Foundation, either version 3 of the License, or 
 *   (at your option) any later version. 
 * 
 *   This program is distributed in the hope that it will be useful, 
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 *   GNU General Public License for more details. 
 * 
 *   You should have received a copy of the GNU General Public License 
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 *     
 */ 
 
 /*
 * generated by Xtext
 */
package com.holycityaudio.spincad.generator

//import com.google.inject.Inject 
import com.holycityaudio.spincad.spinCAD.Pin
import com.holycityaudio.spincad.spinCAD.AudioInput
import com.holycityaudio.spincad.spinCAD.AudioOutput
import com.holycityaudio.spincad.spinCAD.Program
import com.holycityaudio.spincad.spinCAD.ControlInput

class SpinCADTestGenerator {
 
def genTestHeader(String blockName) { 
	'''
/* SpinCAD Designer - DSP Development Tool for the Spin FV-1 
 * «blockName+"Test"».java
 * Copyright (C) 2015 - Gary Worsham 
 * Based on ElmGen by Andrew Kilpatrick 
 * 
 *   This program is free software: you can redistribute it and/or modify 
 *   it under the terms of the GNU General Public License as published by 
 *   the Free Software Foundation, either version 3 of the License, or 
 *   (at your option) any later version. 
 * 
 *   This program is distributed in the hope that it will be useful, 
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 *   GNU General Public License for more details. 
 * 
 *   You should have received a copy of the GNU General Public License 
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 *     
 */ 
 
package com.holycityaudio.SpinCAD.test;

import com.holycityaudio.SpinCAD.SpinCADFrame;
import com.holycityaudio.SpinCAD.SpinCADPanel;
import com.holycityaudio.SpinCAD.SpinCADPin;
import com.holycityaudio.SpinCAD.CADBlocks.*;

public class «blockName+"Test"» {
	public «blockName+"Test"»(SpinCADFrame f) {
		System.out.println("Start of «blockName»CADBlock unit test..." + "\n");

		SpinCADPanel p = new SpinCADPanel(f);
		InputCADBlock i = new InputCADBlock(225, 10);
		OutputCADBlock o = new OutputCADBlock(225, 290);
		«blockName»CADBlock m = new «blockName»CADBlock(225, 210);
'''
}

def genTestCloser(String blockName) {
	'''
	// end of test code
		System.out.println("End of «blockName»CADBlock unit test" + "\n");
		}
	}
	'''
}

def testAllConnections(String blockName, Program pr) { 
	var Ins = 0
	var Outs = 0		
	var ControlIns = 0
	'''
		f.getModel().newModel();
		// now do "all control connections"
		f.dropBlock(p, i);	
		f.dropBlock(p, m);	
		f.dropBlock(p, o);	
		«FOR Pin p : pr.pins»
			«switch p {
				AudioInput:{Ins = Ins + 1; conAudioInput(p, Ins)}
				AudioOutput:{Outs = Outs + 1; conAudioOutput(p, Outs)}
				ControlInput:{ControlIns = ControlIns + 1; conControlInput(p, ControlIns)}
			}»
		«ENDFOR»
		f.getModel().sortAlignGen();
		System.out.println("«blockName»CADBlock test passed with all control connections!");

		f.getModel().newModel();	
		
'''	
	}
	
def testNoConnections (String blockName) {
		'''
		f.dropBlock(p, m);	
		
		f.getModel().sortAlignGen();
		System.out.println("«blockName»CADBlock test passed with no connections!");
		'''
	}
	
def conAudioInput(Pin p, int i) {
	'''	
	{
		SpinCADPin p1 = i.getPin("Output «i»");
		SpinCADPin p2 = m.getPin("«p.label»");
		p2.setConnection(i, p1);
	}
	'''
	}
	
def conAudioOutput(Pin p, int i) {
	'''	
	{
		SpinCADPin p1 = o.getPin("Input «i»");
		SpinCADPin p2 = m.getPin("«p.label»");
		p2.setConnection(o, p1);
	}
	'''
	}

def conControlInput(Pin p, int i) {
	'''	
	{
		Pot«i-1»CADBlock pot«i-1» = new Pot«i-1»CADBlock(25, 150 + 40 * «i»);
		f.dropBlock(p, pot«i-1»);
		SpinCADPin p1 = pot«i-1».getPin("Output 1");
		SpinCADPin p2 = m.getPin("«p.label»");
		p2.setConnection(pot«i-1», p1);
	}
	'''
	}
}