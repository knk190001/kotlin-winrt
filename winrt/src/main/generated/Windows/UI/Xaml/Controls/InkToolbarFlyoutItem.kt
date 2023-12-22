package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarFlyoutItemFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.ButtonBase
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

@ABIMarker(InkToolbarFlyoutItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarFlyoutItem;{92b68786-37ee-4915-9e89-e187564a889a})")
@WinRTByReference(brClass = InkToolbarFlyoutItem.ByReference::class)
public open class InkToolbarFlyoutItem(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IInkToolbarFlyoutItem.WithDefault, IWinRTObject {
  private val __446311329_Interface: IInkToolbarFlyoutItem.WithDefault by lazy {
    as_446311329()
  }


  public override val __446311329_Ptr: JNAPointer? by lazy {
    __446311329_Interface.__446311329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__446311329_Interface)

  public constructor() : this(ABI.activate())

  private fun as_446311329(): IInkToolbarFlyoutItem.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarFlyoutItem.ABI.makeIInkToolbarFlyoutItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarFlyoutItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarFlyoutItem.ABI.makeIInkToolbarFlyoutItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarFlyoutItem> {
    public override fun getValue() = InkToolbarFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: InkToolbarFlyoutItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarFlyoutItem, MemoryAddress> {
    public val IInkToolbarFlyoutItemStatics_Instance: IInkToolbarFlyoutItemStatics by lazy {
      createIInkToolbarFlyoutItemStatics()
    }


    public val IInkToolbarFlyoutItemFactory_Instance: IInkToolbarFlyoutItemFactory by lazy {
      createIInkToolbarFlyoutItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarFlyoutItemStatics(): IInkToolbarFlyoutItemStatics {
      val refiid = Guid.REFIID(IInkToolbarFlyoutItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarFlyoutItem".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarFlyoutItemStatics.ABI.makeIInkToolbarFlyoutItemStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarFlyoutItemFactory(): IInkToolbarFlyoutItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarFlyoutItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarFlyoutItemFactory.ABI.makeIInkToolbarFlyoutItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInkToolbarFlyoutItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarFlyoutItem {
      val address = segment.toRawLongValue()
      return InkToolbarFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KindProperty() = ABI.IInkToolbarFlyoutItemStatics_Instance.get_KindProperty()

    public fun get_IsCheckedProperty() =
        ABI.IInkToolbarFlyoutItemStatics_Instance.get_IsCheckedProperty()
  }
}
