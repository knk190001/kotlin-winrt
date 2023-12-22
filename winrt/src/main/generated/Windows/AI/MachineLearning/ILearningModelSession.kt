package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IPropertySet
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

@ABIMarker(ILearningModelSession.ABI::class)
@Signature("{8e58f8f6-b787-4c11-90f0-7129aeca74a9}")
@Guid("8e58f8f6b7874c1190f07129aeca74a9")
@WinRTInterface("8e58f8f6b7874c1190f07129aeca74a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelSession.ByReference::class)
public interface ILearningModelSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Model(): LearningModel?

  @InterfaceMethod(1)
  public fun get_Device(): LearningModelDevice?

  @InterfaceMethod(2)
  public fun get_EvaluationProperties(): IPropertySet?

  @InterfaceMethod(3)
  public fun EvaluateAsync(bindings: LearningModelBinding?, correlationId: String?):
      IAsyncOperation<LearningModelEvaluationResult?>?

  @InterfaceMethod(4)
  public fun EvaluateFeaturesAsync(features: IMap<String?, IUnknown?>?, correlationId: String?):
      IAsyncOperation<LearningModelEvaluationResult?>?

  @InterfaceMethod(5)
  public fun Evaluate(bindings: LearningModelBinding?, correlationId: String?):
      LearningModelEvaluationResult?

  @InterfaceMethod(6)
  public fun EvaluateFeatures(features: IMap<String?, IUnknown?>?, correlationId: String?):
      LearningModelEvaluationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelSession> {
    public override fun getValue() = ABI.makeILearningModelSession(pointer.getPointer(0))

    public fun setValue(value: ILearningModelSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelSession {
    public val __2077341302_Ptr: Pointer?

    public val _2077341302_VtblPtr: Pointer?
      get() = __2077341302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Model(): LearningModel? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModel>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Device(): LearningModelDevice? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelDevice>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EvaluationProperties(): IPropertySet? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPropertySet>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun EvaluateAsync(bindings: LearningModelBinding?, correlationId: String?):
        IAsyncOperation<LearningModelEvaluationResult?>? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr, marshalToNative(bindings),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LearningModelEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun EvaluateFeaturesAsync(features: IMap<String?, IUnknown?>?,
        correlationId: String?): IAsyncOperation<LearningModelEvaluationResult?>? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr, marshalToNative(features),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LearningModelEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Evaluate(bindings: LearningModelBinding?, correlationId: String?):
        LearningModelEvaluationResult? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelEvaluationResult>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr, marshalToNative(bindings),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelEvaluationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun EvaluateFeatures(features: IMap<String?, IUnknown?>?,
        correlationId: String?): LearningModelEvaluationResult? {
      val fnPtr = _2077341302_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelEvaluationResult>()
      val hr = fn.invokeHR(arrayOf(__2077341302_Ptr, marshalToNative(features),
          marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelEvaluationResult>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2077341302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e58f8f6b7874c1190f07129aeca74a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelSession(ptr: Pointer?): WithDefault =
        ILearningModelSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelSession {
      val address = segment.toRawLongValue()
      return makeILearningModelSession(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2077341302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelSession): Array<ILearningModelSession?> =
        (elements as
        Array<ILearningModelSession?>).castToImpl<ILearningModelSession,ILearningModelSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelSession?> =
        arrayOfNulls<ILearningModelSession_Impl>(size) as Array<ILearningModelSession?>
  }
}
