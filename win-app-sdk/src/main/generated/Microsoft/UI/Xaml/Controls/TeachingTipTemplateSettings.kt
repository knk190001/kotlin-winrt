package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITeachingTipTemplateSettingsFactory.ABI.IID
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

@ABIMarker(TeachingTipTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TeachingTipTemplateSettings;{b081e1e9-c1a5-590a-8049-69ea003b6cf7})")
@WinRTByReference(brClass = TeachingTipTemplateSettings.ByReference::class)
public open class TeachingTipTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITeachingTipTemplateSettings.WithDefault, IWinRTObject {
  private val __361745724_Interface: ITeachingTipTemplateSettings.WithDefault by lazy {
    as_361745724()
  }


  public override val __361745724_Ptr: JNAPointer? by lazy {
    __361745724_Interface.__361745724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__361745724_Interface)

  public constructor() : this(ABI.activate())

  private fun as_361745724(): ITeachingTipTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ITeachingTipTemplateSettings.ABI.makeITeachingTipTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITeachingTipTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITeachingTipTemplateSettings.ABI.makeITeachingTipTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TeachingTipTemplateSettings> {
    public override fun getValue() = TeachingTipTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: TeachingTipTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TeachingTipTemplateSettings, MemoryAddress> {
    public val ITeachingTipTemplateSettingsStatics_Instance: ITeachingTipTemplateSettingsStatics by
        lazy {
      createITeachingTipTemplateSettingsStatics()
    }


    public val ITeachingTipTemplateSettingsFactory_Instance: ITeachingTipTemplateSettingsFactory by
        lazy {
      createITeachingTipTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITeachingTipTemplateSettingsStatics(): ITeachingTipTemplateSettingsStatics {
      val refiid = Guid.REFIID(ITeachingTipTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TeachingTipTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          ITeachingTipTemplateSettingsStatics.ABI.makeITeachingTipTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createITeachingTipTemplateSettingsFactory(): ITeachingTipTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TeachingTipTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITeachingTipTemplateSettingsFactory.ABI.makeITeachingTipTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ITeachingTipTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TeachingTipTemplateSettings {
      val address = segment.toRawLongValue()
      return TeachingTipTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: TeachingTipTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TopRightHighlightMarginProperty() =
        ABI.ITeachingTipTemplateSettingsStatics_Instance.get_TopRightHighlightMarginProperty()

    public fun get_TopLeftHighlightMarginProperty() =
        ABI.ITeachingTipTemplateSettingsStatics_Instance.get_TopLeftHighlightMarginProperty()

    public fun get_IconElementProperty() =
        ABI.ITeachingTipTemplateSettingsStatics_Instance.get_IconElementProperty()
  }
}
