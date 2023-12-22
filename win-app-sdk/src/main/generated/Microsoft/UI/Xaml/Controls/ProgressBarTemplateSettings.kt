package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ProgressBarTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ProgressBarTemplateSettings;{fbea95c9-9ef9-5e79-af54-44ded28035d5})")
@WinRTByReference(brClass = ProgressBarTemplateSettings.ByReference::class)
public class ProgressBarTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IProgressBarTemplateSettings.WithDefault, IWinRTObject {
  private val __890589020_Interface: IProgressBarTemplateSettings.WithDefault by lazy {
    as_890589020()
  }


  public override val __890589020_Ptr: JNAPointer? by lazy {
    __890589020_Interface.__890589020_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__890589020_Interface)

  private fun as_890589020(): IProgressBarTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IProgressBarTemplateSettings.ABI.makeIProgressBarTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressBarTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressBarTemplateSettings.ABI.makeIProgressBarTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProgressBarTemplateSettings> {
    public override fun getValue() = ProgressBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ProgressBarTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressBarTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProgressBarTemplateSettings {
      val address = segment.toRawLongValue()
      return ProgressBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ProgressBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
