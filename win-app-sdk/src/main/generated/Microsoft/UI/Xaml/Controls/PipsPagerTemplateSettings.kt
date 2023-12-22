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

@ABIMarker(PipsPagerTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PipsPagerTemplateSettings;{9d8c1252-56c5-57af-9a3a-08e9b947e5fa})")
@WinRTByReference(brClass = PipsPagerTemplateSettings.ByReference::class)
public class PipsPagerTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPipsPagerTemplateSettings.WithDefault, IWinRTObject {
  private val __2146438237_Interface: IPipsPagerTemplateSettings.WithDefault by lazy {
    as_2146438237()
  }


  public override val __2146438237_Ptr: JNAPointer? by lazy {
    __2146438237_Interface.__2146438237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2146438237_Interface)

  private fun as_2146438237(): IPipsPagerTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IPipsPagerTemplateSettings.ABI.makeIPipsPagerTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPipsPagerTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPipsPagerTemplateSettings.ABI.makeIPipsPagerTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PipsPagerTemplateSettings> {
    public override fun getValue() = PipsPagerTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: PipsPagerTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PipsPagerTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PipsPagerTemplateSettings {
      val address = segment.toRawLongValue()
      return PipsPagerTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: PipsPagerTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
