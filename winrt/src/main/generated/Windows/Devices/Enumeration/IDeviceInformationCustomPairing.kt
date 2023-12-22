package Windows.Devices.Enumeration

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IDeviceInformationCustomPairing.ABI::class)
@Signature("{85138c02-4ee6-4914-8370-107a39144c0e}")
@Guid("85138c024ee649148370107a39144c0e")
@WinRTInterface("85138c024ee649148370107a39144c0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationCustomPairing.ByReference::class)
public interface IDeviceInformationCustomPairing : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PairAsync(pairingKindsSupported: DevicePairingKinds?):
      IAsyncOperation<DevicePairingResult?>?

  @InterfaceMethod(1)
  public fun PairAsync(pairingKindsSupported: DevicePairingKinds?,
      minProtectionLevel: DevicePairingProtectionLevel?): IAsyncOperation<DevicePairingResult?>?

  @InterfaceMethod(2)
  public fun PairAsync(
    pairingKindsSupported: DevicePairingKinds?,
    minProtectionLevel: DevicePairingProtectionLevel?,
    devicePairingSettings: IDevicePairingSettings?
  ): IAsyncOperation<DevicePairingResult?>?

  @InterfaceMethod(3)
  public fun add_PairingRequested(handler: TypedEventHandler<DeviceInformationCustomPairing?,
      DevicePairingRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PairingRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationCustomPairing> {
    public override fun getValue() = ABI.makeIDeviceInformationCustomPairing(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationCustomPairing_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationCustomPairing {
    public val __436266081_Ptr: Pointer?

    public val _436266081_VtblPtr: Pointer?
      get() = __436266081_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PairAsync(pairingKindsSupported: DevicePairingKinds?):
        IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _436266081_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__436266081_Ptr, marshalToNative(pairingKindsSupported), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun PairAsync(pairingKindsSupported: DevicePairingKinds?,
        minProtectionLevel: DevicePairingProtectionLevel?): IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _436266081_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__436266081_Ptr, marshalToNative(pairingKindsSupported),
          marshalToNative(minProtectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PairAsync(
      pairingKindsSupported: DevicePairingKinds?,
      minProtectionLevel: DevicePairingProtectionLevel?,
      devicePairingSettings: IDevicePairingSettings?
    ): IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _436266081_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__436266081_Ptr, marshalToNative(pairingKindsSupported),
          marshalToNative(minProtectionLevel), marshalToNative(devicePairingSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun add_PairingRequested(handler: TypedEventHandler<DeviceInformationCustomPairing?,
        DevicePairingRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _436266081_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__436266081_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PairingRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _436266081_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__436266081_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeviceInformationCustomPairing_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __436266081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationCustomPairing, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85138c024ee649148370107a39144c0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationCustomPairing(ptr: Pointer?): WithDefault =
        IDeviceInformationCustomPairing_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationCustomPairing {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationCustomPairing(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationCustomPairing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__436266081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationCustomPairing):
        Array<IDeviceInformationCustomPairing?> = (elements as
        Array<IDeviceInformationCustomPairing?>).castToImpl<IDeviceInformationCustomPairing,IDeviceInformationCustomPairing_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationCustomPairing?> =
        arrayOfNulls<IDeviceInformationCustomPairing_Impl>(size) as
        Array<IDeviceInformationCustomPairing?>
  }
}
