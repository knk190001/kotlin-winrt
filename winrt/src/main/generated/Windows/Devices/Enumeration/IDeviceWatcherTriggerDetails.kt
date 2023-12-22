package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IDeviceWatcherTriggerDetails.ABI::class)
@Signature("{38808119-4cb7-4e57-a56d-776d07cbfef9}")
@Guid("388081194cb74e57a56d776d07cbfef9")
@WinRTInterface("388081194cb74e57a56d776d07cbfef9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceWatcherTriggerDetails.ByReference::class)
public interface IDeviceWatcherTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceWatcherEvents(): IVectorView<DeviceWatcherEvent?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceWatcherTriggerDetails> {
    public override fun getValue() = ABI.makeIDeviceWatcherTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IDeviceWatcherTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceWatcherTriggerDetails {
    public val __1401492338_Ptr: Pointer?

    public val _1401492338_VtblPtr: Pointer?
      get() = __1401492338_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceWatcherEvents(): IVectorView<DeviceWatcherEvent?>? {
      val fnPtr = _1401492338_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DeviceWatcherEvent?>>()
      val hr = fn.invokeHR(arrayOf(__1401492338_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DeviceWatcherEvent?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceWatcherTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1401492338_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceWatcherTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("388081194cb74e57a56d776d07cbfef9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceWatcherTriggerDetails(ptr: Pointer?): WithDefault =
        IDeviceWatcherTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceWatcherTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIDeviceWatcherTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IDeviceWatcherTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1401492338_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceWatcherTriggerDetails):
        Array<IDeviceWatcherTriggerDetails?> = (elements as
        Array<IDeviceWatcherTriggerDetails?>).castToImpl<IDeviceWatcherTriggerDetails,IDeviceWatcherTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceWatcherTriggerDetails?> =
        arrayOfNulls<IDeviceWatcherTriggerDetails_Impl>(size) as
        Array<IDeviceWatcherTriggerDetails?>
  }
}
