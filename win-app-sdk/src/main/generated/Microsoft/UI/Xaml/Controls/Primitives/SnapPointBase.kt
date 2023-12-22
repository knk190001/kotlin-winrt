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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SnapPointBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.SnapPointBase;{14ed1089-fb97-5211-8c45-c352cd8b96a1})")
@WinRTByReference(brClass = SnapPointBase.ByReference::class)
public open class SnapPointBase(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISnapPointBase.WithDefault, IWinRTObject {
  private val __1283094310_Interface: ISnapPointBase.WithDefault by lazy {
    as_1283094310()
  }


  public override val __1283094310_Ptr: JNAPointer? by lazy {
    __1283094310_Interface.__1283094310_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1283094310_Interface)

  private fun as_1283094310(): ISnapPointBase.WithDefault {
    if(pointer == NULL) {
      return(ISnapPointBase.ABI.makeISnapPointBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISnapPointBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISnapPointBase.ABI.makeISnapPointBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SnapPointBase>
      {
    public override fun getValue() = SnapPointBase(pointer.getPointer(0))

    public fun setValue(value: SnapPointBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SnapPointBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SnapPointBase {
      val address = segment.toRawLongValue()
      return SnapPointBase(Pointer(address))
    }

    public override fun toNative(obj: SnapPointBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
