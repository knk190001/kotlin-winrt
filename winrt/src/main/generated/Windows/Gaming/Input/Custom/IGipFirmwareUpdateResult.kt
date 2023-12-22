package Windows.Gaming.Input.Custom

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGipFirmwareUpdateResult.ABI::class)
@Signature("{6b794d32-8553-4292-8e03-e16651a2f8bc}")
@Guid("6b794d32855342928e03e16651a2f8bc")
@WinRTInterface("6b794d32855342928e03e16651a2f8bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGipFirmwareUpdateResult.ByReference::class)
public interface IGipFirmwareUpdateResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedErrorCode(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_FinalComponentId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Status(): GipFirmwareUpdateStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGipFirmwareUpdateResult> {
    public override fun getValue() = ABI.makeIGipFirmwareUpdateResult(pointer.getPointer(0))

    public fun setValue(value: IGipFirmwareUpdateResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGipFirmwareUpdateResult {
    public val __1784188785_Ptr: Pointer?

    public val _1784188785_VtblPtr: Pointer?
      get() = __1784188785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedErrorCode(): WinDef.UINT {
      val fnPtr = _1784188785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1784188785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_FinalComponentId(): WinDef.UINT {
      val fnPtr = _1784188785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1784188785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Status(): GipFirmwareUpdateStatus? {
      val fnPtr = _1784188785_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GipFirmwareUpdateStatus>()
      val hr = fn.invokeHR(arrayOf(__1784188785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GipFirmwareUpdateStatus>(result.getValue())
      return resultValue
    }
  }

  public class IGipFirmwareUpdateResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1784188785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGipFirmwareUpdateResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b794d32855342928e03e16651a2f8bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGipFirmwareUpdateResult(ptr: Pointer?): WithDefault =
        IGipFirmwareUpdateResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGipFirmwareUpdateResult {
      val address = segment.toRawLongValue()
      return makeIGipFirmwareUpdateResult(Pointer(address))
    }

    public override fun toNative(obj: IGipFirmwareUpdateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1784188785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGipFirmwareUpdateResult):
        Array<IGipFirmwareUpdateResult?> = (elements as
        Array<IGipFirmwareUpdateResult?>).castToImpl<IGipFirmwareUpdateResult,IGipFirmwareUpdateResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGipFirmwareUpdateResult?> =
        arrayOfNulls<IGipFirmwareUpdateResult_Impl>(size) as Array<IGipFirmwareUpdateResult?>
  }
}
