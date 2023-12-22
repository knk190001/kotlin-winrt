package Windows.Media.SpeechRecognition

import Windows.Media.SpeechRecognition.ISpeechRecognitionConstraint.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionVoiceCommandDefinitionConstraint.ABI::class)
@Signature("{f2791c2b-1ef4-4ae7-9d77-b6ff10b8a3c2}")
@Guid("f2791c2b1ef44ae79d77b6ff10b8a3c2")
@WinRTInterface("f2791c2b1ef44ae79d77b6ff10b8a3c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionVoiceCommandDefinitionConstraint.ByReference::class)
public interface ISpeechRecognitionVoiceCommandDefinitionConstraint : NativeMapped, IWinRTInterface,
    ISpeechRecognitionConstraint {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionVoiceCommandDefinitionConstraint> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionVoiceCommandDefinitionConstraint(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionVoiceCommandDefinitionConstraint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionVoiceCommandDefinitionConstraint,
      ISpeechRecognitionConstraint.WithDefault {
    public val __159737259_Ptr: Pointer?

    public val _159737259_VtblPtr: Pointer?
      get() = __159737259_Ptr?.getPointer(0)
  }

  public class ISpeechRecognitionVoiceCommandDefinitionConstraint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpeechRecognitionConstraint {
    public override val __411817545_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_159737259_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __159737259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionVoiceCommandDefinitionConstraint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2791c2b1ef44ae79d77b6ff10b8a3c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionVoiceCommandDefinitionConstraint(ptr: Pointer?): WithDefault =
        ISpeechRecognitionVoiceCommandDefinitionConstraint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionVoiceCommandDefinitionConstraint {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionVoiceCommandDefinitionConstraint(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionVoiceCommandDefinitionConstraint):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__159737259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionVoiceCommandDefinitionConstraint):
        Array<ISpeechRecognitionVoiceCommandDefinitionConstraint?> = (elements as
        Array<ISpeechRecognitionVoiceCommandDefinitionConstraint?>).castToImpl<ISpeechRecognitionVoiceCommandDefinitionConstraint,ISpeechRecognitionVoiceCommandDefinitionConstraint_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISpeechRecognitionVoiceCommandDefinitionConstraint?> =
        arrayOfNulls<ISpeechRecognitionVoiceCommandDefinitionConstraint_Impl>(size) as
        Array<ISpeechRecognitionVoiceCommandDefinitionConstraint?>
  }
}
