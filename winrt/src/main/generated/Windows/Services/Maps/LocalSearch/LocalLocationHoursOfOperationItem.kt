package Windows.Services.Maps.LocalSearch

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

@ABIMarker(LocalLocationHoursOfOperationItem.ABI::class)
@Signature("rc(Windows.Services.Maps.LocalSearch.LocalLocationHoursOfOperationItem;{23548c72-a1c7-43f1-a4f0-1091c39ec640})")
@WinRTByReference(brClass = LocalLocationHoursOfOperationItem.ByReference::class)
public class LocalLocationHoursOfOperationItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILocalLocationHoursOfOperationItem.WithDefault, IWinRTObject {
  private val __1485566452_Interface: ILocalLocationHoursOfOperationItem.WithDefault by lazy {
    as_1485566452()
  }


  public override val __1485566452_Ptr: JNAPointer? by lazy {
    __1485566452_Interface.__1485566452_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1485566452_Interface)

  private fun as_1485566452(): ILocalLocationHoursOfOperationItem.WithDefault {
    if(pointer == NULL) {
      return(ILocalLocationHoursOfOperationItem.ABI.makeILocalLocationHoursOfOperationItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalLocationHoursOfOperationItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalLocationHoursOfOperationItem.ABI.makeILocalLocationHoursOfOperationItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalLocationHoursOfOperationItem> {
    public override fun getValue() = LocalLocationHoursOfOperationItem(pointer.getPointer(0))

    public fun setValue(value: LocalLocationHoursOfOperationItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalLocationHoursOfOperationItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LocalLocationHoursOfOperationItem {
      val address = segment.toRawLongValue()
      return LocalLocationHoursOfOperationItem(Pointer(address))
    }

    public override fun toNative(obj: LocalLocationHoursOfOperationItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
