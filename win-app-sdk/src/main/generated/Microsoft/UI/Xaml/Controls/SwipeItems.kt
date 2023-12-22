package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISwipeItemsFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(SwipeItems.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SwipeItems;{40d3022b-c82b-5565-a4e4-ad9d7a66b1a9})")
@WinRTByReference(brClass = SwipeItems.ByReference::class)
public open class SwipeItems(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISwipeItems.WithDefault, IVector<SwipeItem?>, IIterable<SwipeItem?>,
    IWinRTObject {
  private val __454447699_Interface: ISwipeItems.WithDefault by lazy {
    as_454447699()
  }


  private val __1070388601_Interface: IVector<SwipeItem?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<SwipeItem?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<SwipeItem?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<SwipeItem?>>()

  public override val __454447699_Ptr: JNAPointer? by lazy {
    __454447699_Interface.__454447699_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__454447699_Interface, __1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_454447699(): ISwipeItems.WithDefault {
    if(pointer == NULL) {
      return(ISwipeItems.ABI.makeISwipeItems(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeItems>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeItems.ABI.makeISwipeItems(ref.value))
  }

  private fun as_1070388601(): IVector<SwipeItem?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<SwipeItem?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<SwipeItem?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<SwipeItem?>(ref.value))
  }

  private fun as_1449643190(): IIterable<SwipeItem?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<SwipeItem?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<SwipeItem?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<SwipeItem?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SwipeItems> {
    public override fun getValue() = SwipeItems(pointer.getPointer(0))

    public fun setValue(value: SwipeItems): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeItems, MemoryAddress> {
    public val ISwipeItemsStatics_Instance: ISwipeItemsStatics by lazy {
      createISwipeItemsStatics()
    }


    public val ISwipeItemsFactory_Instance: ISwipeItemsFactory by lazy {
      createISwipeItemsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISwipeItemsStatics(): ISwipeItemsStatics {
      val refiid = Guid.REFIID(ISwipeItemsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwipeItems".toHandle(),refiid,interfacePtr)
      val result = ISwipeItemsStatics.ABI.makeISwipeItemsStatics(interfacePtr.value)
      return result
    }

    public fun createISwipeItemsFactory(): ISwipeItemsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SwipeItems".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISwipeItemsFactory.ABI.makeISwipeItemsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISwipeItemsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SwipeItems {
      val address = segment.toRawLongValue()
      return SwipeItems(Pointer(address))
    }

    public override fun toNative(obj: SwipeItems): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ModeProperty() = ABI.ISwipeItemsStatics_Instance.get_ModeProperty()
  }
}
