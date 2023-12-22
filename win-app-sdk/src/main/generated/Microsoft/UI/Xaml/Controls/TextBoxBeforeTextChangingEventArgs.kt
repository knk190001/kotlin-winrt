package Microsoft.UI.Xaml.Controls

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

@ABIMarker(TextBoxBeforeTextChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextBoxBeforeTextChangingEventArgs;{ba46105b-9a16-5237-a20f-5df750992a05})")
@WinRTByReference(brClass = TextBoxBeforeTextChangingEventArgs.ByReference::class)
public class TextBoxBeforeTextChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextBoxBeforeTextChangingEventArgs.WithDefault, IWinRTObject {
  private val __326040441_Interface: ITextBoxBeforeTextChangingEventArgs.WithDefault by lazy {
    as_326040441()
  }


  public override val __326040441_Ptr: JNAPointer? by lazy {
    __326040441_Interface.__326040441_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__326040441_Interface)

  private fun as_326040441(): ITextBoxBeforeTextChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxBeforeTextChangingEventArgs.ABI.makeITextBoxBeforeTextChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxBeforeTextChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxBeforeTextChangingEventArgs.ABI.makeITextBoxBeforeTextChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextBoxBeforeTextChangingEventArgs> {
    public override fun getValue() = TextBoxBeforeTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextBoxBeforeTextChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBoxBeforeTextChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextBoxBeforeTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return TextBoxBeforeTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextBoxBeforeTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
