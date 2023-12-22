package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemDiscoveryTypeFilterFactory.ABI.IID
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

@ABIMarker(RemoteSystemDiscoveryTypeFilter.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter;{42d9041f-ee5a-43da-ac6a-6fee25460741})")
@WinRTByReference(brClass = RemoteSystemDiscoveryTypeFilter.ByReference::class)
public class RemoteSystemDiscoveryTypeFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemDiscoveryTypeFilter.WithDefault, IRemoteSystemFilter.WithDefault,
    IWinRTObject {
  private val __2133643922_Interface: IRemoteSystemDiscoveryTypeFilter.WithDefault by lazy {
    as_2133643922()
  }


  private val __31591340_Interface: IRemoteSystemFilter.WithDefault by lazy {
    as_31591340()
  }


  public override val __2133643922_Ptr: JNAPointer? by lazy {
    __2133643922_Interface.__2133643922_Ptr
  }


  public override val __31591340_Ptr: JNAPointer? by lazy {
    __31591340_Interface.__31591340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2133643922_Interface, __31591340_Interface)

  public constructor(discoveryType: RemoteSystemDiscoveryType) : this(ABI.activate(discoveryType))

  private fun as_2133643922(): IRemoteSystemDiscoveryTypeFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemDiscoveryTypeFilter.ABI.makeIRemoteSystemDiscoveryTypeFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemDiscoveryTypeFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemDiscoveryTypeFilter.ABI.makeIRemoteSystemDiscoveryTypeFilter(ref.value))
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
      IByReference<RemoteSystemDiscoveryTypeFilter> {
    public override fun getValue() = RemoteSystemDiscoveryTypeFilter(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemDiscoveryTypeFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemDiscoveryTypeFilter, MemoryAddress> {
    public val IRemoteSystemDiscoveryTypeFilterFactory_Instance:
        IRemoteSystemDiscoveryTypeFilterFactory by lazy {
      createIRemoteSystemDiscoveryTypeFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemDiscoveryTypeFilterFactory():
        IRemoteSystemDiscoveryTypeFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemDiscoveryTypeFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemDiscoveryTypeFilterFactory.ABI.makeIRemoteSystemDiscoveryTypeFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(discoveryType: RemoteSystemDiscoveryType): JNAPointer? =
        IRemoteSystemDiscoveryTypeFilterFactory_Instance.Create(discoveryType)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemDiscoveryTypeFilter {
      val address = segment.toRawLongValue()
      return RemoteSystemDiscoveryTypeFilter(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemDiscoveryTypeFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
