package Microsoft.UI.Input

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

@ABIMarker(TappedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.TappedEventArgs;{c3a01bb5-6076-5e0f-871a-9d94a6a8f82b})")
@WinRTByReference(brClass = TappedEventArgs.ByReference::class)
public class TappedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITappedEventArgs.WithDefault, IWinRTObject {
  private val __384019758_Interface: ITappedEventArgs.WithDefault by lazy {
    as_384019758()
  }


  public override val __384019758_Ptr: JNAPointer? by lazy {
    __384019758_Interface.__384019758_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__384019758_Interface)

  private fun as_384019758(): ITappedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITappedEventArgs.ABI.makeITappedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITappedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITappedEventArgs.ABI.makeITappedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TappedEventArgs> {
    public override fun getValue() = TappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TappedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TappedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TappedEventArgs {
      val address = segment.toRawLongValue()
      return TappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
