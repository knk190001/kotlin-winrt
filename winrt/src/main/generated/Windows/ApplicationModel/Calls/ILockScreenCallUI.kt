package Windows.ApplicationModel.Calls

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILockScreenCallUI.ABI::class)
@Signature("{c596fd8d-73c9-4a14-b021-ec1c50a3b727}")
@Guid("c596fd8d73c94a14b021ec1c50a3b727")
@WinRTInterface("c596fd8d73c94a14b021ec1c50a3b727")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILockScreenCallUI.ByReference::class)
public interface ILockScreenCallUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Dismiss(): Unit

  @InterfaceMethod(1)
  public fun add_EndRequested(handler: TypedEventHandler<LockScreenCallUI?,
      LockScreenCallEndRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_EndRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Closed(handler: TypedEventHandler<LockScreenCallUI?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun get_CallTitle(): String?

  @InterfaceMethod(6)
  public fun put_CallTitle(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILockScreenCallUI> {
    public override fun getValue() = ABI.makeILockScreenCallUI(pointer.getPointer(0))

    public fun setValue(value: ILockScreenCallUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILockScreenCallUI {
    public val __1772404807_Ptr: Pointer?

    public val _1772404807_VtblPtr: Pointer?
      get() = __1772404807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Dismiss(): Unit {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun add_EndRequested(handler: TypedEventHandler<LockScreenCallUI?,
        LockScreenCallEndRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_EndRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Closed(handler: TypedEventHandler<LockScreenCallUI?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CallTitle(): String? {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_CallTitle(value: String?): Unit {
      val fnPtr = _1772404807_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1772404807_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILockScreenCallUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1772404807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILockScreenCallUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c596fd8d73c94a14b021ec1c50a3b727")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILockScreenCallUI(ptr: Pointer?): WithDefault = ILockScreenCallUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILockScreenCallUI {
      val address = segment.toRawLongValue()
      return makeILockScreenCallUI(Pointer(address))
    }

    public override fun toNative(obj: ILockScreenCallUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1772404807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILockScreenCallUI): Array<ILockScreenCallUI?> = (elements
        as Array<ILockScreenCallUI?>).castToImpl<ILockScreenCallUI,ILockScreenCallUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILockScreenCallUI?> =
        arrayOfNulls<ILockScreenCallUI_Impl>(size) as Array<ILockScreenCallUI?>
  }
}
