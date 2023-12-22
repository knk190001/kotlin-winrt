package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IHyperlinkButtonFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.ButtonBase
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

@ABIMarker(HyperlinkButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.HyperlinkButton;{ccebaca3-3b5c-4f4c-9bfd-86887bc79772})")
@WinRTByReference(brClass = HyperlinkButton.ByReference::class)
public open class HyperlinkButton(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IHyperlinkButton.WithDefault, IWinRTObject {
  private val __1023742052_Interface: IHyperlinkButton.WithDefault by lazy {
    as_1023742052()
  }


  public override val __1023742052_Ptr: JNAPointer? by lazy {
    __1023742052_Interface.__1023742052_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1023742052_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1023742052(): IHyperlinkButton.WithDefault {
    if(pointer == NULL) {
      return(IHyperlinkButton.ABI.makeIHyperlinkButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlinkButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlinkButton.ABI.makeIHyperlinkButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HyperlinkButton> {
    public override fun getValue() = HyperlinkButton(pointer.getPointer(0))

    public fun setValue(value: HyperlinkButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HyperlinkButton, MemoryAddress> {
    public val IHyperlinkButtonStatics_Instance: IHyperlinkButtonStatics by lazy {
      createIHyperlinkButtonStatics()
    }


    public val IHyperlinkButtonFactory_Instance: IHyperlinkButtonFactory by lazy {
      createIHyperlinkButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHyperlinkButtonStatics(): IHyperlinkButtonStatics {
      val refiid = Guid.REFIID(IHyperlinkButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.HyperlinkButton".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkButtonStatics.ABI.makeIHyperlinkButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIHyperlinkButtonFactory(): IHyperlinkButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.HyperlinkButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHyperlinkButtonFactory.ABI.makeIHyperlinkButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IHyperlinkButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HyperlinkButton {
      val address = segment.toRawLongValue()
      return HyperlinkButton(Pointer(address))
    }

    public override fun toNative(obj: HyperlinkButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_NavigateUriProperty() =
        ABI.IHyperlinkButtonStatics_Instance.get_NavigateUriProperty()
  }
}
