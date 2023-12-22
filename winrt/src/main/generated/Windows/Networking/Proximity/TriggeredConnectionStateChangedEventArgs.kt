package Windows.Networking.Proximity

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

@ABIMarker(TriggeredConnectionStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs;{c6a780ad-f6e1-4d54-96e2-33f620bca88a})")
@WinRTByReference(brClass = TriggeredConnectionStateChangedEventArgs.ByReference::class)
public class TriggeredConnectionStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITriggeredConnectionStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __844576232_Interface: ITriggeredConnectionStateChangedEventArgs.WithDefault by lazy {
    as_844576232()
  }


  public override val __844576232_Ptr: JNAPointer? by lazy {
    __844576232_Interface.__844576232_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__844576232_Interface)

  private fun as_844576232(): ITriggeredConnectionStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITriggeredConnectionStateChangedEventArgs.ABI.makeITriggeredConnectionStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITriggeredConnectionStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITriggeredConnectionStateChangedEventArgs.ABI.makeITriggeredConnectionStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TriggeredConnectionStateChangedEventArgs> {
    public override fun getValue() = TriggeredConnectionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TriggeredConnectionStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TriggeredConnectionStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        TriggeredConnectionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return TriggeredConnectionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TriggeredConnectionStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
