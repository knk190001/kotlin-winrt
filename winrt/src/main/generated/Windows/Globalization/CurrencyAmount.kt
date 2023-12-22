package Windows.Globalization

import Windows.Globalization.ICurrencyAmountFactory.ABI.IID
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

@ABIMarker(CurrencyAmount.ABI::class)
@Signature("rc(Windows.Globalization.CurrencyAmount;{74b49942-eb75-443a-95b3-7d723f56f93c})")
@WinRTByReference(brClass = CurrencyAmount.ByReference::class)
public class CurrencyAmount(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrencyAmount.WithDefault, IWinRTObject {
  private val __1609794884_Interface: ICurrencyAmount.WithDefault by lazy {
    as_1609794884()
  }


  public override val __1609794884_Ptr: JNAPointer? by lazy {
    __1609794884_Interface.__1609794884_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1609794884_Interface)

  public constructor(amount: String, currency: String) : this(ABI.activate(amount, currency))

  private fun as_1609794884(): ICurrencyAmount.WithDefault {
    if(pointer == NULL) {
      return(ICurrencyAmount.ABI.makeICurrencyAmount(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrencyAmount>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrencyAmount.ABI.makeICurrencyAmount(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CurrencyAmount>
      {
    public override fun getValue() = CurrencyAmount(pointer.getPointer(0))

    public fun setValue(value: CurrencyAmount): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrencyAmount, MemoryAddress> {
    public val ICurrencyAmountFactory_Instance: ICurrencyAmountFactory by lazy {
      createICurrencyAmountFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICurrencyAmountFactory(): ICurrencyAmountFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CurrencyAmount".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICurrencyAmountFactory.ABI.makeICurrencyAmountFactory(factoryActivatorPtr.value))
    }

    public fun activate(amount: String, currency: String): JNAPointer? =
        ICurrencyAmountFactory_Instance.Create(amount, currency)?.pointer

    public override fun fromNative(segment: MemoryAddress): CurrencyAmount {
      val address = segment.toRawLongValue()
      return CurrencyAmount(Pointer(address))
    }

    public override fun toNative(obj: CurrencyAmount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
