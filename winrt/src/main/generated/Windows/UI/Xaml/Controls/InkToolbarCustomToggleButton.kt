package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarCustomToggleButtonFactory.ABI.IID
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

@ABIMarker(InkToolbarCustomToggleButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarCustomToggleButton;{550c4d84-4f54-4fbe-b12b-e0a50aab0d05})")
@WinRTByReference(brClass = InkToolbarCustomToggleButton.ByReference::class)
public open class InkToolbarCustomToggleButton(
  ptr: JNAPointer? = NULL
) : InkToolbarToggleButton(ptr), IInkToolbarCustomToggleButton.WithDefault, IWinRTObject {
  private val __1790022296_Interface: IInkToolbarCustomToggleButton.WithDefault by lazy {
    as_1790022296()
  }


  public override val __1790022296_Ptr: JNAPointer? by lazy {
    __1790022296_Interface.__1790022296_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1790022296_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1790022296(): IInkToolbarCustomToggleButton.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarCustomToggleButton.ABI.makeIInkToolbarCustomToggleButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarCustomToggleButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarCustomToggleButton.ABI.makeIInkToolbarCustomToggleButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarCustomToggleButton> {
    public override fun getValue() = InkToolbarCustomToggleButton(pointer.getPointer(0))

    public fun setValue(value: InkToolbarCustomToggleButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarCustomToggleButton, MemoryAddress> {
    public val IInkToolbarCustomToggleButtonFactory_Instance: IInkToolbarCustomToggleButtonFactory
        by lazy {
      createIInkToolbarCustomToggleButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarCustomToggleButtonFactory(): IInkToolbarCustomToggleButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomToggleButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarCustomToggleButtonFactory.ABI.makeIInkToolbarCustomToggleButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInkToolbarCustomToggleButtonFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarCustomToggleButton {
      val address = segment.toRawLongValue()
      return InkToolbarCustomToggleButton(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarCustomToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
