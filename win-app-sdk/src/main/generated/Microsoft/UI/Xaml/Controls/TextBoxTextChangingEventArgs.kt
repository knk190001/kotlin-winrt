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

@ABIMarker(TextBoxTextChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TextBoxTextChangingEventArgs;{a1a08d48-e8c0-5379-b138-7eb3f8d5f5e6})")
@WinRTByReference(brClass = TextBoxTextChangingEventArgs.ByReference::class)
public class TextBoxTextChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextBoxTextChangingEventArgs.WithDefault, IWinRTObject {
  private val __1942079878_Interface: ITextBoxTextChangingEventArgs.WithDefault by lazy {
    as_1942079878()
  }


  public override val __1942079878_Ptr: JNAPointer? by lazy {
    __1942079878_Interface.__1942079878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1942079878_Interface)

  private fun as_1942079878(): ITextBoxTextChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxTextChangingEventArgs.ABI.makeITextBoxTextChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxTextChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxTextChangingEventArgs.ABI.makeITextBoxTextChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextBoxTextChangingEventArgs> {
    public override fun getValue() = TextBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TextBoxTextChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextBoxTextChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return TextBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TextBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
