package Windows.Media.Capture

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

@ABIMarker(IAppBroadcastBackgroundService2.ABI::class)
@Signature("{fc8ccbbf-5549-4b87-959f-23ca401fd473}")
@Guid("fc8ccbbf55494b87959f23ca401fd473")
@WinRTInterface("fc8ccbbf55494b87959f23ca401fd473")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundService2.ByReference::class)
public interface IAppBroadcastBackgroundService2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_BroadcastTitle(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_BroadcastLanguage(): String?

  @InterfaceMethod(2)
  public fun put_BroadcastLanguage(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_BroadcastChannel(): String?

  @InterfaceMethod(4)
  public fun put_BroadcastChannel(value: String?): Unit

  @InterfaceMethod(5)
  public fun add_BroadcastTitleChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_BroadcastTitleChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_BroadcastLanguageChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_BroadcastLanguageChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_BroadcastChannelChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_BroadcastChannelChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundService2> {
    public override fun getValue() = ABI.makeIAppBroadcastBackgroundService2(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundService2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundService2 {
    public val __1212763395_Ptr: Pointer?

    public val _1212763395_VtblPtr: Pointer?
      get() = __1212763395_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_BroadcastTitle(value: String?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_BroadcastLanguage(): String? {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_BroadcastLanguage(value: String?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BroadcastChannel(): String? {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_BroadcastChannel(value: String?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override
        fun add_BroadcastTitleChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_BroadcastTitleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override
        fun add_BroadcastLanguageChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_BroadcastLanguageChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun add_BroadcastChannelChanged(handler: TypedEventHandler<AppBroadcastBackgroundService?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_BroadcastChannelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1212763395_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1212763395_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastBackgroundService2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1212763395_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundService2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc8ccbbf55494b87959f23ca401fd473")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundService2(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundService2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastBackgroundService2 {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundService2(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundService2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1212763395_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundService2):
        Array<IAppBroadcastBackgroundService2?> = (elements as
        Array<IAppBroadcastBackgroundService2?>).castToImpl<IAppBroadcastBackgroundService2,IAppBroadcastBackgroundService2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundService2?> =
        arrayOfNulls<IAppBroadcastBackgroundService2_Impl>(size) as
        Array<IAppBroadcastBackgroundService2?>
  }
}
