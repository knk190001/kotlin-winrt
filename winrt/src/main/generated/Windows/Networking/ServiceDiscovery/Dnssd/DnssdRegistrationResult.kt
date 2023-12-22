package Windows.Networking.ServiceDiscovery.Dnssd

import Windows.Foundation.IStringable
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

@ABIMarker(DnssdRegistrationResult.ABI::class)
@Signature("rc(Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult;{3d786ad2-e606-5350-73ea-7e97f066162f})")
@WinRTByReference(brClass = DnssdRegistrationResult.ByReference::class)
public class DnssdRegistrationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDnssdRegistrationResult.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __2052503587_Interface: IDnssdRegistrationResult.WithDefault by lazy {
    as_2052503587()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __2052503587_Ptr: JNAPointer? by lazy {
    __2052503587_Interface.__2052503587_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2052503587_Interface, __328683030_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2052503587(): IDnssdRegistrationResult.WithDefault {
    if(pointer == NULL) {
      return(IDnssdRegistrationResult.ABI.makeIDnssdRegistrationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDnssdRegistrationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDnssdRegistrationResult.ABI.makeIDnssdRegistrationResult(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DnssdRegistrationResult> {
    public override fun getValue() = DnssdRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: DnssdRegistrationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DnssdRegistrationResult, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationResult".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DnssdRegistrationResult {
      val address = segment.toRawLongValue()
      return DnssdRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: DnssdRegistrationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
