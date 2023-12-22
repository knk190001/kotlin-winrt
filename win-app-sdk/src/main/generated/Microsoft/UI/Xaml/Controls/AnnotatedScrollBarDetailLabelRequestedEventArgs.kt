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

@ABIMarker(AnnotatedScrollBarDetailLabelRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnnotatedScrollBarDetailLabelRequestedEventArgs;{43275b82-f594-590d-90ff-76fd219feaa8})")
@WinRTByReference(brClass = AnnotatedScrollBarDetailLabelRequestedEventArgs.ByReference::class)
public class AnnotatedScrollBarDetailLabelRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnnotatedScrollBarDetailLabelRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1143225079_Interface: IAnnotatedScrollBarDetailLabelRequestedEventArgs.WithDefault
      by lazy {
    as_1143225079()
  }


  public override val __1143225079_Ptr: JNAPointer? by lazy {
    __1143225079_Interface.__1143225079_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1143225079_Interface)

  private fun as_1143225079(): IAnnotatedScrollBarDetailLabelRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAnnotatedScrollBarDetailLabelRequestedEventArgs.ABI.makeIAnnotatedScrollBarDetailLabelRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnnotatedScrollBarDetailLabelRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnnotatedScrollBarDetailLabelRequestedEventArgs.ABI.makeIAnnotatedScrollBarDetailLabelRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnnotatedScrollBarDetailLabelRequestedEventArgs> {
    public override fun getValue() =
        AnnotatedScrollBarDetailLabelRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AnnotatedScrollBarDetailLabelRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnnotatedScrollBarDetailLabelRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AnnotatedScrollBarDetailLabelRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AnnotatedScrollBarDetailLabelRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AnnotatedScrollBarDetailLabelRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
