package Windows.Networking.NetworkOperators

import Windows.Networking.NetworkOperators.IMobileBroadbandModemIsolationFactory.ABI.IID
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

@ABIMarker(MobileBroadbandModemIsolation.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandModemIsolation;{b5618fec-e661-4330-9bb4-3480212ec354})")
@WinRTByReference(brClass = MobileBroadbandModemIsolation.ByReference::class)
public class MobileBroadbandModemIsolation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandModemIsolation.WithDefault, IWinRTObject {
  private val __1706382336_Interface: IMobileBroadbandModemIsolation.WithDefault by lazy {
    as_1706382336()
  }


  public override val __1706382336_Ptr: JNAPointer? by lazy {
    __1706382336_Interface.__1706382336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1706382336_Interface)

  public constructor(modemDeviceId: String, ruleGroupId: String) : this(ABI.activate(modemDeviceId,
      ruleGroupId))

  private fun as_1706382336(): IMobileBroadbandModemIsolation.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModemIsolation.ABI.makeIMobileBroadbandModemIsolation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModemIsolation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModemIsolation.ABI.makeIMobileBroadbandModemIsolation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandModemIsolation> {
    public override fun getValue() = MobileBroadbandModemIsolation(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandModemIsolation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandModemIsolation, MemoryAddress> {
    public val IMobileBroadbandModemIsolationFactory_Instance: IMobileBroadbandModemIsolationFactory
        by lazy {
      createIMobileBroadbandModemIsolationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMobileBroadbandModemIsolationFactory():
        IMobileBroadbandModemIsolationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.MobileBroadbandModemIsolation".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMobileBroadbandModemIsolationFactory.ABI.makeIMobileBroadbandModemIsolationFactory(factoryActivatorPtr.value))
    }

    public fun activate(modemDeviceId: String, ruleGroupId: String): JNAPointer? =
        IMobileBroadbandModemIsolationFactory_Instance.Create(modemDeviceId, ruleGroupId)?.pointer

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandModemIsolation {
      val address = segment.toRawLongValue()
      return MobileBroadbandModemIsolation(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandModemIsolation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
