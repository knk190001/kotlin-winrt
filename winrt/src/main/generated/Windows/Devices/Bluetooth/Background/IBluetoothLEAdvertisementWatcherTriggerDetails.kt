package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs
import Windows.Devices.Bluetooth.BluetoothError
import Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
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

@ABIMarker(IBluetoothLEAdvertisementWatcherTriggerDetails.ABI::class)
@Signature("{a7db5ad7-2257-4e69-9784-fee645c1dce0}")
@Guid("a7db5ad722574e699784fee645c1dce0")
@WinRTInterface("a7db5ad722574e699784fee645c1dce0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcherTriggerDetails.ByReference::class)
public interface IBluetoothLEAdvertisementWatcherTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  @InterfaceMethod(1)
  public fun get_Advertisements(): IVectorView<BluetoothLEAdvertisementReceivedEventArgs?>?

  @InterfaceMethod(2)
  public fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcherTriggerDetails> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementWatcherTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcherTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcherTriggerDetails {
    public val __1875634711_Ptr: Pointer?

    public val _1875634711_VtblPtr: Pointer?
      get() = __1875634711_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1875634711_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1875634711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Advertisements():
        IVectorView<BluetoothLEAdvertisementReceivedEventArgs?>? {
      val fnPtr = _1875634711_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BluetoothLEAdvertisementReceivedEventArgs?>>()
      val hr = fn.invokeHR(arrayOf(__1875634711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<BluetoothLEAdvertisementReceivedEventArgs?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SignalStrengthFilter(): BluetoothSignalStrengthFilter? {
      val fnPtr = _1875634711_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothSignalStrengthFilter>()
      val hr = fn.invokeHR(arrayOf(__1875634711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothSignalStrengthFilter>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementWatcherTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1875634711_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcherTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7db5ad722574e699784fee645c1dce0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcherTriggerDetails(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcherTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementWatcherTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcherTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcherTriggerDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1875634711_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcherTriggerDetails):
        Array<IBluetoothLEAdvertisementWatcherTriggerDetails?> = (elements as
        Array<IBluetoothLEAdvertisementWatcherTriggerDetails?>).castToImpl<IBluetoothLEAdvertisementWatcherTriggerDetails,IBluetoothLEAdvertisementWatcherTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcherTriggerDetails?> =
        arrayOfNulls<IBluetoothLEAdvertisementWatcherTriggerDetails_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcherTriggerDetails?>
  }
}
