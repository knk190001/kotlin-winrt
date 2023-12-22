package Windows.Phone.UI.Input

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

@ABIMarker(BackPressedEventArgs.ABI::class)
@Signature("rc(Windows.Phone.UI.Input.BackPressedEventArgs;{f6f555ff-64ec-42a2-b93b-2fbc0c36a121})")
@WinRTByReference(brClass = BackPressedEventArgs.ByReference::class)
public class BackPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackPressedEventArgs.WithDefault, IWinRTObject {
  private val __453700342_Interface: IBackPressedEventArgs.WithDefault by lazy {
    as_453700342()
  }


  public override val __453700342_Ptr: JNAPointer? by lazy {
    __453700342_Interface.__453700342_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__453700342_Interface)

  private fun as_453700342(): IBackPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBackPressedEventArgs.ABI.makeIBackPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackPressedEventArgs.ABI.makeIBackPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackPressedEventArgs> {
    public override fun getValue() = BackPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BackPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackPressedEventArgs {
      val address = segment.toRawLongValue()
      return BackPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BackPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
