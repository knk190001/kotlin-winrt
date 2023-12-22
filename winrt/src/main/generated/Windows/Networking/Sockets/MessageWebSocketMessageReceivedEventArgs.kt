package Windows.Networking.Sockets

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

@ABIMarker(MessageWebSocketMessageReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs;{478c22ac-4c4b-42ed-9ed7-1ef9f94fa3d5})")
@WinRTByReference(brClass = MessageWebSocketMessageReceivedEventArgs.ByReference::class)
public class MessageWebSocketMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMessageWebSocketMessageReceivedEventArgs.WithDefault,
    IMessageWebSocketMessageReceivedEventArgs2.WithDefault, IWinRTObject {
  private val __1341297383_Interface: IMessageWebSocketMessageReceivedEventArgs.WithDefault by
      lazy {
    as_1341297383()
  }


  private val __1369454037_Interface: IMessageWebSocketMessageReceivedEventArgs2.WithDefault by
      lazy {
    as_1369454037()
  }


  public override val __1341297383_Ptr: JNAPointer? by lazy {
    __1341297383_Interface.__1341297383_Ptr
  }


  public override val __1369454037_Ptr: JNAPointer? by lazy {
    __1369454037_Interface.__1369454037_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1341297383_Interface, __1369454037_Interface)

  private fun as_1341297383(): IMessageWebSocketMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocketMessageReceivedEventArgs.ABI.makeIMessageWebSocketMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocketMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocketMessageReceivedEventArgs.ABI.makeIMessageWebSocketMessageReceivedEventArgs(ref.value))
  }

  private fun as_1369454037(): IMessageWebSocketMessageReceivedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocketMessageReceivedEventArgs2.ABI.makeIMessageWebSocketMessageReceivedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocketMessageReceivedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocketMessageReceivedEventArgs2.ABI.makeIMessageWebSocketMessageReceivedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessageWebSocketMessageReceivedEventArgs> {
    public override fun getValue() = MessageWebSocketMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MessageWebSocketMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MessageWebSocketMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MessageWebSocketMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MessageWebSocketMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MessageWebSocketMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
