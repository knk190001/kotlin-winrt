package Windows.Web.Syndication

import Windows.Security.Credentials.PasswordCredential
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SyndicationClient.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationClient;{9e18a9b7-7249-4b45-b229-7df895a5a1f5})")
@WinRTByReference(brClass = SyndicationClient.ByReference::class)
public class SyndicationClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationClient.WithDefault, IWinRTObject {
  private val __796507003_Interface: ISyndicationClient.WithDefault by lazy {
    as_796507003()
  }


  public override val __796507003_Ptr: JNAPointer? by lazy {
    __796507003_Interface.__796507003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__796507003_Interface)

  public constructor() : this(ABI.activate())

  public constructor(serverCredential: PasswordCredential) : this(ABI.activate(serverCredential))

  private fun as_796507003(): ISyndicationClient.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationClient.ABI.makeISyndicationClient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationClient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationClient.ABI.makeISyndicationClient(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SyndicationClient> {
    public override fun getValue() = SyndicationClient(pointer.getPointer(0))

    public fun setValue(value: SyndicationClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationClient, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationClientFactory_Instance: ISyndicationClientFactory by lazy {
      createISyndicationClientFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationClient".toHandle(),
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

    public fun createISyndicationClientFactory(): ISyndicationClientFactory {
      val refiid = Guid.REFIID(ISyndicationClientFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationClient".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationClientFactory.ABI.makeISyndicationClientFactory(factoryActivatorPtr.value))
    }

    public fun activate(serverCredential: PasswordCredential): JNAPointer? =
        ISyndicationClientFactory_Instance.CreateSyndicationClient(serverCredential)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationClient {
      val address = segment.toRawLongValue()
      return SyndicationClient(Pointer(address))
    }

    public override fun toNative(obj: SyndicationClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
