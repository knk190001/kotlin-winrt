package Windows.Devices.Sms

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

@ABIMarker(SmsTextMessage2.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsTextMessage2;{22a0d893-4555-4755-b5a1-e7fd84955f8d})")
@WinRTByReference(brClass = SmsTextMessage2.ByReference::class)
public class SmsTextMessage2(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsTextMessage2.WithDefault, ISmsMessageBase.WithDefault, IWinRTObject {
  private val __197043525_Interface: ISmsTextMessage2.WithDefault by lazy {
    as_197043525()
  }


  private val __1120832021_Interface: ISmsMessageBase.WithDefault by lazy {
    as_1120832021()
  }


  public override val __197043525_Ptr: JNAPointer? by lazy {
    __197043525_Interface.__197043525_Ptr
  }


  public override val __1120832021_Ptr: JNAPointer? by lazy {
    __1120832021_Interface.__1120832021_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__197043525_Interface, __1120832021_Interface)

  public constructor() : this(ABI.activate())

  private fun as_197043525(): ISmsTextMessage2.WithDefault {
    if(pointer == NULL) {
      return(ISmsTextMessage2.ABI.makeISmsTextMessage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsTextMessage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsTextMessage2.ABI.makeISmsTextMessage2(ref.value))
  }

  private fun as_1120832021(): ISmsMessageBase.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageBase.ABI.makeISmsMessageBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageBase.ABI.makeISmsMessageBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsTextMessage2> {
    public override fun getValue() = SmsTextMessage2(pointer.getPointer(0))

    public fun setValue(value: SmsTextMessage2): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsTextMessage2, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsTextMessage2".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SmsTextMessage2 {
      val address = segment.toRawLongValue()
      return SmsTextMessage2(Pointer(address))
    }

    public override fun toNative(obj: SmsTextMessage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
