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

@ABIMarker(IBluetoothLEAdvertisementWatcherStoppedEventArgs.ABI::class)
@Signature("{dd40f84d-e7b9-43e3-9c04-0685d085fd8c}")
@Guid("dd40f84de7b943e39c040685d085fd8c")
@WinRTInterface("dd40f84de7b943e39c040685d085fd8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementWatcherStoppedEventArgs.ByReference::class)
public interface IBluetoothLEAdvertisementWatcherStoppedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementWatcherStoppedEventArgs> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementWatcherStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementWatcherStoppedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementWatcherStoppedEventArgs {
    public val __1041475048_Ptr: Pointer?

    public val _1041475048_VtblPtr: Pointer?
      get() = __1041475048_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _1041475048_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__1041475048_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementWatcherStoppedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1041475048_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementWatcherStoppedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd40f84de7b943e39c040685d085fd8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementWatcherStoppedEventArgs(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementWatcherStoppedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementWatcherStoppedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementWatcherStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementWatcherStoppedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1041475048_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementWatcherStoppedEventArgs):
        Array<IBluetoothLEAdvertisementWatcherStoppedEventArgs?> = (elements as
        Array<IBluetoothLEAdvertisementWatcherStoppedEventArgs?>).castToImpl<IBluetoothLEAdvertisementWatcherStoppedEventArgs,IBluetoothLEAdvertisementWatcherStoppedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementWatcherStoppedEventArgs?>
        = arrayOfNulls<IBluetoothLEAdvertisementWatcherStoppedEventArgs_Impl>(size) as
        Array<IBluetoothLEAdvertisementWatcherStoppedEventArgs?>
  }
}
