package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentDetailsModifierFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(PaymentDetailsModifier.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentDetailsModifier;{be1c7d65-4323-41d7-b305-dfcb765f69de})")
@WinRTByReference(brClass = PaymentDetailsModifier.ByReference::class)
public class PaymentDetailsModifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentDetailsModifier.WithDefault, IWinRTObject {
  private val __1411045413_Interface: IPaymentDetailsModifier.WithDefault by lazy {
    as_1411045413()
  }


  public override val __1411045413_Ptr: JNAPointer? by lazy {
    __1411045413_Interface.__1411045413_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1411045413_Interface)

  public constructor(supportedMethodIds: IIterable<String?>, total: PaymentItem) :
      this(ABI.activate(supportedMethodIds, total))

  public constructor(
    supportedMethodIds: IIterable<String?>,
    total: PaymentItem,
    additionalDisplayItems: IIterable<PaymentItem?>
  ) : this(ABI.activate(supportedMethodIds, total, additionalDisplayItems))

  public constructor(
    supportedMethodIds: IIterable<String?>,
    total: PaymentItem,
    additionalDisplayItems: IIterable<PaymentItem?>,
    jsonData: String
  ) : this(ABI.activate(supportedMethodIds, total, additionalDisplayItems, jsonData))

  private fun as_1411045413(): IPaymentDetailsModifier.WithDefault {
    if(pointer == NULL) {
      return(IPaymentDetailsModifier.ABI.makeIPaymentDetailsModifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentDetailsModifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentDetailsModifier.ABI.makeIPaymentDetailsModifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentDetailsModifier> {
    public override fun getValue() = PaymentDetailsModifier(pointer.getPointer(0))

    public fun setValue(value: PaymentDetailsModifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentDetailsModifier, MemoryAddress> {
    public val IPaymentDetailsModifierFactory_Instance: IPaymentDetailsModifierFactory by lazy {
      createIPaymentDetailsModifierFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentDetailsModifierFactory(): IPaymentDetailsModifierFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentDetailsModifier".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentDetailsModifierFactory.ABI.makeIPaymentDetailsModifierFactory(factoryActivatorPtr.value))
    }

    public fun activate(supportedMethodIds: IIterable<String?>, total: PaymentItem): JNAPointer? =
        IPaymentDetailsModifierFactory_Instance.Create(supportedMethodIds, total)?.pointer

    public fun activate(
      supportedMethodIds: IIterable<String?>,
      total: PaymentItem,
      additionalDisplayItems: IIterable<PaymentItem?>
    ): JNAPointer? =
        IPaymentDetailsModifierFactory_Instance.CreateWithAdditionalDisplayItems(supportedMethodIds,
        total, additionalDisplayItems)?.pointer

    public fun activate(
      supportedMethodIds: IIterable<String?>,
      total: PaymentItem,
      additionalDisplayItems: IIterable<PaymentItem?>,
      jsonData: String
    ): JNAPointer? =
        IPaymentDetailsModifierFactory_Instance.CreateWithAdditionalDisplayItemsAndJsonData(supportedMethodIds,
        total, additionalDisplayItems, jsonData)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentDetailsModifier {
      val address = segment.toRawLongValue()
      return PaymentDetailsModifier(Pointer(address))
    }

    public override fun toNative(obj: PaymentDetailsModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
