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

@ABIMarker(IDevicePairingResult.ABI::class)
@Signature("{072b02bf-dd95-4025-9b37-de51adba37b7}")
@Guid("072b02bfdd9540259b37de51adba37b7")
@WinRTInterface("072b02bfdd9540259b37de51adba37b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePairingResult.ByReference::class)
public interface IDevicePairingResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DevicePairingResultStatus?

  @InterfaceMethod(1)
  public fun get_ProtectionLevelUsed(): DevicePairingProtectionLevel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePairingResult> {
    public override fun getValue() = ABI.makeIDevicePairingResult(pointer.getPointer(0))

    public fun setValue(value: IDevicePairingResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePairingResult {
    public val __1248578097_Ptr: Pointer?

    public val _1248578097_VtblPtr: Pointer?
      get() = __1248578097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DevicePairingResultStatus? {
      val fnPtr = _1248578097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePairingResultStatus>()
      val hr = fn.invokeHR(arrayOf(__1248578097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePairingResultStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtectionLevelUsed(): DevicePairingProtectionLevel? {
      val fnPtr = _1248578097_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DevicePairingProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1248578097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DevicePairingProtectionLevel>(result.getValue())
      return resultValue
    }
  }

  public class IDevicePairingResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248578097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePairingResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("072b02bfdd9540259b37de51adba37b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePairingResult(ptr: Pointer?): WithDefault = IDevicePairingResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePairingResult {
      val address = segment.toRawLongValue()
      return makeIDevicePairingResult(Pointer(address))
    }

    public override fun toNative(obj: IDevicePairingResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248578097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePairingResult): Array<IDevicePairingResult?> =
        (elements as
        Array<IDevicePairingResult?>).castToImpl<IDevicePairingResult,IDevicePairingResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePairingResult?> =
        arrayOfNulls<IDevicePairingResult_Impl>(size) as Array<IDevicePairingResult?>
  }
}
