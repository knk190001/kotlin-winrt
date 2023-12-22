package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(AppBarButtonTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.AppBarButtonTemplateSettings;{6fc13525-bf03-5190-a1d5-ebd6a1bcb6b4})")
@WinRTByReference(brClass = AppBarButtonTemplateSettings.ByReference::class)
public class AppBarButtonTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAppBarButtonTemplateSettings.WithDefault, IWinRTObject {
  private val __375159730_Interface: IAppBarButtonTemplateSettings.WithDefault by lazy {
    as_375159730()
  }


  public override val __375159730_Ptr: JNAPointer? by lazy {
    __375159730_Interface.__375159730_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__375159730_Interface)

  private fun as_375159730(): IAppBarButtonTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IAppBarButtonTemplateSettings.ABI.makeIAppBarButtonTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarButtonTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarButtonTemplateSettings.ABI.makeIAppBarButtonTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarButtonTemplateSettings> {
    public override fun getValue() = AppBarButtonTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: AppBarButtonTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarButtonTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBarButtonTemplateSettings {
      val address = segment.toRawLongValue()
      return AppBarButtonTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: AppBarButtonTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
