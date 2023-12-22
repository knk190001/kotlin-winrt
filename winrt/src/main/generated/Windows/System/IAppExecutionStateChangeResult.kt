package Windows.System

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

@ABIMarker(IAppExecutionStateChangeResult.ABI::class)
@Signature("{6f039bf0-f91b-4df8-ae77-3033ccb69114}")
@Guid("6f039bf0f91b4df8ae773033ccb69114")
@WinRTInterface("6f039bf0f91b4df8ae773033ccb69114")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExecutionStateChangeResult.ByReference::class)
public interface IAppExecutionStateChangeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExecutionStateChangeResult> {
    public override fun getValue() = ABI.makeIAppExecutionStateChangeResult(pointer.getPointer(0))

    public fun setValue(value: IAppExecutionStateChangeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExecutionStateChangeResult {
    public val __1507707688_Ptr: Pointer?

    public val _1507707688_VtblPtr: Pointer?
      get() = __1507707688_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1507707688_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1507707688_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IAppExecutionStateChangeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1507707688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExecutionStateChangeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f039bf0f91b4df8ae773033ccb69114")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExecutionStateChangeResult(ptr: Pointer?): WithDefault =
        IAppExecutionStateChangeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExecutionStateChangeResult {
      val address = segment.toRawLongValue()
      return makeIAppExecutionStateChangeResult(Pointer(address))
    }

    public override fun toNative(obj: IAppExecutionStateChangeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1507707688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExecutionStateChangeResult):
        Array<IAppExecutionStateChangeResult?> = (elements as
        Array<IAppExecutionStateChangeResult?>).castToImpl<IAppExecutionStateChangeResult,IAppExecutionStateChangeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExecutionStateChangeResult?> =
        arrayOfNulls<IAppExecutionStateChangeResult_Impl>(size) as
        Array<IAppExecutionStateChangeResult?>
  }
}
