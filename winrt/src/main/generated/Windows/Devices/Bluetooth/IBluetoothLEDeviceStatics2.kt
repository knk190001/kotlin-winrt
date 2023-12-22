package Windows.Devices.Bluetooth

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IBluetoothLEDeviceStatics2.ABI::class)
@Signature("{5f12c06b-3bac-43e8-ad16-563271bd41c2}")
@Guid("5f12c06b3bac43e8ad16563271bd41c2")
@WinRTInterface("5f12c06b3bac43e8ad16563271bd41c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEDeviceStatics2.ByReference::class)
public interface IBluetoothLEDeviceStatics2 : NativeMapped, IWinRTInterface {
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
  public fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG,
      bluetoothAddressType: BluetoothAddressType?): String?

  @InterfaceMethod(5)
  public fun GetDeviceSelectorFromAppearance(appearance: BluetoothLEAppearance?): String?

  @InterfaceMethod(6)
  public fun FromBluetoothAddressAsync(bluetoothAddress: WinDef.ULONG,
      bluetoothAddressType: BluetoothAddressType?): IAsyncOperation<BluetoothLEDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEDeviceStatics2> {
    public override fun getValue() = ABI.makeIBluetoothLEDeviceStatics2(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEDeviceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEDeviceStatics2 {
    public val __765159187_Ptr: Pointer?

    public val _765159187_VtblPtr: Pointer?
      get() = __765159187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelectorFromPairingState(pairingState: Boolean): String? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, pairingState, result))
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
      val fnPtr = _765159187_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, marshalToNative(connectionStatus), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelectorFromDeviceName(deviceName: String?): String? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, marshalToNative(deviceName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG):
        String? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, bluetoothAddress, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDeviceSelectorFromBluetoothAddress(bluetoothAddress: WinDef.ULONG,
        bluetoothAddressType: BluetoothAddressType?): String? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, bluetoothAddress,
          marshalToNative(bluetoothAddressType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetDeviceSelectorFromAppearance(appearance: BluetoothLEAppearance?):
        String? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, marshalToNative(appearance), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FromBluetoothAddressAsync(bluetoothAddress: WinDef.ULONG,
        bluetoothAddressType: BluetoothAddressType?): IAsyncOperation<BluetoothLEDevice?>? {
      val fnPtr = _765159187_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BluetoothLEDevice?>>()
      val hr = fn.invokeHR(arrayOf(__765159187_Ptr, bluetoothAddress,
          marshalToNative(bluetoothAddressType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BluetoothLEDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEDeviceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __765159187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEDeviceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f12c06b3bac43e8ad16563271bd41c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEDeviceStatics2(ptr: Pointer?): WithDefault =
        IBluetoothLEDeviceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEDeviceStatics2 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEDeviceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEDeviceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__765159187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEDeviceStatics2):
        Array<IBluetoothLEDeviceStatics2?> = (elements as
        Array<IBluetoothLEDeviceStatics2?>).castToImpl<IBluetoothLEDeviceStatics2,IBluetoothLEDeviceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEDeviceStatics2?> =
        arrayOfNulls<IBluetoothLEDeviceStatics2_Impl>(size) as Array<IBluetoothLEDeviceStatics2?>
  }
}
