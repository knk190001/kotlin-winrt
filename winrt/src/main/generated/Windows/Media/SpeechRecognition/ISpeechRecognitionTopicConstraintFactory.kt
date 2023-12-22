package Windows.Media.SpeechRecognition

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionTopicConstraintFactory.ABI::class)
@Signature("{6e6863df-ec05-47d7-a5df-56a3431e58d2}")
@Guid("6e6863dfec0547d7a5df56a3431e58d2")
@WinRTInterface("6e6863dfec0547d7a5df56a3431e58d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionTopicConstraintFactory.ByReference::class)
public interface ISpeechRecognitionTopicConstraintFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(scenario: SpeechRecognitionScenario?, topicHint: String?):
      SpeechRecognitionTopicConstraint?

  @InterfaceMethod(1)
  public fun CreateWithTag(
    scenario: SpeechRecognitionScenario?,
    topicHint: String?,
    tag: String?
  ): SpeechRecognitionTopicConstraint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionTopicConstraintFactory> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionTopicConstraintFactory(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionTopicConstraintFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionTopicConstraintFactory {
    public val __2005132650_Ptr: Pointer?

    public val _2005132650_VtblPtr: Pointer?
      get() = __2005132650_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(scenario: SpeechRecognitionScenario?, topicHint: String?):
        SpeechRecognitionTopicConstraint? {
      val fnPtr = _2005132650_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionTopicConstraint>()
      val hr = fn.invokeHR(arrayOf(__2005132650_Ptr, marshalToNative(scenario),
          marshalToNative(topicHint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionTopicConstraint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTag(
      scenario: SpeechRecognitionScenario?,
      topicHint: String?,
      tag: String?
    ): SpeechRecognitionTopicConstraint? {
      val fnPtr = _2005132650_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionTopicConstraint>()
      val hr = fn.invokeHR(arrayOf(__2005132650_Ptr, marshalToNative(scenario),
          marshalToNative(topicHint), marshalToNative(tag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionTopicConstraint>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionTopicConstraintFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2005132650_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionTopicConstraintFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e6863dfec0547d7a5df56a3431e58d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionTopicConstraintFactory(ptr: Pointer?): WithDefault =
        ISpeechRecognitionTopicConstraintFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionTopicConstraintFactory {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionTopicConstraintFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionTopicConstraintFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005132650_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionTopicConstraintFactory):
        Array<ISpeechRecognitionTopicConstraintFactory?> = (elements as
        Array<ISpeechRecognitionTopicConstraintFactory?>).castToImpl<ISpeechRecognitionTopicConstraintFactory,ISpeechRecognitionTopicConstraintFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionTopicConstraintFactory?> =
        arrayOfNulls<ISpeechRecognitionTopicConstraintFactory_Impl>(size) as
        Array<ISpeechRecognitionTopicConstraintFactory?>
  }
}
