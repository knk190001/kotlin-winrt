package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IToggleButtonFactory.ABI.IID
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

@ABIMarker(ToggleButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ToggleButton;{686fbaa4-c866-568b-8f75-481d8d545291})")
@WinRTByReference(brClass = ToggleButton.ByReference::class)
public open class ToggleButton(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IToggleButton.WithDefault, IToggleButtonOverrides.WithDefault, IWinRTObject {
  private val __95732105_Interface: IToggleButton.WithDefault by lazy {
    as_95732105()
  }


  private val __207394160_Interface: IToggleButtonOverrides.WithDefault by lazy {
    as_207394160()
  }


  public override val __95732105_Ptr: JNAPointer? by lazy {
    __95732105_Interface.__95732105_Ptr
  }


  public override val __207394160_Ptr: JNAPointer? by lazy {
    __207394160_Interface.__207394160_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__95732105_Interface, __207394160_Interface)

  public constructor() : this(ABI.activate())

  private fun as_95732105(): IToggleButton.WithDefault {
    if(pointer == NULL) {
      return(IToggleButton.ABI.makeIToggleButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleButton.ABI.makeIToggleButton(ref.value))
  }

  private fun as_207394160(): IToggleButtonOverrides.WithDefault {
    if(pointer == NULL) {
      return(IToggleButtonOverrides.ABI.makeIToggleButtonOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleButtonOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleButtonOverrides.ABI.makeIToggleButtonOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ToggleButton> {
    public override fun getValue() = ToggleButton(pointer.getPointer(0))

    public fun setValue(value: ToggleButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleButton, MemoryAddress> {
    public val IToggleButtonStatics_Instance: IToggleButtonStatics by lazy {
      createIToggleButtonStatics()
    }


    public val IToggleButtonFactory_Instance: IToggleButtonFactory by lazy {
      createIToggleButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleButtonStatics(): IToggleButtonStatics {
      val refiid = Guid.REFIID(IToggleButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ToggleButton".toHandle(),refiid,interfacePtr)
      val result = IToggleButtonStatics.ABI.makeIToggleButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIToggleButtonFactory(): IToggleButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ToggleButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleButtonFactory.ABI.makeIToggleButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IToggleButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleButton {
      val address = segment.toRawLongValue()
      return ToggleButton(Pointer(address))
    }

    public override fun toNative(obj: ToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCheckedProperty() = ABI.IToggleButtonStatics_Instance.get_IsCheckedProperty()

    public fun get_IsThreeStateProperty() =
        ABI.IToggleButtonStatics_Instance.get_IsThreeStateProperty()
  }
}
