package Windows.Media.Protection.PlayReady

import Windows.Media.Protection.IMediaProtectionServiceRequest
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

@ABIMarker(PlayReadyIndividualizationServiceRequest.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyIndividualizationServiceRequest;{21f5a86b-008c-4611-ab2f-aaa6c69f0e24})")
@WinRTByReference(brClass = PlayReadyIndividualizationServiceRequest.ByReference::class)
public class PlayReadyIndividualizationServiceRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyIndividualizationServiceRequest.WithDefault,
    IPlayReadyServiceRequest.WithDefault, IMediaProtectionServiceRequest.WithDefault, IWinRTObject {
  private val __1165043248_Interface: IPlayReadyIndividualizationServiceRequest.WithDefault by
      lazy {
    as_1165043248()
  }


  private val __573428623_Interface: IPlayReadyServiceRequest.WithDefault by lazy {
    as_573428623()
  }


  private val __454607004_Interface: IMediaProtectionServiceRequest.WithDefault by lazy {
    as_454607004()
  }


  public override val __1165043248_Ptr: JNAPointer? by lazy {
    __1165043248_Interface.__1165043248_Ptr
  }


  public override val __573428623_Ptr: JNAPointer? by lazy {
    __573428623_Interface.__573428623_Ptr
  }


  public override val __454607004_Ptr: JNAPointer? by lazy {
    __454607004_Interface.__454607004_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1165043248_Interface, __573428623_Interface, __454607004_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1165043248(): IPlayReadyIndividualizationServiceRequest.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyIndividualizationServiceRequest.ABI.makeIPlayReadyIndividualizationServiceRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyIndividualizationServiceRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyIndividualizationServiceRequest.ABI.makeIPlayReadyIndividualizationServiceRequest(ref.value))
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
      IByReference<PlayReadyIndividualizationServiceRequest> {
    public override fun getValue() = PlayReadyIndividualizationServiceRequest(pointer.getPointer(0))

    public fun setValue(value: PlayReadyIndividualizationServiceRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyIndividualizationServiceRequest, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyIndividualizationServiceRequest".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        PlayReadyIndividualizationServiceRequest {
      val address = segment.toRawLongValue()
      return PlayReadyIndividualizationServiceRequest(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyIndividualizationServiceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
