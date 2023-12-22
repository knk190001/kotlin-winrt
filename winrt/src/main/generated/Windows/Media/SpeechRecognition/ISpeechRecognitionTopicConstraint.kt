package Windows.Media.SpeechRecognition

import Windows.Media.SpeechRecognition.ISpeechRecognitionConstraint.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpeechRecognitionTopicConstraint.ABI::class)
@Signature("{bf6fdf19-825d-4e69-a681-36e48cf1c93e}")
@Guid("bf6fdf19825d4e69a68136e48cf1c93e")
@WinRTInterface("bf6fdf19825d4e69a68136e48cf1c93e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionTopicConstraint.ByReference::class)
public interface ISpeechRecognitionTopicConstraint : NativeMapped, IWinRTInterface,
    ISpeechRecognitionConstraint {
  @InterfaceMethod(0)
  public fun get_Scenario(): SpeechRecognitionScenario?

  @InterfaceMethod(1)
  public fun get_TopicHint(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionTopicConstraint> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionTopicConstraint(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionTopicConstraint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionTopicConstraint,
      ISpeechRecognitionConstraint.WithDefault {
    public val __755954560_Ptr: Pointer?

    public val _755954560_VtblPtr: Pointer?
      get() = __755954560_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Scenario(): SpeechRecognitionScenario? {
      val fnPtr = _755954560_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionScenario>()
      val hr = fn.invokeHR(arrayOf(__755954560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionScenario>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TopicHint(): String? {
      val fnPtr = _755954560_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__755954560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionTopicConstraint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISpeechRecognitionConstraint {
    public override val __411817545_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_755954560_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __755954560_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionTopicConstraint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf6fdf19825d4e69a68136e48cf1c93e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionTopicConstraint(ptr: Pointer?): WithDefault =
        ISpeechRecognitionTopicConstraint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpeechRecognitionTopicConstraint {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionTopicConstraint(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionTopicConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__755954560_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionTopicConstraint):
        Array<ISpeechRecognitionTopicConstraint?> = (elements as
        Array<ISpeechRecognitionTopicConstraint?>).castToImpl<ISpeechRecognitionTopicConstraint,ISpeechRecognitionTopicConstraint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionTopicConstraint?> =
        arrayOfNulls<ISpeechRecognitionTopicConstraint_Impl>(size) as
        Array<ISpeechRecognitionTopicConstraint?>
  }
}
