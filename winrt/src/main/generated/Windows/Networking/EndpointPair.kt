package Windows.Networking

import Windows.Networking.IEndpointPairFactory.ABI.IID
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

@ABIMarker(EndpointPair.ABI::class)
@Signature("rc(Windows.Networking.EndpointPair;{33a0aa36-f8fa-4b30-b856-76517c3bd06d})")
@WinRTByReference(brClass = EndpointPair.ByReference::class)
public class EndpointPair(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEndpointPair.WithDefault, IWinRTObject {
  private val __333849639_Interface: IEndpointPair.WithDefault by lazy {
    as_333849639()
  }


  public override val __333849639_Ptr: JNAPointer? by lazy {
    __333849639_Interface.__333849639_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__333849639_Interface)

  public constructor(
    localHostName: HostName,
    localServiceName: String,
    remoteHostName: HostName,
    remoteServiceName: String
  ) : this(ABI.activate(localHostName, localServiceName, remoteHostName, remoteServiceName))

  private fun as_333849639(): IEndpointPair.WithDefault {
    if(pointer == NULL) {
      return(IEndpointPair.ABI.makeIEndpointPair(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEndpointPair>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEndpointPair.ABI.makeIEndpointPair(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<EndpointPair> {
    public override fun getValue() = EndpointPair(pointer.getPointer(0))

    public fun setValue(value: EndpointPair): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EndpointPair, MemoryAddress> {
    public val IEndpointPairFactory_Instance: IEndpointPairFactory by lazy {
      createIEndpointPairFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEndpointPairFactory(): IEndpointPairFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.EndpointPair".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEndpointPairFactory.ABI.makeIEndpointPairFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      localHostName: HostName,
      localServiceName: String,
      remoteHostName: HostName,
      remoteServiceName: String
    ): JNAPointer? = IEndpointPairFactory_Instance.CreateEndpointPair(localHostName,
        localServiceName, remoteHostName, remoteServiceName)?.pointer

    public override fun fromNative(segment: MemoryAddress): EndpointPair {
      val address = segment.toRawLongValue()
      return EndpointPair(Pointer(address))
    }

    public override fun toNative(obj: EndpointPair): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
