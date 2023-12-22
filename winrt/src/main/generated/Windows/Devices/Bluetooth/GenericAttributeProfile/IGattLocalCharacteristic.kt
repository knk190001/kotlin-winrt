package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IGattLocalCharacteristic.ABI::class)
@Signature("{aede376d-5412-4d74-92a8-8deb8526829c}")
@Guid("aede376d54124d7492a88deb8526829c")
@WinRTInterface("aede376d54124d7492a88deb8526829c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalCharacteristic.ByReference::class)
public interface IGattLocalCharacteristic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_StaticValue(): IBuffer?

  @InterfaceMethod(2)
  public fun get_CharacteristicProperties(): GattCharacteristicProperties?

  @InterfaceMethod(3)
  public fun get_ReadProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(4)
  public fun get_WriteProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(5)
  public fun CreateDescriptorAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?,
      parameters: GattLocalDescriptorParameters?): IAsyncOperation<GattLocalDescriptorResult?>?

  @InterfaceMethod(6)
  public fun get_Descriptors(): IVectorView<GattLocalDescriptor?>?

  @InterfaceMethod(7)
  public fun get_UserDescription(): String?

  @InterfaceMethod(8)
  public fun get_PresentationFormats(): IVectorView<GattPresentationFormat?>?

  @InterfaceMethod(9)
  public fun get_SubscribedClients(): IVectorView<GattSubscribedClient?>?

  @InterfaceMethod(10)
  public fun add_SubscribedClientsChanged(handler: TypedEventHandler<GattLocalCharacteristic?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_SubscribedClientsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_ReadRequested(handler: TypedEventHandler<GattLocalCharacteristic?,
      GattReadRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_ReadRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_WriteRequested(handler: TypedEventHandler<GattLocalCharacteristic?,
      GattWriteRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_WriteRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun NotifyValueAsync(value: IBuffer?):
      IAsyncOperation<IVectorView<GattClientNotificationResult?>?>?

  @InterfaceMethod(17)
  public fun NotifyValueAsync(value: IBuffer?, subscribedClient: GattSubscribedClient?):
      IAsyncOperation<GattClientNotificationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalCharacteristic> {
    public override fun getValue() = ABI.makeIGattLocalCharacteristic(pointer.getPointer(0))

    public fun setValue(value: IGattLocalCharacteristic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalCharacteristic {
    public val __2036066997_Ptr: Pointer?

    public val _2036066997_VtblPtr: Pointer?
      get() = __2036066997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StaticValue(): IBuffer? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CharacteristicProperties(): GattCharacteristicProperties? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristicProperties>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ReadProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WriteProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateDescriptorAsync(descriptorUuid: com.sun.jna.platform.win32.Guid.GUID?,
        parameters: GattLocalDescriptorParameters?): IAsyncOperation<GattLocalDescriptorResult?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattLocalDescriptorResult?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(descriptorUuid),
          marshalToNative(parameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattLocalDescriptorResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Descriptors(): IVectorView<GattLocalDescriptor?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattLocalDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattLocalDescriptor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_UserDescription(): String? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PresentationFormats(): IVectorView<GattPresentationFormat?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattPresentationFormat?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattPresentationFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SubscribedClients(): IVectorView<GattSubscribedClient?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattSubscribedClient?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattSubscribedClient?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override
        fun add_SubscribedClientsChanged(handler: TypedEventHandler<GattLocalCharacteristic?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_SubscribedClientsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_ReadRequested(handler: TypedEventHandler<GattLocalCharacteristic?,
        GattReadRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_ReadRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_WriteRequested(handler: TypedEventHandler<GattLocalCharacteristic?,
        GattWriteRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_WriteRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun NotifyValueAsync(value: IBuffer?):
        IAsyncOperation<IVectorView<GattClientNotificationResult?>?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<GattClientNotificationResult?>?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<GattClientNotificationResult?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun NotifyValueAsync(value: IBuffer?, subscribedClient: GattSubscribedClient?):
        IAsyncOperation<GattClientNotificationResult?>? {
      val fnPtr = _2036066997_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattClientNotificationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2036066997_Ptr, marshalToNative(value),
          marshalToNative(subscribedClient), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattClientNotificationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalCharacteristic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2036066997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalCharacteristic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aede376d54124d7492a88deb8526829c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalCharacteristic(ptr: Pointer?): WithDefault =
        IGattLocalCharacteristic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalCharacteristic {
      val address = segment.toRawLongValue()
      return makeIGattLocalCharacteristic(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalCharacteristic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2036066997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalCharacteristic):
        Array<IGattLocalCharacteristic?> = (elements as
        Array<IGattLocalCharacteristic?>).castToImpl<IGattLocalCharacteristic,IGattLocalCharacteristic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalCharacteristic?> =
        arrayOfNulls<IGattLocalCharacteristic_Impl>(size) as Array<IGattLocalCharacteristic?>
  }
}
