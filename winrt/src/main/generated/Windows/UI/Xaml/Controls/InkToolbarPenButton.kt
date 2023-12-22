package Windows.UI.Xaml.Controls

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

@ABIMarker(InkToolbarPenButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarPenButton;{e0b80c21-b032-40ee-a2b9-507f6ccb827b})")
@WinRTByReference(brClass = InkToolbarPenButton.ByReference::class)
public open class InkToolbarPenButton(
  ptr: JNAPointer? = NULL
) : InkToolbarToolButton(ptr), IInkToolbarPenButton.WithDefault, IWinRTObject {
  private val __1437793574_Interface: IInkToolbarPenButton.WithDefault by lazy {
    as_1437793574()
  }


  public override val __1437793574_Ptr: JNAPointer? by lazy {
    __1437793574_Interface.__1437793574_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1437793574_Interface)

  private fun as_1437793574(): IInkToolbarPenButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarPenButton.ABI.makeIInkToolbarPenButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarPenButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarPenButton.ABI.makeIInkToolbarPenButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarPenButton> {
    public override fun getValue() = InkToolbarPenButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarPenButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarPenButton, MemoryAddress> {
    public val IInkToolbarPenButtonStatics_Instance: IInkToolbarPenButtonStatics by lazy {
      createIInkToolbarPenButtonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarPenButtonStatics(): IInkToolbarPenButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarPenButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarPenButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarPenButtonStatics.ABI.makeIInkToolbarPenButtonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InkToolbarPenButton {
      val address = segment.toRawLongValue()
      return InkToolbarPenButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarPenButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PaletteProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_PaletteProperty()

    public fun get_MinStrokeWidthProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_MinStrokeWidthProperty()

    public fun get_MaxStrokeWidthProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_MaxStrokeWidthProperty()

    public fun get_SelectedBrushProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_SelectedBrushProperty()

    public fun get_SelectedBrushIndexProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_SelectedBrushIndexProperty()

    public fun get_SelectedStrokeWidthProperty() =
        ABI.IInkToolbarPenButtonStatics_Instance.get_SelectedStrokeWidthProperty()
  }
}
