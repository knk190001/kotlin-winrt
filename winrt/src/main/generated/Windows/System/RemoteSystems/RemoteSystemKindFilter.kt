package Windows.System.RemoteSystems

import Windows.Foundation.Collections.IIterable
import Windows.System.RemoteSystems.IRemoteSystemKindFilterFactory.ABI.IID
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

@ABIMarker(RemoteSystemKindFilter.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemKindFilter;{38e1c9ec-22c3-4ef6-901a-bbb1c7aad4ed})")
@WinRTByReference(brClass = RemoteSystemKindFilter.ByReference::class)
public class RemoteSystemKindFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemKindFilter.WithDefault, IRemoteSystemFilter.WithDefault,
    IWinRTObject {
  private val __151520672_Interface: IRemoteSystemKindFilter.WithDefault by lazy {
    as_151520672()
  }


  private val __31591340_Interface: IRemoteSystemFilter.WithDefault by lazy {
    as_31591340()
  }


  public override val __151520672_Ptr: JNAPointer? by lazy {
    __151520672_Interface.__151520672_Ptr
  }


  public override val __31591340_Ptr: JNAPointer? by lazy {
    __31591340_Interface.__31591340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__151520672_Interface, __31591340_Interface)

  public constructor(remoteSystemKinds: IIterable<String?>) : this(ABI.activate(remoteSystemKinds))

  private fun as_151520672(): IRemoteSystemKindFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemKindFilter.ABI.makeIRemoteSystemKindFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemKindFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemKindFilter.ABI.makeIRemoteSystemKindFilter(ref.value))
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
      IByReference<RemoteSystemKindFilter> {
    public override fun getValue() = RemoteSystemKindFilter(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemKindFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemKindFilter, MemoryAddress> {
    public val IRemoteSystemKindFilterFactory_Instance: IRemoteSystemKindFilterFactory by lazy {
      createIRemoteSystemKindFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemKindFilterFactory(): IRemoteSystemKindFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemKindFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemKindFilterFactory.ABI.makeIRemoteSystemKindFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(remoteSystemKinds: IIterable<String?>): JNAPointer? =
        IRemoteSystemKindFilterFactory_Instance.Create(remoteSystemKinds)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemKindFilter {
      val address = segment.toRawLongValue()
      return RemoteSystemKindFilter(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemKindFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
