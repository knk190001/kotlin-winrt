package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemAuthorizationKindFilterFactory.ABI.IID
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

@ABIMarker(RemoteSystemAuthorizationKindFilter.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemAuthorizationKindFilter;{6b0dde8e-04d0-40f4-a27f-c2acbbd6b734})")
@WinRTByReference(brClass = RemoteSystemAuthorizationKindFilter.ByReference::class)
public class RemoteSystemAuthorizationKindFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemAuthorizationKindFilter.WithDefault,
    IRemoteSystemFilter.WithDefault, IWinRTObject {
  private val __875635759_Interface: IRemoteSystemAuthorizationKindFilter.WithDefault by lazy {
    as_875635759()
  }


  private val __31591340_Interface: IRemoteSystemFilter.WithDefault by lazy {
    as_31591340()
  }


  public override val __875635759_Ptr: JNAPointer? by lazy {
    __875635759_Interface.__875635759_Ptr
  }


  public override val __31591340_Ptr: JNAPointer? by lazy {
    __31591340_Interface.__31591340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__875635759_Interface, __31591340_Interface)

  public constructor(remoteSystemAuthorizationKind: RemoteSystemAuthorizationKind) :
      this(ABI.activate(remoteSystemAuthorizationKind))

  private fun as_875635759(): IRemoteSystemAuthorizationKindFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemAuthorizationKindFilter.ABI.makeIRemoteSystemAuthorizationKindFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemAuthorizationKindFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemAuthorizationKindFilter.ABI.makeIRemoteSystemAuthorizationKindFilter(ref.value))
  }

  private fun as_31591340(): IRemoteSystemFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemFilter.ABI.makeIRemoteSystemFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemFilter.ABI.makeIRemoteSystemFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemAuthorizationKindFilter> {
    public override fun getValue() = RemoteSystemAuthorizationKindFilter(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemAuthorizationKindFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemAuthorizationKindFilter, MemoryAddress> {
    public val IRemoteSystemAuthorizationKindFilterFactory_Instance:
        IRemoteSystemAuthorizationKindFilterFactory by lazy {
      createIRemoteSystemAuthorizationKindFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemAuthorizationKindFilterFactory():
        IRemoteSystemAuthorizationKindFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemAuthorizationKindFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemAuthorizationKindFilterFactory.ABI.makeIRemoteSystemAuthorizationKindFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(remoteSystemAuthorizationKind: RemoteSystemAuthorizationKind): JNAPointer? =
        IRemoteSystemAuthorizationKindFilterFactory_Instance.Create(remoteSystemAuthorizationKind)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemAuthorizationKindFilter {
      val address = segment.toRawLongValue()
      return RemoteSystemAuthorizationKindFilter(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemAuthorizationKindFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
