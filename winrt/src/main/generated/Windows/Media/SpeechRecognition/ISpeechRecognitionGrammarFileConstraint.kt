package Windows.Media.SpeechRecognition

import Windows.Media.SpeechRecognition.ISpeechRecognitionConstraint.ABI.IID
import Windows.Storage.StorageFile
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISpeechRecognitionGrammarFileConstraint.ABI::class)
@Signature("{b5031a8f-85ca-4fa4-b11a-474fc41b3835}")
@Guid("b5031a8f85ca4fa4b11a474fc41b3835")
@WinRTInterface("b5031a8f85ca4fa4b11a474fc41b3835")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionGrammarFileConstraint.ByReference::class)
public interface ISpeechRecognitionGrammarFileConstraint : NativeMapped, IWinRTInterface,
    ISpeechRecognitionConstraint {
  @InterfaceMethod(0)
  public fun get_GrammarFile(): StorageFile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionGrammarFileConstraint> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionGrammarFileConstraint(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionGrammarFileConstraint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionGrammarFileConstraint,
      ISpeechRecognitionConstraint.WithDefault {
    public val __1798538260_Ptr: Pointer?

    public val _1798538260_VtblPtr: Pointer?
      get() = __1798538260_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GrammarFile(): StorageFile? {
      val fnPtr = _1798538260_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__1798538260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionGrammarFileConstraint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpeechRecognitionConstraint {
    public override val __411817545_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1798538260_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1798538260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionGrammarFileConstraint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5031a8f85ca4fa4b11a474fc41b3835")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionGrammarFileConstraint(ptr: Pointer?): WithDefault =
        ISpeechRecognitionGrammarFileConstraint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionGrammarFileConstraint {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionGrammarFileConstraint(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionGrammarFileConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1798538260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionGrammarFileConstraint):
        Array<ISpeechRecognitionGrammarFileConstraint?> = (elements as
        Array<ISpeechRecognitionGrammarFileConstraint?>).castToImpl<ISpeechRecognitionGrammarFileConstraint,ISpeechRecognitionGrammarFileConstraint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionGrammarFileConstraint?> =
        arrayOfNulls<ISpeechRecognitionGrammarFileConstraint_Impl>(size) as
        Array<ISpeechRecognitionGrammarFileConstraint?>
  }
}
