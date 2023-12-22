package Windows.Devices.Bluetooth.Advertisement

import Windows.Foundation.IReference
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
import kotlin.Short
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.ABI::class)
@Signature("{8f62790e-dc88-5c8b-b34e-10b321850f88}")
@Guid("8f62790edc885c8bb34e10b321850f88")
@WinRTInterface("8f62790edc885c8bb34e10b321850f88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2 : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedTransmitPowerLevelInDBm(): IReference<Short>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2 {
    public val __4721759_Ptr: Pointer?

    public val _4721759_VtblPtr: Pointer?
      get() = __4721759_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedTransmitPowerLevelInDBm(): IReference<Short>? {
      val fnPtr = _4721759_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Short>>()
      val hr = fn.invokeHR(arrayOf(__4721759_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Short>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __4721759_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f62790edc885c8bb34e10b321850f88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs2(ptr: Pointer?):
        WithDefault = IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__4721759_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2):
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2?>).castToImpl<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2,IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs2?>
  }
}
