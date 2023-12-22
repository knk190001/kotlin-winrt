package Windows.Perception.Spatial

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

@ABIMarker(SpatialLocatorAttachedFrameOfReference.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialLocatorAttachedFrameOfReference;{e1774ef6-1f4f-499c-9625-ef5e6ed7a048})")
@WinRTByReference(brClass = SpatialLocatorAttachedFrameOfReference.ByReference::class)
public class SpatialLocatorAttachedFrameOfReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialLocatorAttachedFrameOfReference.WithDefault, IWinRTObject {
  private val __1968190240_Interface: ISpatialLocatorAttachedFrameOfReference.WithDefault by lazy {
    as_1968190240()
  }


  public override val __1968190240_Ptr: JNAPointer? by lazy {
    __1968190240_Interface.__1968190240_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1968190240_Interface)

  private fun as_1968190240(): ISpatialLocatorAttachedFrameOfReference.WithDefault {
    if(pointer == NULL) {
      return(ISpatialLocatorAttachedFrameOfReference.ABI.makeISpatialLocatorAttachedFrameOfReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialLocatorAttachedFrameOfReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialLocatorAttachedFrameOfReference.ABI.makeISpatialLocatorAttachedFrameOfReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialLocatorAttachedFrameOfReference> {
    public override fun getValue() = SpatialLocatorAttachedFrameOfReference(pointer.getPointer(0))

    public fun setValue(value: SpatialLocatorAttachedFrameOfReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialLocatorAttachedFrameOfReference, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialLocatorAttachedFrameOfReference {
      val address = segment.toRawLongValue()
      return SpatialLocatorAttachedFrameOfReference(Pointer(address))
    }

    public override fun toNative(obj: SpatialLocatorAttachedFrameOfReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
