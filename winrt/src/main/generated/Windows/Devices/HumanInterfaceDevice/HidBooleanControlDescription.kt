package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidBooleanControlDescription.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidBooleanControlDescription;{6196e543-29d8-4a2a-8683-849e207bbe31})")
@WinRTByReference(brClass = HidBooleanControlDescription.ByReference::class)
public class HidBooleanControlDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidBooleanControlDescription.WithDefault,
    IHidBooleanControlDescription2.WithDefault, IWinRTObject {
  private val __894711727_Interface: IHidBooleanControlDescription.WithDefault by lazy {
    as_894711727()
  }


  private val __1966259811_Interface: IHidBooleanControlDescription2.WithDefault by lazy {
    as_1966259811()
  }


  public override val __894711727_Ptr: JNAPointer? by lazy {
    __894711727_Interface.__894711727_Ptr
  }


  public override val __1966259811_Ptr: JNAPointer? by lazy {
    __1966259811_Interface.__1966259811_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__894711727_Interface, __1966259811_Interface)

  private fun as_894711727(): IHidBooleanControlDescription.WithDefault {
    if(pointer == NULL) {
      return(IHidBooleanControlDescription.ABI.makeIHidBooleanControlDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidBooleanControlDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidBooleanControlDescription.ABI.makeIHidBooleanControlDescription(ref.value))
  }

  private fun as_1966259811(): IHidBooleanControlDescription2.WithDefault {
    if(pointer == NULL) {
      return(IHidBooleanControlDescription2.ABI.makeIHidBooleanControlDescription2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidBooleanControlDescription2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidBooleanControlDescription2.ABI.makeIHidBooleanControlDescription2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidBooleanControlDescription> {
    public override fun getValue() = HidBooleanControlDescription(pointer.getPointer(0))

    public fun setValue(value: HidBooleanControlDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidBooleanControlDescription, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidBooleanControlDescription {
      val address = segment.toRawLongValue()
      return HidBooleanControlDescription(Pointer(address))
    }

    public override fun toNative(obj: HidBooleanControlDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
