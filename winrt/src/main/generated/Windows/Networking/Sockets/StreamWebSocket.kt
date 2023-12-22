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

@ABIMarker(StreamWebSocket.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamWebSocket;{bd4a49d8-b289-45bb-97eb-c7525205a843})")
@WinRTByReference(brClass = StreamWebSocket.ByReference::class)
public class StreamWebSocket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamWebSocket.WithDefault, IWebSocket.WithDefault, IClosable.WithDefault,
    IStreamWebSocket2.WithDefault, IWinRTObject {
  private val __818243215_Interface: IStreamWebSocket.WithDefault by lazy {
    as_818243215()
  }


  private val __1618117585_Interface: IWebSocket.WithDefault by lazy {
    as_1618117585()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __404264061_Interface: IStreamWebSocket2.WithDefault by lazy {
    as_404264061()
  }


  public override val __818243215_Ptr: JNAPointer? by lazy {
    __818243215_Interface.__818243215_Ptr
  }


  public override val __1618117585_Ptr: JNAPointer? by lazy {
    __1618117585_Interface.__1618117585_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __404264061_Ptr: JNAPointer? by lazy {
    __404264061_Interface.__404264061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__818243215_Interface, __1618117585_Interface, __1260617006_Interface,
        __404264061_Interface)

  public constructor() : this(ABI.activate())

  private fun as_818243215(): IStreamWebSocket.WithDefault {
    if(pointer == NULL) {
      return(IStreamWebSocket.ABI.makeIStreamWebSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamWebSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamWebSocket.ABI.makeIStreamWebSocket(ref.value))
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

  private fun as_404264061(): IStreamWebSocket2.WithDefault {
    if(pointer == NULL) {
      return(IStreamWebSocket2.ABI.makeIStreamWebSocket2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamWebSocket2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamWebSocket2.ABI.makeIStreamWebSocket2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamWebSocket> {
    public override fun getValue() = StreamWebSocket(pointer.getPointer(0))

    public fun setValue(value: StreamWebSocket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamWebSocket, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.StreamWebSocket".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): StreamWebSocket {
      val address = segment.toRawLongValue()
      return StreamWebSocket(Pointer(address))
    }

    public override fun toNative(obj: StreamWebSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
