package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITextCommandBarFlyoutFactory.ABI.IID
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

@ABIMarker(TextCommandBarFlyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextCommandBarFlyout;{6d0f38a5-0eb3-5d73-8195-d2d89b76b0f7})")
@WinRTByReference(brClass = TextCommandBarFlyout.ByReference::class)
public open class TextCommandBarFlyout(
  ptr: JNAPointer? = NULL
) : CommandBarFlyout(ptr), ITextCommandBarFlyout.WithDefault, IWinRTObject {
  private val __1813426295_Interface: ITextCommandBarFlyout.WithDefault by lazy {
    as_1813426295()
  }


  public override val __1813426295_Ptr: JNAPointer? by lazy {
    __1813426295_Interface.__1813426295_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1813426295_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1813426295(): ITextCommandBarFlyout.WithDefault {
    if(pointer == NULL) {
      return(ITextCommandBarFlyout.ABI.makeITextCommandBarFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextCommandBarFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextCommandBarFlyout.ABI.makeITextCommandBarFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextCommandBarFlyout> {
    public override fun getValue() = TextCommandBarFlyout(pointer.getPointer(0))

    public fun setValue(value: TextCommandBarFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextCommandBarFlyout, MemoryAddress> {
    public val ITextCommandBarFlyoutFactory_Instance: ITextCommandBarFlyoutFactory by lazy {
      createITextCommandBarFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextCommandBarFlyoutFactory(): ITextCommandBarFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TextCommandBarFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextCommandBarFlyoutFactory.ABI.makeITextCommandBarFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITextCommandBarFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextCommandBarFlyout {
      val address = segment.toRawLongValue()
      return TextCommandBarFlyout(Pointer(address))
    }

    public override fun toNative(obj: TextCommandBarFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
