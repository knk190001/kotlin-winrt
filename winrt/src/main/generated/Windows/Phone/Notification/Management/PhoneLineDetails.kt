package Windows.Phone.Notification.Management

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

@ABIMarker(PhoneLineDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.PhoneLineDetails;{47eb32dc-33ed-49b9-995c-a296bac82b77})")
@WinRTByReference(brClass = PhoneLineDetails.ByReference::class)
public class PhoneLineDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineDetails.WithDefault, IPhoneLineDetails2.WithDefault, IWinRTObject {
  private val __1836713710_Interface: IPhoneLineDetails.WithDefault by lazy {
    as_1836713710()
  }


  private val __1103550212_Interface: IPhoneLineDetails2.WithDefault by lazy {
    as_1103550212()
  }


  public override val __1836713710_Ptr: JNAPointer? by lazy {
    __1836713710_Interface.__1836713710_Ptr
  }


  public override val __1103550212_Ptr: JNAPointer? by lazy {
    __1103550212_Interface.__1103550212_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1836713710_Interface, __1103550212_Interface)

  private fun as_1836713710(): IPhoneLineDetails.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineDetails.ABI.makeIPhoneLineDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineDetails.ABI.makeIPhoneLineDetails(ref.value))
  }

  private fun as_1103550212(): IPhoneLineDetails2.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineDetails2.ABI.makeIPhoneLineDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineDetails2.ABI.makeIPhoneLineDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineDetails> {
    public override fun getValue() = PhoneLineDetails(pointer.getPointer(0))

    public fun setValue(value: PhoneLineDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineDetails {
      val address = segment.toRawLongValue()
      return PhoneLineDetails(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
