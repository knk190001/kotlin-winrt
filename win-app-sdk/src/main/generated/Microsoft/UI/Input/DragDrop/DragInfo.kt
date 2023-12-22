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

@ABIMarker(DragInfo.ABI::class)
@Signature("rc(Microsoft.UI.Input.DragDrop.DragInfo;{7507d891-62a8-5a79-a880-ac7353d001ec})")
@WinRTByReference(brClass = DragInfo.ByReference::class)
public class DragInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragInfo.WithDefault, IWinRTObject {
  private val __38606102_Interface: IDragInfo.WithDefault by lazy {
    as_38606102()
  }


  public override val __38606102_Ptr: JNAPointer? by lazy {
    __38606102_Interface.__38606102_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__38606102_Interface)

  private fun as_38606102(): IDragInfo.WithDefault {
    if(pointer == NULL) {
      return(IDragInfo.ABI.makeIDragInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragInfo.ABI.makeIDragInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DragInfo> {
    public override fun getValue() = DragInfo(pointer.getPointer(0))

    public fun setValue(value: DragInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragInfo {
      val address = segment.toRawLongValue()
      return DragInfo(Pointer(address))
    }

    public override fun toNative(obj: DragInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
