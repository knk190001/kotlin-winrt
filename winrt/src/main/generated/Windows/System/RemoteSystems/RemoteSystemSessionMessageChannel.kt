package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemSessionMessageChannelFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RemoteSystemSessionMessageChannel.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionMessageChannel;{9524d12a-73d9-4c10-b751-c26784437127})")
@WinRTByReference(brClass = RemoteSystemSessionMessageChannel.ByReference::class)
public class RemoteSystemSessionMessageChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionMessageChannel.WithDefault, IWinRTObject {
  private val __832753538_Interface: IRemoteSystemSessionMessageChannel.WithDefault by lazy {
    as_832753538()
  }


  public override val __832753538_Ptr: JNAPointer? by lazy {
    __832753538_Interface.__832753538_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__832753538_Interface)

  public constructor(session: RemoteSystemSession, channelName: String) : this(ABI.activate(session,
      channelName))

  public constructor(
    session: RemoteSystemSession,
    channelName: String,
    reliability: RemoteSystemSessionMessageChannelReliability
  ) : this(ABI.activate(session, channelName, reliability))

  private fun as_832753538(): IRemoteSystemSessionMessageChannel.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionMessageChannel.ABI.makeIRemoteSystemSessionMessageChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionMessageChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionMessageChannel.ABI.makeIRemoteSystemSessionMessageChannel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionMessageChannel> {
    public override fun getValue() = RemoteSystemSessionMessageChannel(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionMessageChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionMessageChannel, MemoryAddress> {
    public val IRemoteSystemSessionMessageChannelFactory_Instance:
        IRemoteSystemSessionMessageChannelFactory by lazy {
      createIRemoteSystemSessionMessageChannelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemSessionMessageChannelFactory():
        IRemoteSystemSessionMessageChannelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemSessionMessageChannel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemSessionMessageChannelFactory.ABI.makeIRemoteSystemSessionMessageChannelFactory(factoryActivatorPtr.value))
    }

    public fun activate(session: RemoteSystemSession, channelName: String): JNAPointer? =
        IRemoteSystemSessionMessageChannelFactory_Instance.Create(session, channelName)?.pointer

    public fun activate(
      session: RemoteSystemSession,
      channelName: String,
      reliability: RemoteSystemSessionMessageChannelReliability
    ): JNAPointer? = IRemoteSystemSessionMessageChannelFactory_Instance.Create(session, channelName,
        reliability)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionMessageChannel {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionMessageChannel(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionMessageChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
