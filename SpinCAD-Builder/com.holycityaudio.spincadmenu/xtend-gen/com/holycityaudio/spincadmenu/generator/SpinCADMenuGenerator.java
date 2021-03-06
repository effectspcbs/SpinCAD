/**
 * SpinCAD Builder - DSP Development Tool for the Spin FV-1
 * SpinCADMenuGenerator.xtend
 * This file supplies template code generation for the creating the block menus.
 * Looks like it also is used to generate some test code calling each of the blocks
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
 */
package com.holycityaudio.spincadmenu.generator;

import com.holycityaudio.spincadmenu.spinCADMenu.Element;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_HEADER;
import com.holycityaudio.spincadmenu.spinCADMenu.MENU_ITEM;
import com.holycityaudio.spincadmenu.spinCADMenu.Menu;
import com.holycityaudio.spincadmenu.spinCADMenu.TEST_ITEM;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class SpinCADMenuGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String pkage = "/com/holycityaudio/SpinCAD/";
    String _className = this.className(resource);
    String _plus = (pkage + _className);
    String _plus_1 = (_plus + "Menu");
    String _plus_2 = (_plus_1 + ".java");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus_2, this.toMenuCode(((Menu) _head)));
  }
  
  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    InputOutput.<String>println(name);
    return name.substring(0, name.indexOf("."));
  }
  
  public CharSequence toTestCases(final Menu mn, final Resource resource, final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = mn.getElements();
      for(final Element m : _elements) {
        boolean _matched = false;
        if (m instanceof TEST_ITEM) {
          _matched=true;
          this.genTestItem(((TEST_ITEM)m), resource, fsa);
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void genTestItem(final TEST_ITEM m, final Resource resource, final IFileSystemAccess fsa) {
    String pkage = "\\com\\holycityaudio\\SpinCAD\\test\\";
  }
  
  public CharSequence toTestCode(final Menu mn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* SpinCAD Designer - DSP Development Tool for the Spin FV-1");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright (C) 2013 - 2015 - Gary Worsham");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Based on ElmGen by Andrew Kilpatrick.  Modified by Gary Worsham 2013 - 2014.  Look for GSW in code.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   This program is free software: you can redistribute it and/or modify");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   it under the terms of the GNU General Public License as published by");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   the Free Software Foundation, either version 3 of the License, or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   This program is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   but WITHOUT ANY WARRANTY; without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   GNU General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   You should have received a copy of the GNU General Public License");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*   along with this program.  If not, see <http://www.gnu.org/licenses/>.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* \t");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// this is a bunch of units tests for the blocks");
    _builder.newLine();
    _builder.append("// could stand improvement");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package com.holycityaudio.SpinCAD.test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.swing.SwingUtilities;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.holycityaudio.SpinCAD.SpinCADFrame;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.andrewkilpatrick.elmGen.ElmProgram;");
    _builder.newLine();
    _builder.append("import org.andrewkilpatrick.elmGen.simulator.SimulatorState;");
    _builder.newLine();
    _builder.append("import org.andrewkilpatrick.elmGen.simulator.SinLFO;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class SpinCADTest {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SpinCADTest() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ------------------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Launch the application.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final ElmProgram p = new ElmProgram(\"Test\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SwingUtilities.invokeLater(new Runnable() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("try { ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("SpinCADFrame dspFrame = new SpinCADFrame();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("dspFrame.setVisible(true);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// these were generated by GenTestCases() - old Java written CADBlocks");
    _builder.newLine();
    _builder.append("/*\t\t\t\t\tnew BitCrusherTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new SingleDelayTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new MultiTapTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new HPF2PTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new OneBandEQTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new SixBandEQTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new BiQuadTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ChorusTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ChorusPresetTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new DelayTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new LPF4PTest(dspFrame);");
    _builder.newLine();
    _builder.append("//\t\t\t\t\tnew CubeGainTest(dspFrame);");
    _builder.newLine();
    _builder.append("*/\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("// these are auto-generated from spincad source files");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new very_tight_plate_verbTest(dspFrame);\t");
    _builder.newLine();
    _builder.append("//\t\t\t\t\tnew InstructionTestTest(dspFrame);");
    _builder.newLine();
    _builder.append("//\t\t\t\t\tnew dance_ir_fla_lTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ToverXTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new OctaveTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new distTest(dspFrame);\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_chorusTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_echoTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_flangerTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new crossfadeTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new control_smootherTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_flangerTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new MN3011aTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_phaserTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_vibratoTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new ga_demo_wahTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new rms_lim_expTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new rms_limiterTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new slow_gearTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new gated_verbTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new rom_rev1Test(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new shimmer_verbTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new act_xoverTest(dspFrame); \t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("new soft_knee_limiterTest(dspFrame);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toMenuCode(final Menu mn) {
    CharSequence _xblockexpression = null;
    {
      String menuNameY = "testing";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("package com.holycityaudio.SpinCAD;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import com.holycityaudio.SpinCAD.SpinCADBlock;");
      _builder.newLine();
      {
        EList<Element> _elements = mn.getElements();
        for(final Element m : _elements) {
          _builder.append("\t");
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (m instanceof MENU_ITEM) {
            _matched=true;
            _switchResult = this.importMenuItem(((MENU_ITEM)m));
          }
          _builder.append(_switchResult, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import java.awt.event.ActionEvent;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import java.awt.event.ActionListener;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenu;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenuBar;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("import javax.swing.JMenuItem;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public class ");
      String _className = this.className(mn.eResource());
      String _plus = (_className + "Menu");
      _builder.append(_plus, "\t");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//\tprivate static final long serialVersionUID = 1L;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _className_1 = this.className(mn.eResource());
      String _plus_1 = (_className_1 + "Menu");
      _builder.append(_plus_1, "\t");
      _builder.append("(final SpinCADFrame f, final SpinCADPanel panel, JMenuBar menuBar) {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Element> _elements_1 = mn.getElements();
        for(final Element m_1 : _elements_1) {
          _builder.append("\t");
          CharSequence _switchResult_1 = null;
          boolean _matched_1 = false;
          if (m_1 instanceof MENU_HEADER) {
            _matched_1=true;
            String _xblockexpression_1 = null;
            {
              menuNameY = this.getMenuName(((MENU_HEADER)m_1).getName());
              _xblockexpression_1 = this.genMenu(((MENU_HEADER)m_1));
            }
            _switchResult_1 = _xblockexpression_1;
          }
          if (!_matched_1) {
            if (m_1 instanceof MENU_ITEM) {
              _matched_1=true;
              _switchResult_1 = this.genMenuItem(((MENU_ITEM)m_1), menuNameY);
            }
          }
          _builder.append(_switchResult_1, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String genMenu(final MENU_HEADER m) {
    String _xblockexpression = null;
    {
      String menuNameX = this.getMenuName(m.getName());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("JMenu ");
      _builder.append(menuNameX);
      _builder.append(" = new JMenu(\"");
      String _name = m.getName();
      _builder.append(_name);
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("menuBar.add(");
      _builder.append(menuNameX);
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public CharSequence genMenuItem(final MENU_ITEM m, final String menuName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final JMenuItem mntm_");
    String _className = m.getClassName();
    _builder.append(_className);
    _builder.append(" = new JMenuItem(\"");
    String _name = m.getName();
    _builder.append(_name);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("mntm_");
    String _className_1 = m.getClassName();
    _builder.append(_className_1);
    _builder.append(".addActionListener(new ActionListener() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void actionPerformed(ActionEvent e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SpinCADBlock pcB = new ");
    String _className_2 = m.getClassName();
    _builder.append(_className_2, "\t\t");
    _builder.append("CADBlock(50, 100);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("f.dropBlock(panel, pcB);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("});");
    _builder.newLine();
    _builder.append(menuName);
    _builder.append(".add(mntm_");
    String _className_3 = m.getClassName();
    _builder.append(_className_3);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence importMenuItem(final MENU_ITEM m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import com.holycityaudio.SpinCAD.CADBlocks.");
    String _className = m.getClassName();
    _builder.append(_className);
    _builder.append("CADBlock;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String getMenuName(final String header) {
    String _xblockexpression = null;
    {
      String menuName = header.replaceAll("\\s+", "");
      menuName = menuName.replaceAll("\\/", "");
      menuName = menuName.replaceAll("-", "_");
      String _lowerCase = menuName.toLowerCase();
      _xblockexpression = ("mn_" + _lowerCase);
    }
    return _xblockexpression;
  }
}
