package Windows.Perception.Spatial.Preview

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

@ABIMarker(SpatialGraphInteropFrameOfReferencePreview.ABI::class)
@Signature("rc(Windows.Perception.Spatial.Preview.SpatialGraphInteropFrameOfReferencePreview;{a8271b23-735f-5729-a98e-e64ed189abc5})")
@WinRTByReference(brClass = SpatialGraphInteropFrameOfReferencePreview.ByReference::class)
public class SpatialGraphInteropFrameOfReferencePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialGraphInteropFrameOfReferencePreview.WithDefault, IWinRTObject {
  private val __445842519_Interface: ISpatialGraphInteropFrameOfReferencePreview.WithDefault by
      lazy {
    as_445842519()
  }


  public override val __445842519_Ptr: JNAPointer? by lazy {
    __445842519_Interface.__445842519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__445842519_Interface)

  private fun as_445842519(): ISpatialGraphInteropFrameOfReferencePreview.WithDefault {
    if(pointer == NULL) {
      return(ISpatialGraphInteropFrameOfReferencePreview.ABI.makeISpatialGraphInteropFrameOfReferencePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialGraphInteropFrameOfReferencePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialGraphInteropFrameOfReferencePreview.ABI.makeISpatialGraphInteropFrameOfReferencePreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialGraphInteropFrameOfReferencePreview> {
    public override fun getValue() =
        SpatialGraphInteropFrameOfReferencePreview(pointer.getPointer(0))

    public fun setValue(value: SpatialGraphInteropFrameOfReferencePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialGraphInteropFrameOfReferencePreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SpatialGraphInteropFrameOfReferencePreview {
      val address = segment.toRawLongValue()
      return SpatialGraphInteropFrameOfReferencePreview(Pointer(address))
    }

    public override fun toNative(obj: SpatialGraphInteropFrameOfReferencePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
