package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Style
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBox6.ABI::class)
@Signature("{61aad6a5-81fb-5f87-bae3-369fbe2ea1f3}")
@Guid("61aad6a581fb5f87bae3369fbe2ea1f3")
@WinRTInterface("61aad6a581fb5f87bae3369fbe2ea1f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBox6.ByReference::class)
public interface IComboBox6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_IsEditable(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Text(): String?

  @InterfaceMethod(2)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_TextBoxStyle(): Style?

  @InterfaceMethod(4)
  public fun put_TextBoxStyle(value: Style?): Unit

  @InterfaceMethod(5)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(6)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(7)
  public fun add_TextSubmitted(handler: TypedEventHandler<ComboBox?,
      ComboBoxTextSubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_TextSubmitted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBox6> {
    public override fun getValue() = ABI.makeIComboBox6(pointer.getPointer(0))

    public fun setValue(value: IComboBox6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBox6 {
    public val __227077597_Ptr: Pointer?

    public val _227077597_VtblPtr: Pointer?
      get() = __227077597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_IsEditable(value: Boolean): Unit {
      val fnPtr = _227077597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _227077597_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _227077597_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TextBoxStyle(): Style? {
      val fnPtr = _227077597_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_TextBoxStyle(value: Style?): Unit {
      val fnPtr = _227077597_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _227077597_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _227077597_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_TextSubmitted(handler: TypedEventHandler<ComboBox?,
        ComboBoxTextSubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _227077597_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_TextSubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _227077597_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077597_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBox6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __227077597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBox6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61aad6a581fb5f87bae3369fbe2ea1f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBox6(ptr: Pointer?): WithDefault = IComboBox6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBox6 {
      val address = segment.toRawLongValue()
      return makeIComboBox6(Pointer(address))
    }

    public override fun toNative(obj: IComboBox6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__227077597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBox6): Array<IComboBox6?> = (elements as
        Array<IComboBox6?>).castToImpl<IComboBox6,IComboBox6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBox6?> = arrayOfNulls<IComboBox6_Impl>(size)
        as Array<IComboBox6?>
  }
}
