package Windows.Devices.Enumeration

import Windows.ApplicationModel.Background.DeviceWatcherTrigger
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IDeviceWatcher2.ABI::class)
@Signature("{ff08456e-ed14-49e9-9a69-8117c54ae971}")
@Guid("ff08456eed1449e99a698117c54ae971")
@WinRTInterface("ff08456eed1449e99a698117c54ae971")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceWatcher2.ByReference::class)
public interface IDeviceWatcher2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetBackgroundTrigger(requestedEventKinds: IIterable<DeviceWatcherEventKind?>?):
      DeviceWatcherTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceWatcher2> {
    public override fun getValue() = ABI.makeIDeviceWatcher2(pointer.getPointer(0))

    public fun setValue(value: IDeviceWatcher2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceWatcher2 {
    public val __534746442_Ptr: Pointer?

    public val _534746442_VtblPtr: Pointer?
      get() = __534746442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetBackgroundTrigger(requestedEventKinds: IIterable<DeviceWatcherEventKind?>?):
        DeviceWatcherTrigger? {
      val fnPtr = _534746442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcherTrigger>()
      val hr = fn.invokeHR(arrayOf(__534746442_Ptr, marshalToNative(requestedEventKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcherTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceWatcher2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __534746442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceWatcher2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff08456eed1449e99a698117c54ae971")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceWatcher2(ptr: Pointer?): WithDefault = IDeviceWatcher2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceWatcher2 {
      val address = segment.toRawLongValue()
      return makeIDeviceWatcher2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceWatcher2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__534746442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceWatcher2): Array<IDeviceWatcher2?> = (elements as
        Array<IDeviceWatcher2?>).castToImpl<IDeviceWatcher2,IDeviceWatcher2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceWatcher2?> =
        arrayOfNulls<IDeviceWatcher2_Impl>(size) as Array<IDeviceWatcher2?>
  }
}
