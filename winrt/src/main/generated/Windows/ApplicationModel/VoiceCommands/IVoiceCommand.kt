package Windows.ApplicationModel.VoiceCommands

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Media.SpeechRecognition.SpeechRecognitionResult
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

@ABIMarker(IVoiceCommand.ABI::class)
@Signature("{936f5273-ec82-42a6-a55c-d2d79ec6f920}")
@Guid("936f5273ec8242a6a55cd2d79ec6f920")
@WinRTInterface("936f5273ec8242a6a55cd2d79ec6f920")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoiceCommand.ByReference::class)
public interface IVoiceCommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CommandName(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IVectorView<String?>?>?

  @InterfaceMethod(2)
  public fun get_SpeechRecognitionResult(): SpeechRecognitionResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVoiceCommand>
      {
    public override fun getValue() = ABI.makeIVoiceCommand(pointer.getPointer(0))

    public fun setValue(value: IVoiceCommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoiceCommand {
    public val __1503887022_Ptr: Pointer?

    public val _1503887022_VtblPtr: Pointer?
      get() = __1503887022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CommandName(): String? {
      val fnPtr = _1503887022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1503887022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IVectorView<String?>?>? {
      val fnPtr = _1503887022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1503887022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SpeechRecognitionResult(): SpeechRecognitionResult? {
      val fnPtr = _1503887022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpeechRecognitionResult>()
      val hr = fn.invokeHR(arrayOf(__1503887022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpeechRecognitionResult>(result.getValue())
      return resultValue
    }
  }

  public class IVoiceCommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1503887022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoiceCommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("936f5273ec8242a6a55cd2d79ec6f920")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoiceCommand(ptr: Pointer?): WithDefault = IVoiceCommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoiceCommand {
      val address = segment.toRawLongValue()
      return makeIVoiceCommand(Pointer(address))
    }

    public override fun toNative(obj: IVoiceCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1503887022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoiceCommand): Array<IVoiceCommand?> = (elements as
        Array<IVoiceCommand?>).castToImpl<IVoiceCommand,IVoiceCommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoiceCommand?> =
        arrayOfNulls<IVoiceCommand_Impl>(size) as Array<IVoiceCommand?>
  }
}
