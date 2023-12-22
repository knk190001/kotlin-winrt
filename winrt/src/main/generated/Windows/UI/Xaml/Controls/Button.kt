package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IButtonFactory.ABI.IID
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

@ABIMarker(Button.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Button;{280335ae-5570-46c7-8e0b-602be71229a2})")
@WinRTByReference(brClass = Button.ByReference::class)
public open class Button(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IButton.WithDefault, IButtonWithFlyout.WithDefault, IWinRTObject {
  private val __257556046_Interface: IButton.WithDefault by lazy {
    as_257556046()
  }


  private val __1655166129_Interface: IButtonWithFlyout.WithDefault by lazy {
    as_1655166129()
  }


  public override val __257556046_Ptr: JNAPointer? by lazy {
    __257556046_Interface.__257556046_Ptr
  }


  public override val __1655166129_Ptr: JNAPointer? by lazy {
    __1655166129_Interface.__1655166129_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257556046_Interface, __1655166129_Interface)

  public constructor() : this(ABI.activate())

  private fun as_257556046(): IButton.WithDefault {
    if(pointer == NULL) {
      return(IButton.ABI.makeIButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButton.ABI.makeIButton(ref.value))
  }

  private fun as_1655166129(): IButtonWithFlyout.WithDefault {
    if(pointer == NULL) {
      return(IButtonWithFlyout.ABI.makeIButtonWithFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButtonWithFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButtonWithFlyout.ABI.makeIButtonWithFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Button> {
    public override fun getValue() = Button(pointer.getPointer(0))

    public fun setValue(value: Button): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Button, MemoryAddress> {
    public val IButtonStaticsWithFlyout_Instance: IButtonStaticsWithFlyout by lazy {
      createIButtonStaticsWithFlyout()
    }


    public val IButtonFactory_Instance: IButtonFactory by lazy {
      createIButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIButtonStaticsWithFlyout(): IButtonStaticsWithFlyout {
      val refiid = Guid.REFIID(IButtonStaticsWithFlyout.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Button".toHandle(),refiid,interfacePtr)
      val result = IButtonStaticsWithFlyout.ABI.makeIButtonStaticsWithFlyout(interfacePtr.value)
      return result
    }

    public fun createIButtonFactory(): IButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Button".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IButtonFactory.ABI.makeIButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Button {
      val address = segment.toRawLongValue()
      return Button(Pointer(address))
    }

    public override fun toNative(obj: Button): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FlyoutProperty() = ABI.IButtonStaticsWithFlyout_Instance.get_FlyoutProperty()
  }
}
