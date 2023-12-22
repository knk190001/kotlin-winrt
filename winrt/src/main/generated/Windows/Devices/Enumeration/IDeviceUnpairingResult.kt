package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceUnpairingResult.ABI::class)
@Signature("{66f44ad3-79d9-444b-92cf-a92ef72571c7}")
@Guid("66f44ad379d9444b92cfa92ef72571c7")
@WinRTInterface("66f44ad379d9444b92cfa92ef72571c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceUnpairingResult.ByReference::class)
public interface IDeviceUnpairingResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DeviceUnpairingResultStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceUnpairingResult> {
    public override fun getValue() = ABI.makeIDeviceUnpairingResult(pointer.getPointer(0))

    public fun setValue(value: IDeviceUnpairingResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceUnpairingResult {
    public val __568680760_Ptr: Pointer?

    public val _568680760_VtblPtr: Pointer?
      get() = __568680760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DeviceUnpairingResultStatus? {
      val fnPtr = _568680760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceUnpairingResultStatus>()
      val hr = fn.invokeHR(arrayOf(__568680760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceUnpairingResultStatus>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceUnpairingResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __568680760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceUnpairingResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66f44ad379d9444b92cfa92ef72571c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceUnpairingResult(ptr: Pointer?): WithDefault =
        IDeviceUnpairingResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceUnpairingResult {
      val address = segment.toRawLongValue()
      return makeIDeviceUnpairingResult(Pointer(address))
    }

    public override fun toNative(obj: IDeviceUnpairingResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__568680760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceUnpairingResult): Array<IDeviceUnpairingResult?> =
        (elements as
        Array<IDeviceUnpairingResult?>).castToImpl<IDeviceUnpairingResult,IDeviceUnpairingResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceUnpairingResult?> =
        arrayOfNulls<IDeviceUnpairingResult_Impl>(size) as Array<IDeviceUnpairingResult?>
  }
}
