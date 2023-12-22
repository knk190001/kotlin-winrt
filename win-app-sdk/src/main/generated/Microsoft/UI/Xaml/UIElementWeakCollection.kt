package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IUIElementWeakCollectionFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(UIElementWeakCollection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.UIElementWeakCollection;pinterface({913337e9-11a1-4345-a3a2-4e7f956e222d};rc(Microsoft.UI.Xaml.UIElement;{c3c01020-320c-5cf6-9d24-d396bbfa4d8b})))")
@WinRTByReference(brClass = UIElementWeakCollection.ByReference::class)
public open class UIElementWeakCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVector<UIElement?>, IIterable<UIElement?>, IWinRTObject {
  private val __1070388601_Interface: IVector<UIElement?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<UIElement?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<UIElement?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<UIElement?>>()

  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

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
      IByReference<UIElementWeakCollection> {
    public override fun getValue() = UIElementWeakCollection(pointer.getPointer(0))

    public fun setValue(value: UIElementWeakCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIElementWeakCollection, MemoryAddress> {
    public val IUIElementWeakCollectionFactory_Instance: IUIElementWeakCollectionFactory by lazy {
      createIUIElementWeakCollectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUIElementWeakCollectionFactory(): IUIElementWeakCollectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.UIElementWeakCollection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUIElementWeakCollectionFactory.ABI.makeIUIElementWeakCollectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IUIElementWeakCollectionFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): UIElementWeakCollection {
      val address = segment.toRawLongValue()
      return UIElementWeakCollection(Pointer(address))
    }

    public override fun toNative(obj: UIElementWeakCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
