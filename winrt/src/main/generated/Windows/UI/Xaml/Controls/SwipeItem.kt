package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ISwipeItemFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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
import kotlin.reflect.typeOf

@ABIMarker(SwipeItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SwipeItem;{836edadc-45c8-4a00-90a0-7107fa894a1b})")
@WinRTByReference(brClass = SwipeItem.ByReference::class)
public open class SwipeItem(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISwipeItem.WithDefault, IWinRTObject {
  private val __728070959_Interface: ISwipeItem.WithDefault by lazy {
    as_728070959()
  }


  public override val __728070959_Ptr: JNAPointer? by lazy {
    __728070959_Interface.__728070959_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__728070959_Interface)

  public constructor() : this(ABI.activate())

  private fun as_728070959(): ISwipeItem.WithDefault {
    if(pointer == NULL) {
      return(ISwipeItem.ABI.makeISwipeItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeItem.ABI.makeISwipeItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SwipeItem> {
    public override fun getValue() = SwipeItem(pointer.getPointer(0))

    public fun setValue(value: SwipeItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeItem, MemoryAddress> {
    public val ISwipeItemStatics_Instance: ISwipeItemStatics by lazy {
      createISwipeItemStatics()
    }


    public val ISwipeItemFactory_Instance: ISwipeItemFactory by lazy {
      createISwipeItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISwipeItemStatics(): ISwipeItemStatics {
      val refiid = Guid.REFIID(ISwipeItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SwipeItem".toHandle(),refiid,interfacePtr)
      val result = ISwipeItemStatics.ABI.makeISwipeItemStatics(interfacePtr.value)
      return result
    }

    public fun createISwipeItemFactory(): ISwipeItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SwipeItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISwipeItemFactory.ABI.makeISwipeItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISwipeItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SwipeItem {
      val address = segment.toRawLongValue()
      return SwipeItem(Pointer(address))
    }

    public override fun toNative(obj: SwipeItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconSourceProperty() = ABI.ISwipeItemStatics_Instance.get_IconSourceProperty()

    public fun get_TextProperty() = ABI.ISwipeItemStatics_Instance.get_TextProperty()

    public fun get_BackgroundProperty() = ABI.ISwipeItemStatics_Instance.get_BackgroundProperty()

    public fun get_ForegroundProperty() = ABI.ISwipeItemStatics_Instance.get_ForegroundProperty()

    public fun get_CommandProperty() = ABI.ISwipeItemStatics_Instance.get_CommandProperty()

    public fun get_CommandParameterProperty() =
        ABI.ISwipeItemStatics_Instance.get_CommandParameterProperty()

    public fun get_BehaviorOnInvokedProperty() =
        ABI.ISwipeItemStatics_Instance.get_BehaviorOnInvokedProperty()
  }
}
