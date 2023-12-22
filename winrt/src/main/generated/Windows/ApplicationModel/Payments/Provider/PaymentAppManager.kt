package Windows.ApplicationModel.Payments.Provider

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

@ABIMarker(PaymentAppManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Payments.Provider.PaymentAppManager;{0e47aa53-8521-4969-a957-df2538a3a98f})")
@WinRTByReference(brClass = PaymentAppManager.ByReference::class)
public class PaymentAppManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPaymentAppManager.WithDefault, IWinRTObject {
  private val __2079169071_Interface: IPaymentAppManager.WithDefault by lazy {
    as_2079169071()
  }


  public override val __2079169071_Ptr: JNAPointer? by lazy {
    __2079169071_Interface.__2079169071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2079169071_Interface)

  private fun as_2079169071(): IPaymentAppManager.WithDefault {
    if(pointer == NULL) {
      return(IPaymentAppManager.ABI.makeIPaymentAppManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPaymentAppManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPaymentAppManager.ABI.makeIPaymentAppManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PaymentAppManager> {
    public override fun getValue() = PaymentAppManager(pointer.getPointer(0))

    public fun setValue(value: PaymentAppManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PaymentAppManager, MemoryAddress> {
    public val IPaymentAppManagerStatics_Instance: IPaymentAppManagerStatics by lazy {
      createIPaymentAppManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPaymentAppManagerStatics(): IPaymentAppManagerStatics {
      val refiid = Guid.REFIID(IPaymentAppManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Payments.Provider.PaymentAppManager".toHandle(),refiid,interfacePtr)
      val result = IPaymentAppManagerStatics.ABI.makeIPaymentAppManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PaymentAppManager {
      val address = segment.toRawLongValue()
      return PaymentAppManager(Pointer(address))
    }

    public override fun toNative(obj: PaymentAppManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IPaymentAppManagerStatics_Instance.get_Current()
  }
}
