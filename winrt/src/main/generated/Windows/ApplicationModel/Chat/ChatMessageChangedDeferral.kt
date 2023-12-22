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

@ABIMarker(ChatMessageChangedDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageChangedDeferral;{fbc6b30c-788c-4dcc-ace7-6282382968cf})")
@WinRTByReference(brClass = ChatMessageChangedDeferral.ByReference::class)
public class ChatMessageChangedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageChangedDeferral.WithDefault, IWinRTObject {
  private val __988324727_Interface: IChatMessageChangedDeferral.WithDefault by lazy {
    as_988324727()
  }


  public override val __988324727_Ptr: JNAPointer? by lazy {
    __988324727_Interface.__988324727_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__988324727_Interface)

  private fun as_988324727(): IChatMessageChangedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageChangedDeferral.ABI.makeIChatMessageChangedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageChangedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageChangedDeferral.ABI.makeIChatMessageChangedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageChangedDeferral> {
    public override fun getValue() = ChatMessageChangedDeferral(pointer.getPointer(0))

    public fun setValue(value: ChatMessageChangedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageChangedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageChangedDeferral {
      val address = segment.toRawLongValue()
      return ChatMessageChangedDeferral(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageChangedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
