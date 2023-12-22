package Microsoft.UI.Xaml.Controls

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
@Signature("rc(Microsoft.UI.Xaml.Controls.AutoSuggestBox;{3eea809e-b2db-521d-97db-e0648fb5d798})")
@WinRTByReference(brClass = AutoSuggestBox.ByReference::class)
public class AutoSuggestBox(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), IAutoSuggestBox.WithDefault, IWinRTObject {
  private val __1031112765_Interface: IAutoSuggestBox.WithDefault by lazy {
    as_1031112765()
  }


  public override val __1031112765_Ptr: JNAPointer? by lazy {
    __1031112765_Interface.__1031112765_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1031112765_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1031112765(): IAutoSuggestBox.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBox.ABI.makeIAutoSuggestBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBox.ABI.makeIAutoSuggestBox(ref.value))
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


    public val IAutoSuggestBoxStatics_Instance: IAutoSuggestBoxStatics by lazy {
      createIAutoSuggestBoxStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AutoSuggestBox".toHandle(),
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

    public fun createIAutoSuggestBoxStatics(): IAutoSuggestBoxStatics {
      val refiid = Guid.REFIID(IAutoSuggestBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AutoSuggestBox".toHandle(),refiid,interfacePtr)
      val result = IAutoSuggestBoxStatics.ABI.makeIAutoSuggestBoxStatics(interfacePtr.value)
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

    public fun get_QueryIconProperty() = ABI.IAutoSuggestBoxStatics_Instance.get_QueryIconProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_LightDismissOverlayModeProperty()

    public fun get_DescriptionProperty() =
        ABI.IAutoSuggestBoxStatics_Instance.get_DescriptionProperty()
  }
}
