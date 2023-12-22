package Windows.Media.Control

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

@ABIMarker(CurrentSessionChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Control.CurrentSessionChangedEventArgs;{6969cb39-0bfa-5fe0-8d73-09cc5e5408e1})")
@WinRTByReference(brClass = CurrentSessionChangedEventArgs.ByReference::class)
public class CurrentSessionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrentSessionChangedEventArgs.WithDefault, IWinRTObject {
  private val __859093025_Interface: ICurrentSessionChangedEventArgs.WithDefault by lazy {
    as_859093025()
  }


  public override val __859093025_Ptr: JNAPointer? by lazy {
    __859093025_Interface.__859093025_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__859093025_Interface)

  private fun as_859093025(): ICurrentSessionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICurrentSessionChangedEventArgs.ABI.makeICurrentSessionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrentSessionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrentSessionChangedEventArgs.ABI.makeICurrentSessionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrentSessionChangedEventArgs> {
    public override fun getValue() = CurrentSessionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CurrentSessionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentSessionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CurrentSessionChangedEventArgs {
      val address = segment.toRawLongValue()
      return CurrentSessionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CurrentSessionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
