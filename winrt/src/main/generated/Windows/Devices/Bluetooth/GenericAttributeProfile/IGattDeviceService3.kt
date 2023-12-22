package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
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

@ABIMarker(IGattDeviceService3.ABI::class)
@Signature("{b293a950-0c53-437c-a9b3-5c3210c6e569}")
@Guid("b293a9500c53437ca9b35c3210c6e569")
@WinRTInterface("b293a9500c53437ca9b35c3210c6e569")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceService3.ByReference::class)
public interface IGattDeviceService3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceAccessInformation(): DeviceAccessInformation?

  @InterfaceMethod(1)
  public fun get_Session(): GattSession?

  @InterfaceMethod(2)
  public fun get_SharingMode(): GattSharingMode?

  @InterfaceMethod(3)
  public fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>?

  @InterfaceMethod(4)
  public fun OpenAsync(sharingMode: GattSharingMode?): IAsyncOperation<GattOpenStatus?>?

  @InterfaceMethod(5)
  public fun GetCharacteristicsAsync(): IAsyncOperation<GattCharacteristicsResult?>?

  @InterfaceMethod(6)
  public fun GetCharacteristicsAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<GattCharacteristicsResult?>?

  @InterfaceMethod(7)
  public
      fun GetCharacteristicsForUuidAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<GattCharacteristicsResult?>?

  @InterfaceMethod(8)
  public
      fun GetCharacteristicsForUuidAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?,
      cacheMode: BluetoothCacheMode?): IAsyncOperation<GattCharacteristicsResult?>?

  @InterfaceMethod(9)
  public fun GetIncludedServicesAsync(): IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(10)
  public fun GetIncludedServicesAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(11)
  public fun GetIncludedServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<GattDeviceServicesResult?>?

  @InterfaceMethod(12)
  public fun GetIncludedServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
      cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDeviceServicesResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceService3> {
    public override fun getValue() = ABI.makeIGattDeviceService3(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceService3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceService3 {
    public val __918531569_Ptr: Pointer?

    public val _918531569_VtblPtr: Pointer?
      get() = __918531569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceAccessInformation(): DeviceAccessInformation? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Session(): GattSession? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSession>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SharingMode(): GattSharingMode? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSharingMode>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessAsync(): IAsyncOperation<DeviceAccessStatus?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun OpenAsync(sharingMode: GattSharingMode?):
        IAsyncOperation<GattOpenStatus?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattOpenStatus?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(sharingMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattOpenStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetCharacteristicsAsync(): IAsyncOperation<GattCharacteristicsResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetCharacteristicsAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattCharacteristicsResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun GetCharacteristicsForUuidAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<GattCharacteristicsResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(characteristicUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun GetCharacteristicsForUuidAsync(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?,
        cacheMode: BluetoothCacheMode?): IAsyncOperation<GattCharacteristicsResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCharacteristicsResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(characteristicUuid),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCharacteristicsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetIncludedServicesAsync(): IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetIncludedServicesAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override
        fun GetIncludedServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override
        fun GetIncludedServicesForUuidAsync(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?,
        cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDeviceServicesResult?>? {
      val fnPtr = _918531569_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceServicesResult?>>()
      val hr = fn.invokeHR(arrayOf(__918531569_Ptr, marshalToNative(serviceUuid),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDeviceServicesResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDeviceService3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918531569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceService3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b293a9500c53437ca9b35c3210c6e569")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceService3(ptr: Pointer?): WithDefault = IGattDeviceService3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceService3 {
      val address = segment.toRawLongValue()
      return makeIGattDeviceService3(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceService3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918531569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceService3): Array<IGattDeviceService3?> =
        (elements as
        Array<IGattDeviceService3?>).castToImpl<IGattDeviceService3,IGattDeviceService3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceService3?> =
        arrayOfNulls<IGattDeviceService3_Impl>(size) as Array<IGattDeviceService3?>
  }
}
