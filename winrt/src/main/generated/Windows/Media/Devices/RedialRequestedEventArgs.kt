package Windows.Media.Devices

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

@ABIMarker(RedialRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Devices.RedialRequestedEventArgs;{7eb55209-76ab-4c31-b40e-4b58379d580c})")
@WinRTByReference(brClass = RedialRequestedEventArgs.ByReference::class)
public class RedialRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRedialRequestedEventArgs.WithDefault, IWinRTObject {
  private val __116203923_Interface: IRedialRequestedEventArgs.WithDefault by lazy {
    as_116203923()
  }


  public override val __116203923_Ptr: JNAPointer? by lazy {
    __116203923_Interface.__116203923_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__116203923_Interface)

  private fun as_116203923(): IRedialRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRedialRequestedEventArgs.ABI.makeIRedialRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRedialRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRedialRequestedEventArgs.ABI.makeIRedialRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RedialRequestedEventArgs> {
    public override fun getValue() = RedialRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RedialRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RedialRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RedialRequestedEventArgs {
      val address = segment.toRawLongValue()
      return RedialRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RedialRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
