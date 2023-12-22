package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IGattCharacteristic3.ABI::class)
@Signature("{3f3c663e-93d4-406b-b817-db81f8ed53b3}")
@Guid("3f3c663e93d4406bb817db81f8ed53b3")
@WinRTInterface("3f3c663e93d4406bb817db81f8ed53b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristic3.ByReference::class)
public interface IGattCharacteristic3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDescriptorsAsync(): IAsyncOperation<GattDescriptorsResult?>?

  @InterfaceMethod(1)
  public fun GetDescriptorsAsync(cacheMode: BluetoothCacheMode?):
      IAsyncOperation<GattDescriptorsResult?>?

  @InterfaceMethod(2)
  public fun GetDescriptorsForUuidAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IAsyncOperation<GattDescriptorsResult?>?

  @InterfaceMethod(3)
  public fun GetDescriptorsForUuidAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?,
      cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDescriptorsResult?>?

  @InterfaceMethod(4)
  public fun WriteValueWithResultAsync(value: IBuffer?): IAsyncOperation<GattWriteResult?>?

  @InterfaceMethod(5)
  public fun WriteValueWithResultAsync(value: IBuffer?, writeOption: GattWriteOption?):
      IAsyncOperation<GattWriteResult?>?

  @InterfaceMethod(6)
  public
      fun WriteClientCharacteristicConfigurationDescriptorWithResultAsync(clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue?):
      IAsyncOperation<GattWriteResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristic3> {
    public override fun getValue() = ABI.makeIGattCharacteristic3(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristic3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristic3 {
    public val __1407380445_Ptr: Pointer?

    public val _1407380445_VtblPtr: Pointer?
      get() = __1407380445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDescriptorsAsync(): IAsyncOperation<GattDescriptorsResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDescriptorsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDescriptorsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDescriptorsAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattDescriptorsResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDescriptorsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDescriptorsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun GetDescriptorsForUuidAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IAsyncOperation<GattDescriptorsResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDescriptorsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr, marshalToNative(descriptorUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDescriptorsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun GetDescriptorsForUuidAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?,
        cacheMode: BluetoothCacheMode?): IAsyncOperation<GattDescriptorsResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDescriptorsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr, marshalToNative(descriptorUuid),
          marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattDescriptorsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun WriteValueWithResultAsync(value: IBuffer?):
        IAsyncOperation<GattWriteResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattWriteResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattWriteResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun WriteValueWithResultAsync(value: IBuffer?, writeOption: GattWriteOption?):
        IAsyncOperation<GattWriteResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattWriteResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr, marshalToNative(value),
          marshalToNative(writeOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattWriteResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override
        fun WriteClientCharacteristicConfigurationDescriptorWithResultAsync(clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue?):
        IAsyncOperation<GattWriteResult?>? {
      val fnPtr = _1407380445_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattWriteResult?>>()
      val hr = fn.invokeHR(arrayOf(__1407380445_Ptr,
          marshalToNative(clientCharacteristicConfigurationDescriptorValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattWriteResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristic3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1407380445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristic3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f3c663e93d4406bb817db81f8ed53b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristic3(ptr: Pointer?): WithDefault = IGattCharacteristic3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristic3 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristic3(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristic3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1407380445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristic3): Array<IGattCharacteristic3?> =
        (elements as
        Array<IGattCharacteristic3?>).castToImpl<IGattCharacteristic3,IGattCharacteristic3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristic3?> =
        arrayOfNulls<IGattCharacteristic3_Impl>(size) as Array<IGattCharacteristic3?>
  }
}
