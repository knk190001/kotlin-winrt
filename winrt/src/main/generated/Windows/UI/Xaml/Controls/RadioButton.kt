package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRadioButtonFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(RadioButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RadioButton;{325c44e0-9a03-4bf3-abd6-6fbb46c9a486})")
@WinRTByReference(brClass = RadioButton.ByReference::class)
public open class RadioButton(
  ptr: JNAPointer? = NULL
) : ToggleButton(ptr), IRadioButton.WithDefault, IWinRTObject {
  private val __847562383_Interface: IRadioButton.WithDefault by lazy {
    as_847562383()
  }


  public override val __847562383_Ptr: JNAPointer? by lazy {
    __847562383_Interface.__847562383_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__847562383_Interface)

  public constructor() : this(ABI.activate())

  private fun as_847562383(): IRadioButton.WithDefault {
    if(pointer == NULL) {
      return(IRadioButton.ABI.makeIRadioButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadioButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadioButton.ABI.makeIRadioButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RadioButton> {
    public override fun getValue() = RadioButton(pointer.getPointer(0))

    public fun setValue(value: RadioButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadioButton, MemoryAddress> {
    public val IRadioButtonStatics_Instance: IRadioButtonStatics by lazy {
      createIRadioButtonStatics()
    }


    public val IRadioButtonFactory_Instance: IRadioButtonFactory by lazy {
      createIRadioButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadioButtonStatics(): IRadioButtonStatics {
      val refiid = Guid.REFIID(IRadioButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RadioButton".toHandle(),refiid,interfacePtr)
      val result = IRadioButtonStatics.ABI.makeIRadioButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIRadioButtonFactory(): IRadioButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RadioButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRadioButtonFactory.ABI.makeIRadioButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRadioButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RadioButton {
      val address = segment.toRawLongValue()
      return RadioButton(Pointer(address))
    }

    public override fun toNative(obj: RadioButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_GroupNameProperty() = ABI.IRadioButtonStatics_Instance.get_GroupNameProperty()
  }
}
