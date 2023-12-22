package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.RoutedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPasswordBox.ABI::class)
@Signature("{02b9aa11-0b47-4e7d-ad91-3a4168ed230d}")
@Guid("02b9aa110b474e7dad913a4168ed230d")
@WinRTInterface("02b9aa110b474e7dad913a4168ed230d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPasswordBox.ByReference::class)
public interface IPasswordBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Password(): String?

  @InterfaceMethod(1)
  public fun put_Password(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_PasswordChar(): String?

  @InterfaceMethod(3)
  public fun put_PasswordChar(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_IsPasswordRevealButtonEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsPasswordRevealButtonEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_MaxLength(): Int

  @InterfaceMethod(7)
  public fun put_MaxLength(value: Int): Unit

  @InterfaceMethod(8)
  public fun add_PasswordChanged(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PasswordChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun SelectAll(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPasswordBox> {
    public override fun getValue() = ABI.makeIPasswordBox(pointer.getPointer(0))

    public fun setValue(value: IPasswordBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPasswordBox {
    public val __1447672724_Ptr: Pointer?

    public val _1447672724_VtblPtr: Pointer?
      get() = __1447672724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Password(): String? {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Password(value: String?): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PasswordChar(): String? {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PasswordChar(value: String?): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsPasswordRevealButtonEnabled(): Boolean {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsPasswordRevealButtonEnabled(value: Boolean): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MaxLength(): Int {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MaxLength(value: Int): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PasswordChanged(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PasswordChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ContextMenuOpening(handler: ContextMenuOpeningEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ContextMenuOpening(token: EventRegistrationToken?): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun SelectAll(): Unit {
      val fnPtr = _1447672724_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1447672724_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPasswordBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1447672724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPasswordBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02b9aa110b474e7dad913a4168ed230d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPasswordBox(ptr: Pointer?): WithDefault = IPasswordBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPasswordBox {
      val address = segment.toRawLongValue()
      return makeIPasswordBox(Pointer(address))
    }

    public override fun toNative(obj: IPasswordBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1447672724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPasswordBox): Array<IPasswordBox?> = (elements as
        Array<IPasswordBox?>).castToImpl<IPasswordBox,IPasswordBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPasswordBox?> =
        arrayOfNulls<IPasswordBox_Impl>(size) as Array<IPasswordBox?>
  }
}
