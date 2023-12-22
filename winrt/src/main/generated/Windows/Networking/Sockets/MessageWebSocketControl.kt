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

@ABIMarker(MessageWebSocketControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.MessageWebSocketControl;{8118388a-c629-4f0a-80fb-81fc05538862})")
@WinRTByReference(brClass = MessageWebSocketControl.ByReference::class)
public class MessageWebSocketControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMessageWebSocketControl.WithDefault, IWebSocketControl.WithDefault,
    IWebSocketControl2.WithDefault, IMessageWebSocketControl2.WithDefault, IWinRTObject {
  private val __492159003_Interface: IMessageWebSocketControl.WithDefault by lazy {
    as_492159003()
  }


  private val __136954322_Interface: IWebSocketControl.WithDefault by lazy {
    as_136954322()
  }


  private val __49383364_Interface: IWebSocketControl2.WithDefault by lazy {
    as_49383364()
  }


  private val __1922940141_Interface: IMessageWebSocketControl2.WithDefault by lazy {
    as_1922940141()
  }


  public override val __492159003_Ptr: JNAPointer? by lazy {
    __492159003_Interface.__492159003_Ptr
  }


  public override val __136954322_Ptr: JNAPointer? by lazy {
    __136954322_Interface.__136954322_Ptr
  }


  public override val __49383364_Ptr: JNAPointer? by lazy {
    __49383364_Interface.__49383364_Ptr
  }


  public override val __1922940141_Ptr: JNAPointer? by lazy {
    __1922940141_Interface.__1922940141_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__492159003_Interface, __136954322_Interface, __49383364_Interface,
        __1922940141_Interface)

  private fun as_492159003(): IMessageWebSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocketControl.ABI.makeIMessageWebSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocketControl.ABI.makeIMessageWebSocketControl(ref.value))
  }

  private fun as_136954322(): IWebSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketControl.ABI.makeIWebSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketControl.ABI.makeIWebSocketControl(ref.value))
  }

  private fun as_49383364(): IWebSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketControl2.ABI.makeIWebSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketControl2.ABI.makeIWebSocketControl2(ref.value))
  }

  private fun as_1922940141(): IMessageWebSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocketControl2.ABI.makeIMessageWebSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocketControl2.ABI.makeIMessageWebSocketControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessageWebSocketControl> {
    public override fun getValue() = MessageWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: MessageWebSocketControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MessageWebSocketControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MessageWebSocketControl {
      val address = segment.toRawLongValue()
      return MessageWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: MessageWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
