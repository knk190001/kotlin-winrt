package Windows.Devices.SmartCards

import Windows.Devices.SmartCards.ISmartCardAutomaticResponseApduFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(SmartCardAutomaticResponseApdu.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardAutomaticResponseApdu;{52152bab-c63e-4531-a857-d756d99b986a})")
@WinRTByReference(brClass = SmartCardAutomaticResponseApdu.ByReference::class)
public class SmartCardAutomaticResponseApdu(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardAutomaticResponseApdu.WithDefault,
    ISmartCardAutomaticResponseApdu2.WithDefault, ISmartCardAutomaticResponseApdu3.WithDefault,
    IWinRTObject {
  private val __816191194_Interface: ISmartCardAutomaticResponseApdu.WithDefault by lazy {
    as_816191194()
  }


  private val __467876812_Interface: ISmartCardAutomaticResponseApdu2.WithDefault by lazy {
    as_467876812()
  }


  private val __467876813_Interface: ISmartCardAutomaticResponseApdu3.WithDefault by lazy {
    as_467876813()
  }


  public override val __816191194_Ptr: JNAPointer? by lazy {
    __816191194_Interface.__816191194_Ptr
  }


  public override val __467876812_Ptr: JNAPointer? by lazy {
    __467876812_Interface.__467876812_Ptr
  }


  public override val __467876813_Ptr: JNAPointer? by lazy {
    __467876813_Interface.__467876813_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__816191194_Interface, __467876812_Interface, __467876813_Interface)

  public constructor(commandApdu: IBuffer, responseApdu: IBuffer) : this(ABI.activate(commandApdu,
      responseApdu))

  private fun as_816191194(): ISmartCardAutomaticResponseApdu.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAutomaticResponseApdu.ABI.makeISmartCardAutomaticResponseApdu(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAutomaticResponseApdu>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAutomaticResponseApdu.ABI.makeISmartCardAutomaticResponseApdu(ref.value))
  }

  private fun as_467876812(): ISmartCardAutomaticResponseApdu2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAutomaticResponseApdu2.ABI.makeISmartCardAutomaticResponseApdu2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAutomaticResponseApdu2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAutomaticResponseApdu2.ABI.makeISmartCardAutomaticResponseApdu2(ref.value))
  }

  private fun as_467876813(): ISmartCardAutomaticResponseApdu3.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAutomaticResponseApdu3.ABI.makeISmartCardAutomaticResponseApdu3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAutomaticResponseApdu3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAutomaticResponseApdu3.ABI.makeISmartCardAutomaticResponseApdu3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardAutomaticResponseApdu> {
    public override fun getValue() = SmartCardAutomaticResponseApdu(pointer.getPointer(0))

    public fun setValue(value: SmartCardAutomaticResponseApdu): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardAutomaticResponseApdu, MemoryAddress> {
    public val ISmartCardAutomaticResponseApduFactory_Instance:
        ISmartCardAutomaticResponseApduFactory by lazy {
      createISmartCardAutomaticResponseApduFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardAutomaticResponseApduFactory():
        ISmartCardAutomaticResponseApduFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardAutomaticResponseApdu".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISmartCardAutomaticResponseApduFactory.ABI.makeISmartCardAutomaticResponseApduFactory(factoryActivatorPtr.value))
    }

    public fun activate(commandApdu: IBuffer, responseApdu: IBuffer): JNAPointer? =
        ISmartCardAutomaticResponseApduFactory_Instance.Create(commandApdu, responseApdu)?.pointer

    public override fun fromNative(segment: MemoryAddress): SmartCardAutomaticResponseApdu {
      val address = segment.toRawLongValue()
      return SmartCardAutomaticResponseApdu(Pointer(address))
    }

    public override fun toNative(obj: SmartCardAutomaticResponseApdu): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
