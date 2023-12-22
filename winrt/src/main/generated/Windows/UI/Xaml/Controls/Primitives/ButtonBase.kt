package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.ContentControl
import Windows.UI.Xaml.Controls.Primitives.IButtonBaseFactory.ABI.IID
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

@ABIMarker(ButtonBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ButtonBase;{fa002c1a-494e-46cf-91d4-e14a8d798674})")
@WinRTByReference(brClass = ButtonBase.ByReference::class)
public open class ButtonBase(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IButtonBase.WithDefault, IWinRTObject {
  private val __665952511_Interface: IButtonBase.WithDefault by lazy {
    as_665952511()
  }


  public override val __665952511_Ptr: JNAPointer? by lazy {
    __665952511_Interface.__665952511_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__665952511_Interface)

  public constructor() : this(ABI.activate())

  private fun as_665952511(): IButtonBase.WithDefault {
    if(pointer == NULL) {
      return(IButtonBase.ABI.makeIButtonBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IButtonBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IButtonBase.ABI.makeIButtonBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ButtonBase> {
    public override fun getValue() = ButtonBase(pointer.getPointer(0))

    public fun setValue(value: ButtonBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ButtonBase, MemoryAddress> {
    public val IButtonBaseStatics_Instance: IButtonBaseStatics by lazy {
      createIButtonBaseStatics()
    }


    public val IButtonBaseFactory_Instance: IButtonBaseFactory by lazy {
      createIButtonBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIButtonBaseStatics(): IButtonBaseStatics {
      val refiid = Guid.REFIID(IButtonBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ButtonBase".toHandle(),refiid,interfacePtr)
      val result = IButtonBaseStatics.ABI.makeIButtonBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIButtonBaseFactory(): IButtonBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.ButtonBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IButtonBaseFactory.ABI.makeIButtonBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IButtonBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ButtonBase {
      val address = segment.toRawLongValue()
      return ButtonBase(Pointer(address))
    }

    public override fun toNative(obj: ButtonBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ClickModeProperty() = ABI.IButtonBaseStatics_Instance.get_ClickModeProperty()

    public fun get_IsPointerOverProperty() =
        ABI.IButtonBaseStatics_Instance.get_IsPointerOverProperty()

    public fun get_IsPressedProperty() = ABI.IButtonBaseStatics_Instance.get_IsPressedProperty()

    public fun get_CommandProperty() = ABI.IButtonBaseStatics_Instance.get_CommandProperty()

    public fun get_CommandParameterProperty() =
        ABI.IButtonBaseStatics_Instance.get_CommandParameterProperty()
  }
}
