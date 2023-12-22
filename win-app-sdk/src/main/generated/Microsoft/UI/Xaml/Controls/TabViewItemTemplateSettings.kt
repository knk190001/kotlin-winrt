package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITabViewItemTemplateSettingsFactory.ABI.IID
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

@ABIMarker(TabViewItemTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabViewItemTemplateSettings;{cc5c99ec-c9d1-55f5-bc81-7612ff4e2b77})")
@WinRTByReference(brClass = TabViewItemTemplateSettings.ByReference::class)
public open class TabViewItemTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITabViewItemTemplateSettings.WithDefault,
    ITabViewItemTemplateSettings2.WithDefault, IWinRTObject {
  private val __927844157_Interface: ITabViewItemTemplateSettings.WithDefault by lazy {
    as_927844157()
  }


  private val __1301602255_Interface: ITabViewItemTemplateSettings2.WithDefault by lazy {
    as_1301602255()
  }


  public override val __927844157_Ptr: JNAPointer? by lazy {
    __927844157_Interface.__927844157_Ptr
  }


  public override val __1301602255_Ptr: JNAPointer? by lazy {
    __1301602255_Interface.__1301602255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__927844157_Interface, __1301602255_Interface)

  public constructor() : this(ABI.activate())

  private fun as_927844157(): ITabViewItemTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ITabViewItemTemplateSettings.ABI.makeITabViewItemTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewItemTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewItemTemplateSettings.ABI.makeITabViewItemTemplateSettings(ref.value))
  }

  private fun as_1301602255(): ITabViewItemTemplateSettings2.WithDefault {
    if(pointer == NULL) {
      return(ITabViewItemTemplateSettings2.ABI.makeITabViewItemTemplateSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabViewItemTemplateSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabViewItemTemplateSettings2.ABI.makeITabViewItemTemplateSettings2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TabViewItemTemplateSettings> {
    public override fun getValue() = TabViewItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: TabViewItemTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabViewItemTemplateSettings, MemoryAddress> {
    public val ITabViewItemTemplateSettingsStatics2_Instance: ITabViewItemTemplateSettingsStatics2
        by lazy {
      createITabViewItemTemplateSettingsStatics2()
    }


    public val ITabViewItemTemplateSettingsStatics_Instance: ITabViewItemTemplateSettingsStatics by
        lazy {
      createITabViewItemTemplateSettingsStatics()
    }


    public val ITabViewItemTemplateSettingsFactory_Instance: ITabViewItemTemplateSettingsFactory by
        lazy {
      createITabViewItemTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewItemTemplateSettingsStatics2(): ITabViewItemTemplateSettingsStatics2 {
      val refiid = Guid.REFIID(ITabViewItemTemplateSettingsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabViewItemTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          ITabViewItemTemplateSettingsStatics2.ABI.makeITabViewItemTemplateSettingsStatics2(interfacePtr.value)
      return result
    }

    public fun createITabViewItemTemplateSettingsStatics(): ITabViewItemTemplateSettingsStatics {
      val refiid = Guid.REFIID(ITabViewItemTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabViewItemTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          ITabViewItemTemplateSettingsStatics.ABI.makeITabViewItemTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createITabViewItemTemplateSettingsFactory(): ITabViewItemTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabViewItemTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewItemTemplateSettingsFactory.ABI.makeITabViewItemTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ITabViewItemTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabViewItemTemplateSettings {
      val address = segment.toRawLongValue()
      return TabViewItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: TabViewItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TabGeometryProperty() =
        ABI.ITabViewItemTemplateSettingsStatics2_Instance.get_TabGeometryProperty()

    public fun get_IconElementProperty() =
        ABI.ITabViewItemTemplateSettingsStatics_Instance.get_IconElementProperty()
  }
}
