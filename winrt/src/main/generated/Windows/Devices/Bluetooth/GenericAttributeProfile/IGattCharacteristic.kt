package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGattCharacteristic.ABI::class)
@Signature("{59cb50c1-5934-4f68-a198-eb864fa44e6b}")
@Guid("59cb50c159344f68a198eb864fa44e6b")
@WinRTInterface("59cb50c159344f68a198eb864fa44e6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristic.ByReference::class)
public interface IGattCharacteristic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDescriptors(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IVectorView<GattDescriptor?>?

  @InterfaceMethod(1)
  public fun get_CharacteristicProperties(): GattCharacteristicProperties?

  @InterfaceMethod(2)
  public fun get_ProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(3)
  public fun put_ProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(4)
  public fun get_UserDescription(): String?

  @InterfaceMethod(5)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_AttributeHandle(): WinDef.USHORT

  @InterfaceMethod(7)
  public fun get_PresentationFormats(): IVectorView<GattPresentationFormat?>?

  @InterfaceMethod(8)
  public fun ReadValueAsync(): IAsyncOperation<GattReadResult?>?

  @InterfaceMethod(9)
  public fun ReadValueAsync(cacheMode: BluetoothCacheMode?): IAsyncOperation<GattReadResult?>?

  @InterfaceMethod(10)
  public fun WriteValueAsync(value: IBuffer?): IAsyncOperation<GattCommunicationStatus?>?

  @InterfaceMethod(11)
  public fun WriteValueAsync(value: IBuffer?, writeOption: GattWriteOption?):
      IAsyncOperation<GattCommunicationStatus?>?

  @InterfaceMethod(12)
  public fun ReadClientCharacteristicConfigurationDescriptorAsync():
      IAsyncOperation<GattReadClientCharacteristicConfigurationDescriptorResult?>?

  @InterfaceMethod(13)
  public
      fun WriteClientCharacteristicConfigurationDescriptorAsync(clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue?):
      IAsyncOperation<GattCommunicationStatus?>?

  @InterfaceMethod(14)
  public fun add_ValueChanged(valueChangedHandler: TypedEventHandler<GattCharacteristic?,
      GattValueChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_ValueChanged(valueChangedEventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristic> {
    public override fun getValue() = ABI.makeIGattCharacteristic(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristic {
    public val __1617168618_Ptr: Pointer?

    public val _1617168618_VtblPtr: Pointer?
      get() = __1617168618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDescriptors(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IVectorView<GattDescriptor?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(descriptorUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CharacteristicProperties(): GattCharacteristicProperties? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristicProperties>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_UserDescription(): String? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AttributeHandle(): WinDef.USHORT {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_PresentationFormats(): IVectorView<GattPresentationFormat?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattPresentationFormat?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattPresentationFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun ReadValueAsync(): IAsyncOperation<GattReadResult?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattReadResult?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattReadResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ReadValueAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattReadResult?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattReadResult?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattReadResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun WriteValueAsync(value: IBuffer?):
        IAsyncOperation<GattCommunicationStatus?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCommunicationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCommunicationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun WriteValueAsync(value: IBuffer?, writeOption: GattWriteOption?):
        IAsyncOperation<GattCommunicationStatus?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCommunicationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(value),
          marshalToNative(writeOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCommunicationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun ReadClientCharacteristicConfigurationDescriptorAsync():
        IAsyncOperation<GattReadClientCharacteristicConfigurationDescriptorResult?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<GattReadClientCharacteristicConfigurationDescriptorResult?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattReadClientCharacteristicConfigurationDescriptorResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override
        fun WriteClientCharacteristicConfigurationDescriptorAsync(clientCharacteristicConfigurationDescriptorValue: GattClientCharacteristicConfigurationDescriptorValue?):
        IAsyncOperation<GattCommunicationStatus?>? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCommunicationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr,
          marshalToNative(clientCharacteristicConfigurationDescriptorValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCommunicationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun add_ValueChanged(valueChangedHandler: TypedEventHandler<GattCharacteristic?,
        GattValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(valueChangedHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_ValueChanged(valueChangedEventCookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _1617168618_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1617168618_Ptr, marshalToNative(valueChangedEventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattCharacteristic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1617168618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59cb50c159344f68a198eb864fa44e6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristic(ptr: Pointer?): WithDefault = IGattCharacteristic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristic {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristic(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1617168618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristic): Array<IGattCharacteristic?> =
        (elements as
        Array<IGattCharacteristic?>).castToImpl<IGattCharacteristic,IGattCharacteristic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristic?> =
        arrayOfNulls<IGattCharacteristic_Impl>(size) as Array<IGattCharacteristic?>
  }
}
