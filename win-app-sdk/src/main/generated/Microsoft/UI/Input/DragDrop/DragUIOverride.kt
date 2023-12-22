package Microsoft.UI.Input.DragDrop

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

@ABIMarker(DragUIOverride.ABI::class)
@Signature("rc(Microsoft.UI.Input.DragDrop.DragUIOverride;{8432fbac-a17f-5a95-8f56-fb432280b54d})")
@WinRTByReference(brClass = DragUIOverride.ByReference::class)
public class DragUIOverride(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragUIOverride.WithDefault, IWinRTObject {
  private val __306234268_Interface: IDragUIOverride.WithDefault by lazy {
    as_306234268()
  }


  public override val __306234268_Ptr: JNAPointer? by lazy {
    __306234268_Interface.__306234268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__306234268_Interface)

  private fun as_306234268(): IDragUIOverride.WithDefault {
    if(pointer == NULL) {
      return(IDragUIOverride.ABI.makeIDragUIOverride(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragUIOverride>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragUIOverride.ABI.makeIDragUIOverride(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DragUIOverride>
      {
    public override fun getValue() = DragUIOverride(pointer.getPointer(0))

    public fun setValue(value: DragUIOverride): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragUIOverride, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragUIOverride {
      val address = segment.toRawLongValue()
      return DragUIOverride(Pointer(address))
    }

    public override fun toNative(obj: DragUIOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
