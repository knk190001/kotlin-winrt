package Windows.Networking.NetworkOperators

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

@ABIMarker(NetworkOperatorTetheringAccessPointConfiguration.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration;{0bcc0284-412e-403d-acc6-b757e34774a4})")
@WinRTByReference(brClass = NetworkOperatorTetheringAccessPointConfiguration.ByReference::class)
public class NetworkOperatorTetheringAccessPointConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorTetheringAccessPointConfiguration.WithDefault,
    INetworkOperatorTetheringAccessPointConfiguration2.WithDefault, IWinRTObject {
  private val __2117598815_Interface: INetworkOperatorTetheringAccessPointConfiguration.WithDefault
      by lazy {
    as_2117598815()
  }


  private val __1221053775_Interface: INetworkOperatorTetheringAccessPointConfiguration2.WithDefault
      by lazy {
    as_1221053775()
  }


  public override val __2117598815_Ptr: JNAPointer? by lazy {
    __2117598815_Interface.__2117598815_Ptr
  }


  public override val __1221053775_Ptr: JNAPointer? by lazy {
    __1221053775_Interface.__1221053775_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2117598815_Interface, __1221053775_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2117598815(): INetworkOperatorTetheringAccessPointConfiguration.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringAccessPointConfiguration.ABI.makeINetworkOperatorTetheringAccessPointConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringAccessPointConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringAccessPointConfiguration.ABI.makeINetworkOperatorTetheringAccessPointConfiguration(ref.value))
  }

  private fun as_1221053775(): INetworkOperatorTetheringAccessPointConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringAccessPointConfiguration2.ABI.makeINetworkOperatorTetheringAccessPointConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringAccessPointConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringAccessPointConfiguration2.ABI.makeINetworkOperatorTetheringAccessPointConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorTetheringAccessPointConfiguration> {
    public override fun getValue() =
        NetworkOperatorTetheringAccessPointConfiguration(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorTetheringAccessPointConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorTetheringAccessPointConfiguration, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.NetworkOperatorTetheringAccessPointConfiguration".toHandle(),
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
        NetworkOperatorTetheringAccessPointConfiguration {
      val address = segment.toRawLongValue()
      return NetworkOperatorTetheringAccessPointConfiguration(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorTetheringAccessPointConfiguration):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
