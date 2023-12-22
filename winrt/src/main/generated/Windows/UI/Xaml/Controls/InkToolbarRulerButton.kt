package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarRulerButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarRulerButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarRulerButton;{4a992832-1984-4148-9f25-382b35db087f})")
@WinRTByReference(brClass = InkToolbarRulerButton.ByReference::class)
public open class InkToolbarRulerButton(
  ptr: JNAPointer? = NULL
) : InkToolbarToggleButton(ptr), IInkToolbarRulerButton.WithDefault, IWinRTObject {
  private val __792465097_Interface: IInkToolbarRulerButton.WithDefault by lazy {
    as_792465097()
  }


  public override val __792465097_Ptr: JNAPointer? by lazy {
    __792465097_Interface.__792465097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__792465097_Interface)

  public constructor() : this(ABI.activate())

  private fun as_792465097(): IInkToolbarRulerButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarRulerButton.ABI.makeIInkToolbarRulerButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarRulerButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarRulerButton.ABI.makeIInkToolbarRulerButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarRulerButton> {
    public override fun getValue() = InkToolbarRulerButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarRulerButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarRulerButton, MemoryAddress> {
    public val IInkToolbarRulerButtonStatics_Instance: IInkToolbarRulerButtonStatics by lazy {
      createIInkToolbarRulerButtonStatics()
    }


    public val IInkToolbarRulerButtonFactory_Instance: IInkToolbarRulerButtonFactory by lazy {
      createIInkToolbarRulerButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarRulerButtonStatics(): IInkToolbarRulerButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarRulerButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarRulerButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarRulerButtonStatics.ABI.makeIInkToolbarRulerButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarRulerButtonFactory(): IInkToolbarRulerButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarRulerButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarRulerButtonFactory.ABI.makeIInkToolbarRulerButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInkToolbarRulerButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarRulerButton {
      val address = segment.toRawLongValue()
      return InkToolbarRulerButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarRulerButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RulerProperty() = ABI.IInkToolbarRulerButtonStatics_Instance.get_RulerProperty()
  }
}
