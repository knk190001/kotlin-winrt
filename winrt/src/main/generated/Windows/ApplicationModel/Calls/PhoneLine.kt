package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneLine.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLine;{27c66f30-6a69-34ca-a2ba-65302530c311})")
@WinRTByReference(brClass = PhoneLine.ByReference::class)
public class PhoneLine(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLine.WithDefault, IPhoneLine2.WithDefault, IPhoneLine3.WithDefault,
    IWinRTObject {
  private val __1867108924_Interface: IPhoneLine.WithDefault by lazy {
    as_1867108924()
  }


  private val __2045801746_Interface: IPhoneLine2.WithDefault by lazy {
    as_2045801746()
  }


  private val __2045801745_Interface: IPhoneLine3.WithDefault by lazy {
    as_2045801745()
  }


  public override val __1867108924_Ptr: JNAPointer? by lazy {
    __1867108924_Interface.__1867108924_Ptr
  }


  public override val __2045801746_Ptr: JNAPointer? by lazy {
    __2045801746_Interface.__2045801746_Ptr
  }


  public override val __2045801745_Ptr: JNAPointer? by lazy {
    __2045801745_Interface.__2045801745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1867108924_Interface, __2045801746_Interface, __2045801745_Interface)

  private fun as_1867108924(): IPhoneLine.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLine.ABI.makeIPhoneLine(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLine>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLine.ABI.makeIPhoneLine(ref.value))
  }

  private fun as_2045801746(): IPhoneLine2.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLine2.ABI.makeIPhoneLine2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLine2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLine2.ABI.makeIPhoneLine2(ref.value))
  }

  private fun as_2045801745(): IPhoneLine3.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLine3.ABI.makeIPhoneLine3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLine3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLine3.ABI.makeIPhoneLine3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneLine> {
    public override fun getValue() = PhoneLine(pointer.getPointer(0))

    public fun setValue(value: PhoneLine): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLine, MemoryAddress> {
    public val IPhoneLineStatics_Instance: IPhoneLineStatics by lazy {
      createIPhoneLineStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneLineStatics(): IPhoneLineStatics {
      val refiid = Guid.REFIID(IPhoneLineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneLine".toHandle(),refiid,interfacePtr)
      val result = IPhoneLineStatics.ABI.makeIPhoneLineStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneLine {
      val address = segment.toRawLongValue()
      return PhoneLine(Pointer(address))
    }

    public override fun toNative(obj: PhoneLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(lineId: Guid.GUID) = ABI.IPhoneLineStatics_Instance.FromIdAsync(lineId)
  }
}
