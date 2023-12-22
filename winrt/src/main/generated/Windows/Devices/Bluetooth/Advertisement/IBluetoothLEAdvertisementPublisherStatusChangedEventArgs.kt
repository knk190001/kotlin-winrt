package Windows.Devices.Bluetooth.Advertisement

import Windows.Devices.Bluetooth.BluetoothError
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

@ABIMarker(IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.ABI::class)
@Signature("{09c2bd9f-2dff-4b23-86ee-0d14fb94aeae}")
@Guid("09c2bd9f2dff4b2386ee0d14fb94aeae")
@WinRTInterface("09c2bd9f2dff4b2386ee0d14fb94aeae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IBluetoothLEAdvertisementPublisherStatusChangedEventArgs.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherStatusChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): BluetoothLEAdvertisementPublisherStatus?

  @InterfaceMethod(1)
  public fun get_Error(): BluetoothError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherStatusChangedEventArgs {
    public val __1939814963_Ptr: Pointer?

    public val _1939814963_VtblPtr: Pointer?
      get() = __1939814963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): BluetoothLEAdvertisementPublisherStatus? {
      val fnPtr = _1939814963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisementPublisherStatus>()
      val hr = fn.invokeHR(arrayOf(__1939814963_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BluetoothLEAdvertisementPublisherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1939814963_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1939814963_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementPublisherStatusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939814963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09c2bd9f2dff4b2386ee0d14fb94aeae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs(ptr: Pointer?):
        WithDefault = IBluetoothLEAdvertisementPublisherStatusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1939814963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisherStatusChangedEventArgs):
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs?>).castToImpl<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs,IBluetoothLEAdvertisementPublisherStatusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherStatusChangedEventArgs?>
  }
}
