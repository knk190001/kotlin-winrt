package Windows.System.RemoteSystems

import Windows.System.RemoteSystems.IRemoteSystemStatusTypeFilterFactory.ABI.IID
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

@ABIMarker(RemoteSystemStatusTypeFilter.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter;{0c39514e-cbb6-4777-8534-2e0c521affa2})")
@WinRTByReference(brClass = RemoteSystemStatusTypeFilter.ByReference::class)
public class RemoteSystemStatusTypeFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemStatusTypeFilter.WithDefault, IRemoteSystemFilter.WithDefault,
    IWinRTObject {
  private val __608036888_Interface: IRemoteSystemStatusTypeFilter.WithDefault by lazy {
    as_608036888()
  }


  private val __31591340_Interface: IRemoteSystemFilter.WithDefault by lazy {
    as_31591340()
  }


  public override val __608036888_Ptr: JNAPointer? by lazy {
    __608036888_Interface.__608036888_Ptr
  }


  public override val __31591340_Ptr: JNAPointer? by lazy {
    __31591340_Interface.__31591340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__608036888_Interface, __31591340_Interface)

  public constructor(remoteSystemStatusType: RemoteSystemStatusType) :
      this(ABI.activate(remoteSystemStatusType))

  private fun as_608036888(): IRemoteSystemStatusTypeFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemStatusTypeFilter.ABI.makeIRemoteSystemStatusTypeFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemStatusTypeFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemStatusTypeFilter.ABI.makeIRemoteSystemStatusTypeFilter(ref.value))
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
      IByReference<RemoteSystemStatusTypeFilter> {
    public override fun getValue() = RemoteSystemStatusTypeFilter(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemStatusTypeFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemStatusTypeFilter, MemoryAddress> {
    public val IRemoteSystemStatusTypeFilterFactory_Instance: IRemoteSystemStatusTypeFilterFactory
        by lazy {
      createIRemoteSystemStatusTypeFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemStatusTypeFilterFactory(): IRemoteSystemStatusTypeFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemStatusTypeFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemStatusTypeFilterFactory.ABI.makeIRemoteSystemStatusTypeFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(remoteSystemStatusType: RemoteSystemStatusType): JNAPointer? =
        IRemoteSystemStatusTypeFilterFactory_Instance.Create(remoteSystemStatusType)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemStatusTypeFilter {
      val address = segment.toRawLongValue()
      return RemoteSystemStatusTypeFilter(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemStatusTypeFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
