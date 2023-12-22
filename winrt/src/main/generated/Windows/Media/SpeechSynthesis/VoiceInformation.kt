package Windows.Media.SpeechSynthesis

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

@ABIMarker(VoiceInformation.ABI::class)
@Signature("rc(Windows.Media.SpeechSynthesis.VoiceInformation;{b127d6a4-1291-4604-aa9c-83134083352c})")
@WinRTByReference(brClass = VoiceInformation.ByReference::class)
public class VoiceInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVoiceInformation.WithDefault, IWinRTObject {
  private val __323850086_Interface: IVoiceInformation.WithDefault by lazy {
    as_323850086()
  }


  public override val __323850086_Ptr: JNAPointer? by lazy {
    __323850086_Interface.__323850086_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__323850086_Interface)

  private fun as_323850086(): IVoiceInformation.WithDefault {
    if(pointer == NULL) {
      return(IVoiceInformation.ABI.makeIVoiceInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVoiceInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVoiceInformation.ABI.makeIVoiceInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VoiceInformation> {
    public override fun getValue() = VoiceInformation(pointer.getPointer(0))

    public fun setValue(value: VoiceInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VoiceInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VoiceInformation {
      val address = segment.toRawLongValue()
      return VoiceInformation(Pointer(address))
    }

    public override fun toNative(obj: VoiceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
