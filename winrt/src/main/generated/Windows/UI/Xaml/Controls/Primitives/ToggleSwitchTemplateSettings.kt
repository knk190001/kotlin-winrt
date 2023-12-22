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

@ABIMarker(ToggleSwitchTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.ToggleSwitchTemplateSettings;{02b7bdcd-628a-4363-86e0-51d6e2e89e58})")
@WinRTByReference(brClass = ToggleSwitchTemplateSettings.ByReference::class)
public class ToggleSwitchTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IToggleSwitchTemplateSettings.WithDefault, IWinRTObject {
  private val __1923711135_Interface: IToggleSwitchTemplateSettings.WithDefault by lazy {
    as_1923711135()
  }


  public override val __1923711135_Ptr: JNAPointer? by lazy {
    __1923711135_Interface.__1923711135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1923711135_Interface)

  private fun as_1923711135(): IToggleSwitchTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IToggleSwitchTemplateSettings.ABI.makeIToggleSwitchTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSwitchTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSwitchTemplateSettings.ABI.makeIToggleSwitchTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleSwitchTemplateSettings> {
    public override fun getValue() = ToggleSwitchTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ToggleSwitchTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSwitchTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToggleSwitchTemplateSettings {
      val address = segment.toRawLongValue()
      return ToggleSwitchTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ToggleSwitchTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
