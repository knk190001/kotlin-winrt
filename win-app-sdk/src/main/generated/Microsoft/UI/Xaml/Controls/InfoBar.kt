package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IInfoBarFactory.ABI.IID
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

@ABIMarker(InfoBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.InfoBar;{c1c3a438-dd79-5d22-9e42-5a3cdf8113a9})")
@WinRTByReference(brClass = InfoBar.ByReference::class)
public open class InfoBar(
  ptr: JNAPointer? = NULL
) : Control(ptr), IInfoBar.WithDefault, IWinRTObject {
  private val __3822370_Interface: IInfoBar.WithDefault by lazy {
    as_3822370()
  }


  public override val __3822370_Ptr: JNAPointer? by lazy {
    __3822370_Interface.__3822370_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__3822370_Interface)

  public constructor() : this(ABI.activate())

  private fun as_3822370(): IInfoBar.WithDefault {
    if(pointer == NULL) {
      return(IInfoBar.ABI.makeIInfoBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfoBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfoBar.ABI.makeIInfoBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InfoBar> {
    public override fun getValue() = InfoBar(pointer.getPointer(0))

    public fun setValue(value: InfoBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfoBar, MemoryAddress> {
    public val IInfoBarStatics_Instance: IInfoBarStatics by lazy {
      createIInfoBarStatics()
    }


    public val IInfoBarFactory_Instance: IInfoBarFactory by lazy {
      createIInfoBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInfoBarStatics(): IInfoBarStatics {
      val refiid = Guid.REFIID(IInfoBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBar".toHandle(),refiid,interfacePtr)
      val result = IInfoBarStatics.ABI.makeIInfoBarStatics(interfacePtr.value)
      return result
    }

    public fun createIInfoBarFactory(): IInfoBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInfoBarFactory.ABI.makeIInfoBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInfoBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InfoBar {
      val address = segment.toRawLongValue()
      return InfoBar(Pointer(address))
    }

    public override fun toNative(obj: InfoBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsOpenProperty() = ABI.IInfoBarStatics_Instance.get_IsOpenProperty()

    public fun get_TitleProperty() = ABI.IInfoBarStatics_Instance.get_TitleProperty()

    public fun get_MessageProperty() = ABI.IInfoBarStatics_Instance.get_MessageProperty()

    public fun get_SeverityProperty() = ABI.IInfoBarStatics_Instance.get_SeverityProperty()

    public fun get_IconSourceProperty() = ABI.IInfoBarStatics_Instance.get_IconSourceProperty()

    public fun get_IsIconVisibleProperty() =
        ABI.IInfoBarStatics_Instance.get_IsIconVisibleProperty()

    public fun get_IsClosableProperty() = ABI.IInfoBarStatics_Instance.get_IsClosableProperty()

    public fun get_CloseButtonStyleProperty() =
        ABI.IInfoBarStatics_Instance.get_CloseButtonStyleProperty()

    public fun get_CloseButtonCommandProperty() =
        ABI.IInfoBarStatics_Instance.get_CloseButtonCommandProperty()

    public fun get_CloseButtonCommandParameterProperty() =
        ABI.IInfoBarStatics_Instance.get_CloseButtonCommandParameterProperty()

    public fun get_ActionButtonProperty() = ABI.IInfoBarStatics_Instance.get_ActionButtonProperty()

    public fun get_ContentProperty() = ABI.IInfoBarStatics_Instance.get_ContentProperty()

    public fun get_ContentTemplateProperty() =
        ABI.IInfoBarStatics_Instance.get_ContentTemplateProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.IInfoBarStatics_Instance.get_TemplateSettingsProperty()
  }
}
