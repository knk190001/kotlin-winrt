package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.UIElement
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(UIElementCollection.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.UIElementCollection;{d6602d54-88f6-43f6-85d8-a9d914a6dd3b})")
@WinRTByReference(brClass = UIElementCollection.ByReference::class)
public class UIElementCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUIElementCollection.WithDefault, IVector<UIElement?>, IIterable<UIElement?>,
    IWinRTObject {
  private val __1912151306_Interface: IUIElementCollection.WithDefault by lazy {
    as_1912151306()
  }


  private val __1070388601_Interface: IVector<UIElement?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<UIElement?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<UIElement?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<UIElement?>>()

  public override val __1912151306_Ptr: JNAPointer? by lazy {
    __1912151306_Interface.__1912151306_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1912151306_Interface, __1070388601_Interface, __1449643190_Interface)

  private fun as_1912151306(): IUIElementCollection.WithDefault {
    if(pointer == NULL) {
      return(IUIElementCollection.ABI.makeIUIElementCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIElementCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIElementCollection.ABI.makeIUIElementCollection(ref.value))
  }

  private fun as_1070388601(): IVector<UIElement?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<UIElement?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<UIElement?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<UIElement?>(ref.value))
  }

  private fun as_1449643190(): IIterable<UIElement?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<UIElement?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<UIElement?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<UIElement?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UIElementCollection> {
    public override fun getValue() = UIElementCollection(pointer.getPointer(0))

    public fun setValue(value: UIElementCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIElementCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UIElementCollection {
      val address = segment.toRawLongValue()
      return UIElementCollection(Pointer(address))
    }

    public override fun toNative(obj: UIElementCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
