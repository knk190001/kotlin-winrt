package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(ISpeechRecognitionSemanticInterpretation.ABI::class)
@Signature("{aae1da9b-7e32-4c1f-89fe-0c65f486f52e}")
@Guid("aae1da9b7e324c1f89fe0c65f486f52e")
@WinRTInterface("aae1da9b7e324c1f89fe0c65f486f52e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionSemanticInterpretation.ByReference::class)
public interface ISpeechRecognitionSemanticInterpretation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Properties(): IMapView<String?, IVectorView<String?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionSemanticInterpretation> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionSemanticInterpretation(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionSemanticInterpretation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionSemanticInterpretation {
    public val __1086900186_Ptr: Pointer?

    public val _1086900186_VtblPtr: Pointer?
      get() = __1086900186_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Properties(): IMapView<String?, IVectorView<String?>?>? {
      val fnPtr = _1086900186_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1086900186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          IVectorView<String?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionSemanticInterpretation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1086900186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionSemanticInterpretation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aae1da9b7e324c1f89fe0c65f486f52e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionSemanticInterpretation(ptr: Pointer?): WithDefault =
        ISpeechRecognitionSemanticInterpretation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionSemanticInterpretation {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionSemanticInterpretation(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionSemanticInterpretation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1086900186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionSemanticInterpretation):
        Array<ISpeechRecognitionSemanticInterpretation?> = (elements as
        Array<ISpeechRecognitionSemanticInterpretation?>).castToImpl<ISpeechRecognitionSemanticInterpretation,ISpeechRecognitionSemanticInterpretation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionSemanticInterpretation?> =
        arrayOfNulls<ISpeechRecognitionSemanticInterpretation_Impl>(size) as
        Array<ISpeechRecognitionSemanticInterpretation?>
  }
}
