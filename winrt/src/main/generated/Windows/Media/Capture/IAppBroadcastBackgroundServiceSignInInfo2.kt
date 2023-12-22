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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastBackgroundServiceSignInInfo2.ABI::class)
@Signature("{9104285c-62cf-4a3c-a7ee-aeb507404645}")
@Guid("9104285c62cf4a3ca7eeaeb507404645")
@WinRTInterface("9104285c62cf4a3ca7eeaeb507404645")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastBackgroundServiceSignInInfo2.ByReference::class)
public interface IAppBroadcastBackgroundServiceSignInInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_UserNameChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceSignInInfo?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_UserNameChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastBackgroundServiceSignInInfo2> {
    public override fun getValue() =
        ABI.makeIAppBroadcastBackgroundServiceSignInInfo2(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastBackgroundServiceSignInInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastBackgroundServiceSignInInfo2 {
    public val __1291043347_Ptr: Pointer?

    public val _1291043347_VtblPtr: Pointer?
      get() = __1291043347_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_UserNameChanged(handler: TypedEventHandler<AppBroadcastBackgroundServiceSignInInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1291043347_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1291043347_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_UserNameChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1291043347_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1291043347_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastBackgroundServiceSignInInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1291043347_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastBackgroundServiceSignInInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9104285c62cf4a3ca7eeaeb507404645")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastBackgroundServiceSignInInfo2(ptr: Pointer?): WithDefault =
        IAppBroadcastBackgroundServiceSignInInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppBroadcastBackgroundServiceSignInInfo2 {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastBackgroundServiceSignInInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastBackgroundServiceSignInInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1291043347_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastBackgroundServiceSignInInfo2):
        Array<IAppBroadcastBackgroundServiceSignInInfo2?> = (elements as
        Array<IAppBroadcastBackgroundServiceSignInInfo2?>).castToImpl<IAppBroadcastBackgroundServiceSignInInfo2,IAppBroadcastBackgroundServiceSignInInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastBackgroundServiceSignInInfo2?> =
        arrayOfNulls<IAppBroadcastBackgroundServiceSignInInfo2_Impl>(size) as
        Array<IAppBroadcastBackgroundServiceSignInInfo2?>
  }
}
