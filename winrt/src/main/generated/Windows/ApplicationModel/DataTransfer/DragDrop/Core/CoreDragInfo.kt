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

@ABIMarker(CoreDragInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DragDrop.Core.CoreDragInfo;{48353a8b-cb50-464e-9575-cd4e3a7ab028})")
@WinRTByReference(brClass = CoreDragInfo.ByReference::class)
public class CoreDragInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreDragInfo.WithDefault, ICoreDragInfo2.WithDefault, IWinRTObject {
  private val __1344639153_Interface: ICoreDragInfo.WithDefault by lazy {
    as_1344639153()
  }


  private val __1265859267_Interface: ICoreDragInfo2.WithDefault by lazy {
    as_1265859267()
  }


  public override val __1344639153_Ptr: JNAPointer? by lazy {
    __1344639153_Interface.__1344639153_Ptr
  }


  public override val __1265859267_Ptr: JNAPointer? by lazy {
    __1265859267_Interface.__1265859267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1344639153_Interface, __1265859267_Interface)

  private fun as_1344639153(): ICoreDragInfo.WithDefault {
    if(pointer == NULL) {
      return(ICoreDragInfo.ABI.makeICoreDragInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDragInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDragInfo.ABI.makeICoreDragInfo(ref.value))
  }

  private fun as_1265859267(): ICoreDragInfo2.WithDefault {
    if(pointer == NULL) {
      return(ICoreDragInfo2.ABI.makeICoreDragInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDragInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDragInfo2.ABI.makeICoreDragInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreDragInfo> {
    public override fun getValue() = CoreDragInfo(pointer.getPointer(0))

    public fun setValue(value: CoreDragInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreDragInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreDragInfo {
      val address = segment.toRawLongValue()
      return CoreDragInfo(Pointer(address))
    }

    public override fun toNative(obj: CoreDragInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
