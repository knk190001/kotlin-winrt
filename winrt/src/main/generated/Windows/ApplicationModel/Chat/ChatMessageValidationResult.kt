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

@ABIMarker(ChatMessageValidationResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageValidationResult;{25e93a03-28ec-5889-569b-7e486b126f18})")
@WinRTByReference(brClass = ChatMessageValidationResult.ByReference::class)
public class ChatMessageValidationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageValidationResult.WithDefault, IWinRTObject {
  private val __1403411390_Interface: IChatMessageValidationResult.WithDefault by lazy {
    as_1403411390()
  }


  public override val __1403411390_Ptr: JNAPointer? by lazy {
    __1403411390_Interface.__1403411390_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1403411390_Interface)

  private fun as_1403411390(): IChatMessageValidationResult.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageValidationResult.ABI.makeIChatMessageValidationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageValidationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageValidationResult.ABI.makeIChatMessageValidationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageValidationResult> {
    public override fun getValue() = ChatMessageValidationResult(pointer.getPointer(0))

    public fun setValue(value: ChatMessageValidationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageValidationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageValidationResult {
      val address = segment.toRawLongValue()
      return ChatMessageValidationResult(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageValidationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
