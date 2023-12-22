package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsEndUserMessage.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsEndUserMessage;{d7cda5eb-cbd7-4f3b-8526-b506dec35c53})")
@WinRTByReference(brClass = RcsEndUserMessage.ByReference::class)
public class RcsEndUserMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsEndUserMessage.WithDefault, IWinRTObject {
  private val __760558532_Interface: IRcsEndUserMessage.WithDefault by lazy {
    as_760558532()
  }


  public override val __760558532_Ptr: JNAPointer? by lazy {
    __760558532_Interface.__760558532_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__760558532_Interface)

  private fun as_760558532(): IRcsEndUserMessage.WithDefault {
    if(pointer == NULL) {
      return(IRcsEndUserMessage.ABI.makeIRcsEndUserMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsEndUserMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsEndUserMessage.ABI.makeIRcsEndUserMessage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsEndUserMessage> {
    public override fun getValue() = RcsEndUserMessage(pointer.getPointer(0))

    public fun setValue(value: RcsEndUserMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsEndUserMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsEndUserMessage {
      val address = segment.toRawLongValue()
      return RcsEndUserMessage(Pointer(address))
    }

    public override fun toNative(obj: RcsEndUserMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
