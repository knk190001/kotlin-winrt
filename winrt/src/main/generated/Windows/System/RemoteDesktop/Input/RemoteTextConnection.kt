package Windows.System.RemoteDesktop.Input

import Windows.Foundation.IClosable
import Windows.System.RemoteDesktop.Input.IRemoteTextConnectionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(RemoteTextConnection.ABI::class)
@Signature("rc(Windows.System.RemoteDesktop.Input.RemoteTextConnection;{4e7bb02a-183e-5e66-b5e4-3e6e5c570cf1})")
@WinRTByReference(brClass = RemoteTextConnection.ByReference::class)
public class RemoteTextConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteTextConnection.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __343268964_Interface: IRemoteTextConnection.WithDefault by lazy {
    as_343268964()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __343268964_Ptr: JNAPointer? by lazy {
    __343268964_Interface.__343268964_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__343268964_Interface, __1260617006_Interface)

  public constructor(connectionId: Guid.GUID, pduForwarder: RemoteTextConnectionDataHandler) :
      this(ABI.activate(connectionId, pduForwarder))

  private fun as_343268964(): IRemoteTextConnection.WithDefault {
    if(pointer == NULL) {
      return(IRemoteTextConnection.ABI.makeIRemoteTextConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteTextConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteTextConnection.ABI.makeIRemoteTextConnection(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteTextConnection> {
    public override fun getValue() = RemoteTextConnection(pointer.getPointer(0))

    public fun setValue(value: RemoteTextConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteTextConnection, MemoryAddress> {
    public val IRemoteTextConnectionFactory_Instance: IRemoteTextConnectionFactory by lazy {
      createIRemoteTextConnectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteTextConnectionFactory(): IRemoteTextConnectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteDesktop.Input.RemoteTextConnection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteTextConnectionFactory.ABI.makeIRemoteTextConnectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(connectionId: Guid.GUID, pduForwarder: RemoteTextConnectionDataHandler):
        JNAPointer? = IRemoteTextConnectionFactory_Instance.CreateInstance(connectionId,
        pduForwarder)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteTextConnection {
      val address = segment.toRawLongValue()
      return RemoteTextConnection(Pointer(address))
    }

    public override fun toNative(obj: RemoteTextConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
