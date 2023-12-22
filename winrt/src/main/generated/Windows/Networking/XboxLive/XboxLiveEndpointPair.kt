package Windows.Networking.XboxLive

import Windows.Networking.HostName
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XboxLiveEndpointPair.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveEndpointPair;{1e9a839b-813e-44e0-b87f-c87a093475e4})")
@WinRTByReference(brClass = XboxLiveEndpointPair.ByReference::class)
public class XboxLiveEndpointPair(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveEndpointPair.WithDefault, IWinRTObject {
  private val __249610071_Interface: IXboxLiveEndpointPair.WithDefault by lazy {
    as_249610071()
  }


  public override val __249610071_Ptr: JNAPointer? by lazy {
    __249610071_Interface.__249610071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__249610071_Interface)

  private fun as_249610071(): IXboxLiveEndpointPair.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveEndpointPair.ABI.makeIXboxLiveEndpointPair(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveEndpointPair>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveEndpointPair.ABI.makeIXboxLiveEndpointPair(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveEndpointPair> {
    public override fun getValue() = XboxLiveEndpointPair(pointer.getPointer(0))

    public fun setValue(value: XboxLiveEndpointPair): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveEndpointPair, MemoryAddress> {
    public val IXboxLiveEndpointPairStatics_Instance: IXboxLiveEndpointPairStatics by lazy {
      createIXboxLiveEndpointPairStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXboxLiveEndpointPairStatics(): IXboxLiveEndpointPairStatics {
      val refiid = Guid.REFIID(IXboxLiveEndpointPairStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.XboxLive.XboxLiveEndpointPair".toHandle(),refiid,interfacePtr)
      val result =
          IXboxLiveEndpointPairStatics.ABI.makeIXboxLiveEndpointPairStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XboxLiveEndpointPair {
      val address = segment.toRawLongValue()
      return XboxLiveEndpointPair(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveEndpointPair): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindEndpointPairBySocketAddressBytes(localSocketAddress: Array<Byte>,
        remoteSocketAddress: Array<Byte>) =
        ABI.IXboxLiveEndpointPairStatics_Instance.FindEndpointPairBySocketAddressBytes(localSocketAddress,
        remoteSocketAddress)

    public fun FindEndpointPairByHostNamesAndPorts(
      localHostName: HostName,
      localPort: String,
      remoteHostName: HostName,
      remotePort: String
    ) = ABI.IXboxLiveEndpointPairStatics_Instance.FindEndpointPairByHostNamesAndPorts(localHostName,
        localPort, remoteHostName, remotePort)
  }
}
