package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMenuBarFactory.ABI.IID
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

@ABIMarker(MenuBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MenuBar;{ba97f337-8f1e-5141-b53f-e77a8ba3ebbd})")
@WinRTByReference(brClass = MenuBar.ByReference::class)
public open class MenuBar(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMenuBar.WithDefault, IWinRTObject {
  private val __998870387_Interface: IMenuBar.WithDefault by lazy {
    as_998870387()
  }


  public override val __998870387_Ptr: JNAPointer? by lazy {
    __998870387_Interface.__998870387_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__998870387_Interface)

  public constructor() : this(ABI.activate())

  private fun as_998870387(): IMenuBar.WithDefault {
    if(pointer == NULL) {
      return(IMenuBar.ABI.makeIMenuBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuBar.ABI.makeIMenuBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MenuBar> {
    public override fun getValue() = MenuBar(pointer.getPointer(0))

    public fun setValue(value: MenuBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuBar, MemoryAddress> {
    public val IMenuBarStatics_Instance: IMenuBarStatics by lazy {
      createIMenuBarStatics()
    }


    public val IMenuBarFactory_Instance: IMenuBarFactory by lazy {
      createIMenuBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMenuBarStatics(): IMenuBarStatics {
      val refiid = Guid.REFIID(IMenuBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuBar".toHandle(),refiid,interfacePtr)
      val result = IMenuBarStatics.ABI.makeIMenuBarStatics(interfacePtr.value)
      return result
    }

    public fun createIMenuBarFactory(): IMenuBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMenuBarFactory.ABI.makeIMenuBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMenuBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MenuBar {
      val address = segment.toRawLongValue()
      return MenuBar(Pointer(address))
    }

    public override fun toNative(obj: MenuBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsProperty() = ABI.IMenuBarStatics_Instance.get_ItemsProperty()
  }
}
