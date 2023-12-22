package Windows.Data.Text

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

@ABIMarker(AlternateWordForm.ABI::class)
@Signature("rc(Windows.Data.Text.AlternateWordForm;{47396c1e-51b9-4207-9146-248e636a1d1d})")
@WinRTByReference(brClass = AlternateWordForm.ByReference::class)
public class AlternateWordForm(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAlternateWordForm.WithDefault, IWinRTObject {
  private val __1312537115_Interface: IAlternateWordForm.WithDefault by lazy {
    as_1312537115()
  }


  public override val __1312537115_Ptr: JNAPointer? by lazy {
    __1312537115_Interface.__1312537115_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1312537115_Interface)

  private fun as_1312537115(): IAlternateWordForm.WithDefault {
    if(pointer == NULL) {
      return(IAlternateWordForm.ABI.makeIAlternateWordForm(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAlternateWordForm>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAlternateWordForm.ABI.makeIAlternateWordForm(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AlternateWordForm> {
    public override fun getValue() = AlternateWordForm(pointer.getPointer(0))

    public fun setValue(value: AlternateWordForm): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AlternateWordForm, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AlternateWordForm {
      val address = segment.toRawLongValue()
      return AlternateWordForm(Pointer(address))
    }

    public override fun toNative(obj: AlternateWordForm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
