package Microsoft.UI.Xaml.Controls.Primitives

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ZoomSnapPointBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ZoomSnapPointBase;{c6d08756-0860-5c2d-abec-6eb4aa4b53d7})")
@WinRTByReference(brClass = ZoomSnapPointBase.ByReference::class)
public open class ZoomSnapPointBase(
  ptr: JNAPointer? = NULL
) : SnapPointBase(ptr), IZoomSnapPointBase.WithDefault, IWinRTObject {
  private val __1995592339_Interface: IZoomSnapPointBase.WithDefault by lazy {
    as_1995592339()
  }


  public override val __1995592339_Ptr: JNAPointer? by lazy {
    __1995592339_Interface.__1995592339_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1995592339_Interface)

  private fun as_1995592339(): IZoomSnapPointBase.WithDefault {
    if(pointer == NULL) {
      return(IZoomSnapPointBase.ABI.makeIZoomSnapPointBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IZoomSnapPointBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IZoomSnapPointBase.ABI.makeIZoomSnapPointBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ZoomSnapPointBase> {
    public override fun getValue() = ZoomSnapPointBase(pointer.getPointer(0))

    public fun setValue(value: ZoomSnapPointBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ZoomSnapPointBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ZoomSnapPointBase {
      val address = segment.toRawLongValue()
      return ZoomSnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: ZoomSnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
