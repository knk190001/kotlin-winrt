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

@ABIMarker(SmartCard.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCard;{1b718871-6434-43f4-b55a-6a29623870aa})")
@WinRTByReference(brClass = SmartCard.ByReference::class)
public class SmartCard(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCard.WithDefault, ISmartCardConnect.WithDefault, IWinRTObject {
  private val __204168922_Interface: ISmartCard.WithDefault by lazy {
    as_204168922()
  }


  private val __2050881764_Interface: ISmartCardConnect.WithDefault by lazy {
    as_2050881764()
  }


  public override val __204168922_Ptr: JNAPointer? by lazy {
    __204168922_Interface.__204168922_Ptr
  }


  public override val __2050881764_Ptr: JNAPointer? by lazy {
    __2050881764_Interface.__2050881764_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__204168922_Interface, __2050881764_Interface)

  private fun as_204168922(): ISmartCard.WithDefault {
    if(pointer == NULL) {
      return(ISmartCard.ABI.makeISmartCard(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCard>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCard.ABI.makeISmartCard(ref.value))
  }

  private fun as_2050881764(): ISmartCardConnect.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardConnect.ABI.makeISmartCardConnect(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardConnect>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardConnect.ABI.makeISmartCardConnect(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SmartCard> {
    public override fun getValue() = SmartCard(pointer.getPointer(0))

    public fun setValue(value: SmartCard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCard, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCard {
      val address = segment.toRawLongValue()
      return SmartCard(Pointer(address))
    }

    public override fun toNative(obj: SmartCard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
