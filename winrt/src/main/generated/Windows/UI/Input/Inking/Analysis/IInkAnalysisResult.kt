package Windows.UI.Input.Inking.Analysis

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

@ABIMarker(IInkAnalysisResult.ABI::class)
@Signature("{8948ba79-a243-4aa3-a294-1f98bd0ff580}")
@Guid("8948ba79a2434aa3a2941f98bd0ff580")
@WinRTInterface("8948ba79a2434aa3a2941f98bd0ff580")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkAnalysisResult.ByReference::class)
public interface IInkAnalysisResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): InkAnalysisStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkAnalysisResult> {
    public override fun getValue() = ABI.makeIInkAnalysisResult(pointer.getPointer(0))

    public fun setValue(value: IInkAnalysisResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkAnalysisResult {
    public val __2005148943_Ptr: Pointer?

    public val _2005148943_VtblPtr: Pointer?
      get() = __2005148943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): InkAnalysisStatus? {
      val fnPtr = _2005148943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkAnalysisStatus>()
      val hr = fn.invokeHR(arrayOf(__2005148943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkAnalysisStatus>(result.getValue())
      return resultValue
    }
  }

  public class IInkAnalysisResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2005148943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkAnalysisResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8948ba79a2434aa3a2941f98bd0ff580")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkAnalysisResult(ptr: Pointer?): WithDefault = IInkAnalysisResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkAnalysisResult {
      val address = segment.toRawLongValue()
      return makeIInkAnalysisResult(Pointer(address))
    }

    public override fun toNative(obj: IInkAnalysisResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005148943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkAnalysisResult): Array<IInkAnalysisResult?> =
        (elements as
        Array<IInkAnalysisResult?>).castToImpl<IInkAnalysisResult,IInkAnalysisResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkAnalysisResult?> =
        arrayOfNulls<IInkAnalysisResult_Impl>(size) as Array<IInkAnalysisResult?>
  }
}
