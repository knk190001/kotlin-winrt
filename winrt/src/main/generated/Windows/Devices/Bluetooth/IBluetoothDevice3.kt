package Windows.Devices.Bluetooth

import Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceServicesResult
import Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
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

@ABIMarker(IBluetoothDevice3.ABI::class)
@Signature("{57fff78b-651a-4454-b90f-eb21ef0b0d71}")
@Guid("57fff78b651a4454b90feb21ef0b0d71")
@WinRTInterface("57fff78b651a4454b90feb21ef0b0d71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothDevice3.ByReference::class)
public interface IBluetoothDevice3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceAccessInformation(): DeviceAccessInformation?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>?

  @InterfaceMethod(2)
  public fun GetRfcommServicesAsync(): IAsyncOperation<RfcommDeviceServicesResult?>?

  @InterfaceMethod(3)
  public fun GetRfcommServicesAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<RfcommDeviceServicesResult?>?

  @InterfaceMethod(4)
  public fun GetRfcommServicesForIdAsync(serviceId: RfcommServiceId?):
      IAsyncOperation<RfcommDeviceServicesResult?>?

  @InterfaceMethod(5)
  public fun GetRfcommServicesForIdAsync(serviceId: RfcommServiceId?,
      cacheMode: BluetoothCacheMode?): IAsyncOperation<RfcommDeviceServicesResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothDevice3> {
    public override fun getValue() = ABI.makeIBluetoothDevice3(pointer.getPointer(0))

    public fun setValue(value: IBluetoothDevice3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothDevice3 {
    public val __1985833242_Ptr: Pointer?

    public val _1985833242_VtblPtr: Pointer?
      get() = __1985833242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceAccessInformation(): DeviceAccessInformation? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRfcommServicesAsync(): IAsyncOperation<RfcommDeviceServicesResult?>? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RfcommDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RfcommDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetRfcommServicesAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<RfcommDeviceServicesResult?>? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RfcommDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RfcommDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetRfcommServicesForIdAsync(serviceId: RfcommServiceId?):
        IAsyncOperation<RfcommDeviceServicesResult?>? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RfcommDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr, marshalToNative(serviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RfcommDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetRfcommServicesForIdAsync(serviceId: RfcommServiceId?,
        cacheMode: BluetoothCacheMode?): IAsyncOperation<RfcommDeviceServicesResult?>? {
      val fnPtr = _1985833242_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RfcommDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__1985833242_Ptr, marshalToNative(serviceId),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RfcommDeviceServicesResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothDevice3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1985833242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothDevice3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57fff78b651a4454b90feb21ef0b0d71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothDevice3(ptr: Pointer?): WithDefault = IBluetoothDevice3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothDevice3 {
      val address = segment.toRawLongValue()
      return makeIBluetoothDevice3(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothDevice3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1985833242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothDevice3): Array<IBluetoothDevice3?> = (elements
        as Array<IBluetoothDevice3?>).castToImpl<IBluetoothDevice3,IBluetoothDevice3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothDevice3?> =
        arrayOfNulls<IBluetoothDevice3_Impl>(size) as Array<IBluetoothDevice3?>
  }
}
