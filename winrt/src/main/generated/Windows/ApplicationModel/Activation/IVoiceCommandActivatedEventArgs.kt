package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Media.SpeechRecognition.SpeechRecognitionResult
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

@ABIMarker(IVoiceCommandActivatedEventArgs.ABI::class)
@Signature("{ab92dcfd-8d43-4de6-9775-20704b581b00}")
@Guid("ab92dcfd8d434de6977520704b581b00")
@WinRTInterface("ab92dcfd8d434de6977520704b581b00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommandActivatedEventArgs.ByReference::class)
public interface IVoiceCommandActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Result(): SpeechRecognitionResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoiceCommandActivatedEventArgs> {
    public override fun getValue() = ABI.makeIVoiceCommandActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommandActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommandActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1715149144_Ptr: Pointer?

    public val _1715149144_VtblPtr: Pointer?
      get() = __1715149144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Result(): SpeechRecognitionResult? {
      val fnPtr = _1715149144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionResult>()
      val hr = fn.invokeHR(arrayOf(__1715149144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionResult>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommandActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1715149144_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1715149144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommandActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab92dcfd8d434de6977520704b581b00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommandActivatedEventArgs(ptr: Pointer?): WithDefault =
        IVoiceCommandActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommandActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVoiceCommandActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommandActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1715149144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommandActivatedEventArgs):
        Array<IVoiceCommandActivatedEventArgs?> = (elements as
        Array<IVoiceCommandActivatedEventArgs?>).castToImpl<IVoiceCommandActivatedEventArgs,IVoiceCommandActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommandActivatedEventArgs?> =
        arrayOfNulls<IVoiceCommandActivatedEventArgs_Impl>(size) as
        Array<IVoiceCommandActivatedEventArgs?>
  }
}
