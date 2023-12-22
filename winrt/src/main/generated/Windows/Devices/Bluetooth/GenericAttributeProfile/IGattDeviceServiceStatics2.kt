package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Devices.Bluetooth.BluetoothDeviceId
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattDeviceServiceStatics2.ABI::class)
@Signature("{0604186e-24a6-4b0d-a2f2-30cc01545d25}")
@Guid("0604186e24a64b0da2f230cc01545d25")
@WinRTInterface("0604186e24a64b0da2f230cc01545d25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceServiceStatics2.ByReference::class)
public interface IGattDeviceServiceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?, sharingMode: GattSharingMode?):
      IAsyncOperation<GattDeviceService?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId?): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId?,
      cacheMode: BluetoothCacheMode?): String?

  @InterfaceMethod(3)
  public fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(bluetoothDeviceId: BluetoothDeviceId?,
      serviceUuid: com.sun.jna.platform.win32.Guid.GUID?): String?

  @InterfaceMethod(4)
  public fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(
    bluetoothDeviceId: BluetoothDeviceId?,
    serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
    cacheMode: BluetoothCacheMode?
  ): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceServiceStatics2> {
    public override fun getValue() = ABI.makeIGattDeviceServiceStatics2(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceServiceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceServiceStatics2 {
    public val __635665361_Ptr: Pointer?

    public val _635665361_VtblPtr: Pointer?
      get() = __635665361_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?, sharingMode: GattSharingMode?):
        IAsyncOperation<GattDeviceService?>? {
      val fnPtr = _635665361_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__635665361_Ptr, marshalToNative(deviceId),
          marshalToNative(sharingMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId?): String? {
      val fnPtr = _635665361_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635665361_Ptr, marshalToNative(bluetoothDeviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelectorForBluetoothDeviceId(bluetoothDeviceId: BluetoothDeviceId?,
        cacheMode: BluetoothCacheMode?): String? {
      val fnPtr = _635665361_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635665361_Ptr, marshalToNative(bluetoothDeviceId),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(bluetoothDeviceId: BluetoothDeviceId?,
        serviceUuid: com.sun.jna.platform.win32.Guid.GUID?): String? {
      val fnPtr = _635665361_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635665361_Ptr, marshalToNative(bluetoothDeviceId),
          marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDeviceSelectorForBluetoothDeviceIdAndUuid(
      bluetoothDeviceId: BluetoothDeviceId?,
      serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
      cacheMode: BluetoothCacheMode?
    ): String? {
      val fnPtr = _635665361_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635665361_Ptr, marshalToNative(bluetoothDeviceId),
          marshalToNative(serviceUuid), marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IGattDeviceServiceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635665361_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceServiceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0604186e24a64b0da2f230cc01545d25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceServiceStatics2(ptr: Pointer?): WithDefault =
        IGattDeviceServiceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceServiceStatics2 {
      val address = segment.toRawLongValue()
      return makeIGattDeviceServiceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceServiceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635665361_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceServiceStatics2):
        Array<IGattDeviceServiceStatics2?> = (elements as
        Array<IGattDeviceServiceStatics2?>).castToImpl<IGattDeviceServiceStatics2,IGattDeviceServiceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceServiceStatics2?> =
        arrayOfNulls<IGattDeviceServiceStatics2_Impl>(size) as Array<IGattDeviceServiceStatics2?>
  }
}
