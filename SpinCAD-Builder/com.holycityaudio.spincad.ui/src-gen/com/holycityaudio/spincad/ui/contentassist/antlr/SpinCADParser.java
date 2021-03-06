/*
 * generated by Xtext
 */
package com.holycityaudio.spincad.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.holycityaudio.spincad.services.SpinCADGrammarAccess;

public class SpinCADParser extends AbstractContentAssistParser {
	
	@Inject
	private SpinCADGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser createParser() {
		com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser result = new com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramAccess().getNameAlternatives_1_0(), "rule__Program__NameAlternatives_1_0");
					put(grammarAccess.getPinAccess().getAlternatives(), "rule__Pin__Alternatives");
					put(grammarAccess.getInputPinAccess().getAlternatives(), "rule__InputPin__Alternatives");
					put(grammarAccess.getOutputPinAccess().getAlternatives(), "rule__OutputPin__Alternatives");
					put(grammarAccess.getAudioInputAccess().getLabelAlternatives_2_0(), "rule__AudioInput__LabelAlternatives_2_0");
					put(grammarAccess.getAudioOutputAccess().getLabelAlternatives_2_0(), "rule__AudioOutput__LabelAlternatives_2_0");
					put(grammarAccess.getControlInputAccess().getLabelAlternatives_2_0(), "rule__ControlInput__LabelAlternatives_2_0");
					put(grammarAccess.getControlOutputAccess().getLabelAlternatives_2_0(), "rule__ControlOutput__LabelAlternatives_2_0");
					put(grammarAccess.getSpinElementAccess().getAlternatives(), "rule__SpinElement__Alternatives");
					put(grammarAccess.getControlAccess().getAlternatives(), "rule__Control__Alternatives");
					put(grammarAccess.getSpinSliderLabelAccess().getControlNameAlternatives_2_0(), "rule__SpinSliderLabel__ControlNameAlternatives_2_0");
					put(grammarAccess.getSliderLabelSpinnerAccess().getControlNameAlternatives_2_0(), "rule__SliderLabelSpinner__ControlNameAlternatives_2_0");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getControlNameAlternatives_2_0(), "rule__SliderLabelCheckBox__ControlNameAlternatives_2_0");
					put(grammarAccess.getSpinCheckBoxAccess().getControlNameAlternatives_2_0(), "rule__SpinCheckBox__ControlNameAlternatives_2_0");
					put(grammarAccess.getLogFreqSliderLabelAccess().getControlNameAlternatives_2_0(), "rule__LogFreqSliderLabel__ControlNameAlternatives_2_0");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getControlNameAlternatives_2_0(), "rule__LogFreq2SliderLabel__ControlNameAlternatives_2_0");
					put(grammarAccess.getSpinRadioButtonAccess().getControlNameAlternatives_2_0(), "rule__SpinRadioButton__ControlNameAlternatives_2_0");
					put(grammarAccess.getMacroAccess().getAlternatives(), "rule__Macro__Alternatives");
					put(grammarAccess.getIsPinConnectedAccess().getArg1Alternatives_1_0(), "rule__IsPinConnected__Arg1Alternatives_1_0");
					put(grammarAccess.getSetOutputPinAccess().getPinNameAlternatives_1_0(), "rule__SetOutputPin__PinNameAlternatives_1_0");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getInst_B6_S1_14Access().getAlternatives(), "rule__Inst_B6_S1_14__Alternatives");
					put(grammarAccess.getInst_B15_S1_9Access().getAlternatives(), "rule__Inst_B15_S1_9__Alternatives");
					put(grammarAccess.getInst_B6Access().getAlternatives(), "rule__Inst_B6__Alternatives");
					put(grammarAccess.getInst_B24Access().getAlternatives(), "rule__Inst_B24__Alternatives");
					put(grammarAccess.getInst_X0Access().getAlternatives(), "rule__Inst_X0__Alternatives");
					put(grammarAccess.getInst_S1_14_S1_10Access().getAlternatives(), "rule__Inst_S1_14_S1_10__Alternatives");
					put(grammarAccess.getSPINDOUBLEAccess().getAlternatives_1(), "rule__SPINDOUBLE__Alternatives_1");
					put(grammarAccess.getSPINREGISTERAccess().getAlternatives_1(), "rule__SPINREGISTER__Alternatives_1");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getAlternatives(), "rule__SPINCHOREGFLAGS__Alternatives");
					put(grammarAccess.getSPINMEMAccess().getAlternatives_1(), "rule__SPINMEM__Alternatives_1");
					put(grammarAccess.getSPINBUFAccess().getAlternatives_1(), "rule__SPINBUF__Alternatives_1");
					put(grammarAccess.getSPINBUFAccess().getAlternatives_2(), "rule__SPINBUF__Alternatives_2");
					put(grammarAccess.getBINARY24Access().getAlternatives(), "rule__BINARY24__Alternatives");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_2(), "rule__Program__Group_2__0");
					put(grammarAccess.getAudioInputAccess().getGroup(), "rule__AudioInput__Group__0");
					put(grammarAccess.getAudioOutputAccess().getGroup(), "rule__AudioOutput__Group__0");
					put(grammarAccess.getControlInputAccess().getGroup(), "rule__ControlInput__Group__0");
					put(grammarAccess.getControlOutputAccess().getGroup(), "rule__ControlOutput__Group__0");
					put(grammarAccess.getSpinEquateAccess().getGroup(), "rule__SpinEquate__Group__0");
					put(grammarAccess.getSpinIntAccess().getGroup(), "rule__SpinInt__Group__0");
					put(grammarAccess.getMemAccess().getGroup(), "rule__Mem__Group__0");
					put(grammarAccess.getOffsetAccess().getGroup(), "rule__Offset__Group__0");
					put(grammarAccess.getSpinBoolAccess().getGroup(), "rule__SpinBool__Group__0");
					put(grammarAccess.getSpinSliderLabelAccess().getGroup(), "rule__SpinSliderLabel__Group__0");
					put(grammarAccess.getSpinSliderLabelAccess().getGroup_3(), "rule__SpinSliderLabel__Group_3__0");
					put(grammarAccess.getSliderLabelSpinnerAccess().getGroup(), "rule__SliderLabelSpinner__Group__0");
					put(grammarAccess.getSliderLabelSpinnerAccess().getGroup_3(), "rule__SliderLabelSpinner__Group_3__0");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getGroup(), "rule__SliderLabelCheckBox__Group__0");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getGroup_3(), "rule__SliderLabelCheckBox__Group_3__0");
					put(grammarAccess.getSpinCheckBoxAccess().getGroup(), "rule__SpinCheckBox__Group__0");
					put(grammarAccess.getLogFreqSliderLabelAccess().getGroup(), "rule__LogFreqSliderLabel__Group__0");
					put(grammarAccess.getLogFreqSliderLabelAccess().getGroup_3(), "rule__LogFreqSliderLabel__Group_3__0");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getGroup(), "rule__LogFreq2SliderLabel__Group__0");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getGroup_3(), "rule__LogFreq2SliderLabel__Group_3__0");
					put(grammarAccess.getSpinRadioButtonAccess().getGroup(), "rule__SpinRadioButton__Group__0");
					put(grammarAccess.getSpinComboBoxAccess().getGroup(), "rule__SpinComboBox__Group__0");
					put(grammarAccess.getSpinComboBoxAccess().getGroup_4(), "rule__SpinComboBox__Group_4__0");
					put(grammarAccess.getSpinComboBoxAccess().getGroup_4_1(), "rule__SpinComboBox__Group_4_1__0");
					put(grammarAccess.getSpinComboBoxAccess().getGroup_4_1_1(), "rule__SpinComboBox__Group_4_1_1__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getIsPinConnectedAccess().getGroup(), "rule__IsPinConnected__Group__0");
					put(grammarAccess.getIsGreaterThanAccess().getGroup(), "rule__IsGreaterThan__Group__0");
					put(grammarAccess.getIsLessThanAccess().getGroup(), "rule__IsLessThan__Group__0");
					put(grammarAccess.getIsEqualToAccess().getGroup(), "rule__IsEqualTo__Group__0");
					put(grammarAccess.getIsTrueAccess().getGroup(), "rule__IsTrue__Group__0");
					put(grammarAccess.getIsElseAccess().getGroup(), "rule__IsElse__Group__0");
					put(grammarAccess.getIsEndifAccess().getGroup(), "rule__IsEndif__Group__0");
					put(grammarAccess.getIsOrAccess().getGroup(), "rule__IsOr__Group__0");
					put(grammarAccess.getGetInputDefaultAccess().getGroup(), "rule__GetInputDefault__Group__0");
					put(grammarAccess.getGetDelayScaleControlAccess().getGroup(), "rule__GetDelayScaleControl__Group__0");
					put(grammarAccess.getReadChorusTapAccess().getGroup(), "rule__ReadChorusTap__Group__0");
					put(grammarAccess.getGetSamplesFromRatioAccess().getGroup(), "rule__GetSamplesFromRatio__Group__0");
					put(grammarAccess.getSemitonesToRmpRateAccess().getGroup(), "rule__SemitonesToRmpRate__Group__0");
					put(grammarAccess.getGetBaseAddressAccess().getGroup(), "rule__GetBaseAddress__Group__0");
					put(grammarAccess.getSetOutputPinAccess().getGroup(), "rule__SetOutputPin__Group__0");
					put(grammarAccess.getMinusDoubleAccess().getGroup(), "rule__MinusDouble__Group__0");
					put(grammarAccess.getDivideDoubleAccess().getGroup(), "rule__DivideDouble__Group__0");
					put(grammarAccess.getEqualsAccess().getGroup(), "rule__Equals__Group__0");
					put(grammarAccess.getEqualsBoolAccess().getGroup(), "rule__EqualsBool__Group__0");
					put(grammarAccess.getDivideIntAccess().getGroup(), "rule__DivideInt__Group__0");
					put(grammarAccess.getMultiplyDoubleAccess().getGroup(), "rule__MultiplyDouble__Group__0");
					put(grammarAccess.getSetChorusWidthAccess().getGroup(), "rule__SetChorusWidth__Group__0");
					put(grammarAccess.getReadRegisterAccess().getGroup(), "rule__ReadRegister__Group__0");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getGroup(), "rule__WriteRegisterLowshelf__Group__0");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getGroup(), "rule__WriteRegisterHighshelf__Group__0");
					put(grammarAccess.getWriteRegisterAccess().getGroup(), "rule__WriteRegister__Group__0");
					put(grammarAccess.getMaxxAccess().getGroup(), "rule__Maxx__Group__0");
					put(grammarAccess.getReadRegisterFilterAccess().getGroup(), "rule__ReadRegisterFilter__Group__0");
					put(grammarAccess.getMulxAccess().getGroup(), "rule__Mulx__Group__0");
					put(grammarAccess.getLdaxAccess().getGroup(), "rule__Ldax__Group__0");
					put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
					put(grammarAccess.getLogAccess().getGroup(), "rule__Log__Group__0");
					put(grammarAccess.getScaleOffsetAccess().getGroup(), "rule__ScaleOffset__Group__0");
					put(grammarAccess.getWriteDelayAccess().getGroup(), "rule__WriteDelay__Group__0");
					put(grammarAccess.getWriteAllpassAccess().getGroup(), "rule__WriteAllpass__Group__0");
					put(grammarAccess.getReadDelayAccess().getGroup(), "rule__ReadDelay__Group__0");
					put(grammarAccess.getLoadSinLFOAccess().getGroup(), "rule__LoadSinLFO__Group__0");
					put(grammarAccess.getLoadRampLFOAccess().getGroup(), "rule__LoadRampLFO__Group__0");
					put(grammarAccess.getChorusReadDelayAccess().getGroup(), "rule__ChorusReadDelay__Group__0");
					put(grammarAccess.getChorusReadValueAccess().getGroup(), "rule__ChorusReadValue__Group__0");
					put(grammarAccess.getChorusScaleOffsetAccess().getGroup(), "rule__ChorusScaleOffset__Group__0");
					put(grammarAccess.getReadDelayPointerAccess().getGroup(), "rule__ReadDelayPointer__Group__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getXorAccess().getGroup(), "rule__Xor__Group__0");
					put(grammarAccess.getJamAccess().getGroup(), "rule__Jam__Group__0");
					put(grammarAccess.getClrAccess().getGroup(), "rule__Clr__Group__0");
					put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
					put(grammarAccess.getAbsaAccess().getGroup(), "rule__Absa__Group__0");
					put(grammarAccess.getSkipAccess().getGroup(), "rule__Skip__Group__0");
					put(grammarAccess.getSkipAccess().getGroup_2(), "rule__Skip__Group_2__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup(), "rule__SPINDOUBLE__Group__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup_1_1(), "rule__SPINDOUBLE__Group_1_1__0");
					put(grammarAccess.getSPINDOUBLEAccess().getGroup_1_1_1(), "rule__SPINDOUBLE__Group_1_1_1__0");
					put(grammarAccess.getSPINREGISTERAccess().getGroup(), "rule__SPINREGISTER__Group__0");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getGroup_1(), "rule__SPINCHOREGFLAGS__Group_1__0");
					put(grammarAccess.getSPINCHOREGFLAGSAccess().getGroup_1_1(), "rule__SPINCHOREGFLAGS__Group_1_1__0");
					put(grammarAccess.getSPINMEMAccess().getGroup(), "rule__SPINMEM__Group__0");
					put(grammarAccess.getSPINMEMAccess().getGroup_1_0(), "rule__SPINMEM__Group_1_0__0");
					put(grammarAccess.getSPINMEMAccess().getGroup_1_0_1(), "rule__SPINMEM__Group_1_0_1__0");
					put(grammarAccess.getSPINBUFAccess().getGroup(), "rule__SPINBUF__Group__0");
					put(grammarAccess.getBINARY24Access().getGroup_0(), "rule__BINARY24__Group_0__0");
					put(grammarAccess.getBINARY24Access().getGroup_0_0(), "rule__BINARY24__Group_0_0__0");
					put(grammarAccess.getBINARY24Access().getGroup_1(), "rule__BINARY24__Group_1__0");
					put(grammarAccess.getProgramAccess().getNameAssignment_1(), "rule__Program__NameAssignment_1");
					put(grammarAccess.getProgramAccess().getColorAssignment_2_1(), "rule__Program__ColorAssignment_2_1");
					put(grammarAccess.getProgramAccess().getPinsAssignment_3(), "rule__Program__PinsAssignment_3");
					put(grammarAccess.getProgramAccess().getElementsAssignment_4(), "rule__Program__ElementsAssignment_4");
					put(grammarAccess.getAudioInputAccess().getVarNameAssignment_1(), "rule__AudioInput__VarNameAssignment_1");
					put(grammarAccess.getAudioInputAccess().getLabelAssignment_2(), "rule__AudioInput__LabelAssignment_2");
					put(grammarAccess.getAudioOutputAccess().getVarNameAssignment_1(), "rule__AudioOutput__VarNameAssignment_1");
					put(grammarAccess.getAudioOutputAccess().getLabelAssignment_2(), "rule__AudioOutput__LabelAssignment_2");
					put(grammarAccess.getControlInputAccess().getVarNameAssignment_1(), "rule__ControlInput__VarNameAssignment_1");
					put(grammarAccess.getControlInputAccess().getLabelAssignment_2(), "rule__ControlInput__LabelAssignment_2");
					put(grammarAccess.getControlOutputAccess().getVarNameAssignment_1(), "rule__ControlOutput__VarNameAssignment_1");
					put(grammarAccess.getControlOutputAccess().getLabelAssignment_2(), "rule__ControlOutput__LabelAssignment_2");
					put(grammarAccess.getSpinEquateAccess().getEnameAssignment_1(), "rule__SpinEquate__EnameAssignment_1");
					put(grammarAccess.getSpinEquateAccess().getValueAssignment_2(), "rule__SpinEquate__ValueAssignment_2");
					put(grammarAccess.getSpinIntAccess().getEnameAssignment_1(), "rule__SpinInt__EnameAssignment_1");
					put(grammarAccess.getSpinIntAccess().getValueAssignment_2(), "rule__SpinInt__ValueAssignment_2");
					put(grammarAccess.getMemAccess().getBufferAssignment_1(), "rule__Mem__BufferAssignment_1");
					put(grammarAccess.getMemAccess().getLengthAssignment_2(), "rule__Mem__LengthAssignment_2");
					put(grammarAccess.getOffsetAccess().getNameAssignment_1(), "rule__Offset__NameAssignment_1");
					put(grammarAccess.getOffsetAccess().getLengthAssignment_2(), "rule__Offset__LengthAssignment_2");
					put(grammarAccess.getSpinBoolAccess().getLabelAssignment_1(), "rule__SpinBool__LabelAssignment_1");
					put(grammarAccess.getSpinBoolAccess().getValueAssignment_2(), "rule__SpinBool__ValueAssignment_2");
					put(grammarAccess.getSpinSliderLabelAccess().getEnameAssignment_1(), "rule__SpinSliderLabel__EnameAssignment_1");
					put(grammarAccess.getSpinSliderLabelAccess().getControlNameAssignment_2(), "rule__SpinSliderLabel__ControlNameAssignment_2");
					put(grammarAccess.getSpinSliderLabelAccess().getMinValAssignment_3_0(), "rule__SpinSliderLabel__MinValAssignment_3_0");
					put(grammarAccess.getSpinSliderLabelAccess().getMaxValAssignment_3_1(), "rule__SpinSliderLabel__MaxValAssignment_3_1");
					put(grammarAccess.getSpinSliderLabelAccess().getInitValAssignment_3_2(), "rule__SpinSliderLabel__InitValAssignment_3_2");
					put(grammarAccess.getSpinSliderLabelAccess().getMultiplierAssignment_3_3(), "rule__SpinSliderLabel__MultiplierAssignment_3_3");
					put(grammarAccess.getSpinSliderLabelAccess().getPrecisionAssignment_3_4(), "rule__SpinSliderLabel__PrecisionAssignment_3_4");
					put(grammarAccess.getSpinSliderLabelAccess().getOptionAssignment_3_5(), "rule__SpinSliderLabel__OptionAssignment_3_5");
					put(grammarAccess.getSliderLabelSpinnerAccess().getEnameAssignment_1(), "rule__SliderLabelSpinner__EnameAssignment_1");
					put(grammarAccess.getSliderLabelSpinnerAccess().getControlNameAssignment_2(), "rule__SliderLabelSpinner__ControlNameAssignment_2");
					put(grammarAccess.getSliderLabelSpinnerAccess().getMinValAssignment_3_0(), "rule__SliderLabelSpinner__MinValAssignment_3_0");
					put(grammarAccess.getSliderLabelSpinnerAccess().getMaxValAssignment_3_1(), "rule__SliderLabelSpinner__MaxValAssignment_3_1");
					put(grammarAccess.getSliderLabelSpinnerAccess().getInitValAssignment_3_2(), "rule__SliderLabelSpinner__InitValAssignment_3_2");
					put(grammarAccess.getSliderLabelSpinnerAccess().getMultiplierAssignment_3_3(), "rule__SliderLabelSpinner__MultiplierAssignment_3_3");
					put(grammarAccess.getSliderLabelSpinnerAccess().getPrecisionAssignment_3_4(), "rule__SliderLabelSpinner__PrecisionAssignment_3_4");
					put(grammarAccess.getSliderLabelSpinnerAccess().getOptionAssignment_3_5(), "rule__SliderLabelSpinner__OptionAssignment_3_5");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getEnameAssignment_1(), "rule__SliderLabelCheckBox__EnameAssignment_1");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getControlNameAssignment_2(), "rule__SliderLabelCheckBox__ControlNameAssignment_2");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getMinValAssignment_3_0(), "rule__SliderLabelCheckBox__MinValAssignment_3_0");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getMaxValAssignment_3_1(), "rule__SliderLabelCheckBox__MaxValAssignment_3_1");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getInitValAssignment_3_2(), "rule__SliderLabelCheckBox__InitValAssignment_3_2");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getMultiplierAssignment_3_3(), "rule__SliderLabelCheckBox__MultiplierAssignment_3_3");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getPrecisionAssignment_3_4(), "rule__SliderLabelCheckBox__PrecisionAssignment_3_4");
					put(grammarAccess.getSliderLabelCheckBoxAccess().getOptionAssignment_3_5(), "rule__SliderLabelCheckBox__OptionAssignment_3_5");
					put(grammarAccess.getSpinCheckBoxAccess().getEnameAssignment_1(), "rule__SpinCheckBox__EnameAssignment_1");
					put(grammarAccess.getSpinCheckBoxAccess().getControlNameAssignment_2(), "rule__SpinCheckBox__ControlNameAssignment_2");
					put(grammarAccess.getLogFreqSliderLabelAccess().getEnameAssignment_1(), "rule__LogFreqSliderLabel__EnameAssignment_1");
					put(grammarAccess.getLogFreqSliderLabelAccess().getControlNameAssignment_2(), "rule__LogFreqSliderLabel__ControlNameAssignment_2");
					put(grammarAccess.getLogFreqSliderLabelAccess().getMinValAssignment_3_0(), "rule__LogFreqSliderLabel__MinValAssignment_3_0");
					put(grammarAccess.getLogFreqSliderLabelAccess().getMaxValAssignment_3_1(), "rule__LogFreqSliderLabel__MaxValAssignment_3_1");
					put(grammarAccess.getLogFreqSliderLabelAccess().getInitValAssignment_3_2(), "rule__LogFreqSliderLabel__InitValAssignment_3_2");
					put(grammarAccess.getLogFreqSliderLabelAccess().getMultiplierAssignment_3_3(), "rule__LogFreqSliderLabel__MultiplierAssignment_3_3");
					put(grammarAccess.getLogFreqSliderLabelAccess().getPrecisionAssignment_3_4(), "rule__LogFreqSliderLabel__PrecisionAssignment_3_4");
					put(grammarAccess.getLogFreqSliderLabelAccess().getOptionAssignment_3_5(), "rule__LogFreqSliderLabel__OptionAssignment_3_5");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getEnameAssignment_1(), "rule__LogFreq2SliderLabel__EnameAssignment_1");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getControlNameAssignment_2(), "rule__LogFreq2SliderLabel__ControlNameAssignment_2");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getMinValAssignment_3_0(), "rule__LogFreq2SliderLabel__MinValAssignment_3_0");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getMaxValAssignment_3_1(), "rule__LogFreq2SliderLabel__MaxValAssignment_3_1");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getInitValAssignment_3_2(), "rule__LogFreq2SliderLabel__InitValAssignment_3_2");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getMultiplierAssignment_3_3(), "rule__LogFreq2SliderLabel__MultiplierAssignment_3_3");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getPrecisionAssignment_3_4(), "rule__LogFreq2SliderLabel__PrecisionAssignment_3_4");
					put(grammarAccess.getLogFreq2SliderLabelAccess().getOptionAssignment_3_5(), "rule__LogFreq2SliderLabel__OptionAssignment_3_5");
					put(grammarAccess.getSpinRadioButtonAccess().getEnameAssignment_1(), "rule__SpinRadioButton__EnameAssignment_1");
					put(grammarAccess.getSpinRadioButtonAccess().getControlNameAssignment_2(), "rule__SpinRadioButton__ControlNameAssignment_2");
					put(grammarAccess.getSpinComboBoxAccess().getEnameAssignment_1(), "rule__SpinComboBox__EnameAssignment_1");
					put(grammarAccess.getSpinComboBoxAccess().getOptionaAssignment_2(), "rule__SpinComboBox__OptionaAssignment_2");
					put(grammarAccess.getSpinComboBoxAccess().getOptionbAssignment_3(), "rule__SpinComboBox__OptionbAssignment_3");
					put(grammarAccess.getSpinComboBoxAccess().getOptioncAssignment_4_0(), "rule__SpinComboBox__OptioncAssignment_4_0");
					put(grammarAccess.getSpinComboBoxAccess().getOptiondAssignment_4_1_0(), "rule__SpinComboBox__OptiondAssignment_4_1_0");
					put(grammarAccess.getSpinComboBoxAccess().getOptioneAssignment_4_1_1_0(), "rule__SpinComboBox__OptioneAssignment_4_1_1_0");
					put(grammarAccess.getSpinComboBoxAccess().getOptionfAssignment_4_1_1_1(), "rule__SpinComboBox__OptionfAssignment_4_1_1_1");
					put(grammarAccess.getCommentAccess().getRemarkAssignment(), "rule__Comment__RemarkAssignment");
					put(grammarAccess.getLabelAccess().getNameAssignment_0(), "rule__Label__NameAssignment_0");
					put(grammarAccess.getIsPinConnectedAccess().getArg1Assignment_1(), "rule__IsPinConnected__Arg1Assignment_1");
					put(grammarAccess.getIsGreaterThanAccess().getVariableAssignment_1(), "rule__IsGreaterThan__VariableAssignment_1");
					put(grammarAccess.getIsGreaterThanAccess().getValueAssignment_2(), "rule__IsGreaterThan__ValueAssignment_2");
					put(grammarAccess.getIsLessThanAccess().getVariableAssignment_1(), "rule__IsLessThan__VariableAssignment_1");
					put(grammarAccess.getIsLessThanAccess().getValueAssignment_2(), "rule__IsLessThan__ValueAssignment_2");
					put(grammarAccess.getIsEqualToAccess().getVariableAssignment_1(), "rule__IsEqualTo__VariableAssignment_1");
					put(grammarAccess.getIsEqualToAccess().getValueAssignment_2(), "rule__IsEqualTo__ValueAssignment_2");
					put(grammarAccess.getIsTrueAccess().getVariableAssignment_1(), "rule__IsTrue__VariableAssignment_1");
					put(grammarAccess.getIsOrAccess().getVar1Assignment_1(), "rule__IsOr__Var1Assignment_1");
					put(grammarAccess.getIsOrAccess().getVar2Assignment_2(), "rule__IsOr__Var2Assignment_2");
					put(grammarAccess.getIsOrAccess().getValueAssignment_3(), "rule__IsOr__ValueAssignment_3");
					put(grammarAccess.getGetInputDefaultAccess().getLabelAssignment_1(), "rule__GetInputDefault__LabelAssignment_1");
					put(grammarAccess.getGetInputDefaultAccess().getVariableAssignment_2(), "rule__GetInputDefault__VariableAssignment_2");
					put(grammarAccess.getGetInputDefaultAccess().getScaleAssignment_3(), "rule__GetInputDefault__ScaleAssignment_3");
					put(grammarAccess.getGetInputDefaultAccess().getDefaultValAssignment_4(), "rule__GetInputDefault__DefaultValAssignment_4");
					put(grammarAccess.getGetDelayScaleControlAccess().getRatioAssignment_1(), "rule__GetDelayScaleControl__RatioAssignment_1");
					put(grammarAccess.getGetDelayScaleControlAccess().getLengthAssignment_2(), "rule__GetDelayScaleControl__LengthAssignment_2");
					put(grammarAccess.getGetDelayScaleControlAccess().getOffsetAssignment_3(), "rule__GetDelayScaleControl__OffsetAssignment_3");
					put(grammarAccess.getGetDelayScaleControlAccess().getControlAssignment_4(), "rule__GetDelayScaleControl__ControlAssignment_4");
					put(grammarAccess.getReadChorusTapAccess().getLfoAssignment_1(), "rule__ReadChorusTap__LfoAssignment_1");
					put(grammarAccess.getReadChorusTapAccess().getPhaseAssignment_2(), "rule__ReadChorusTap__PhaseAssignment_2");
					put(grammarAccess.getReadChorusTapAccess().getRatioAssignment_3(), "rule__ReadChorusTap__RatioAssignment_3");
					put(grammarAccess.getReadChorusTapAccess().getLengthAssignment_4(), "rule__ReadChorusTap__LengthAssignment_4");
					put(grammarAccess.getReadChorusTapAccess().getOffsetAssignment_5(), "rule__ReadChorusTap__OffsetAssignment_5");
					put(grammarAccess.getGetSamplesFromRatioAccess().getVariableAssignment_1(), "rule__GetSamplesFromRatio__VariableAssignment_1");
					put(grammarAccess.getGetSamplesFromRatioAccess().getRatioAssignment_2(), "rule__GetSamplesFromRatio__RatioAssignment_2");
					put(grammarAccess.getGetSamplesFromRatioAccess().getLengthAssignment_3(), "rule__GetSamplesFromRatio__LengthAssignment_3");
					put(grammarAccess.getSemitonesToRmpRateAccess().getVariableAssignment_1(), "rule__SemitonesToRmpRate__VariableAssignment_1");
					put(grammarAccess.getSemitonesToRmpRateAccess().getSemitonesAssignment_2(), "rule__SemitonesToRmpRate__SemitonesAssignment_2");
					put(grammarAccess.getSetOutputPinAccess().getPinNameAssignment_1(), "rule__SetOutputPin__PinNameAssignment_1");
					put(grammarAccess.getSetOutputPinAccess().getVarNameAssignment_2(), "rule__SetOutputPin__VarNameAssignment_2");
					put(grammarAccess.getMinusDoubleAccess().getVarNameAssignment_1(), "rule__MinusDouble__VarNameAssignment_1");
					put(grammarAccess.getMinusDoubleAccess().getHighAssignment_2(), "rule__MinusDouble__HighAssignment_2");
					put(grammarAccess.getMinusDoubleAccess().getLowAssignment_3(), "rule__MinusDouble__LowAssignment_3");
					put(grammarAccess.getDivideDoubleAccess().getVarNameAssignment_1(), "rule__DivideDouble__VarNameAssignment_1");
					put(grammarAccess.getDivideDoubleAccess().getHighAssignment_2(), "rule__DivideDouble__HighAssignment_2");
					put(grammarAccess.getDivideDoubleAccess().getLowAssignment_3(), "rule__DivideDouble__LowAssignment_3");
					put(grammarAccess.getEqualsAccess().getVarNameAssignment_1(), "rule__Equals__VarNameAssignment_1");
					put(grammarAccess.getEqualsAccess().getValueAssignment_2(), "rule__Equals__ValueAssignment_2");
					put(grammarAccess.getEqualsBoolAccess().getVarNameAssignment_1(), "rule__EqualsBool__VarNameAssignment_1");
					put(grammarAccess.getEqualsBoolAccess().getValueAssignment_2(), "rule__EqualsBool__ValueAssignment_2");
					put(grammarAccess.getDivideIntAccess().getVarNameAssignment_1(), "rule__DivideInt__VarNameAssignment_1");
					put(grammarAccess.getDivideIntAccess().getHighAssignment_2(), "rule__DivideInt__HighAssignment_2");
					put(grammarAccess.getDivideIntAccess().getLowAssignment_3(), "rule__DivideInt__LowAssignment_3");
					put(grammarAccess.getMultiplyDoubleAccess().getVarNameAssignment_1(), "rule__MultiplyDouble__VarNameAssignment_1");
					put(grammarAccess.getMultiplyDoubleAccess().getHighAssignment_2(), "rule__MultiplyDouble__HighAssignment_2");
					put(grammarAccess.getMultiplyDoubleAccess().getLowAssignment_3(), "rule__MultiplyDouble__LowAssignment_3");
					put(grammarAccess.getSetChorusWidthAccess().getVarNameAssignment_1(), "rule__SetChorusWidth__VarNameAssignment_1");
					put(grammarAccess.getSetChorusWidthAccess().getLengthAssignment_2(), "rule__SetChorusWidth__LengthAssignment_2");
					put(grammarAccess.getSetChorusWidthAccess().getScaleAssignment_3(), "rule__SetChorusWidth__ScaleAssignment_3");
					put(grammarAccess.getReadRegisterAccess().getArg1Assignment_1(), "rule__ReadRegister__Arg1Assignment_1");
					put(grammarAccess.getReadRegisterAccess().getArg2Assignment_3(), "rule__ReadRegister__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getArg1Assignment_1(), "rule__WriteRegisterLowshelf__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterLowshelfAccess().getArg2Assignment_3(), "rule__WriteRegisterLowshelf__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getArg1Assignment_1(), "rule__WriteRegisterHighshelf__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterHighshelfAccess().getArg2Assignment_3(), "rule__WriteRegisterHighshelf__Arg2Assignment_3");
					put(grammarAccess.getWriteRegisterAccess().getArg1Assignment_1(), "rule__WriteRegister__Arg1Assignment_1");
					put(grammarAccess.getWriteRegisterAccess().getArg2Assignment_3(), "rule__WriteRegister__Arg2Assignment_3");
					put(grammarAccess.getMaxxAccess().getArg1Assignment_1(), "rule__Maxx__Arg1Assignment_1");
					put(grammarAccess.getMaxxAccess().getArg2Assignment_3(), "rule__Maxx__Arg2Assignment_3");
					put(grammarAccess.getReadRegisterFilterAccess().getArg1Assignment_1(), "rule__ReadRegisterFilter__Arg1Assignment_1");
					put(grammarAccess.getReadRegisterFilterAccess().getArg2Assignment_3(), "rule__ReadRegisterFilter__Arg2Assignment_3");
					put(grammarAccess.getMulxAccess().getArg1Assignment_1(), "rule__Mulx__Arg1Assignment_1");
					put(grammarAccess.getLdaxAccess().getArg1Assignment_1(), "rule__Ldax__Arg1Assignment_1");
					put(grammarAccess.getExpAccess().getArg1Assignment_1(), "rule__Exp__Arg1Assignment_1");
					put(grammarAccess.getExpAccess().getArg2Assignment_3(), "rule__Exp__Arg2Assignment_3");
					put(grammarAccess.getLogAccess().getArg1Assignment_1(), "rule__Log__Arg1Assignment_1");
					put(grammarAccess.getLogAccess().getArg2Assignment_3(), "rule__Log__Arg2Assignment_3");
					put(grammarAccess.getScaleOffsetAccess().getArg1Assignment_1(), "rule__ScaleOffset__Arg1Assignment_1");
					put(grammarAccess.getScaleOffsetAccess().getArg2Assignment_3(), "rule__ScaleOffset__Arg2Assignment_3");
					put(grammarAccess.getWriteDelayAccess().getArg1Assignment_1(), "rule__WriteDelay__Arg1Assignment_1");
					put(grammarAccess.getWriteDelayAccess().getArg2Assignment_3(), "rule__WriteDelay__Arg2Assignment_3");
					put(grammarAccess.getWriteAllpassAccess().getArg1Assignment_1(), "rule__WriteAllpass__Arg1Assignment_1");
					put(grammarAccess.getWriteAllpassAccess().getArg2Assignment_3(), "rule__WriteAllpass__Arg2Assignment_3");
					put(grammarAccess.getReadDelayAccess().getArg1Assignment_1(), "rule__ReadDelay__Arg1Assignment_1");
					put(grammarAccess.getReadDelayAccess().getArg2Assignment_3(), "rule__ReadDelay__Arg2Assignment_3");
					put(grammarAccess.getLoadSinLFOAccess().getArg1Assignment_1(), "rule__LoadSinLFO__Arg1Assignment_1");
					put(grammarAccess.getLoadSinLFOAccess().getArg2Assignment_3(), "rule__LoadSinLFO__Arg2Assignment_3");
					put(grammarAccess.getLoadSinLFOAccess().getArg3Assignment_5(), "rule__LoadSinLFO__Arg3Assignment_5");
					put(grammarAccess.getLoadRampLFOAccess().getArg1Assignment_1(), "rule__LoadRampLFO__Arg1Assignment_1");
					put(grammarAccess.getLoadRampLFOAccess().getArg2Assignment_3(), "rule__LoadRampLFO__Arg2Assignment_3");
					put(grammarAccess.getLoadRampLFOAccess().getArg3Assignment_5(), "rule__LoadRampLFO__Arg3Assignment_5");
					put(grammarAccess.getChorusReadDelayAccess().getArg1Assignment_2(), "rule__ChorusReadDelay__Arg1Assignment_2");
					put(grammarAccess.getChorusReadDelayAccess().getArg2Assignment_4(), "rule__ChorusReadDelay__Arg2Assignment_4");
					put(grammarAccess.getChorusReadDelayAccess().getArg3Assignment_6(), "rule__ChorusReadDelay__Arg3Assignment_6");
					put(grammarAccess.getChorusReadValueAccess().getArg1Assignment_2(), "rule__ChorusReadValue__Arg1Assignment_2");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg1Assignment_2(), "rule__ChorusScaleOffset__Arg1Assignment_2");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg2Assignment_4(), "rule__ChorusScaleOffset__Arg2Assignment_4");
					put(grammarAccess.getChorusScaleOffsetAccess().getArg3Assignment_6(), "rule__ChorusScaleOffset__Arg3Assignment_6");
					put(grammarAccess.getReadDelayPointerAccess().getArg1Assignment_1(), "rule__ReadDelayPointer__Arg1Assignment_1");
					put(grammarAccess.getAndAccess().getArg1Assignment_1(), "rule__And__Arg1Assignment_1");
					put(grammarAccess.getOrAccess().getArg1Assignment_1(), "rule__Or__Arg1Assignment_1");
					put(grammarAccess.getXorAccess().getArg1Assignment_1(), "rule__Xor__Arg1Assignment_1");
					put(grammarAccess.getJamAccess().getArg1Assignment_1(), "rule__Jam__Arg1Assignment_1");
					put(grammarAccess.getSkipAccess().getFlagsAssignment_1(), "rule__Skip__FlagsAssignment_1");
					put(grammarAccess.getSkipAccess().getLabelAssignment_4(), "rule__Skip__LabelAssignment_4");
					put(grammarAccess.getSPINMEMAccess().getBufferAssignment_0(), "rule__SPINMEM__BufferAssignment_0");
					put(grammarAccess.getSPINMEMAccess().getValueAssignment_1_0_0(), "rule__SPINMEM__ValueAssignment_1_0_0");
					put(grammarAccess.getSPINMEMAccess().getScaleAssignment_1_0_1_1(), "rule__SPINMEM__ScaleAssignment_1_0_1_1");
					put(grammarAccess.getSPINMEMAccess().getOffsetAssignment_1_1(), "rule__SPINMEM__OffsetAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser typedParser = (com.holycityaudio.spincad.ui.contentassist.antlr.internal.InternalSpinCADParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SpinCADGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpinCADGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
