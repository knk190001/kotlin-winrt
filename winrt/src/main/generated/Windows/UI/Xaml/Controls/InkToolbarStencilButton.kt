package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarStencilButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarStencilButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarStencilButton;{306a2616-5b40-4bf3-92b7-f1df936aeff5})")
@WinRTByReference(brClass = InkToolbarStencilButton.ByReference::class)
public open class InkToolbarStencilButton(
  ptr: JNAPointer? = NULL
) : InkToolbarMenuButton(ptr), IInkToolbarStencilButton.WithDefault, IWinRTObject {
  private val __212036029_Interface: IInkToolbarStencilButton.WithDefault by lazy {
    as_212036029()
  }


  public override val __212036029_Ptr: JNAPointer? by lazy {
    __212036029_Interface.__212036029_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__212036029_Interface)

  public constructor() : this(ABI.activate())

  private fun as_212036029(): IInkToolbarStencilButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarStencilButton.ABI.makeIInkToolbarStencilButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarStencilButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarStencilButton.ABI.makeIInkToolbarStencilButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarStencilButton> {
    public override fun getValue() = InkToolbarStencilButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarStencilButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarStencilButton, MemoryAddress> {
    public val IInkToolbarStencilButtonStatics_Instance: IInkToolbarStencilButtonStatics by lazy {
      createIInkToolbarStencilButtonStatics()
    }


    public val IInkToolbarStencilButtonFactory_Instance: IInkToolbarStencilButtonFactory by lazy {
      createIInkToolbarStencilButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarStencilButtonStatics(): IInkToolbarStencilButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarStencilButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarStencilButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarStencilButtonStatics.ABI.makeIInkToolbarStencilButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIInkToolbarStencilButtonFactory(): IInkToolbarStencilButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarStencilButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarStencilButtonFactory.ABI.makeIInkToolbarStencilButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarStencilButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarStencilButton {
      val address = segment.toRawLongValue()
      return InkToolbarStencilButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarStencilButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RulerProperty() =
        ABI.IInkToolbarStencilButtonStatics_Instance.get_RulerProperty()

    public fun get_ProtractorProperty() =
        ABI.IInkToolbarStencilButtonStatics_Instance.get_ProtractorProperty()

    public fun get_SelectedStencilProperty() =
        ABI.IInkToolbarStencilButtonStatics_Instance.get_SelectedStencilProperty()

    public fun get_IsRulerItemVisibleProperty() =
        ABI.IInkToolbarStencilButtonStatics_Instance.get_IsRulerItemVisibleProperty()

    public fun get_IsProtractorItemVisibleProperty() =
        ABI.IInkToolbarStencilButtonStatics_Instance.get_IsProtractorItemVisibleProperty()
  }
}
