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

@ABIMarker(AnnotatedScrollBarScrollingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnnotatedScrollBarScrollingEventArgs;{a7466a60-e55e-58ae-9fc1-87fef40e521a})")
@WinRTByReference(brClass = AnnotatedScrollBarScrollingEventArgs.ByReference::class)
public class AnnotatedScrollBarScrollingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnnotatedScrollBarScrollingEventArgs.WithDefault, IWinRTObject {
  private val __2068048041_Interface: IAnnotatedScrollBarScrollingEventArgs.WithDefault by lazy {
    as_2068048041()
  }


  public override val __2068048041_Ptr: JNAPointer? by lazy {
    __2068048041_Interface.__2068048041_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2068048041_Interface)

  private fun as_2068048041(): IAnnotatedScrollBarScrollingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAnnotatedScrollBarScrollingEventArgs.ABI.makeIAnnotatedScrollBarScrollingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnnotatedScrollBarScrollingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnnotatedScrollBarScrollingEventArgs.ABI.makeIAnnotatedScrollBarScrollingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnnotatedScrollBarScrollingEventArgs> {
    public override fun getValue() = AnnotatedScrollBarScrollingEventArgs(pointer.getPointer(0))

    public fun setValue(value: AnnotatedScrollBarScrollingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnnotatedScrollBarScrollingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AnnotatedScrollBarScrollingEventArgs {
      val address = segment.toRawLongValue()
      return AnnotatedScrollBarScrollingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AnnotatedScrollBarScrollingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
