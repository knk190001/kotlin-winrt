package Microsoft.UI.Composition

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

@ABIMarker(DropShadow.ABI::class)
@Signature("rc(Microsoft.UI.Composition.DropShadow;{977095d2-265f-5f58-9789-cb7f85e98c9e})")
@WinRTByReference(brClass = DropShadow.ByReference::class)
public class DropShadow(
  ptr: JNAPointer? = NULL
) : CompositionShadow(ptr), IDropShadow.WithDefault, IDropShadow2.WithDefault, IWinRTObject {
  private val __1753719240_Interface: IDropShadow.WithDefault by lazy {
    as_1753719240()
  }


  private val __1469278358_Interface: IDropShadow2.WithDefault by lazy {
    as_1469278358()
  }


  public override val __1753719240_Ptr: JNAPointer? by lazy {
    __1753719240_Interface.__1753719240_Ptr
  }


  public override val __1469278358_Ptr: JNAPointer? by lazy {
    __1469278358_Interface.__1469278358_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1753719240_Interface, __1469278358_Interface)

  private fun as_1753719240(): IDropShadow.WithDefault {
    if(pointer == NULL) {
      return(IDropShadow.ABI.makeIDropShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropShadow.ABI.makeIDropShadow(ref.value))
  }

  private fun as_1469278358(): IDropShadow2.WithDefault {
    if(pointer == NULL) {
      return(IDropShadow2.ABI.makeIDropShadow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropShadow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropShadow2.ABI.makeIDropShadow2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DropShadow> {
    public override fun getValue() = DropShadow(pointer.getPointer(0))

    public fun setValue(value: DropShadow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropShadow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DropShadow {
      val address = segment.toRawLongValue()
      return DropShadow(Pointer(address))
    }

    public override fun toNative(obj: DropShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
