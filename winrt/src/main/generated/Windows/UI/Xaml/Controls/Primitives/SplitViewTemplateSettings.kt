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

@ABIMarker(SplitViewTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.SplitViewTemplateSettings;{c16ab5a7-4996-4443-b199-6b6b89124eab})")
@WinRTByReference(brClass = SplitViewTemplateSettings.ByReference::class)
public class SplitViewTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ISplitViewTemplateSettings.WithDefault, IWinRTObject {
  private val __1604127328_Interface: ISplitViewTemplateSettings.WithDefault by lazy {
    as_1604127328()
  }


  public override val __1604127328_Ptr: JNAPointer? by lazy {
    __1604127328_Interface.__1604127328_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1604127328_Interface)

  private fun as_1604127328(): ISplitViewTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ISplitViewTemplateSettings.ABI.makeISplitViewTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitViewTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitViewTemplateSettings.ABI.makeISplitViewTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplitViewTemplateSettings> {
    public override fun getValue() = SplitViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: SplitViewTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitViewTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SplitViewTemplateSettings {
      val address = segment.toRawLongValue()
      return SplitViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: SplitViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
