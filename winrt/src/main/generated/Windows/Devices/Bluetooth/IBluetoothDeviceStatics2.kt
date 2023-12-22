package Windows.Devices.Bluetooth

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBluetoothDeviceStatics2.ABI::class)
@Signature("{c29e8e2f-4e14-4477-aa1b-b8b47e5b7ece}")
@Guid("c29e8e2f4e144477aa1bb8b47e5b7ece")
@WinRTInterface("c29e8e2f4e144477aa1bb8b47e5b7ece")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDeviceStatics2.ByReference::class)
public interface IBluetoothDeviceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelectorFromPairingState(pairingState: Boolean): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus?):
      String?

  @InterfaceMethod(2)
  public fun GetDeviceSelectorFromDeviceName(deviceName: String?): String?

  @InterfaceMethod(3)
  public fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG): String?

  @InterfaceMethod(4)
  public fun GetDeviceSelectorFromClassOfDevice(classOfDevice: BluetoothClassOfDevice?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDeviceStatics2> {
    public override fun getValue() = ABI.makeIBluetoothDeviceStatics2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDeviceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDeviceStatics2 {
    public val __1589024998_Ptr: Pointer?

    public val _1589024998_VtblPtr: Pointer?
      get() = __1589024998_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelectorFromPairingState(pairingState: Boolean): String? {
      val fnPtr = _1589024998_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1589024998_Ptr, pairingState, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDeviceSelectorFromConnectionStatus(connectionStatus: BluetoothConnectionStatus?):
        String? {
      val fnPtr = _1589024998_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1589024998_Ptr, marshalToNative(connectionStatus), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelectorFromDeviceName(deviceName: String?): String? {
      val fnPtr = _1589024998_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1589024998_Ptr, marshalToNative(deviceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG):
        String? {
      val fnPtr = _1589024998_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1589024998_Ptr, bluetoothAddress, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDeviceSelectorFromClassOfDevice(classOfDevice: BluetoothClassOfDevice?):
        String? {
      val fnPtr = _1589024998_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1589024998_Ptr, marshalToNative(classOfDevice), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothDeviceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1589024998_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDeviceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c29e8e2f4e144477aa1bb8b47e5b7ece")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDeviceStatics2(ptr: Pointer?): WithDefault =
        IBluetoothDeviceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDeviceStatics2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothDeviceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDeviceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1589024998_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDeviceStatics2):
        Array<IBluetoothDeviceStatics2?> = (elements as
        Array<IBluetoothDeviceStatics2?>).castToImpl<IBluetoothDeviceStatics2,IBluetoothDeviceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDeviceStatics2?> =
        arrayOfNulls<IBluetoothDeviceStatics2_Impl>(size) as Array<IBluetoothDeviceStatics2?>
  }
}
