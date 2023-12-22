package Windows.Media.AppBroadcasting

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppBroadcastingMonitor.ABI::class)
@Signature("{00f95a68-8907-48a0-b8ef-24d208137542}")
@Guid("00f95a68890748a0b8ef24d208137542")
@WinRTInterface("00f95a68890748a0b8ef24d208137542")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastingMonitor.ByReference::class)
public interface IAppBroadcastingMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCurrentAppBroadcasting(): Boolean

  @InterfaceMethod(1)
  public fun add_IsCurrentAppBroadcastingChanged(handler: TypedEventHandler<AppBroadcastingMonitor?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_IsCurrentAppBroadcastingChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastingMonitor> {
    public override fun getValue() = ABI.makeIAppBroadcastingMonitor(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastingMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastingMonitor {
    public val __91987732_Ptr: Pointer?

    public val _91987732_VtblPtr: Pointer?
      get() = __91987732_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCurrentAppBroadcasting(): Boolean {
      val fnPtr = _91987732_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__91987732_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override
        fun add_IsCurrentAppBroadcastingChanged(handler: TypedEventHandler<AppBroadcastingMonitor?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _91987732_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__91987732_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_IsCurrentAppBroadcastingChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _91987732_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__91987732_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastingMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __91987732_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastingMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00f95a68890748a0b8ef24d208137542")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastingMonitor(ptr: Pointer?): WithDefault =
        IAppBroadcastingMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastingMonitor {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastingMonitor(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastingMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__91987732_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastingMonitor): Array<IAppBroadcastingMonitor?>
        = (elements as
        Array<IAppBroadcastingMonitor?>).castToImpl<IAppBroadcastingMonitor,IAppBroadcastingMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastingMonitor?> =
        arrayOfNulls<IAppBroadcastingMonitor_Impl>(size) as Array<IAppBroadcastingMonitor?>
  }
}
