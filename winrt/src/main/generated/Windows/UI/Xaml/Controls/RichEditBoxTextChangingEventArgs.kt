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

@ABIMarker(RichEditBoxTextChangingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RichEditBoxTextChangingEventArgs;{54065018-2813-4922-9f8e-b6bbafd995d8})")
@WinRTByReference(brClass = RichEditBoxTextChangingEventArgs.ByReference::class)
public class RichEditBoxTextChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRichEditBoxTextChangingEventArgs.WithDefault,
    IRichEditBoxTextChangingEventArgs2.WithDefault, IWinRTObject {
  private val __1666204980_Interface: IRichEditBoxTextChangingEventArgs.WithDefault by lazy {
    as_1666204980()
  }


  private val __112746878_Interface: IRichEditBoxTextChangingEventArgs2.WithDefault by lazy {
    as_112746878()
  }


  public override val __1666204980_Ptr: JNAPointer? by lazy {
    __1666204980_Interface.__1666204980_Ptr
  }


  public override val __112746878_Ptr: JNAPointer? by lazy {
    __112746878_Interface.__112746878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1666204980_Interface, __112746878_Interface)

  private fun as_1666204980(): IRichEditBoxTextChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBoxTextChangingEventArgs.ABI.makeIRichEditBoxTextChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBoxTextChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBoxTextChangingEventArgs.ABI.makeIRichEditBoxTextChangingEventArgs(ref.value))
  }

  private fun as_112746878(): IRichEditBoxTextChangingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBoxTextChangingEventArgs2.ABI.makeIRichEditBoxTextChangingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBoxTextChangingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBoxTextChangingEventArgs2.ABI.makeIRichEditBoxTextChangingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditBoxTextChangingEventArgs> {
    public override fun getValue() = RichEditBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: RichEditBoxTextChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBoxTextChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RichEditBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return RichEditBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RichEditBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
