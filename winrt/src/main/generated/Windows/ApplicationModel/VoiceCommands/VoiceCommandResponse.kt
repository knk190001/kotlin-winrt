package Windows.ApplicationModel.VoiceCommands

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VoiceCommandResponse.ABI::class)
@Signature("rc(Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse;{0284b30e-8a3b-4cc4-a6a1-cad5be2716b5})")
@WinRTByReference(brClass = VoiceCommandResponse.ByReference::class)
public class VoiceCommandResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceCommandResponse.WithDefault, IWinRTObject {
  private val __1942521779_Interface: IVoiceCommandResponse.WithDefault by lazy {
    as_1942521779()
  }


  public override val __1942521779_Ptr: JNAPointer? by lazy {
    __1942521779_Interface.__1942521779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1942521779_Interface)

  private fun as_1942521779(): IVoiceCommandResponse.WithDefault {
    if(pointer == NULL) {
      return(IVoiceCommandResponse.ABI.makeIVoiceCommandResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceCommandResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceCommandResponse.ABI.makeIVoiceCommandResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceCommandResponse> {
    public override fun getValue() = VoiceCommandResponse(pointer.getPointer(0))

    public fun setValue(value: VoiceCommandResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceCommandResponse, MemoryAddress> {
    public val IVoiceCommandResponseStatics_Instance: IVoiceCommandResponseStatics by lazy {
      createIVoiceCommandResponseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVoiceCommandResponseStatics(): IVoiceCommandResponseStatics {
      val refiid = Guid.REFIID(IVoiceCommandResponseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.VoiceCommands.VoiceCommandResponse".toHandle(),refiid,interfacePtr)
      val result =
          IVoiceCommandResponseStatics.ABI.makeIVoiceCommandResponseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): VoiceCommandResponse {
      val address = segment.toRawLongValue()
      return VoiceCommandResponse(Pointer(address))
    }

    public override fun toNative(obj: VoiceCommandResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxSupportedVoiceCommandContentTiles() =
        ABI.IVoiceCommandResponseStatics_Instance.get_MaxSupportedVoiceCommandContentTiles()

    public fun CreateResponse(userMessage: VoiceCommandUserMessage) =
        ABI.IVoiceCommandResponseStatics_Instance.CreateResponse(userMessage)

    public fun CreateResponse(message: VoiceCommandUserMessage,
        contentTiles: IIterable<VoiceCommandContentTile?>) =
        ABI.IVoiceCommandResponseStatics_Instance.CreateResponse(message, contentTiles)

    public fun CreateResponseForPrompt(message: VoiceCommandUserMessage,
        repeatMessage: VoiceCommandUserMessage) =
        ABI.IVoiceCommandResponseStatics_Instance.CreateResponseForPrompt(message, repeatMessage)

    public fun CreateResponseForPrompt(
      message: VoiceCommandUserMessage,
      repeatMessage: VoiceCommandUserMessage,
      contentTiles: IIterable<VoiceCommandContentTile?>
    ) = ABI.IVoiceCommandResponseStatics_Instance.CreateResponseForPrompt(message, repeatMessage,
        contentTiles)
  }
}
