package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(InkToolbarMenuButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarMenuButton;{860ecae5-7633-4ea1-a209-50392d1aebd1})")
@WinRTByReference(brClass = InkToolbarMenuButton.ByReference::class)
public open class InkToolbarMenuButton(
  ptr: JNAPointer? = NULL
) : ToggleButton(ptr), IInkToolbarMenuButton.WithDefault, IWinRTObject {
  private val __178530782_Interface: IInkToolbarMenuButton.WithDefault by lazy {
    as_178530782()
  }


  public override val __178530782_Ptr: JNAPointer? by lazy {
    __178530782_Interface.__178530782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__178530782_Interface)

  private fun as_178530782(): IInkToolbarMenuButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarMenuButton.ABI.makeIInkToolbarMenuButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarMenuButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarMenuButton.ABI.makeIInkToolbarMenuButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarMenuButton> {
    public override fun getValue() = InkToolbarMenuButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarMenuButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarMenuButton, MemoryAddress> {
    public val IInkToolbarMenuButtonStatics_Instance: IInkToolbarMenuButtonStatics by lazy {
      createIInkToolbarMenuButtonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarMenuButtonStatics(): IInkToolbarMenuButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarMenuButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarMenuButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarMenuButtonStatics.ABI.makeIInkToolbarMenuButtonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InkToolbarMenuButton {
      val address = segment.toRawLongValue()
      return InkToolbarMenuButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarMenuButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsExtensionGlyphShownProperty() =
        ABI.IInkToolbarMenuButtonStatics_Instance.get_IsExtensionGlyphShownProperty()
  }
}
