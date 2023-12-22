package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelEvaluationResult.ABI::class)
@Signature("{b2f9bfcd-960e-49c0-8593-eb190ae3eee2}")
@Guid("b2f9bfcd960e49c08593eb190ae3eee2")
@WinRTInterface("b2f9bfcd960e49c08593eb190ae3eee2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelEvaluationResult.ByReference::class)
public interface ILearningModelEvaluationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): String?

  @InterfaceMethod(1)
  public fun get_ErrorStatus(): Int

  @InterfaceMethod(2)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(3)
  public fun get_Outputs(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelEvaluationResult> {
    public override fun getValue() = ABI.makeILearningModelEvaluationResult(pointer.getPointer(0))

    public fun setValue(value: ILearningModelEvaluationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelEvaluationResult {
    public val __1135880709_Ptr: Pointer?

    public val _1135880709_VtblPtr: Pointer?
      get() = __1135880709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): String? {
      val fnPtr = _1135880709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1135880709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ErrorStatus(): Int {
      val fnPtr = _1135880709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1135880709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _1135880709_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1135880709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Outputs(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1135880709_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1135880709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelEvaluationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1135880709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelEvaluationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2f9bfcd960e49c08593eb190ae3eee2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelEvaluationResult(ptr: Pointer?): WithDefault =
        ILearningModelEvaluationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelEvaluationResult {
      val address = segment.toRawLongValue()
      return makeILearningModelEvaluationResult(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelEvaluationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1135880709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelEvaluationResult):
        Array<ILearningModelEvaluationResult?> = (elements as
        Array<ILearningModelEvaluationResult?>).castToImpl<ILearningModelEvaluationResult,ILearningModelEvaluationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelEvaluationResult?> =
        arrayOfNulls<ILearningModelEvaluationResult_Impl>(size) as
        Array<ILearningModelEvaluationResult?>
  }
}
