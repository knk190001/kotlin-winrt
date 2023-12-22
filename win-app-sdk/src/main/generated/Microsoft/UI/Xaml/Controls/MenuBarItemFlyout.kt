package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMenuBarItemFlyoutFactory.ABI.IID
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

@ABIMarker(MenuBarItemFlyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MenuBarItemFlyout;{a412ae4f-c3bc-5679-8d5f-865eb97e83cd})")
@WinRTByReference(brClass = MenuBarItemFlyout.ByReference::class)
public open class MenuBarItemFlyout(
  ptr: JNAPointer? = NULL
) : MenuFlyout(ptr), IMenuBarItemFlyout.WithDefault, IWinRTObject {
  private val __638207653_Interface: IMenuBarItemFlyout.WithDefault by lazy {
    as_638207653()
  }


  public override val __638207653_Ptr: JNAPointer? by lazy {
    __638207653_Interface.__638207653_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__638207653_Interface)

  public constructor() : this(ABI.activate())

  private fun as_638207653(): IMenuBarItemFlyout.WithDefault {
    if(pointer == NULL) {
      return(IMenuBarItemFlyout.ABI.makeIMenuBarItemFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBarItemFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBarItemFlyout.ABI.makeIMenuBarItemFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuBarItemFlyout> {
    public override fun getValue() = MenuBarItemFlyout(pointer.getPointer(0))

    public fun setValue(value: MenuBarItemFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBarItemFlyout, MemoryAddress> {
    public val IMenuBarItemFlyoutFactory_Instance: IMenuBarItemFlyoutFactory by lazy {
      createIMenuBarItemFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarItemFlyoutFactory(): IMenuBarItemFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuBarItemFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarItemFlyoutFactory.ABI.makeIMenuBarItemFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuBarItemFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBarItemFlyout {
      val address = segment.toRawLongValue()
      return MenuBarItemFlyout(Pointer(address))
    }

    public override fun toNative(obj: MenuBarItemFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
