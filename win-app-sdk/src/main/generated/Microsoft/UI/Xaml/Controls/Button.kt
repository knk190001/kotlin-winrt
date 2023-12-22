package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IButtonFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ButtonBase
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
@Signature("rc(Microsoft.UI.Xaml.Controls.Button;{216c183d-d07a-5aa5-b8a4-0300a2683e87})")
@WinRTByReference(brClass = Button.ByReference::class)
public open class Button(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IButton.WithDefault, IWinRTObject {
  private val __1884570553_Interface: IButton.WithDefault by lazy {
    as_1884570553()
  }


  public override val __1884570553_Ptr: JNAPointer? by lazy {
    __1884570553_Interface.__1884570553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1884570553_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1884570553(): IButton.WithDefault {
    if(pointer == NULL) {
      return(IButton.ABI.makeIButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButton.ABI.makeIButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Button> {
    public override fun getValue() = Button(pointer.getPointer(0))

    public fun setValue(value: Button): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Button, MemoryAddress> {
    public val IButtonStatics_Instance: IButtonStatics by lazy {
      createIButtonStatics()
    }


    public val IButtonFactory_Instance: IButtonFactory by lazy {
      createIButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIButtonStatics(): IButtonStatics {
      val refiid = Guid.REFIID(IButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Button".toHandle(),refiid,interfacePtr)
      val result = IButtonStatics.ABI.makeIButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIButtonFactory(): IButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Button".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_FlyoutProperty() = ABI.IButtonStatics_Instance.get_FlyoutProperty()
  }
}
