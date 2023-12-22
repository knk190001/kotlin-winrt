package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IToggleMenuFlyoutItemFactory.ABI.IID
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

@ABIMarker(ToggleMenuFlyoutItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ToggleMenuFlyoutItem;{1803f260-67e4-5bc1-a63a-123510167bb8})")
@WinRTByReference(brClass = ToggleMenuFlyoutItem.ByReference::class)
public open class ToggleMenuFlyoutItem(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItem(ptr), IToggleMenuFlyoutItem.WithDefault, IWinRTObject {
  private val __733695192_Interface: IToggleMenuFlyoutItem.WithDefault by lazy {
    as_733695192()
  }


  public override val __733695192_Ptr: JNAPointer? by lazy {
    __733695192_Interface.__733695192_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__733695192_Interface)

  public constructor() : this(ABI.activate())

  private fun as_733695192(): IToggleMenuFlyoutItem.WithDefault {
    if(pointer == NULL) {
      return(IToggleMenuFlyoutItem.ABI.makeIToggleMenuFlyoutItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleMenuFlyoutItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleMenuFlyoutItem.ABI.makeIToggleMenuFlyoutItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleMenuFlyoutItem> {
    public override fun getValue() = ToggleMenuFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: ToggleMenuFlyoutItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleMenuFlyoutItem, MemoryAddress> {
    public val IToggleMenuFlyoutItemStatics_Instance: IToggleMenuFlyoutItemStatics by lazy {
      createIToggleMenuFlyoutItemStatics()
    }


    public val IToggleMenuFlyoutItemFactory_Instance: IToggleMenuFlyoutItemFactory by lazy {
      createIToggleMenuFlyoutItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleMenuFlyoutItemStatics(): IToggleMenuFlyoutItemStatics {
      val refiid = Guid.REFIID(IToggleMenuFlyoutItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleMenuFlyoutItem".toHandle(),refiid,interfacePtr)
      val result =
          IToggleMenuFlyoutItemStatics.ABI.makeIToggleMenuFlyoutItemStatics(interfacePtr.value)
      return result
    }

    public fun createIToggleMenuFlyoutItemFactory(): IToggleMenuFlyoutItemFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleMenuFlyoutItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleMenuFlyoutItemFactory.ABI.makeIToggleMenuFlyoutItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IToggleMenuFlyoutItemFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleMenuFlyoutItem {
      val address = segment.toRawLongValue()
      return ToggleMenuFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: ToggleMenuFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCheckedProperty() =
        ABI.IToggleMenuFlyoutItemStatics_Instance.get_IsCheckedProperty()
  }
}
