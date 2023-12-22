package Windows.Media.SpeechRecognition

import Windows.Storage.StorageFile
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

@ABIMarker(ISpeechRecognitionGrammarFileConstraintFactory.ABI::class)
@Signature("{3da770eb-c479-4c27-9f19-89974ef392d1}")
@Guid("3da770ebc4794c279f1989974ef392d1")
@WinRTInterface("3da770ebc4794c279f1989974ef392d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionGrammarFileConstraintFactory.ByReference::class)
public interface ISpeechRecognitionGrammarFileConstraintFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(`file`: StorageFile?): SpeechRecognitionGrammarFileConstraint?

  @InterfaceMethod(1)
  public fun CreateWithTag(`file`: StorageFile?, tag: String?):
      SpeechRecognitionGrammarFileConstraint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionGrammarFileConstraintFactory> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionGrammarFileConstraintFactory(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionGrammarFileConstraintFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionGrammarFileConstraintFactory {
    public val __2142550442_Ptr: Pointer?

    public val _2142550442_VtblPtr: Pointer?
      get() = __2142550442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(`file`: StorageFile?): SpeechRecognitionGrammarFileConstraint? {
      val fnPtr = _2142550442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionGrammarFileConstraint>()
      val hr = fn.invokeHR(arrayOf(__2142550442_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionGrammarFileConstraint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTag(`file`: StorageFile?, tag: String?):
        SpeechRecognitionGrammarFileConstraint? {
      val fnPtr = _2142550442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionGrammarFileConstraint>()
      val hr = fn.invokeHR(arrayOf(__2142550442_Ptr, marshalToNative(file), marshalToNative(tag),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionGrammarFileConstraint>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionGrammarFileConstraintFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2142550442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionGrammarFileConstraintFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3da770ebc4794c279f1989974ef392d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionGrammarFileConstraintFactory(ptr: Pointer?): WithDefault =
        ISpeechRecognitionGrammarFileConstraintFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionGrammarFileConstraintFactory {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionGrammarFileConstraintFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionGrammarFileConstraintFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2142550442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionGrammarFileConstraintFactory):
        Array<ISpeechRecognitionGrammarFileConstraintFactory?> = (elements as
        Array<ISpeechRecognitionGrammarFileConstraintFactory?>).castToImpl<ISpeechRecognitionGrammarFileConstraintFactory,ISpeechRecognitionGrammarFileConstraintFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionGrammarFileConstraintFactory?> =
        arrayOfNulls<ISpeechRecognitionGrammarFileConstraintFactory_Impl>(size) as
        Array<ISpeechRecognitionGrammarFileConstraintFactory?>
  }
}
