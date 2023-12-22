package Windows.Devices.Bluetooth

import Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceServicesResult
import Windows.Devices.Enumeration.DeviceAccessInformation
import Windows.Devices.Enumeration.DeviceAccessStatus
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

@ABIMarker(IBluetoothLEDevice3.ABI::class)
@Signature("{aee9e493-44ac-40dc-af33-b2c13c01ca46}")
@Guid("aee9e49344ac40dcaf33b2c13c01ca46")
@WinRTInterface("aee9e49344ac40dcaf33b2c13c01ca46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEDevice3.ByReference::class)
public interface IBluetoothLEDevice3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceAccessInformation(): DeviceAccessInformation?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>?

  @InterfaceMethod(2)
  public fun GetGattServicesAsync(): IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(3)
  public fun GetGattServicesAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(4)
  public fun GetGattServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(5)
  public fun GetGattServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
      cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDeviceServicesResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEDevice3> {
    public override fun getValue() = ABI.makeIBluetoothLEDevice3(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEDevice3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEDevice3 {
    public val __157700851_Ptr: Pointer?

    public val _157700851_VtblPtr: Pointer?
      get() = __157700851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceAccessInformation(): DeviceAccessInformation? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetGattServicesAsync(): IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetGattServicesAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun GetGattServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr, marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun GetGattServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
        cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _157700851_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__157700851_Ptr, marshalToNative(serviceUuid),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEDevice3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157700851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEDevice3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aee9e49344ac40dcaf33b2c13c01ca46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEDevice3(ptr: Pointer?): WithDefault = IBluetoothLEDevice3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEDevice3 {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEDevice3(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEDevice3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157700851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEDevice3): Array<IBluetoothLEDevice3?> =
        (elements as
        Array<IBluetoothLEDevice3?>).castToImpl<IBluetoothLEDevice3,IBluetoothLEDevice3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEDevice3?> =
        arrayOfNulls<IBluetoothLEDevice3_Impl>(size) as Array<IBluetoothLEDevice3?>
  }
}
