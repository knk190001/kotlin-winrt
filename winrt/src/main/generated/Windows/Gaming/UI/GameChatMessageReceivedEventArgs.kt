package Windows.Gaming.UI

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

@ABIMarker(GameChatMessageReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Gaming.UI.GameChatMessageReceivedEventArgs;{a28201f1-3fb9-4e42-a403-7afce2023b1e})")
@WinRTByReference(brClass = GameChatMessageReceivedEventArgs.ByReference::class)
public class GameChatMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGameChatMessageReceivedEventArgs.WithDefault, IWinRTObject {
  private val __920844390_Interface: IGameChatMessageReceivedEventArgs.WithDefault by lazy {
    as_920844390()
  }


  public override val __920844390_Ptr: JNAPointer? by lazy {
    __920844390_Interface.__920844390_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__920844390_Interface)

  private fun as_920844390(): IGameChatMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGameChatMessageReceivedEventArgs.ABI.makeIGameChatMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameChatMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameChatMessageReceivedEventArgs.ABI.makeIGameChatMessageReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GameChatMessageReceivedEventArgs> {
    public override fun getValue() = GameChatMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GameChatMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameChatMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GameChatMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return GameChatMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GameChatMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
