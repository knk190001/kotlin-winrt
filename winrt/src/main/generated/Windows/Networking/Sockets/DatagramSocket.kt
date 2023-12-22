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

@ABIMarker(DatagramSocket.ABI::class)
@Signature("rc(Windows.Networking.Sockets.DatagramSocket;{7fe25bbb-c3bc-4677-8446-ca28a465a3af})")
@WinRTByReference(brClass = DatagramSocket.ByReference::class)
public class DatagramSocket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDatagramSocket.WithDefault, IClosable.WithDefault,
    IDatagramSocket2.WithDefault, IDatagramSocket3.WithDefault, IWinRTObject {
  private val __1622600564_Interface: IDatagramSocket.WithDefault by lazy {
    as_1622600564()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1238990118_Interface: IDatagramSocket2.WithDefault by lazy {
    as_1238990118()
  }


  private val __1238990119_Interface: IDatagramSocket3.WithDefault by lazy {
    as_1238990119()
  }


  public override val __1622600564_Ptr: JNAPointer? by lazy {
    __1622600564_Interface.__1622600564_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1238990118_Ptr: JNAPointer? by lazy {
    __1238990118_Interface.__1238990118_Ptr
  }


  public override val __1238990119_Ptr: JNAPointer? by lazy {
    __1238990119_Interface.__1238990119_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1622600564_Interface, __1260617006_Interface, __1238990118_Interface,
        __1238990119_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1622600564(): IDatagramSocket.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocket.ABI.makeIDatagramSocket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocket.ABI.makeIDatagramSocket(ref.value))
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

  private fun as_1238990118(): IDatagramSocket2.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocket2.ABI.makeIDatagramSocket2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocket2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocket2.ABI.makeIDatagramSocket2(ref.value))
  }

  private fun as_1238990119(): IDatagramSocket3.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocket3.ABI.makeIDatagramSocket3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocket3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocket3.ABI.makeIDatagramSocket3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DatagramSocket>
      {
    public override fun getValue() = DatagramSocket(pointer.getPointer(0))

    public fun setValue(value: DatagramSocket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatagramSocket, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDatagramSocketStatics_Instance: IDatagramSocketStatics by lazy {
      createIDatagramSocketStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.DatagramSocket".toHandle(),
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

    public fun createIDatagramSocketStatics(): IDatagramSocketStatics {
      val refiid = Guid.REFIID(IDatagramSocketStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Sockets.DatagramSocket".toHandle(),refiid,interfacePtr)
      val result = IDatagramSocketStatics.ABI.makeIDatagramSocketStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DatagramSocket {
      val address = segment.toRawLongValue()
      return DatagramSocket(Pointer(address))
    }

    public override fun toNative(obj: DatagramSocket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String) =
        ABI.IDatagramSocketStatics_Instance.GetEndpointPairsAsync(remoteHostName, remoteServiceName)

    public fun GetEndpointPairsAsync(
      remoteHostName: HostName,
      remoteServiceName: String,
      sortOptions: HostNameSortOptions
    ) = ABI.IDatagramSocketStatics_Instance.GetEndpointPairsAsync(remoteHostName, remoteServiceName,
        sortOptions)
  }
}
