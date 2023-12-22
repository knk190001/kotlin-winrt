package Windows.Devices.Sms

import Windows.Devices.Sms.ISmsFilterRuleFactory.ABI.IID
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

@ABIMarker(SmsFilterRule.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsFilterRule;{40e32fae-b049-4fbc-afe9-e2a610eff55c})")
@WinRTByReference(brClass = SmsFilterRule.ByReference::class)
public class SmsFilterRule(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsFilterRule.WithDefault, IWinRTObject {
  private val __1071311297_Interface: ISmsFilterRule.WithDefault by lazy {
    as_1071311297()
  }


  public override val __1071311297_Ptr: JNAPointer? by lazy {
    __1071311297_Interface.__1071311297_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1071311297_Interface)

  public constructor(messageType: SmsMessageType) : this(ABI.activate(messageType))

  private fun as_1071311297(): ISmsFilterRule.WithDefault {
    if(pointer == NULL) {
      return(ISmsFilterRule.ABI.makeISmsFilterRule(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsFilterRule>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsFilterRule.ABI.makeISmsFilterRule(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SmsFilterRule>
      {
    public override fun getValue() = SmsFilterRule(pointer.getPointer(0))

    public fun setValue(value: SmsFilterRule): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsFilterRule, MemoryAddress> {
    public val ISmsFilterRuleFactory_Instance: ISmsFilterRuleFactory by lazy {
      createISmsFilterRuleFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmsFilterRuleFactory(): ISmsFilterRuleFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsFilterRule".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISmsFilterRuleFactory.ABI.makeISmsFilterRuleFactory(factoryActivatorPtr.value))
    }

    public fun activate(messageType: SmsMessageType): JNAPointer? =
        ISmsFilterRuleFactory_Instance.CreateFilterRule(messageType)?.pointer

    public override fun fromNative(segment: MemoryAddress): SmsFilterRule {
      val address = segment.toRawLongValue()
      return SmsFilterRule(Pointer(address))
    }

    public override fun toNative(obj: SmsFilterRule): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
