package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(SettingsFlyoutTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.SettingsFlyoutTemplateSettings;{bcf14c10-cea7-43f1-9d68-57605ded69d4})")
@WinRTByReference(brClass = SettingsFlyoutTemplateSettings.ByReference::class)
public class SettingsFlyoutTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISettingsFlyoutTemplateSettings.WithDefault, IWinRTObject {
  private val __2009896777_Interface: ISettingsFlyoutTemplateSettings.WithDefault by lazy {
    as_2009896777()
  }


  public override val __2009896777_Ptr: JNAPointer? by lazy {
    __2009896777_Interface.__2009896777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2009896777_Interface)

  private fun as_2009896777(): ISettingsFlyoutTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ISettingsFlyoutTemplateSettings.ABI.makeISettingsFlyoutTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsFlyoutTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsFlyoutTemplateSettings.ABI.makeISettingsFlyoutTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SettingsFlyoutTemplateSettings> {
    public override fun getValue() = SettingsFlyoutTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: SettingsFlyoutTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsFlyoutTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SettingsFlyoutTemplateSettings {
      val address = segment.toRawLongValue()
      return SettingsFlyoutTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: SettingsFlyoutTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
