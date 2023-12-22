package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IGattServiceProvider.ABI::class)
@Signature("{7822b3cd-2889-4f86-a051-3f0aed1c2760}")
@Guid("7822b3cd28894f86a0513f0aed1c2760")
@WinRTInterface("7822b3cd28894f86a0513f0aed1c2760")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProvider.ByReference::class)
public interface IGattServiceProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Service(): GattLocalService?

  @InterfaceMethod(1)
  public fun get_AdvertisementStatus(): GattServiceProviderAdvertisementStatus?

  @InterfaceMethod(2)
  public fun add_AdvertisementStatusChanged(handler: TypedEventHandler<GattServiceProvider?,
      GattServiceProviderAdvertisementStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AdvertisementStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun StartAdvertising(): Unit

  @InterfaceMethod(5)
  public fun StartAdvertising(parameters: GattServiceProviderAdvertisingParameters?): Unit

  @InterfaceMethod(6)
  public fun StopAdvertising(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProvider> {
    public override fun getValue() = ABI.makeIGattServiceProvider(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProvider {
    public val __1115232853_Ptr: Pointer?

    public val _1115232853_VtblPtr: Pointer?
      get() = __1115232853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Service(): GattLocalService? {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattLocalService>()
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattLocalService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AdvertisementStatus(): GattServiceProviderAdvertisementStatus? {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattServiceProviderAdvertisementStatus>()
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattServiceProviderAdvertisementStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_AdvertisementStatusChanged(handler: TypedEventHandler<GattServiceProvider?,
        GattServiceProviderAdvertisementStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AdvertisementStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun StartAdvertising(): Unit {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun StartAdvertising(parameters: GattServiceProviderAdvertisingParameters?):
        Unit {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr, marshalToNative(parameters),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun StopAdvertising(): Unit {
      val fnPtr = _1115232853_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1115232853_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattServiceProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1115232853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7822b3cd28894f86a0513f0aed1c2760")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProvider(ptr: Pointer?): WithDefault = IGattServiceProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProvider {
      val address = segment.toRawLongValue()
      return makeIGattServiceProvider(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1115232853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProvider): Array<IGattServiceProvider?> =
        (elements as
        Array<IGattServiceProvider?>).castToImpl<IGattServiceProvider,IGattServiceProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProvider?> =
        arrayOfNulls<IGattServiceProvider_Impl>(size) as Array<IGattServiceProvider?>
  }
}
