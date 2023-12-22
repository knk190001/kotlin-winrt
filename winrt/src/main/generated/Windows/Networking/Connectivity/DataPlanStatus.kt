package Windows.Networking.Connectivity

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

@ABIMarker(DataPlanStatus.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.DataPlanStatus;{977a8b8c-3885-40f3-8851-42cd2bd568bb})")
@WinRTByReference(brClass = DataPlanStatus.ByReference::class)
public class DataPlanStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPlanStatus.WithDefault, IWinRTObject {
  private val __1534926904_Interface: IDataPlanStatus.WithDefault by lazy {
    as_1534926904()
  }


  public override val __1534926904_Ptr: JNAPointer? by lazy {
    __1534926904_Interface.__1534926904_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1534926904_Interface)

  private fun as_1534926904(): IDataPlanStatus.WithDefault {
    if(pointer == NULL) {
      return(IDataPlanStatus.ABI.makeIDataPlanStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPlanStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPlanStatus.ABI.makeIDataPlanStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataPlanStatus>
      {
    public override fun getValue() = DataPlanStatus(pointer.getPointer(0))

    public fun setValue(value: DataPlanStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPlanStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataPlanStatus {
      val address = segment.toRawLongValue()
      return DataPlanStatus(Pointer(address))
    }

    public override fun toNative(obj: DataPlanStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
