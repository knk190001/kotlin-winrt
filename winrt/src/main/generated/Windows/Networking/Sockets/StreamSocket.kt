package Windows.Networking.Sockets

import Windows.Foundation.IClosable
import Windows.Networking.HostName
import Windows.Networking.HostNameSortOptions
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StreamSocket.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocket;{69a22cf3-fc7b-4857-af38-f6e7de6a5b49})")
@WinRTByReference(brClass = StreamSocket.ByReference::class)
public class StreamSocket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocket.WithDefault, IClosable.WithDefault, IStreamSocket2.WithDefault,
    IStreamSocket3.WithDefault, IWinRTObject {
  private val __670203445_Interface: IStreamSocket.WithDefault by lazy {
    as_670203445()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __698529735_Interface: IStreamSocket2.WithDefault by lazy {
    as_698529735()
  }


  private val __698529736_Interface: IStreamSocket3.WithDefault by lazy {
    as_698529736()
  }


  public override val __670203445_Ptr: JNAPointer? by lazy {
    __670203445_Interface.__670203445_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __698529735_Ptr: JNAPointer? by lazy {
    __698529735_Interface.__698529735_Ptr
  }


  public override val __698529736_Ptr: JNAPointer? by lazy {
    __698529736_Interface.__698529736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__670203445_Interface, __1260617006_Interface, __698529735_Interface,
        __698529736_Interface)

  public constructor() : this(ABI.activate())

  private fun as_670203445(): IStreamSocket.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocket.ABI.makeIStreamSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocket.ABI.makeIStreamSocket(ref.value))
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

  private fun as_698529735(): IStreamSocket2.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocket2.ABI.makeIStreamSocket2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocket2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocket2.ABI.makeIStreamSocket2(ref.value))
  }

  private fun as_698529736(): IStreamSocket3.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocket3.ABI.makeIStreamSocket3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocket3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocket3.ABI.makeIStreamSocket3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StreamSocket> {
    public override fun getValue() = StreamSocket(pointer.getPointer(0))

    public fun setValue(value: StreamSocket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocket, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IStreamSocketStatics_Instance: IStreamSocketStatics by lazy {
      createIStreamSocketStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.StreamSocket".toHandle(),
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

    public fun createIStreamSocketStatics(): IStreamSocketStatics {
      val refiid = Guid.REFIID(IStreamSocketStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.StreamSocket".toHandle(),refiid,interfacePtr)
      val result = IStreamSocketStatics.ABI.makeIStreamSocketStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StreamSocket {
      val address = segment.toRawLongValue()
      return StreamSocket(Pointer(address))
    }

    public override fun toNative(obj: StreamSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String) =
        ABI.IStreamSocketStatics_Instance.GetEndpointPairsAsync(remoteHostName, remoteServiceName)

    public fun GetEndpointPairsAsync(
      remoteHostName: HostName,
      remoteServiceName: String,
      sortOptions: HostNameSortOptions
    ) = ABI.IStreamSocketStatics_Instance.GetEndpointPairsAsync(remoteHostName, remoteServiceName,
        sortOptions)
  }
}
