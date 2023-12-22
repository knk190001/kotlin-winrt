package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionResult.ABI::class)
@Signature("{4e303157-034e-4652-857e-d0454cc4beec}")
@Guid("4e303157034e4652857ed0454cc4beec")
@WinRTInterface("4e303157034e4652857ed0454cc4beec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionResult.ByReference::class)
public interface ISpeechRecognitionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SpeechRecognitionResultStatus?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  @InterfaceMethod(2)
  public fun get_Confidence(): SpeechRecognitionConfidence?

  @InterfaceMethod(3)
  public fun get_SemanticInterpretation(): SpeechRecognitionSemanticInterpretation?

  @InterfaceMethod(4)
  public fun GetAlternates(maxAlternates: WinDef.UINT): IVectorView<SpeechRecognitionResult?>?

  @InterfaceMethod(5)
  public fun get_Constraint(): ISpeechRecognitionConstraint?

  @InterfaceMethod(6)
  public fun get_RulePath(): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun get_RawConfidence(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionResult> {
    public override fun getValue() = ABI.makeISpeechRecognitionResult(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionResult {
    public val __1293655689_Ptr: Pointer?

    public val _1293655689_VtblPtr: Pointer?
      get() = __1293655689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SpeechRecognitionResultStatus? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionResultStatus>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionResultStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Confidence(): SpeechRecognitionConfidence? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionConfidence>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionConfidence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SemanticInterpretation(): SpeechRecognitionSemanticInterpretation? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionSemanticInterpretation>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SpeechRecognitionSemanticInterpretation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetAlternates(maxAlternates: WinDef.UINT):
        IVectorView<SpeechRecognitionResult?>? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SpeechRecognitionResult?>>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr, maxAlternates, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SpeechRecognitionResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Constraint(): ISpeechRecognitionConstraint? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISpeechRecognitionConstraint>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISpeechRecognitionConstraint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RulePath(): IVectorView<String?>? {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_RawConfidence(): Double {
      val fnPtr = _1293655689_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1293655689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpeechRecognitionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1293655689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e303157034e4652857ed0454cc4beec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionResult(ptr: Pointer?): WithDefault =
        ISpeechRecognitionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognitionResult {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionResult(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1293655689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionResult):
        Array<ISpeechRecognitionResult?> = (elements as
        Array<ISpeechRecognitionResult?>).castToImpl<ISpeechRecognitionResult,ISpeechRecognitionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionResult?> =
        arrayOfNulls<ISpeechRecognitionResult_Impl>(size) as Array<ISpeechRecognitionResult?>
  }
}
