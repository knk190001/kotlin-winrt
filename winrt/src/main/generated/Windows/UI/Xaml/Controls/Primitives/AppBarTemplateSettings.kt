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

@ABIMarker(AppBarTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.AppBarTemplateSettings;{bcc2a863-eb35-423c-8389-d7827be3bf67})")
@WinRTByReference(brClass = AppBarTemplateSettings.ByReference::class)
public class AppBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IAppBarTemplateSettings.WithDefault,
    IAppBarTemplateSettings2.WithDefault, IWinRTObject {
  private val __42157333_Interface: IAppBarTemplateSettings.WithDefault by lazy {
    as_42157333()
  }


  private val __1306877273_Interface: IAppBarTemplateSettings2.WithDefault by lazy {
    as_1306877273()
  }


  public override val __42157333_Ptr: JNAPointer? by lazy {
    __42157333_Interface.__42157333_Ptr
  }


  public override val __1306877273_Ptr: JNAPointer? by lazy {
    __1306877273_Interface.__1306877273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__42157333_Interface, __1306877273_Interface)

  private fun as_42157333(): IAppBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IAppBarTemplateSettings.ABI.makeIAppBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarTemplateSettings.ABI.makeIAppBarTemplateSettings(ref.value))
  }

  private fun as_1306877273(): IAppBarTemplateSettings2.WithDefault {
    if(pointer == NULL) {
      return(IAppBarTemplateSettings2.ABI.makeIAppBarTemplateSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarTemplateSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarTemplateSettings2.ABI.makeIAppBarTemplateSettings2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarTemplateSettings> {
    public override fun getValue() = AppBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: AppBarTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBarTemplateSettings {
      val address = segment.toRawLongValue()
      return AppBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: AppBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
