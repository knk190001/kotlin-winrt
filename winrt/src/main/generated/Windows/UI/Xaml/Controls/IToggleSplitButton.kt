package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToggleSplitButton.ABI::class)
@Signature("{28981b31-8e78-570c-bebb-685814485ae9}")
@Guid("28981b318e78570cbebb685814485ae9")
@WinRTInterface("28981b318e78570cbebb685814485ae9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButton.ByReference::class)
public interface IToggleSplitButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(1)
  public fun put_IsChecked(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun add_IsCheckedChanged(handler: TypedEventHandler<ToggleSplitButton?,
      ToggleSplitButtonIsCheckedChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_IsCheckedChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButton> {
    public override fun getValue() = ABI.makeIToggleSplitButton(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButton {
    public val __1330765220_Ptr: Pointer?

    public val _1330765220_VtblPtr: Pointer?
      get() = __1330765220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _1330765220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1330765220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _1330765220_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1330765220_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_IsCheckedChanged(handler: TypedEventHandler<ToggleSplitButton?,
        ToggleSplitButtonIsCheckedChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1330765220_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1330765220_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_IsCheckedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1330765220_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1330765220_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleSplitButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1330765220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("28981b318e78570cbebb685814485ae9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButton(ptr: Pointer?): WithDefault = IToggleSplitButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleSplitButton {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButton(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1330765220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButton): Array<IToggleSplitButton?> =
        (elements as
        Array<IToggleSplitButton?>).castToImpl<IToggleSplitButton,IToggleSplitButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButton?> =
        arrayOfNulls<IToggleSplitButton_Impl>(size) as Array<IToggleSplitButton?>
  }
}
