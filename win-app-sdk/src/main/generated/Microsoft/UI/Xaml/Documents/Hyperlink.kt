package Microsoft.UI.Xaml.Documents

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(Hyperlink.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Hyperlink;{ac09bd16-cdfa-54c2-8d03-a474181545b1})")
@WinRTByReference(brClass = Hyperlink.ByReference::class)
public class Hyperlink(
  ptr: JNAPointer? = NULL
) : Span(ptr), IHyperlink.WithDefault, IWinRTObject {
  private val __1744459991_Interface: IHyperlink.WithDefault by lazy {
    as_1744459991()
  }


  public override val __1744459991_Ptr: JNAPointer? by lazy {
    __1744459991_Interface.__1744459991_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1744459991_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1744459991(): IHyperlink.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink.ABI.makeIHyperlink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink.ABI.makeIHyperlink(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Hyperlink> {
    public override fun getValue() = Hyperlink(pointer.getPointer(0))

    public fun setValue(value: Hyperlink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Hyperlink, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IHyperlinkStatics_Instance: IHyperlinkStatics by lazy {
      createIHyperlinkStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Hyperlink".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIHyperlinkStatics(): IHyperlinkStatics {
      val refiid = Guid.REFIID(IHyperlinkStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics.ABI.makeIHyperlinkStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Hyperlink {
      val address = segment.toRawLongValue()
      return Hyperlink(Pointer(address))
    }

    public override fun toNative(obj: Hyperlink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_NavigateUriProperty() = ABI.IHyperlinkStatics_Instance.get_NavigateUriProperty()

    public fun get_UnderlineStyleProperty() =
        ABI.IHyperlinkStatics_Instance.get_UnderlineStyleProperty()

    public fun get_XYFocusLeftProperty() = ABI.IHyperlinkStatics_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() =
        ABI.IHyperlinkStatics_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IHyperlinkStatics_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() = ABI.IHyperlinkStatics_Instance.get_XYFocusDownProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IHyperlinkStatics_Instance.get_ElementSoundModeProperty()

    public fun get_FocusStateProperty() = ABI.IHyperlinkStatics_Instance.get_FocusStateProperty()

    public fun get_XYFocusUpNavigationStrategyProperty() =
        ABI.IHyperlinkStatics_Instance.get_XYFocusUpNavigationStrategyProperty()

    public fun get_XYFocusDownNavigationStrategyProperty() =
        ABI.IHyperlinkStatics_Instance.get_XYFocusDownNavigationStrategyProperty()

    public fun get_XYFocusLeftNavigationStrategyProperty() =
        ABI.IHyperlinkStatics_Instance.get_XYFocusLeftNavigationStrategyProperty()

    public fun get_XYFocusRightNavigationStrategyProperty() =
        ABI.IHyperlinkStatics_Instance.get_XYFocusRightNavigationStrategyProperty()

    public fun get_IsTabStopProperty() = ABI.IHyperlinkStatics_Instance.get_IsTabStopProperty()

    public fun get_TabIndexProperty() = ABI.IHyperlinkStatics_Instance.get_TabIndexProperty()
  }
}
