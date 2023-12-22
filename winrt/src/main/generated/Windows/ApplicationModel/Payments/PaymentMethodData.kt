package Windows.ApplicationModel.Payments

import Windows.ApplicationModel.Payments.IPaymentMethodDataFactory.ABI.IID
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

@ABIMarker(PaymentMethodData.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.PaymentMethodData;{d1d3caf4-de98-4129-b1b7-c3ad86237bf4})")
@WinRTByReference(brClass = PaymentMethodData.ByReference::class)
public class PaymentMethodData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentMethodData.WithDefault, IWinRTObject {
  private val __17426497_Interface: IPaymentMethodData.WithDefault by lazy {
    as_17426497()
  }


  public override val __17426497_Ptr: JNAPointer? by lazy {
    __17426497_Interface.__17426497_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__17426497_Interface)

  public constructor(supportedMethodIds: IIterable<String?>) :
      this(ABI.activate(supportedMethodIds))

  public constructor(supportedMethodIds: IIterable<String?>, jsonData: String) :
      this(ABI.activate(supportedMethodIds, jsonData))

  private fun as_17426497(): IPaymentMethodData.WithDefault {
    if(pointer == NULL) {
      return(IPaymentMethodData.ABI.makeIPaymentMethodData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentMethodData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentMethodData.ABI.makeIPaymentMethodData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentMethodData> {
    public override fun getValue() = PaymentMethodData(pointer.getPointer(0))

    public fun setValue(value: PaymentMethodData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentMethodData, MemoryAddress> {
    public val IPaymentMethodDataFactory_Instance: IPaymentMethodDataFactory by lazy {
      createIPaymentMethodDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentMethodDataFactory(): IPaymentMethodDataFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.PaymentMethodData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPaymentMethodDataFactory.ABI.makeIPaymentMethodDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(supportedMethodIds: IIterable<String?>): JNAPointer? =
        IPaymentMethodDataFactory_Instance.Create(supportedMethodIds)?.pointer

    public fun activate(supportedMethodIds: IIterable<String?>, jsonData: String): JNAPointer? =
        IPaymentMethodDataFactory_Instance.CreateWithJsonData(supportedMethodIds, jsonData)?.pointer

    public override fun fromNative(segment: MemoryAddress): PaymentMethodData {
      val address = segment.toRawLongValue()
      return PaymentMethodData(Pointer(address))
    }

    public override fun toNative(obj: PaymentMethodData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
