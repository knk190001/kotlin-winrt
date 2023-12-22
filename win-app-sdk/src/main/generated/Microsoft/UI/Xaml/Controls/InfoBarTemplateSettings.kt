package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IInfoBarTemplateSettingsFactory.ABI.IID
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

@ABIMarker(InfoBarTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.InfoBarTemplateSettings;{926f7292-9882-5056-8097-6da2a7ea27cd})")
@WinRTByReference(brClass = InfoBarTemplateSettings.ByReference::class)
public open class InfoBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IInfoBarTemplateSettings.WithDefault, IWinRTObject {
  private val __430524347_Interface: IInfoBarTemplateSettings.WithDefault by lazy {
    as_430524347()
  }


  public override val __430524347_Ptr: JNAPointer? by lazy {
    __430524347_Interface.__430524347_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__430524347_Interface)

  public constructor() : this(ABI.activate())

  private fun as_430524347(): IInfoBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IInfoBarTemplateSettings.ABI.makeIInfoBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfoBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfoBarTemplateSettings.ABI.makeIInfoBarTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InfoBarTemplateSettings> {
    public override fun getValue() = InfoBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: InfoBarTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfoBarTemplateSettings, MemoryAddress> {
    public val IInfoBarTemplateSettingsStatics_Instance: IInfoBarTemplateSettingsStatics by lazy {
      createIInfoBarTemplateSettingsStatics()
    }


    public val IInfoBarTemplateSettingsFactory_Instance: IInfoBarTemplateSettingsFactory by lazy {
      createIInfoBarTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInfoBarTemplateSettingsStatics(): IInfoBarTemplateSettingsStatics {
      val refiid = Guid.REFIID(IInfoBarTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBarTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          IInfoBarTemplateSettingsStatics.ABI.makeIInfoBarTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createIInfoBarTemplateSettingsFactory(): IInfoBarTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBarTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInfoBarTemplateSettingsFactory.ABI.makeIInfoBarTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IInfoBarTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InfoBarTemplateSettings {
      val address = segment.toRawLongValue()
      return InfoBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: InfoBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconElementProperty() =
        ABI.IInfoBarTemplateSettingsStatics_Instance.get_IconElementProperty()
  }
}
