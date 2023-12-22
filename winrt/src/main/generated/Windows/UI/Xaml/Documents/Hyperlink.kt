package Windows.UI.Xaml.Documents

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
@Signature("rc(Windows.UI.Xaml.Documents.Hyperlink;{0fe2363b-14e9-4152-9e58-5aea5b21f08d})")
@WinRTByReference(brClass = Hyperlink.ByReference::class)
public class Hyperlink(
  ptr: JNAPointer? = NULL
) : Span(ptr), IHyperlink.WithDefault, IHyperlink2.WithDefault, IHyperlink3.WithDefault,
    IHyperlink4.WithDefault, IHyperlink5.WithDefault, IWinRTObject {
  private val __1909591870_Interface: IHyperlink.WithDefault by lazy {
    as_1909591870()
  }


  private val __932194124_Interface: IHyperlink2.WithDefault by lazy {
    as_932194124()
  }


  private val __932194123_Interface: IHyperlink3.WithDefault by lazy {
    as_932194123()
  }


  private val __932194122_Interface: IHyperlink4.WithDefault by lazy {
    as_932194122()
  }


  private val __932194121_Interface: IHyperlink5.WithDefault by lazy {
    as_932194121()
  }


  public override val __1909591870_Ptr: JNAPointer? by lazy {
    __1909591870_Interface.__1909591870_Ptr
  }


  public override val __932194124_Ptr: JNAPointer? by lazy {
    __932194124_Interface.__932194124_Ptr
  }


  public override val __932194123_Ptr: JNAPointer? by lazy {
    __932194123_Interface.__932194123_Ptr
  }


  public override val __932194122_Ptr: JNAPointer? by lazy {
    __932194122_Interface.__932194122_Ptr
  }


  public override val __932194121_Ptr: JNAPointer? by lazy {
    __932194121_Interface.__932194121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1909591870_Interface, __932194124_Interface, __932194123_Interface,
        __932194122_Interface, __932194121_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1909591870(): IHyperlink.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink.ABI.makeIHyperlink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink.ABI.makeIHyperlink(ref.value))
  }

  private fun as_932194124(): IHyperlink2.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink2.ABI.makeIHyperlink2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink2.ABI.makeIHyperlink2(ref.value))
  }

  private fun as_932194123(): IHyperlink3.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink3.ABI.makeIHyperlink3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink3.ABI.makeIHyperlink3(ref.value))
  }

  private fun as_932194122(): IHyperlink4.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink4.ABI.makeIHyperlink4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink4.ABI.makeIHyperlink4(ref.value))
  }

  private fun as_932194121(): IHyperlink5.WithDefault {
    if(pointer == NULL) {
      return(IHyperlink5.ABI.makeIHyperlink5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHyperlink5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHyperlink5.ABI.makeIHyperlink5(ref.value))
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


    public val IHyperlinkStatics2_Instance: IHyperlinkStatics2 by lazy {
      createIHyperlinkStatics2()
    }


    public val IHyperlinkStatics_Instance: IHyperlinkStatics by lazy {
      createIHyperlinkStatics()
    }


    public val IHyperlinkStatics3_Instance: IHyperlinkStatics3 by lazy {
      createIHyperlinkStatics3()
    }


    public val IHyperlinkStatics4_Instance: IHyperlinkStatics4 by lazy {
      createIHyperlinkStatics4()
    }


    public val IHyperlinkStatics5_Instance: IHyperlinkStatics5 by lazy {
      createIHyperlinkStatics5()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),
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

    public fun createIHyperlinkStatics2(): IHyperlinkStatics2 {
      val refiid = Guid.REFIID(IHyperlinkStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics2.ABI.makeIHyperlinkStatics2(interfacePtr.value)
      return result
    }

    public fun createIHyperlinkStatics(): IHyperlinkStatics {
      val refiid = Guid.REFIID(IHyperlinkStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics.ABI.makeIHyperlinkStatics(interfacePtr.value)
      return result
    }

    public fun createIHyperlinkStatics3(): IHyperlinkStatics3 {
      val refiid = Guid.REFIID(IHyperlinkStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics3.ABI.makeIHyperlinkStatics3(interfacePtr.value)
      return result
    }

    public fun createIHyperlinkStatics4(): IHyperlinkStatics4 {
      val refiid = Guid.REFIID(IHyperlinkStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics4.ABI.makeIHyperlinkStatics4(interfacePtr.value)
      return result
    }

    public fun createIHyperlinkStatics5(): IHyperlinkStatics5 {
      val refiid = Guid.REFIID(IHyperlinkStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Hyperlink".toHandle(),refiid,interfacePtr)
      val result = IHyperlinkStatics5.ABI.makeIHyperlinkStatics5(interfacePtr.value)
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
    public fun get_UnderlineStyleProperty() =
        ABI.IHyperlinkStatics2_Instance.get_UnderlineStyleProperty()

    public fun get_NavigateUriProperty() = ABI.IHyperlinkStatics_Instance.get_NavigateUriProperty()

    public fun get_XYFocusLeftProperty() = ABI.IHyperlinkStatics3_Instance.get_XYFocusLeftProperty()

    public fun get_XYFocusRightProperty() =
        ABI.IHyperlinkStatics3_Instance.get_XYFocusRightProperty()

    public fun get_XYFocusUpProperty() = ABI.IHyperlinkStatics3_Instance.get_XYFocusUpProperty()

    public fun get_XYFocusDownProperty() = ABI.IHyperlinkStatics3_Instance.get_XYFocusDownProperty()

    public fun get_ElementSoundModeProperty() =
        ABI.IHyperlinkStatics3_Instance.get_ElementSoundModeProperty()

    public fun get_FocusStateProperty() = ABI.IHyperlinkStatics4_Instance.get_FocusStateProperty()

    public fun get_XYFocusUpNavigationStrategyProperty() =
        ABI.IHyperlinkStatics4_Instance.get_XYFocusUpNavigationStrategyProperty()

    public fun get_XYFocusDownNavigationStrategyProperty() =
        ABI.IHyperlinkStatics4_Instance.get_XYFocusDownNavigationStrategyProperty()

    public fun get_XYFocusLeftNavigationStrategyProperty() =
        ABI.IHyperlinkStatics4_Instance.get_XYFocusLeftNavigationStrategyProperty()

    public fun get_XYFocusRightNavigationStrategyProperty() =
        ABI.IHyperlinkStatics4_Instance.get_XYFocusRightNavigationStrategyProperty()

    public fun get_IsTabStopProperty() = ABI.IHyperlinkStatics5_Instance.get_IsTabStopProperty()

    public fun get_TabIndexProperty() = ABI.IHyperlinkStatics5_Instance.get_TabIndexProperty()
  }
}
