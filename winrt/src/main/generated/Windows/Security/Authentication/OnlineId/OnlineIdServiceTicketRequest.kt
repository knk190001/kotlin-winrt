package Windows.Security.Authentication.OnlineId

import Windows.Security.Authentication.OnlineId.IOnlineIdServiceTicketRequestFactory.ABI.IID
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

@ABIMarker(OnlineIdServiceTicketRequest.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest;{297445d3-fb63-4135-8909-4e354c061466})")
@WinRTByReference(brClass = OnlineIdServiceTicketRequest.ByReference::class)
public class OnlineIdServiceTicketRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOnlineIdServiceTicketRequest.WithDefault, IWinRTObject {
  private val __585723524_Interface: IOnlineIdServiceTicketRequest.WithDefault by lazy {
    as_585723524()
  }


  public override val __585723524_Ptr: JNAPointer? by lazy {
    __585723524_Interface.__585723524_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__585723524_Interface)

  public constructor(service: String, policy: String) : this(ABI.activate(service, policy))

  public constructor(service: String) : this(ABI.activate(service))

  private fun as_585723524(): IOnlineIdServiceTicketRequest.WithDefault {
    if(pointer == NULL) {
      return(IOnlineIdServiceTicketRequest.ABI.makeIOnlineIdServiceTicketRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOnlineIdServiceTicketRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOnlineIdServiceTicketRequest.ABI.makeIOnlineIdServiceTicketRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdServiceTicketRequest> {
    public override fun getValue() = OnlineIdServiceTicketRequest(pointer.getPointer(0))

    public fun setValue(value: OnlineIdServiceTicketRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdServiceTicketRequest, MemoryAddress> {
    public val IOnlineIdServiceTicketRequestFactory_Instance: IOnlineIdServiceTicketRequestFactory
        by lazy {
      createIOnlineIdServiceTicketRequestFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOnlineIdServiceTicketRequestFactory(): IOnlineIdServiceTicketRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IOnlineIdServiceTicketRequestFactory.ABI.makeIOnlineIdServiceTicketRequestFactory(factoryActivatorPtr.value))
    }

    public fun activate(service: String, policy: String): JNAPointer? =
        IOnlineIdServiceTicketRequestFactory_Instance.CreateOnlineIdServiceTicketRequest(service,
        policy)?.pointer

    public fun activate(service: String): JNAPointer? =
        IOnlineIdServiceTicketRequestFactory_Instance.CreateOnlineIdServiceTicketRequestAdvanced(service)?.pointer

    public override fun fromNative(segment: MemoryAddress): OnlineIdServiceTicketRequest {
      val address = segment.toRawLongValue()
      return OnlineIdServiceTicketRequest(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdServiceTicketRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
