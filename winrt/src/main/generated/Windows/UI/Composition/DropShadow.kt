package Windows.UI.Composition

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
@Signature("rc(Windows.UI.Composition.DropShadow;{cb977c07-a154-4851-85e7-a8924c84fad8})")
@WinRTByReference(brClass = DropShadow.ByReference::class)
public class DropShadow(
  ptr: JNAPointer? = NULL
) : CompositionShadow(ptr), IDropShadow.WithDefault, IDropShadow2.WithDefault, IWinRTObject {
  private val __1560873757_Interface: IDropShadow.WithDefault by lazy {
    as_1560873757()
  }


  private val __1142446261_Interface: IDropShadow2.WithDefault by lazy {
    as_1142446261()
  }


  public override val __1560873757_Ptr: JNAPointer? by lazy {
    __1560873757_Interface.__1560873757_Ptr
  }


  public override val __1142446261_Ptr: JNAPointer? by lazy {
    __1142446261_Interface.__1142446261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1560873757_Interface, __1142446261_Interface)

  private fun as_1560873757(): IDropShadow.WithDefault {
    if(pointer == NULL) {
      return(IDropShadow.ABI.makeIDropShadow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropShadow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropShadow.ABI.makeIDropShadow(ref.value))
  }

  private fun as_1142446261(): IDropShadow2.WithDefault {
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
