package Microsoft.UI.System

import Microsoft.UI.WindowId
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ThemeSettings.ABI::class)
@Signature("rc(Microsoft.UI.System.ThemeSettings;{2228ee7e-6d15-563c-8f3c-e8783ba13846})")
@WinRTByReference(brClass = ThemeSettings.ByReference::class)
public class ThemeSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IThemeSettings.WithDefault, IWinRTObject {
  private val __115293516_Interface: IThemeSettings.WithDefault by lazy {
    as_115293516()
  }


  public override val __115293516_Ptr: JNAPointer? by lazy {
    __115293516_Interface.__115293516_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__115293516_Interface)

  private fun as_115293516(): IThemeSettings.WithDefault {
    if(pointer == NULL) {
      return(IThemeSettings.ABI.makeIThemeSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThemeSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThemeSettings.ABI.makeIThemeSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ThemeSettings>
      {
    public override fun getValue() = ThemeSettings(pointer.getPointer(0))

    public fun setValue(value: ThemeSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThemeSettings, MemoryAddress> {
    public val IThemeSettingsStatics_Instance: IThemeSettingsStatics by lazy {
      createIThemeSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIThemeSettingsStatics(): IThemeSettingsStatics {
      val refiid = Guid.REFIID(IThemeSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.System.ThemeSettings".toHandle(),refiid,interfacePtr)
      val result = IThemeSettingsStatics.ABI.makeIThemeSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ThemeSettings {
      val address = segment.toRawLongValue()
      return ThemeSettings(Pointer(address))
    }

    public override fun toNative(obj: ThemeSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForWindowId(windowId: WindowId) =
        ABI.IThemeSettingsStatics_Instance.CreateForWindowId(windowId)
  }
}
