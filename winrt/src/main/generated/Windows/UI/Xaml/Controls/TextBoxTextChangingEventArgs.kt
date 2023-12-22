package Windows.UI.Xaml.Controls

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
@Signature("rc(Windows.UI.Xaml.Controls.TextBoxTextChangingEventArgs;{4e6a4b75-43dd-4e33-acbe-2d8796a17927})")
@WinRTByReference(brClass = TextBoxTextChangingEventArgs.ByReference::class)
public class TextBoxTextChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextBoxTextChangingEventArgs.WithDefault,
    ITextBoxTextChangingEventArgs2.WithDefault, IWinRTObject {
  private val __155072091_Interface: ITextBoxTextChangingEventArgs.WithDefault by lazy {
    as_155072091()
  }


  private val __512267575_Interface: ITextBoxTextChangingEventArgs2.WithDefault by lazy {
    as_512267575()
  }


  public override val __155072091_Ptr: JNAPointer? by lazy {
    __155072091_Interface.__155072091_Ptr
  }


  public override val __512267575_Ptr: JNAPointer? by lazy {
    __512267575_Interface.__512267575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__155072091_Interface, __512267575_Interface)

  private fun as_155072091(): ITextBoxTextChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxTextChangingEventArgs.ABI.makeITextBoxTextChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxTextChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxTextChangingEventArgs.ABI.makeITextBoxTextChangingEventArgs(ref.value))
  }

  private fun as_512267575(): ITextBoxTextChangingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ITextBoxTextChangingEventArgs2.ABI.makeITextBoxTextChangingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextBoxTextChangingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextBoxTextChangingEventArgs2.ABI.makeITextBoxTextChangingEventArgs2(ref.value))
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
