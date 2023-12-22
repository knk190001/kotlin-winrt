package Windows.UI.Input

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Core.KeyEventArgs
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

@ABIMarker(IKeyboardDeliveryInterceptor.ABI::class)
@Signature("{b4baf068-8f49-446c-8db5-8c0ffe85cc9e}")
@Guid("b4baf0688f49446c8db58c0ffe85cc9e")
@WinRTInterface("b4baf0688f49446c8db58c0ffe85cc9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardDeliveryInterceptor.ByReference::class)
public interface IKeyboardDeliveryInterceptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsInterceptionEnabledWhenInForeground(): Boolean

  @InterfaceMethod(1)
  public fun put_IsInterceptionEnabledWhenInForeground(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun add_KeyDown(handler: TypedEventHandler<KeyboardDeliveryInterceptor?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_KeyDown(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_KeyUp(handler: TypedEventHandler<KeyboardDeliveryInterceptor?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_KeyUp(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardDeliveryInterceptor> {
    public override fun getValue() = ABI.makeIKeyboardDeliveryInterceptor(pointer.getPointer(0))

    public fun setValue(value: IKeyboardDeliveryInterceptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardDeliveryInterceptor {
    public val __1513613156_Ptr: Pointer?

    public val _1513613156_VtblPtr: Pointer?
      get() = __1513613156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsInterceptionEnabledWhenInForeground(): Boolean {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsInterceptionEnabledWhenInForeground(value: Boolean): Unit {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_KeyDown(handler: TypedEventHandler<KeyboardDeliveryInterceptor?,
        KeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_KeyDown(token: EventRegistrationToken?): Unit {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_KeyUp(handler: TypedEventHandler<KeyboardDeliveryInterceptor?,
        KeyEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_KeyUp(token: EventRegistrationToken?): Unit {
      val fnPtr = _1513613156_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1513613156_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeyboardDeliveryInterceptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1513613156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardDeliveryInterceptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4baf0688f49446c8db58c0ffe85cc9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardDeliveryInterceptor(ptr: Pointer?): WithDefault =
        IKeyboardDeliveryInterceptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardDeliveryInterceptor {
      val address = segment.toRawLongValue()
      return makeIKeyboardDeliveryInterceptor(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardDeliveryInterceptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1513613156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardDeliveryInterceptor):
        Array<IKeyboardDeliveryInterceptor?> = (elements as
        Array<IKeyboardDeliveryInterceptor?>).castToImpl<IKeyboardDeliveryInterceptor,IKeyboardDeliveryInterceptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardDeliveryInterceptor?> =
        arrayOfNulls<IKeyboardDeliveryInterceptor_Impl>(size) as
        Array<IKeyboardDeliveryInterceptor?>
  }
}
