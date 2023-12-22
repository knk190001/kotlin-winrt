package Windows.AI.MachineLearning.Preview

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelEvaluationResultPreview.ABI::class)
@Signature("{df25ea9f-9863-4088-8498-87a1f4686f92}")
@Guid("df25ea9f98634088849887a1f4686f92")
@WinRTInterface("df25ea9f98634088849887a1f4686f92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelEvaluationResultPreview.ByReference::class)
public interface ILearningModelEvaluationResultPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CorrelationId(): String?

  @InterfaceMethod(1)
  public fun get_Outputs(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelEvaluationResultPreview> {
    public override fun getValue() =
        ABI.makeILearningModelEvaluationResultPreview(pointer.getPointer(0))

    public fun setValue(value: ILearningModelEvaluationResultPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelEvaluationResultPreview {
    public val __1523942263_Ptr: Pointer?

    public val _1523942263_VtblPtr: Pointer?
      get() = __1523942263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CorrelationId(): String? {
      val fnPtr = _1523942263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1523942263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Outputs(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1523942263_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1523942263_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelEvaluationResultPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1523942263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelEvaluationResultPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df25ea9f98634088849887a1f4686f92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelEvaluationResultPreview(ptr: Pointer?): WithDefault =
        ILearningModelEvaluationResultPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelEvaluationResultPreview {
      val address = segment.toRawLongValue()
      return makeILearningModelEvaluationResultPreview(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelEvaluationResultPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1523942263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelEvaluationResultPreview):
        Array<ILearningModelEvaluationResultPreview?> = (elements as
        Array<ILearningModelEvaluationResultPreview?>).castToImpl<ILearningModelEvaluationResultPreview,ILearningModelEvaluationResultPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelEvaluationResultPreview?> =
        arrayOfNulls<ILearningModelEvaluationResultPreview_Impl>(size) as
        Array<ILearningModelEvaluationResultPreview?>
  }
}
