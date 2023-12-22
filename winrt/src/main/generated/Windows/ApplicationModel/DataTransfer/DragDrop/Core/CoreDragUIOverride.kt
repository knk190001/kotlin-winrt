package Windows.ApplicationModel.DataTransfer.DragDrop.Core

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

@ABIMarker(CoreDragUIOverride.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragUIOverride;{89a85064-3389-4f4f-8897-7e8a3ffb3c93})")
@WinRTByReference(brClass = CoreDragUIOverride.ByReference::class)
public class CoreDragUIOverride(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreDragUIOverride.WithDefault, IWinRTObject {
  private val __527783871_Interface: ICoreDragUIOverride.WithDefault by lazy {
    as_527783871()
  }


  public override val __527783871_Ptr: JNAPointer? by lazy {
    __527783871_Interface.__527783871_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__527783871_Interface)

  private fun as_527783871(): ICoreDragUIOverride.WithDefault {
    if(pointer == NULL) {
      return(ICoreDragUIOverride.ABI.makeICoreDragUIOverride(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDragUIOverride>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDragUIOverride.ABI.makeICoreDragUIOverride(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreDragUIOverride> {
    public override fun getValue() = CoreDragUIOverride(pointer.getPointer(0))

    public fun setValue(value: CoreDragUIOverride): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreDragUIOverride, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreDragUIOverride {
      val address = segment.toRawLongValue()
      return CoreDragUIOverride(Pointer(address))
    }

    public override fun toNative(obj: CoreDragUIOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
