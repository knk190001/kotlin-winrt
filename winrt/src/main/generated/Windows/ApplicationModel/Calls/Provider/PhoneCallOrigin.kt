package Windows.ApplicationModel.Calls.Provider

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

@ABIMarker(PhoneCallOrigin.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.Provider.PhoneCallOrigin;{20613479-0ef9-4454-871c-afb66a14b6a5})")
@WinRTByReference(brClass = PhoneCallOrigin.ByReference::class)
public class PhoneCallOrigin(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallOrigin.WithDefault, IPhoneCallOrigin2.WithDefault,
    IPhoneCallOrigin3.WithDefault, IWinRTObject {
  private val __1700495613_Interface: IPhoneCallOrigin.WithDefault by lazy {
    as_1700495613()
  }


  private val __1175756501_Interface: IPhoneCallOrigin2.WithDefault by lazy {
    as_1175756501()
  }


  private val __1175756502_Interface: IPhoneCallOrigin3.WithDefault by lazy {
    as_1175756502()
  }


  public override val __1700495613_Ptr: JNAPointer? by lazy {
    __1700495613_Interface.__1700495613_Ptr
  }


  public override val __1175756501_Ptr: JNAPointer? by lazy {
    __1175756501_Interface.__1175756501_Ptr
  }


  public override val __1175756502_Ptr: JNAPointer? by lazy {
    __1175756502_Interface.__1175756502_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1700495613_Interface, __1175756501_Interface, __1175756502_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1700495613(): IPhoneCallOrigin.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallOrigin.ABI.makeIPhoneCallOrigin(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallOrigin>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallOrigin.ABI.makeIPhoneCallOrigin(ref.value))
  }

  private fun as_1175756501(): IPhoneCallOrigin2.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallOrigin2.ABI.makeIPhoneCallOrigin2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallOrigin2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallOrigin2.ABI.makeIPhoneCallOrigin2(ref.value))
  }

  private fun as_1175756502(): IPhoneCallOrigin3.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallOrigin3.ABI.makeIPhoneCallOrigin3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallOrigin3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallOrigin3.ABI.makeIPhoneCallOrigin3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallOrigin> {
    public override fun getValue() = PhoneCallOrigin(pointer.getPointer(0))

    public fun setValue(value: PhoneCallOrigin): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallOrigin, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.Provider.PhoneCallOrigin".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PhoneCallOrigin {
      val address = segment.toRawLongValue()
      return PhoneCallOrigin(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallOrigin): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
