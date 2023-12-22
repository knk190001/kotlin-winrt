package Windows.AI.MachineLearning.Preview

import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ILearningModelPreview.ABI::class)
@Signature("{049c266a-93b4-478c-aeb8-70157bf0ff94}")
@Guid("049c266a93b4478caeb870157bf0ff94")
@WinRTInterface("049c266a93b4478caeb870157bf0ff94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelPreview.ByReference::class)
public interface ILearningModelPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun EvaluateAsync(binding: LearningModelBindingPreview?, correlationId: String?):
      IAsyncOperation<LearningModelEvaluationResultPreview?>?

  @InterfaceMethod(1)
  public fun EvaluateFeaturesAsync(features: IMap<String?, IUnknown?>?, correlationId: String?):
      IAsyncOperation<LearningModelEvaluationResultPreview?>?

  @InterfaceMethod(2)
  public fun get_Description(): LearningModelDescriptionPreview?

  @InterfaceMethod(3)
  public fun get_InferencingOptions(): InferencingOptionsPreview?

  @InterfaceMethod(4)
  public fun put_InferencingOptions(value: InferencingOptionsPreview?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelPreview> {
    public override fun getValue() = ABI.makeILearningModelPreview(pointer.getPointer(0))

    public fun setValue(value: ILearningModelPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelPreview {
    public val __1539506498_Ptr: Pointer?

    public val _1539506498_VtblPtr: Pointer?
      get() = __1539506498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun EvaluateAsync(binding: LearningModelBindingPreview?,
        correlationId: String?): IAsyncOperation<LearningModelEvaluationResultPreview?>? {
      val fnPtr = _1539506498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelEvaluationResultPreview?>>()
      val hr = fn.invokeHR(arrayOf(__1539506498_Ptr, marshalToNative(binding),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LearningModelEvaluationResultPreview?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EvaluateFeaturesAsync(features: IMap<String?, IUnknown?>?,
        correlationId: String?): IAsyncOperation<LearningModelEvaluationResultPreview?>? {
      val fnPtr = _1539506498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelEvaluationResultPreview?>>()
      val hr = fn.invokeHR(arrayOf(__1539506498_Ptr, marshalToNative(features),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LearningModelEvaluationResultPreview?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Description(): LearningModelDescriptionPreview? {
      val fnPtr = _1539506498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelDescriptionPreview>()
      val hr = fn.invokeHR(arrayOf(__1539506498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelDescriptionPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InferencingOptions(): InferencingOptionsPreview? {
      val fnPtr = _1539506498_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InferencingOptionsPreview>()
      val hr = fn.invokeHR(arrayOf(__1539506498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InferencingOptionsPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_InferencingOptions(value: InferencingOptionsPreview?): Unit {
      val fnPtr = _1539506498_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1539506498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILearningModelPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539506498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("049c266a93b4478caeb870157bf0ff94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelPreview(ptr: Pointer?): WithDefault =
        ILearningModelPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelPreview {
      val address = segment.toRawLongValue()
      return makeILearningModelPreview(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539506498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelPreview): Array<ILearningModelPreview?> =
        (elements as
        Array<ILearningModelPreview?>).castToImpl<ILearningModelPreview,ILearningModelPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelPreview?> =
        arrayOfNulls<ILearningModelPreview_Impl>(size) as Array<ILearningModelPreview?>
  }
}
