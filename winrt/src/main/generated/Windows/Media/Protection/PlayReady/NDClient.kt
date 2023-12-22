package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.PlayReady.INDClientFactory.ABI.IID
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

@ABIMarker(NDClient.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.NDClient;{3bd6781b-61b8-46e2-99a5-8abcb6b9f7d6})")
@WinRTByReference(brClass = NDClient.ByReference::class)
public class NDClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INDClient.WithDefault, IWinRTObject {
  private val __1508994821_Interface: INDClient.WithDefault by lazy {
    as_1508994821()
  }


  public override val __1508994821_Ptr: JNAPointer? by lazy {
    __1508994821_Interface.__1508994821_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1508994821_Interface)

  public constructor(
    downloadEngine: INDDownloadEngine,
    streamParser: INDStreamParser,
    pMessenger: INDMessenger
  ) : this(ABI.activate(downloadEngine, streamParser, pMessenger))

  private fun as_1508994821(): INDClient.WithDefault {
    if(pointer == NULL) {
      return(INDClient.ABI.makeINDClient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INDClient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INDClient.ABI.makeINDClient(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NDClient> {
    public override fun getValue() = NDClient(pointer.getPointer(0))

    public fun setValue(value: NDClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NDClient, MemoryAddress> {
    public val INDClientFactory_Instance: INDClientFactory by lazy {
      createINDClientFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINDClientFactory(): INDClientFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.NDClient".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INDClientFactory.ABI.makeINDClientFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      downloadEngine: INDDownloadEngine,
      streamParser: INDStreamParser,
      pMessenger: INDMessenger
    ): JNAPointer? = INDClientFactory_Instance.CreateInstance(downloadEngine, streamParser,
        pMessenger)?.pointer

    public override fun fromNative(segment: MemoryAddress): NDClient {
      val address = segment.toRawLongValue()
      return NDClient(Pointer(address))
    }

    public override fun toNative(obj: NDClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
