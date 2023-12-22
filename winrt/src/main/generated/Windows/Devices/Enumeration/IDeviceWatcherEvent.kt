package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceWatcherEvent.ABI::class)
@Signature("{74aa9c0b-1dbd-47fd-b635-3cc556d0ff8b}")
@Guid("74aa9c0b1dbd47fdb6353cc556d0ff8b")
@WinRTInterface("74aa9c0b1dbd47fdb6353cc556d0ff8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceWatcherEvent.ByReference::class)
public interface IDeviceWatcherEvent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): DeviceWatcherEventKind?

  @InterfaceMethod(1)
  public fun get_DeviceInformation(): DeviceInformation?

  @InterfaceMethod(2)
  public fun get_DeviceInformationUpdate(): DeviceInformationUpdate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceWatcherEvent> {
    public override fun getValue() = ABI.makeIDeviceWatcherEvent(pointer.getPointer(0))

    public fun setValue(value: IDeviceWatcherEvent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceWatcherEvent {
    public val __1365429138_Ptr: Pointer?

    public val _1365429138_VtblPtr: Pointer?
      get() = __1365429138_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): DeviceWatcherEventKind? {
      val fnPtr = _1365429138_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcherEventKind>()
      val hr = fn.invokeHR(arrayOf(__1365429138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcherEventKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceInformation(): DeviceInformation? {
      val fnPtr = _1365429138_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1365429138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceInformationUpdate(): DeviceInformationUpdate? {
      val fnPtr = _1365429138_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformationUpdate>()
      val hr = fn.invokeHR(arrayOf(__1365429138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformationUpdate>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceWatcherEvent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1365429138_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceWatcherEvent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74aa9c0b1dbd47fdb6353cc556d0ff8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceWatcherEvent(ptr: Pointer?): WithDefault = IDeviceWatcherEvent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceWatcherEvent {
      val address = segment.toRawLongValue()
      return makeIDeviceWatcherEvent(Pointer(address))
    }

    public override fun toNative(obj: IDeviceWatcherEvent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1365429138_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceWatcherEvent): Array<IDeviceWatcherEvent?> =
        (elements as
        Array<IDeviceWatcherEvent?>).castToImpl<IDeviceWatcherEvent,IDeviceWatcherEvent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceWatcherEvent?> =
        arrayOfNulls<IDeviceWatcherEvent_Impl>(size) as Array<IDeviceWatcherEvent?>
  }
}
