package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(Layout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Layout;{24e50c1c-9c51-5144-9ddc-3f500191c262})")
@WinRTByReference(brClass = Layout.ByReference::class)
public open class Layout(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ILayout.WithDefault, ILayout2.WithDefault, ILayoutProtected.WithDefault,
    ILayoutProtected2.WithDefault, ILayoutOverrides.WithDefault, IWinRTObject {
  private val __2142431311_Interface: ILayout.WithDefault by lazy {
    as_2142431311()
  }


  private val __1990861151_Interface: ILayout2.WithDefault by lazy {
    as_1990861151()
  }


  private val __1500547837_Interface: ILayoutProtected.WithDefault by lazy {
    as_1500547837()
  }


  private val __727657259_Interface: ILayoutProtected2.WithDefault by lazy {
    as_727657259()
  }


  private val __1359117686_Interface: ILayoutOverrides.WithDefault by lazy {
    as_1359117686()
  }


  public override val __2142431311_Ptr: JNAPointer? by lazy {
    __2142431311_Interface.__2142431311_Ptr
  }


  public override val __1990861151_Ptr: JNAPointer? by lazy {
    __1990861151_Interface.__1990861151_Ptr
  }


  public override val __1500547837_Ptr: JNAPointer? by lazy {
    __1500547837_Interface.__1500547837_Ptr
  }


  public override val __727657259_Ptr: JNAPointer? by lazy {
    __727657259_Interface.__727657259_Ptr
  }


  public override val __1359117686_Ptr: JNAPointer? by lazy {
    __1359117686_Interface.__1359117686_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2142431311_Interface, __1990861151_Interface, __1500547837_Interface,
        __727657259_Interface, __1359117686_Interface)

  private fun as_2142431311(): ILayout.WithDefault {
    if(pointer == NULL) {
      return(ILayout.ABI.makeILayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayout.ABI.makeILayout(ref.value))
  }

  private fun as_1990861151(): ILayout2.WithDefault {
    if(pointer == NULL) {
      return(ILayout2.ABI.makeILayout2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayout2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayout2.ABI.makeILayout2(ref.value))
  }

  private fun as_1500547837(): ILayoutProtected.WithDefault {
    if(pointer == NULL) {
      return(ILayoutProtected.ABI.makeILayoutProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayoutProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayoutProtected.ABI.makeILayoutProtected(ref.value))
  }

  private fun as_727657259(): ILayoutProtected2.WithDefault {
    if(pointer == NULL) {
      return(ILayoutProtected2.ABI.makeILayoutProtected2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayoutProtected2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayoutProtected2.ABI.makeILayoutProtected2(ref.value))
  }

  private fun as_1359117686(): ILayoutOverrides.WithDefault {
    if(pointer == NULL) {
      return(ILayoutOverrides.ABI.makeILayoutOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILayoutOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILayoutOverrides.ABI.makeILayoutOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Layout> {
    public override fun getValue() = Layout(pointer.getPointer(0))

    public fun setValue(value: Layout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Layout, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Layout {
      val address = segment.toRawLongValue()
      return Layout(Pointer(address))
    }

    public override fun toNative(obj: Layout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
