package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceInformationPairing2.ABI::class)
@Signature("{f68612fd-0aee-4328-85cc-1c742bb1790d}")
@Guid("f68612fd0aee432885cc1c742bb1790d")
@WinRTInterface("f68612fd0aee432885cc1c742bb1790d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationPairing2.ByReference::class)
public interface IDeviceInformationPairing2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProtectionLevel(): DevicePairingProtectionLevel?

  @InterfaceMethod(1)
  public fun get_Custom(): DeviceInformationCustomPairing?

  @InterfaceMethod(2)
  public fun PairAsync(minProtectionLevel: DevicePairingProtectionLevel?,
      devicePairingSettings: IDevicePairingSettings?): IAsyncOperation<DevicePairingResult?>?

  @InterfaceMethod(3)
  public fun UnpairAsync(): IAsyncOperation<DeviceUnpairingResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationPairing2> {
    public override fun getValue() = ABI.makeIDeviceInformationPairing2(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationPairing2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationPairing2 {
    public val __1209768990_Ptr: Pointer?

    public val _1209768990_VtblPtr: Pointer?
      get() = __1209768990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtectionLevel(): DevicePairingProtectionLevel? {
      val fnPtr = _1209768990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePairingProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1209768990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePairingProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Custom(): DeviceInformationCustomPairing? {
      val fnPtr = _1209768990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformationCustomPairing>()
      val hr = fn.invokeHR(arrayOf(__1209768990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformationCustomPairing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun PairAsync(minProtectionLevel: DevicePairingProtectionLevel?,
        devicePairingSettings: IDevicePairingSettings?): IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _1209768990_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__1209768990_Ptr, marshalToNative(minProtectionLevel),
          marshalToNative(devicePairingSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UnpairAsync(): IAsyncOperation<DeviceUnpairingResult?>? {
      val fnPtr = _1209768990_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceUnpairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__1209768990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<DeviceUnpairingResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformationPairing2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209768990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationPairing2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f68612fd0aee432885cc1c742bb1790d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationPairing2(ptr: Pointer?): WithDefault =
        IDeviceInformationPairing2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationPairing2 {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationPairing2(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationPairing2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209768990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationPairing2):
        Array<IDeviceInformationPairing2?> = (elements as
        Array<IDeviceInformationPairing2?>).castToImpl<IDeviceInformationPairing2,IDeviceInformationPairing2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationPairing2?> =
        arrayOfNulls<IDeviceInformationPairing2_Impl>(size) as Array<IDeviceInformationPairing2?>
  }
}
