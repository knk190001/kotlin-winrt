package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
import Windows.Media.Protection.PlayReady.IPlayReadySecureStopServiceRequestFactory.ABI.IID
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlayReadySecureStopServiceRequest.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest;{b5501ee5-01bf-4401-9677-05630a6a4cc8})")
@WinRTByReference(brClass = PlayReadySecureStopServiceRequest.ByReference::class)
public class PlayReadySecureStopServiceRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadySecureStopServiceRequest.WithDefault,
    IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault, IWinRTObject {
  private val __810857928_Interface: IPlayReadySecureStopServiceRequest.WithDefault by lazy {
    as_810857928()
  }


  private val __573428623_Interface: IPlayReadyServiceRequest.WithDefault by lazy {
    as_573428623()
  }


  private val __454607004_Interface: IMediaProtectionServiceRequest.WithDefault by lazy {
    as_454607004()
  }


  public override val __810857928_Ptr: JNAPointer? by lazy {
    __810857928_Interface.__810857928_Ptr
  }


  public override val __573428623_Ptr: JNAPointer? by lazy {
    __573428623_Interface.__573428623_Ptr
  }


  public override val __454607004_Ptr: JNAPointer? by lazy {
    __454607004_Interface.__454607004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__810857928_Interface, __573428623_Interface, __454607004_Interface)

  public constructor(publisherCertBytes: Array<Byte>) : this(ABI.activate(publisherCertBytes))

  public constructor(sessionID: Guid.GUID, publisherCertBytes: Array<Byte>) :
      this(ABI.activate(sessionID, publisherCertBytes))

  private fun as_810857928(): IPlayReadySecureStopServiceRequest.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadySecureStopServiceRequest.ABI.makeIPlayReadySecureStopServiceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadySecureStopServiceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadySecureStopServiceRequest.ABI.makeIPlayReadySecureStopServiceRequest(ref.value))
  }

  private fun as_573428623(): IPlayReadyServiceRequest.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyServiceRequest.ABI.makeIPlayReadyServiceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyServiceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyServiceRequest.ABI.makeIPlayReadyServiceRequest(ref.value))
  }

  private fun as_454607004(): IMediaProtectionServiceRequest.WithDefault {
    if(pointer == NULL) {
      return(IMediaProtectionServiceRequest.ABI.makeIMediaProtectionServiceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProtectionServiceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProtectionServiceRequest.ABI.makeIMediaProtectionServiceRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadySecureStopServiceRequest> {
    public override fun getValue() = PlayReadySecureStopServiceRequest(pointer.getPointer(0))

    public fun setValue(value: PlayReadySecureStopServiceRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadySecureStopServiceRequest, MemoryAddress> {
    public val IPlayReadySecureStopServiceRequestFactory_Instance:
        IPlayReadySecureStopServiceRequestFactory by lazy {
      createIPlayReadySecureStopServiceRequestFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlayReadySecureStopServiceRequestFactory():
        IPlayReadySecureStopServiceRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlayReadySecureStopServiceRequestFactory.ABI.makeIPlayReadySecureStopServiceRequestFactory(factoryActivatorPtr.value))
    }

    public fun activate(publisherCertBytes: Array<Byte>): JNAPointer? =
        IPlayReadySecureStopServiceRequestFactory_Instance.CreateInstance(publisherCertBytes)?.pointer

    public fun activate(sessionID: Guid.GUID, publisherCertBytes: Array<Byte>): JNAPointer? =
        IPlayReadySecureStopServiceRequestFactory_Instance.CreateInstanceFromSessionID(sessionID,
        publisherCertBytes)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlayReadySecureStopServiceRequest {
      val address = segment.toRawLongValue()
      return PlayReadySecureStopServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: PlayReadySecureStopServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
