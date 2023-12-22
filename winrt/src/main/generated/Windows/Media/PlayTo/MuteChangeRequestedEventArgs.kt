package Windows.Media.PlayTo

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

@ABIMarker(MuteChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.MuteChangeRequestedEventArgs;{e4b4f5f6-af1f-4f1e-b437-7da32400e1d4})")
@WinRTByReference(brClass = MuteChangeRequestedEventArgs.ByReference::class)
public class MuteChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMuteChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __157137207_Interface: IMuteChangeRequestedEventArgs.WithDefault by lazy {
    as_157137207()
  }


  public override val __157137207_Ptr: JNAPointer? by lazy {
    __157137207_Interface.__157137207_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__157137207_Interface)

  private fun as_157137207(): IMuteChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMuteChangeRequestedEventArgs.ABI.makeIMuteChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMuteChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMuteChangeRequestedEventArgs.ABI.makeIMuteChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MuteChangeRequestedEventArgs> {
    public override fun getValue() = MuteChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MuteChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MuteChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MuteChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return MuteChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MuteChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
