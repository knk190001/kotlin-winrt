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

@ABIMarker(InkToolbarToolButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarToolButton;{5c5af41e-ccb7-4458-8064-a9849d31561b})")
@WinRTByReference(brClass = InkToolbarToolButton.ByReference::class)
public open class InkToolbarToolButton(
  ptr: JNAPointer? = NULL
) : RadioButton(ptr), IInkToolbarToolButton.WithDefault, IWinRTObject {
  private val __103588965_Interface: IInkToolbarToolButton.WithDefault by lazy {
    as_103588965()
  }


  public override val __103588965_Ptr: JNAPointer? by lazy {
    __103588965_Interface.__103588965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__103588965_Interface)

  private fun as_103588965(): IInkToolbarToolButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarToolButton.ABI.makeIInkToolbarToolButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarToolButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarToolButton.ABI.makeIInkToolbarToolButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarToolButton> {
    public override fun getValue() = InkToolbarToolButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarToolButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarToolButton, MemoryAddress> {
    public val IInkToolbarToolButtonStatics_Instance: IInkToolbarToolButtonStatics by lazy {
      createIInkToolbarToolButtonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarToolButtonStatics(): IInkToolbarToolButtonStatics {
      val refiid = Guid.REFIID(IInkToolbarToolButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarToolButton".toHandle(),refiid,interfacePtr)
      val result =
          IInkToolbarToolButtonStatics.ABI.makeIInkToolbarToolButtonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InkToolbarToolButton {
      val address = segment.toRawLongValue()
      return InkToolbarToolButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarToolButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsExtensionGlyphShownProperty() =
        ABI.IInkToolbarToolButtonStatics_Instance.get_IsExtensionGlyphShownProperty()
  }
}
