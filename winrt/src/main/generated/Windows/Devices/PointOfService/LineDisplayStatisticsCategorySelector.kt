package Windows.Devices.PointOfService

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

@ABIMarker(LineDisplayStatisticsCategorySelector.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayStatisticsCategorySelector;{b521c46b-9274-4d24-94f3-b6017b832444})")
@WinRTByReference(brClass = LineDisplayStatisticsCategorySelector.ByReference::class)
public class LineDisplayStatisticsCategorySelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayStatisticsCategorySelector.WithDefault, IWinRTObject {
  private val __1796589745_Interface: ILineDisplayStatisticsCategorySelector.WithDefault by lazy {
    as_1796589745()
  }


  public override val __1796589745_Ptr: JNAPointer? by lazy {
    __1796589745_Interface.__1796589745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1796589745_Interface)

  private fun as_1796589745(): ILineDisplayStatisticsCategorySelector.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayStatisticsCategorySelector.ABI.makeILineDisplayStatisticsCategorySelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayStatisticsCategorySelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayStatisticsCategorySelector.ABI.makeILineDisplayStatisticsCategorySelector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayStatisticsCategorySelector> {
    public override fun getValue() = LineDisplayStatisticsCategorySelector(pointer.getPointer(0))

    public fun setValue(value: LineDisplayStatisticsCategorySelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayStatisticsCategorySelector, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayStatisticsCategorySelector {
      val address = segment.toRawLongValue()
      return LineDisplayStatisticsCategorySelector(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayStatisticsCategorySelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
