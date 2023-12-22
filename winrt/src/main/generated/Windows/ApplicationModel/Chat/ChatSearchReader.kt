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

@ABIMarker(ChatSearchReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatSearchReader;{4665fe49-9020-4752-980d-39612325f589})")
@WinRTByReference(brClass = ChatSearchReader.ByReference::class)
public class ChatSearchReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatSearchReader.WithDefault, IWinRTObject {
  private val __642236534_Interface: IChatSearchReader.WithDefault by lazy {
    as_642236534()
  }


  public override val __642236534_Ptr: JNAPointer? by lazy {
    __642236534_Interface.__642236534_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__642236534_Interface)

  private fun as_642236534(): IChatSearchReader.WithDefault {
    if(pointer == NULL) {
      return(IChatSearchReader.ABI.makeIChatSearchReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatSearchReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatSearchReader.ABI.makeIChatSearchReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatSearchReader> {
    public override fun getValue() = ChatSearchReader(pointer.getPointer(0))

    public fun setValue(value: ChatSearchReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatSearchReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatSearchReader {
      val address = segment.toRawLongValue()
      return ChatSearchReader(Pointer(address))
    }

    public override fun toNative(obj: ChatSearchReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
