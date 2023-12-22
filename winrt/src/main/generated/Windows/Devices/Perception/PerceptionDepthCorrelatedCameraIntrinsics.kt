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

@ABIMarker(PerceptionDepthCorrelatedCameraIntrinsics.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthCorrelatedCameraIntrinsics;{6548ca01-86de-5be1-6582-807fcf4c95cf})")
@WinRTByReference(brClass = PerceptionDepthCorrelatedCameraIntrinsics.ByReference::class)
public class PerceptionDepthCorrelatedCameraIntrinsics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthCorrelatedCameraIntrinsics.WithDefault, IWinRTObject {
  private val __1858866354_Interface: IPerceptionDepthCorrelatedCameraIntrinsics.WithDefault by
      lazy {
    as_1858866354()
  }


  public override val __1858866354_Ptr: JNAPointer? by lazy {
    __1858866354_Interface.__1858866354_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1858866354_Interface)

  private fun as_1858866354(): IPerceptionDepthCorrelatedCameraIntrinsics.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthCorrelatedCameraIntrinsics.ABI.makeIPerceptionDepthCorrelatedCameraIntrinsics(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthCorrelatedCameraIntrinsics>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthCorrelatedCameraIntrinsics.ABI.makeIPerceptionDepthCorrelatedCameraIntrinsics(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthCorrelatedCameraIntrinsics> {
    public override fun getValue() =
        PerceptionDepthCorrelatedCameraIntrinsics(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthCorrelatedCameraIntrinsics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthCorrelatedCameraIntrinsics, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionDepthCorrelatedCameraIntrinsics {
      val address = segment.toRawLongValue()
      return PerceptionDepthCorrelatedCameraIntrinsics(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthCorrelatedCameraIntrinsics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
