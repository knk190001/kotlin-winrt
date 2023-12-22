package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverMediaSourceCreatedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverMediaSourceCreatedEventArgs;{17cf519e-1246-531d-945a-6b158e39c3aa})")
@WinRTByReference(brClass = MiracastReceiverMediaSourceCreatedEventArgs.ByReference::class)
public class MiracastReceiverMediaSourceCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverMediaSourceCreatedEventArgs.WithDefault, IWinRTObject {
  private val __2001931115_Interface: IMiracastReceiverMediaSourceCreatedEventArgs.WithDefault by
      lazy {
    as_2001931115()
  }


  public override val __2001931115_Ptr: JNAPointer? by lazy {
    __2001931115_Interface.__2001931115_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2001931115_Interface)

  private fun as_2001931115(): IMiracastReceiverMediaSourceCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverMediaSourceCreatedEventArgs.ABI.makeIMiracastReceiverMediaSourceCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverMediaSourceCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverMediaSourceCreatedEventArgs.ABI.makeIMiracastReceiverMediaSourceCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverMediaSourceCreatedEventArgs> {
    public override fun getValue() =
        MiracastReceiverMediaSourceCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverMediaSourceCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverMediaSourceCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MiracastReceiverMediaSourceCreatedEventArgs {
      val address = segment.toRawLongValue()
      return MiracastReceiverMediaSourceCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverMediaSourceCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
