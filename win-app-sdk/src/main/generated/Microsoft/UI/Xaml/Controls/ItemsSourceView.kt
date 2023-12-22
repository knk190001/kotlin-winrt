package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IItemsSourceViewFactory.ABI.IID
import Microsoft.UI.Xaml.Interop.INotifyCollectionChanged
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ItemsSourceView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ItemsSourceView;{f7f802de-e79c-5c5f-abf8-ccbd486b89d6})")
@WinRTByReference(brClass = ItemsSourceView.ByReference::class)
public open class ItemsSourceView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemsSourceView.WithDefault, INotifyCollectionChanged.WithDefault,
    IWinRTObject {
  private val __1678422169_Interface: IItemsSourceView.WithDefault by lazy {
    as_1678422169()
  }


  private val __1276419701_Interface: INotifyCollectionChanged.WithDefault by lazy {
    as_1276419701()
  }


  public override val __1678422169_Ptr: JNAPointer? by lazy {
    __1678422169_Interface.__1678422169_Ptr
  }


  public override val __1276419701_Ptr: JNAPointer? by lazy {
    __1276419701_Interface.__1276419701_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1678422169_Interface, __1276419701_Interface)

  public constructor(source: IUnknown) : this(ABI.activate(source))

  private fun as_1678422169(): IItemsSourceView.WithDefault {
    if(pointer == NULL) {
      return(IItemsSourceView.ABI.makeIItemsSourceView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsSourceView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsSourceView.ABI.makeIItemsSourceView(ref.value))
  }

  private fun as_1276419701(): INotifyCollectionChanged.WithDefault {
    if(pointer == NULL) {
      return(INotifyCollectionChanged.ABI.makeINotifyCollectionChanged(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotifyCollectionChanged>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotifyCollectionChanged.ABI.makeINotifyCollectionChanged(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsSourceView> {
    public override fun getValue() = ItemsSourceView(pointer.getPointer(0))

    public fun setValue(value: ItemsSourceView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsSourceView, MemoryAddress> {
    public val IItemsSourceViewFactory_Instance: IItemsSourceViewFactory by lazy {
      createIItemsSourceViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIItemsSourceViewFactory(): IItemsSourceViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ItemsSourceView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IItemsSourceViewFactory.ABI.makeIItemsSourceViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(source: IUnknown): JNAPointer? =
        IItemsSourceViewFactory_Instance.CreateInstance(source, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ItemsSourceView {
      val address = segment.toRawLongValue()
      return ItemsSourceView(Pointer(address))
    }

    public override fun toNative(obj: ItemsSourceView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
