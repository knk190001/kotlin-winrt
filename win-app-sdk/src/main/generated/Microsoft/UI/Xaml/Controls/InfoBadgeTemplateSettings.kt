package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IInfoBadgeTemplateSettingsFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(InfoBadgeTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.InfoBadgeTemplateSettings;{ce810f86-d4bb-51bd-bf7d-dfd1e6c85f4a})")
@WinRTByReference(brClass = InfoBadgeTemplateSettings.ByReference::class)
public open class InfoBadgeTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IInfoBadgeTemplateSettings.WithDefault, IWinRTObject {
  private val __633716875_Interface: IInfoBadgeTemplateSettings.WithDefault by lazy {
    as_633716875()
  }


  public override val __633716875_Ptr: JNAPointer? by lazy {
    __633716875_Interface.__633716875_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__633716875_Interface)

  public constructor() : this(ABI.activate())

  private fun as_633716875(): IInfoBadgeTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IInfoBadgeTemplateSettings.ABI.makeIInfoBadgeTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfoBadgeTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfoBadgeTemplateSettings.ABI.makeIInfoBadgeTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InfoBadgeTemplateSettings> {
    public override fun getValue() = InfoBadgeTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: InfoBadgeTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfoBadgeTemplateSettings, MemoryAddress> {
    public val IInfoBadgeTemplateSettingsStatics_Instance: IInfoBadgeTemplateSettingsStatics by
        lazy {
      createIInfoBadgeTemplateSettingsStatics()
    }


    public val IInfoBadgeTemplateSettingsFactory_Instance: IInfoBadgeTemplateSettingsFactory by
        lazy {
      createIInfoBadgeTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInfoBadgeTemplateSettingsStatics(): IInfoBadgeTemplateSettingsStatics {
      val refiid = Guid.REFIID(IInfoBadgeTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBadgeTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          IInfoBadgeTemplateSettingsStatics.ABI.makeIInfoBadgeTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createIInfoBadgeTemplateSettingsFactory(): IInfoBadgeTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBadgeTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInfoBadgeTemplateSettingsFactory.ABI.makeIInfoBadgeTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInfoBadgeTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InfoBadgeTemplateSettings {
      val address = segment.toRawLongValue()
      return InfoBadgeTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: InfoBadgeTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_InfoBadgeCornerRadiusProperty() =
        ABI.IInfoBadgeTemplateSettingsStatics_Instance.get_InfoBadgeCornerRadiusProperty()

    public fun get_IconElementProperty() =
        ABI.IInfoBadgeTemplateSettingsStatics_Instance.get_IconElementProperty()
  }
}
