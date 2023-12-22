package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardAppletIdGroupRegistration.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardAppletIdGroupRegistration;{df1208d1-31bb-5596-43b1-6d69a0257b3a})")
@WinRTByReference(brClass = SmartCardAppletIdGroupRegistration.ByReference::class)
public class SmartCardAppletIdGroupRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardAppletIdGroupRegistration.WithDefault,
    ISmartCardAppletIdGroupRegistration2.WithDefault, IWinRTObject {
  private val __1363637315_Interface: ISmartCardAppletIdGroupRegistration.WithDefault by lazy {
    as_1363637315()
  }


  private val __676916245_Interface: ISmartCardAppletIdGroupRegistration2.WithDefault by lazy {
    as_676916245()
  }


  public override val __1363637315_Ptr: JNAPointer? by lazy {
    __1363637315_Interface.__1363637315_Ptr
  }


  public override val __676916245_Ptr: JNAPointer? by lazy {
    __676916245_Interface.__676916245_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1363637315_Interface, __676916245_Interface)

  private fun as_1363637315(): ISmartCardAppletIdGroupRegistration.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAppletIdGroupRegistration.ABI.makeISmartCardAppletIdGroupRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAppletIdGroupRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAppletIdGroupRegistration.ABI.makeISmartCardAppletIdGroupRegistration(ref.value))
  }

  private fun as_676916245(): ISmartCardAppletIdGroupRegistration2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAppletIdGroupRegistration2.ABI.makeISmartCardAppletIdGroupRegistration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAppletIdGroupRegistration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAppletIdGroupRegistration2.ABI.makeISmartCardAppletIdGroupRegistration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardAppletIdGroupRegistration> {
    public override fun getValue() = SmartCardAppletIdGroupRegistration(pointer.getPointer(0))

    public fun setValue(value: SmartCardAppletIdGroupRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardAppletIdGroupRegistration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardAppletIdGroupRegistration {
      val address = segment.toRawLongValue()
      return SmartCardAppletIdGroupRegistration(Pointer(address))
    }

    public override fun toNative(obj: SmartCardAppletIdGroupRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
