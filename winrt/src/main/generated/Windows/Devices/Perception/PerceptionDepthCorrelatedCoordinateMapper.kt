package Windows.Devices.Perception

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

@ABIMarker(PerceptionDepthCorrelatedCoordinateMapper.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthCorrelatedCoordinateMapper;{5b4d9d1d-b5f6-469c-b8c2-b97a45e6863b})")
@WinRTByReference(brClass = PerceptionDepthCorrelatedCoordinateMapper.ByReference::class)
public class PerceptionDepthCorrelatedCoordinateMapper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthCorrelatedCoordinateMapper.WithDefault, IWinRTObject {
  private val __2113389588_Interface: IPerceptionDepthCorrelatedCoordinateMapper.WithDefault by
      lazy {
    as_2113389588()
  }


  public override val __2113389588_Ptr: JNAPointer? by lazy {
    __2113389588_Interface.__2113389588_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2113389588_Interface)

  private fun as_2113389588(): IPerceptionDepthCorrelatedCoordinateMapper.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthCorrelatedCoordinateMapper.ABI.makeIPerceptionDepthCorrelatedCoordinateMapper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthCorrelatedCoordinateMapper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthCorrelatedCoordinateMapper.ABI.makeIPerceptionDepthCorrelatedCoordinateMapper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthCorrelatedCoordinateMapper> {
    public override fun getValue() =
        PerceptionDepthCorrelatedCoordinateMapper(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthCorrelatedCoordinateMapper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthCorrelatedCoordinateMapper, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionDepthCorrelatedCoordinateMapper {
      val address = segment.toRawLongValue()
      return PerceptionDepthCorrelatedCoordinateMapper(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthCorrelatedCoordinateMapper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
