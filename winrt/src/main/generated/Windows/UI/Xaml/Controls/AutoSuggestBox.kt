package Windows.UI.Xaml.Controls

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

@ABIMarker(AutoSuggestBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.AutoSuggestBox;{103e9b13-3400-4a16-90b9-6912bf06974f})")
@WinRTByReference(brClass = AutoSuggestBox.ByReference::class)
public class AutoSuggestBox(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), IAutoSuggestBox.WithDefault, IAutoSuggestBox2.WithDefault,
    IAutoSuggestBox3.WithDefault, IAutoSuggestBox4.WithDefault, IWinRTObject {
  private val __200662482_Interface: IAutoSuggestBox.WithDefault by lazy {
    as_200662482()
  }


  private val __1925569696_Interface: IAutoSuggestBox2.WithDefault by lazy {
    as_1925569696()
  }


  private val __1925569697_Interface: IAutoSuggestBox3.WithDefault by lazy {
    as_1925569697()
  }


  private val __1925569698_Interface: IAutoSuggestBox4.WithDefault by lazy {
    as_1925569698()
  }


  public override val __200662482_Ptr: JNAPointer? by lazy {
    __200662482_Interface.__200662482_Ptr
  }


  public override val __1925569696_Ptr: JNAPointer? by lazy {
    __1925569696_Interface.__1925569696_Ptr
  }


  public override val __1925569697_Ptr: JNAPointer? by lazy {
    __1925569697_Interface.__1925569697_Ptr
  }


  public override val __1925569698_Ptr: JNAPointer? by lazy {
    __1925569698_Interface.__1925569698_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__200662482_Interface, __1925569696_Interface, __1925569697_Interface,
        __1925569698_Interface)

  public constructor() : this(ABI.activate())

  private fun as_200662482(): IAutoSuggestBox.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBox.ABI.makeIAutoSuggestBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBox.ABI.makeIAutoSuggestBox(ref.value))
  }

  private fun as_1925569696(): IAutoSuggestBox2.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBox2.ABI.makeIAutoSuggestBox2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBox2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBox2.ABI.makeIAutoSuggestBox2(ref.value))
  }

  private fun as_1925569697(): IAutoSuggestBox3.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBox3.ABI.makeIAutoSuggestBox3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBox3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBox3.ABI.makeIAutoSuggestBox3(ref.value))
  }

  private fun as_1925569698(): IAutoSuggestBox4.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBox4.ABI.makeIAutoSuggestBox4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBox4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBox4.ABI.makeIAutoSuggestBox4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AutoSuggestBox>
      {
    public override fun getValue() = AutoSuggestBox(pointer.getPointer(0))

    public fun setValue(value: AutoSuggestBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoSuggestBox, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAutoSuggestBoxStatics2_Instance: IAutoSuggestBoxStatics2 by lazy {
      createIAutoSuggestBoxStatics2()
    }


    public val IAutoSuggestBoxStatics4_Instance: IAutoSuggestBoxStatics4 by lazy {
      createIAutoSuggestBoxStatics4()
    }


    public val IAutoSuggestBoxStatics_Instance: IAutoSuggestBoxStatics by lazy {
      createIAutoSuggestBoxStatics()
    }


    public val IAutoSuggestBoxStatics3_Instance: IAutoSuggestBoxStatics3 by lazy {
      createIAutoSuggestBoxStatics3()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AutoSuggestBox".toHandle(),
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

    public fun createIAutoSuggestBoxStatics2(): IAutoSuggestBoxStatics2 {
      val refiid = Guid.REFIID(IAutoSuggestBoxStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AutoSuggestBox".toHandle(),refiid,interfacePtr)
      val result = IAutoSuggestBoxStatics2.ABI.makeIAutoSuggestBoxStatics2(interfacePtr.value)
      return result
    }

    public fun createIAutoSuggestBoxStatics4(): IAutoSuggestBoxStatics4 {
      val refiid = Guid.REFIID(IAutoSuggestBoxStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AutoSuggestBox".toHandle(),refiid,interfacePtr)
      val result = IAutoSuggestBoxStatics4.ABI.makeIAutoSuggestBoxStatics4(interfacePtr.value)
      return result
    }

    public fun createIAutoSuggestBoxStatics(): IAutoSuggestBoxStatics {
      val refiid = Guid.REFIID(IAutoSuggestBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AutoSuggestBox".toHandle(),refiid,interfacePtr)
      val result = IAutoSuggestBoxStatics.ABI.makeIAutoSuggestBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIAutoSuggestBoxStatics3(): IAutoSuggestBoxStatics3 {
      val refiid = Guid.REFIID(IAutoSuggestBoxStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AutoSuggestBox".toHandle(),refiid,interfacePtr)
      val result = IAutoSuggestBoxStatics3.ABI.makeIAutoSuggestBoxStatics3(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutoSuggestBox {
      val address = segment.toRawLongValue()
      return AutoSuggestBox(Pointer(address))
    }

    public override fun toNative(obj: AutoSuggestBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_QueryIconProperty() =
        ABI.IAutoSuggestBoxStatics2_Instance.get_QueryIconProperty()

    public fun get_DescriptionProperty() =
        ABI.IAutoSuggestBoxStatics4_Instance.get_DescriptionProperty()

    public fun get_MaxSuggestionListHeightProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_MaxSuggestionListHeightProperty()

    public fun get_IsSuggestionListOpenProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_IsSuggestionListOpenProperty()

    public fun get_TextMemberPathProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_TextMemberPathProperty()

    public fun get_TextProperty() = ABI.IAutoSuggestBoxStatics_Instance.get_TextProperty()

    public fun get_UpdateTextOnSelectProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_UpdateTextOnSelectProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_HeaderProperty() = ABI.IAutoSuggestBoxStatics_Instance.get_HeaderProperty()

    public fun get_AutoMaximizeSuggestionAreaProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_AutoMaximizeSuggestionAreaProperty()

    public fun get_TextBoxStyleProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_TextBoxStyleProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IAutoSuggestBoxStatics3_Instance.get_LightDismissOverlayModeProperty()
  }
}
