package Windows.System.RemoteSystems

import Windows.Security.Credentials.WebAccount
import Windows.System.RemoteSystems.IRemoteSystemWebAccountFilterFactory.ABI.IID
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

@ABIMarker(RemoteSystemWebAccountFilter.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemWebAccountFilter;{3fb75873-87c8-5d8f-977e-f69f96d67238})")
@WinRTByReference(brClass = RemoteSystemWebAccountFilter.ByReference::class)
public class RemoteSystemWebAccountFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemWebAccountFilter.WithDefault, IRemoteSystemFilter.WithDefault,
    IWinRTObject {
  private val __1475532731_Interface: IRemoteSystemWebAccountFilter.WithDefault by lazy {
    as_1475532731()
  }


  private val __31591340_Interface: IRemoteSystemFilter.WithDefault by lazy {
    as_31591340()
  }


  public override val __1475532731_Ptr: JNAPointer? by lazy {
    __1475532731_Interface.__1475532731_Ptr
  }


  public override val __31591340_Ptr: JNAPointer? by lazy {
    __31591340_Interface.__31591340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1475532731_Interface, __31591340_Interface)

  public constructor(account: WebAccount) : this(ABI.activate(account))

  private fun as_1475532731(): IRemoteSystemWebAccountFilter.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemWebAccountFilter.ABI.makeIRemoteSystemWebAccountFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemWebAccountFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemWebAccountFilter.ABI.makeIRemoteSystemWebAccountFilter(ref.value))
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
      IByReference<RemoteSystemWebAccountFilter> {
    public override fun getValue() = RemoteSystemWebAccountFilter(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemWebAccountFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemWebAccountFilter, MemoryAddress> {
    public val IRemoteSystemWebAccountFilterFactory_Instance: IRemoteSystemWebAccountFilterFactory
        by lazy {
      createIRemoteSystemWebAccountFilterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRemoteSystemWebAccountFilterFactory(): IRemoteSystemWebAccountFilterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteSystems.RemoteSystemWebAccountFilter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRemoteSystemWebAccountFilterFactory.ABI.makeIRemoteSystemWebAccountFilterFactory(factoryActivatorPtr.value))
    }

    public fun activate(account: WebAccount): JNAPointer? =
        IRemoteSystemWebAccountFilterFactory_Instance.Create(account)?.pointer

    public override fun fromNative(segment: MemoryAddress): RemoteSystemWebAccountFilter {
      val address = segment.toRawLongValue()
      return RemoteSystemWebAccountFilter(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemWebAccountFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
