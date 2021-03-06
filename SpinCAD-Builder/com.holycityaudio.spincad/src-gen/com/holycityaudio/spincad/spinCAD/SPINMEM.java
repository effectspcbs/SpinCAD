/**
 */
package com.holycityaudio.spincad.spinCAD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPINMEM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getValue <em>Value</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getScale <em>Scale</em>}</li>
 *   <li>{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSPINMEM()
 * @model
 * @generated
 */
public interface SPINMEM extends EObject
{
  /**
   * Returns the value of the '<em><b>Buffer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buffer</em>' attribute.
   * @see #setBuffer(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSPINMEM_Buffer()
   * @model
   * @generated
   */
  String getBuffer();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getBuffer <em>Buffer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Buffer</em>' attribute.
   * @see #getBuffer()
   * @generated
   */
  void setBuffer(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSPINMEM_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #setScale(String)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSPINMEM_Scale()
   * @model
   * @generated
   */
  String getScale();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #getScale()
   * @generated
   */
  void setScale(String value);

  /**
   * Returns the value of the '<em><b>Offset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' reference.
   * @see #setOffset(Offset)
   * @see com.holycityaudio.spincad.spinCAD.SpinCADPackage#getSPINMEM_Offset()
   * @model
   * @generated
   */
  Offset getOffset();

  /**
   * Sets the value of the '{@link com.holycityaudio.spincad.spinCAD.SPINMEM#getOffset <em>Offset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset</em>' reference.
   * @see #getOffset()
   * @generated
   */
  void setOffset(Offset value);

} // SPINMEM
