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

@ABIMarker(PersonPictureTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PersonPictureTemplateSettings;{e16df12f-c3c0-5f26-a381-08f2df052f29})")
@WinRTByReference(brClass = PersonPictureTemplateSettings.ByReference::class)
public class PersonPictureTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPersonPictureTemplateSettings.WithDefault, IWinRTObject {
  private val __1923072095_Interface: IPersonPictureTemplateSettings.WithDefault by lazy {
    as_1923072095()
  }


  public override val __1923072095_Ptr: JNAPointer? by lazy {
    __1923072095_Interface.__1923072095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1923072095_Interface)

  private fun as_1923072095(): IPersonPictureTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(IPersonPictureTemplateSettings.ABI.makeIPersonPictureTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPersonPictureTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPersonPictureTemplateSettings.ABI.makeIPersonPictureTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PersonPictureTemplateSettings> {
    public override fun getValue() = PersonPictureTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: PersonPictureTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PersonPictureTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PersonPictureTemplateSettings {
      val address = segment.toRawLongValue()
      return PersonPictureTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: PersonPictureTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
