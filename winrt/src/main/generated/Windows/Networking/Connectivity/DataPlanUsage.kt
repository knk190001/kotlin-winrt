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

@ABIMarker(DataPlanUsage.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.DataPlanUsage;{b921492d-3b44-47ff-b361-be59e69ed1b0})")
@WinRTByReference(brClass = DataPlanUsage.ByReference::class)
public class DataPlanUsage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPlanUsage.WithDefault, IWinRTObject {
  private val __1891965707_Interface: IDataPlanUsage.WithDefault by lazy {
    as_1891965707()
  }


  public override val __1891965707_Ptr: JNAPointer? by lazy {
    __1891965707_Interface.__1891965707_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1891965707_Interface)

  private fun as_1891965707(): IDataPlanUsage.WithDefault {
    if(pointer == NULL) {
      return(IDataPlanUsage.ABI.makeIDataPlanUsage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPlanUsage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPlanUsage.ABI.makeIDataPlanUsage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataPlanUsage>
      {
    public override fun getValue() = DataPlanUsage(pointer.getPointer(0))

    public fun setValue(value: DataPlanUsage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPlanUsage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataPlanUsage {
      val address = segment.toRawLongValue()
      return DataPlanUsage(Pointer(address))
    }

    public override fun toNative(obj: DataPlanUsage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
