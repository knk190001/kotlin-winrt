package Windows.Media.Miracast

import Windows.Foundation.HResult
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

@ABIMarker(IMiracastReceiverApplySettingsResult.ABI::class)
@Signature("{d0aa6272-09cd-58e1-a4f2-5d5143d312f9}")
@Guid("d0aa627209cd58e1a4f25d5143d312f9")
@WinRTInterface("d0aa627209cd58e1a4f25d5143d312f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverApplySettingsResult.ByReference::class)
public interface IMiracastReceiverApplySettingsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MiracastReceiverApplySettingsStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverApplySettingsResult> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverApplySettingsResult(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverApplySettingsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverApplySettingsResult {
    public val __743508427_Ptr: Pointer?

    public val _743508427_VtblPtr: Pointer?
      get() = __743508427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MiracastReceiverApplySettingsStatus? {
      val fnPtr = _743508427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MiracastReceiverApplySettingsStatus>()
      val hr = fn.invokeHR(arrayOf(__743508427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MiracastReceiverApplySettingsStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _743508427_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__743508427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IMiracastReceiverApplySettingsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __743508427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverApplySettingsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0aa627209cd58e1a4f25d5143d312f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverApplySettingsResult(ptr: Pointer?): WithDefault =
        IMiracastReceiverApplySettingsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverApplySettingsResult {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverApplySettingsResult(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverApplySettingsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__743508427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverApplySettingsResult):
        Array<IMiracastReceiverApplySettingsResult?> = (elements as
        Array<IMiracastReceiverApplySettingsResult?>).castToImpl<IMiracastReceiverApplySettingsResult,IMiracastReceiverApplySettingsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverApplySettingsResult?> =
        arrayOfNulls<IMiracastReceiverApplySettingsResult_Impl>(size) as
        Array<IMiracastReceiverApplySettingsResult?>
  }
}
