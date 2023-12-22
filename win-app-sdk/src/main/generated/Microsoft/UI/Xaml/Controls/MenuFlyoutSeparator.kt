package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMenuFlyoutSeparatorFactory.ABI.IID
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

@ABIMarker(MenuFlyoutSeparator.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MenuFlyoutSeparator;{3eaf5fd5-935e-5ed7-8d05-f6bafa936d25})")
@WinRTByReference(brClass = MenuFlyoutSeparator.ByReference::class)
public open class MenuFlyoutSeparator(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItemBase(ptr), IMenuFlyoutSeparator.WithDefault, IWinRTObject {
  private val __245314212_Interface: IMenuFlyoutSeparator.WithDefault by lazy {
    as_245314212()
  }


  public override val __245314212_Ptr: JNAPointer? by lazy {
    __245314212_Interface.__245314212_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__245314212_Interface)

  public constructor() : this(ABI.activate())

  private fun as_245314212(): IMenuFlyoutSeparator.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutSeparator.ABI.makeIMenuFlyoutSeparator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutSeparator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutSeparator.ABI.makeIMenuFlyoutSeparator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutSeparator> {
    public override fun getValue() = MenuFlyoutSeparator(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutSeparator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutSeparator, MemoryAddress> {
    public val IMenuFlyoutSeparatorFactory_Instance: IMenuFlyoutSeparatorFactory by lazy {
      createIMenuFlyoutSeparatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuFlyoutSeparatorFactory(): IMenuFlyoutSeparatorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuFlyoutSeparator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuFlyoutSeparatorFactory.ABI.makeIMenuFlyoutSeparatorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuFlyoutSeparatorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutSeparator {
      val address = segment.toRawLongValue()
      return MenuFlyoutSeparator(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
