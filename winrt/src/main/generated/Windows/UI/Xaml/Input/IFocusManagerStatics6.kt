package Windows.UI.Xaml.Input

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFocusManagerStatics6.ABI::class)
@Signature("{3546a1b6-20bf-5007-929d-e6d32e16afe4}")
@Guid("3546a1b620bf5007929de6d32e16afe4")
@WinRTInterface("3546a1b620bf5007929de6d32e16afe4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerStatics6.ByReference::class)
public interface IFocusManagerStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_GettingFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_LosingFocus(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerStatics6> {
    public override fun getValue() = ABI.makeIFocusManagerStatics6(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerStatics6 {
    public val __687728572_Ptr: Pointer?

    public val _687728572_VtblPtr: Pointer?
      get() = __687728572_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_GotFocus(handler: EventHandler<FocusManagerGotFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _687728572_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _687728572_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_LostFocus(handler: EventHandler<FocusManagerLostFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _687728572_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _687728572_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_GettingFocus(handler: EventHandler<GettingFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _687728572_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_GettingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _687728572_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_LosingFocus(handler: EventHandler<LosingFocusEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _687728572_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_LosingFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _687728572_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__687728572_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFocusManagerStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __687728572_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3546a1b620bf5007929de6d32e16afe4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerStatics6(ptr: Pointer?): WithDefault =
        IFocusManagerStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerStatics6 {
      val address = segment.toRawLongValue()
      return makeIFocusManagerStatics6(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__687728572_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerStatics6): Array<IFocusManagerStatics6?> =
        (elements as
        Array<IFocusManagerStatics6?>).castToImpl<IFocusManagerStatics6,IFocusManagerStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerStatics6?> =
        arrayOfNulls<IFocusManagerStatics6_Impl>(size) as Array<IFocusManagerStatics6?>
  }
}
