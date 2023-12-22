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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceInformationPairing.ABI::class)
@Signature("{2c4769f5-f684-40d5-8469-e8dbaab70485}")
@Guid("2c4769f5f68440d58469e8dbaab70485")
@WinRTInterface("2c4769f5f68440d58469e8dbaab70485")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformationPairing.ByReference::class)
public interface IDeviceInformationPairing : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPaired(): Boolean

  @InterfaceMethod(1)
  public fun get_CanPair(): Boolean

  @InterfaceMethod(2)
  public fun PairAsync(): IAsyncOperation<DevicePairingResult?>?

  @InterfaceMethod(3)
  public fun PairAsync(minProtectionLevel: DevicePairingProtectionLevel?):
      IAsyncOperation<DevicePairingResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformationPairing> {
    public override fun getValue() = ABI.makeIDeviceInformationPairing(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformationPairing_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformationPairing {
    public val __316119472_Ptr: Pointer?

    public val _316119472_VtblPtr: Pointer?
      get() = __316119472_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPaired(): Boolean {
      val fnPtr = _316119472_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__316119472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanPair(): Boolean {
      val fnPtr = _316119472_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__316119472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun PairAsync(): IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _316119472_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__316119472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun PairAsync(minProtectionLevel: DevicePairingProtectionLevel?):
        IAsyncOperation<DevicePairingResult?>? {
      val fnPtr = _316119472_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DevicePairingResult?>>()
      val hr = fn.invokeHR(arrayOf(__316119472_Ptr, marshalToNative(minProtectionLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DevicePairingResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformationPairing_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __316119472_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformationPairing, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c4769f5f68440d58469e8dbaab70485")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformationPairing(ptr: Pointer?): WithDefault =
        IDeviceInformationPairing_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformationPairing {
      val address = segment.toRawLongValue()
      return makeIDeviceInformationPairing(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformationPairing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__316119472_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformationPairing):
        Array<IDeviceInformationPairing?> = (elements as
        Array<IDeviceInformationPairing?>).castToImpl<IDeviceInformationPairing,IDeviceInformationPairing_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformationPairing?> =
        arrayOfNulls<IDeviceInformationPairing_Impl>(size) as Array<IDeviceInformationPairing?>
  }
}
