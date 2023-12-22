package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IContentDialogFactory.ABI.IID
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

@ABIMarker(ContentDialog.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentDialog;{ac2145a3-4a32-5305-a81d-47509515bfce})")
@WinRTByReference(brClass = ContentDialog.ByReference::class)
public open class ContentDialog(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IContentDialog.WithDefault, IWinRTObject {
  private val __877014202_Interface: IContentDialog.WithDefault by lazy {
    as_877014202()
  }


  public override val __877014202_Ptr: JNAPointer? by lazy {
    __877014202_Interface.__877014202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__877014202_Interface)

  public constructor() : this(ABI.activate())

  private fun as_877014202(): IContentDialog.WithDefault {
    if(pointer == NULL) {
      return(IContentDialog.ABI.makeIContentDialog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialog.ABI.makeIContentDialog(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentDialog>
      {
    public override fun getValue() = ContentDialog(pointer.getPointer(0))

    public fun setValue(value: ContentDialog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialog, MemoryAddress> {
    public val IContentDialogStatics_Instance: IContentDialogStatics by lazy {
      createIContentDialogStatics()
    }


    public val IContentDialogFactory_Instance: IContentDialogFactory by lazy {
      createIContentDialogFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentDialogStatics(): IContentDialogStatics {
      val refiid = Guid.REFIID(IContentDialogStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentDialog".toHandle(),refiid,interfacePtr)
      val result = IContentDialogStatics.ABI.makeIContentDialogStatics(interfacePtr.value)
      return result
    }

    public fun createIContentDialogFactory(): IContentDialogFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentDialog".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContentDialogFactory.ABI.makeIContentDialogFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IContentDialogFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContentDialog {
      val address = segment.toRawLongValue()
      return ContentDialog(Pointer(address))
    }

    public override fun toNative(obj: ContentDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TitleProperty() = ABI.IContentDialogStatics_Instance.get_TitleProperty()

    public fun get_TitleTemplateProperty() =
        ABI.IContentDialogStatics_Instance.get_TitleTemplateProperty()

    public fun get_FullSizeDesiredProperty() =
        ABI.IContentDialogStatics_Instance.get_FullSizeDesiredProperty()

    public fun get_PrimaryButtonTextProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonTextProperty()

    public fun get_SecondaryButtonTextProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonTextProperty()

    public fun get_CloseButtonTextProperty() =
        ABI.IContentDialogStatics_Instance.get_CloseButtonTextProperty()

    public fun get_PrimaryButtonCommandProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonCommandProperty()

    public fun get_SecondaryButtonCommandProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonCommandProperty()

    public fun get_CloseButtonCommandProperty() =
        ABI.IContentDialogStatics_Instance.get_CloseButtonCommandProperty()

    public fun get_PrimaryButtonCommandParameterProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonCommandParameterProperty()

    public fun get_SecondaryButtonCommandParameterProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonCommandParameterProperty()

    public fun get_CloseButtonCommandParameterProperty() =
        ABI.IContentDialogStatics_Instance.get_CloseButtonCommandParameterProperty()

    public fun get_IsPrimaryButtonEnabledProperty() =
        ABI.IContentDialogStatics_Instance.get_IsPrimaryButtonEnabledProperty()

    public fun get_IsSecondaryButtonEnabledProperty() =
        ABI.IContentDialogStatics_Instance.get_IsSecondaryButtonEnabledProperty()

    public fun get_PrimaryButtonStyleProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonStyleProperty()

    public fun get_SecondaryButtonStyleProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonStyleProperty()

    public fun get_CloseButtonStyleProperty() =
        ABI.IContentDialogStatics_Instance.get_CloseButtonStyleProperty()

    public fun get_DefaultButtonProperty() =
        ABI.IContentDialogStatics_Instance.get_DefaultButtonProperty()
  }
}
