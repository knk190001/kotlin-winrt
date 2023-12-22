package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ISpeechRecognitionListConstraintFactory.ABI::class)
@Signature("{40f3cdc7-562a-426a-9f3b-3b4e282be1d5}")
@Guid("40f3cdc7562a426a9f3b3b4e282be1d5")
@WinRTInterface("40f3cdc7562a426a9f3b3b4e282be1d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpeechRecognitionListConstraintFactory.ByReference::class)
public interface ISpeechRecognitionListConstraintFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(commands: IIterable<String?>?): SpeechRecognitionListConstraint?

  @InterfaceMethod(1)
  public fun CreateWithTag(commands: IIterable<String?>?, tag: String?):
      SpeechRecognitionListConstraint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpeechRecognitionListConstraintFactory> {
    public override fun getValue() =
        ABI.makeISpeechRecognitionListConstraintFactory(pointer.getPointer(0))

    public fun setValue(value: ISpeechRecognitionListConstraintFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpeechRecognitionListConstraintFactory {
    public val __1936395389_Ptr: Pointer?

    public val _1936395389_VtblPtr: Pointer?
      get() = __1936395389_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(commands: IIterable<String?>?): SpeechRecognitionListConstraint? {
      val fnPtr = _1936395389_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionListConstraint>()
      val hr = fn.invokeHR(arrayOf(__1936395389_Ptr, marshalToNative(commands), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionListConstraint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTag(commands: IIterable<String?>?, tag: String?):
        SpeechRecognitionListConstraint? {
      val fnPtr = _1936395389_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionListConstraint>()
      val hr = fn.invokeHR(arrayOf(__1936395389_Ptr, marshalToNative(commands),
          marshalToNative(tag), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionListConstraint>(result.getValue())
      return resultValue
    }
  }

  public class ISpeechRecognitionListConstraintFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936395389_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpeechRecognitionListConstraintFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40f3cdc7562a426a9f3b3b4e282be1d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpeechRecognitionListConstraintFactory(ptr: Pointer?): WithDefault =
        ISpeechRecognitionListConstraintFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpeechRecognitionListConstraintFactory {
      val address = segment.toRawLongValue()
      return makeISpeechRecognitionListConstraintFactory(Pointer(address))
    }

    public override fun toNative(obj: ISpeechRecognitionListConstraintFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936395389_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpeechRecognitionListConstraintFactory):
        Array<ISpeechRecognitionListConstraintFactory?> = (elements as
        Array<ISpeechRecognitionListConstraintFactory?>).castToImpl<ISpeechRecognitionListConstraintFactory,ISpeechRecognitionListConstraintFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpeechRecognitionListConstraintFactory?> =
        arrayOfNulls<ISpeechRecognitionListConstraintFactory_Impl>(size) as
        Array<ISpeechRecognitionListConstraintFactory?>
  }
}
