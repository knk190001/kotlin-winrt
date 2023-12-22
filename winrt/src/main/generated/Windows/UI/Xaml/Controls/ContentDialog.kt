package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IContentDialogFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.ContentDialog;{38dc4404-d24e-40d8-9415-349464c1afdc})")
@WinRTByReference(brClass = ContentDialog.ByReference::class)
public open class ContentDialog(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IContentDialog.WithDefault, IContentDialog2.WithDefault,
    IContentDialog3.WithDefault, IWinRTObject {
  private val __1505079163_Interface: IContentDialog.WithDefault by lazy {
    as_1505079163()
  }


  private val __587186253_Interface: IContentDialog2.WithDefault by lazy {
    as_587186253()
  }


  private val __587186254_Interface: IContentDialog3.WithDefault by lazy {
    as_587186254()
  }


  public override val __1505079163_Ptr: JNAPointer? by lazy {
    __1505079163_Interface.__1505079163_Ptr
  }


  public override val __587186253_Ptr: JNAPointer? by lazy {
    __587186253_Interface.__587186253_Ptr
  }


  public override val __587186254_Ptr: JNAPointer? by lazy {
    __587186254_Interface.__587186254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1505079163_Interface, __587186253_Interface, __587186254_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1505079163(): IContentDialog.WithDefault {
    if(pointer == NULL) {
      return(IContentDialog.ABI.makeIContentDialog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialog.ABI.makeIContentDialog(ref.value))
  }

  private fun as_587186253(): IContentDialog2.WithDefault {
    if(pointer == NULL) {
      return(IContentDialog2.ABI.makeIContentDialog2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialog2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialog2.ABI.makeIContentDialog2(ref.value))
  }

  private fun as_587186254(): IContentDialog3.WithDefault {
    if(pointer == NULL) {
      return(IContentDialog3.ABI.makeIContentDialog3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialog3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialog3.ABI.makeIContentDialog3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentDialog>
      {
    public override fun getValue() = ContentDialog(pointer.getPointer(0))

    public fun setValue(value: ContentDialog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialog, MemoryAddress> {
    public val IContentDialogStatics2_Instance: IContentDialogStatics2 by lazy {
      createIContentDialogStatics2()
    }


    public val IContentDialogStatics_Instance: IContentDialogStatics by lazy {
      createIContentDialogStatics()
    }


    public val IContentDialogFactory_Instance: IContentDialogFactory by lazy {
      createIContentDialogFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentDialogStatics2(): IContentDialogStatics2 {
      val refiid = Guid.REFIID(IContentDialogStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentDialog".toHandle(),refiid,interfacePtr)
      val result = IContentDialogStatics2.ABI.makeIContentDialogStatics2(interfacePtr.value)
      return result
    }

    public fun createIContentDialogStatics(): IContentDialogStatics {
      val refiid = Guid.REFIID(IContentDialogStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentDialog".toHandle(),refiid,interfacePtr)
      val result = IContentDialogStatics.ABI.makeIContentDialogStatics(interfacePtr.value)
      return result
    }

    public fun createIContentDialogFactory(): IContentDialogFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentDialog".toHandle(),refiid,factoryActivatorPtr)
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
    public fun get_CloseButtonTextProperty() =
        ABI.IContentDialogStatics2_Instance.get_CloseButtonTextProperty()

    public fun get_CloseButtonCommandProperty() =
        ABI.IContentDialogStatics2_Instance.get_CloseButtonCommandProperty()

    public fun get_CloseButtonCommandParameterProperty() =
        ABI.IContentDialogStatics2_Instance.get_CloseButtonCommandParameterProperty()

    public fun get_PrimaryButtonStyleProperty() =
        ABI.IContentDialogStatics2_Instance.get_PrimaryButtonStyleProperty()

    public fun get_SecondaryButtonStyleProperty() =
        ABI.IContentDialogStatics2_Instance.get_SecondaryButtonStyleProperty()

    public fun get_CloseButtonStyleProperty() =
        ABI.IContentDialogStatics2_Instance.get_CloseButtonStyleProperty()

    public fun get_DefaultButtonProperty() =
        ABI.IContentDialogStatics2_Instance.get_DefaultButtonProperty()

    public fun get_TitleProperty() = ABI.IContentDialogStatics_Instance.get_TitleProperty()

    public fun get_TitleTemplateProperty() =
        ABI.IContentDialogStatics_Instance.get_TitleTemplateProperty()

    public fun get_FullSizeDesiredProperty() =
        ABI.IContentDialogStatics_Instance.get_FullSizeDesiredProperty()

    public fun get_PrimaryButtonTextProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonTextProperty()

    public fun get_SecondaryButtonTextProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonTextProperty()

    public fun get_PrimaryButtonCommandProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonCommandProperty()

    public fun get_SecondaryButtonCommandProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonCommandProperty()

    public fun get_PrimaryButtonCommandParameterProperty() =
        ABI.IContentDialogStatics_Instance.get_PrimaryButtonCommandParameterProperty()

    public fun get_SecondaryButtonCommandParameterProperty() =
        ABI.IContentDialogStatics_Instance.get_SecondaryButtonCommandParameterProperty()

    public fun get_IsPrimaryButtonEnabledProperty() =
        ABI.IContentDialogStatics_Instance.get_IsPrimaryButtonEnabledProperty()

    public fun get_IsSecondaryButtonEnabledProperty() =
        ABI.IContentDialogStatics_Instance.get_IsSecondaryButtonEnabledProperty()
  }
}
