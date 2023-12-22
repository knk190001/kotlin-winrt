package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadySoapMessage.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadySoapMessage;{b659fcb5-ce41-41ba-8a0d-61df5fffa139})")
@WinRTByReference(brClass = PlayReadySoapMessage.ByReference::class)
public class PlayReadySoapMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadySoapMessage.WithDefault, IWinRTObject {
  private val __264603815_Interface: IPlayReadySoapMessage.WithDefault by lazy {
    as_264603815()
  }


  public override val __264603815_Ptr: JNAPointer? by lazy {
    __264603815_Interface.__264603815_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__264603815_Interface)

  private fun as_264603815(): IPlayReadySoapMessage.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadySoapMessage.ABI.makeIPlayReadySoapMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadySoapMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadySoapMessage.ABI.makeIPlayReadySoapMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadySoapMessage> {
    public override fun getValue() = PlayReadySoapMessage(pointer.getPointer(0))

    public fun setValue(value: PlayReadySoapMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadySoapMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayReadySoapMessage {
      val address = segment.toRawLongValue()
      return PlayReadySoapMessage(Pointer(address))
    }

    public override fun toNative(obj: PlayReadySoapMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
