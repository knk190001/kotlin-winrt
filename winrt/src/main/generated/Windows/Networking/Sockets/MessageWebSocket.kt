package Windows.Networking.Sockets

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(MessageWebSocket.ABI::class)
@Signature("rc(Windows.Networking.Sockets.MessageWebSocket;{33727d08-34d5-4746-ad7b-8dde5bc2ef88})")
@WinRTByReference(brClass = MessageWebSocket.ByReference::class)
public class MessageWebSocket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMessageWebSocket.WithDefault, IWebSocket.WithDefault, IClosable.WithDefault,
    IMessageWebSocket2.WithDefault, IMessageWebSocket3.WithDefault, IWinRTObject {
  private val __747760216_Interface: IMessageWebSocket.WithDefault by lazy {
    as_747760216()
  }


  private val __1618117585_Interface: IWebSocket.WithDefault by lazy {
    as_1618117585()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1705730266_Interface: IMessageWebSocket2.WithDefault by lazy {
    as_1705730266()
  }


  private val __1705730267_Interface: IMessageWebSocket3.WithDefault by lazy {
    as_1705730267()
  }


  public override val __747760216_Ptr: JNAPointer? by lazy {
    __747760216_Interface.__747760216_Ptr
  }


  public override val __1618117585_Ptr: JNAPointer? by lazy {
    __1618117585_Interface.__1618117585_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1705730266_Ptr: JNAPointer? by lazy {
    __1705730266_Interface.__1705730266_Ptr
  }


  public override val __1705730267_Ptr: JNAPointer? by lazy {
    __1705730267_Interface.__1705730267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__747760216_Interface, __1618117585_Interface, __1260617006_Interface,
        __1705730266_Interface, __1705730267_Interface)

  public constructor() : this(ABI.activate())

  private fun as_747760216(): IMessageWebSocket.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocket.ABI.makeIMessageWebSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocket.ABI.makeIMessageWebSocket(ref.value))
  }

  private fun as_1618117585(): IWebSocket.WithDefault {
    if(pointer == NULL) {
      return(IWebSocket.ABI.makeIWebSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocket.ABI.makeIWebSocket(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1705730266(): IMessageWebSocket2.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocket2.ABI.makeIMessageWebSocket2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocket2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocket2.ABI.makeIMessageWebSocket2(ref.value))
  }

  private fun as_1705730267(): IMessageWebSocket3.WithDefault {
    if(pointer == NULL) {
      return(IMessageWebSocket3.ABI.makeIMessageWebSocket3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMessageWebSocket3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMessageWebSocket3.ABI.makeIMessageWebSocket3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessageWebSocket> {
    public override fun getValue() = MessageWebSocket(pointer.getPointer(0))

    public fun setValue(value: MessageWebSocket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MessageWebSocket, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.MessageWebSocket".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MessageWebSocket {
      val address = segment.toRawLongValue()
      return MessageWebSocket(Pointer(address))
    }

    public override fun toNative(obj: MessageWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
