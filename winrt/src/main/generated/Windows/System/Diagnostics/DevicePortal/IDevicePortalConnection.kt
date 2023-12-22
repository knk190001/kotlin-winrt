package Windows.System.Diagnostics.DevicePortal

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDevicePortalConnection.ABI::class)
@Signature("{0f447f51-1198-4da1-8d54-bdef393e09b6}")
@Guid("0f447f5111984da18d54bdef393e09b6")
@WinRTInterface("0f447f5111984da18d54bdef393e09b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePortalConnection.ByReference::class)
public interface IDevicePortalConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<DevicePortalConnection?,
      DevicePortalConnectionClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_RequestReceived(handler: TypedEventHandler<DevicePortalConnection?,
      DevicePortalConnectionRequestReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RequestReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePortalConnection> {
    public override fun getValue() = ABI.makeIDevicePortalConnection(pointer.getPointer(0))

    public fun setValue(value: IDevicePortalConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePortalConnection {
    public val __1726247759_Ptr: Pointer?

    public val _1726247759_VtblPtr: Pointer?
      get() = __1726247759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<DevicePortalConnection?,
        DevicePortalConnectionClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1726247759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1726247759_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1726247759_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1726247759_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RequestReceived(handler: TypedEventHandler<DevicePortalConnection?,
        DevicePortalConnectionRequestReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1726247759_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1726247759_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RequestReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1726247759_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1726247759_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDevicePortalConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1726247759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePortalConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f447f5111984da18d54bdef393e09b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePortalConnection(ptr: Pointer?): WithDefault =
        IDevicePortalConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePortalConnection {
      val address = segment.toRawLongValue()
      return makeIDevicePortalConnection(Pointer(address))
    }

    public override fun toNative(obj: IDevicePortalConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1726247759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePortalConnection): Array<IDevicePortalConnection?>
        = (elements as
        Array<IDevicePortalConnection?>).castToImpl<IDevicePortalConnection,IDevicePortalConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePortalConnection?> =
        arrayOfNulls<IDevicePortalConnection_Impl>(size) as Array<IDevicePortalConnection?>
  }
}
