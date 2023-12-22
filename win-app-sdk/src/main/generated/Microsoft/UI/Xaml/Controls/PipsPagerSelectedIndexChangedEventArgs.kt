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

@ABIMarker(PipsPagerSelectedIndexChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PipsPagerSelectedIndexChangedEventArgs;{6c2ce4fc-bf52-5ca6-9da4-b0bd5b928d97})")
@WinRTByReference(brClass = PipsPagerSelectedIndexChangedEventArgs.ByReference::class)
public class PipsPagerSelectedIndexChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPipsPagerSelectedIndexChangedEventArgs.WithDefault, IWinRTObject {
  private val __531566150_Interface: IPipsPagerSelectedIndexChangedEventArgs.WithDefault by lazy {
    as_531566150()
  }


  public override val __531566150_Ptr: JNAPointer? by lazy {
    __531566150_Interface.__531566150_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__531566150_Interface)

  private fun as_531566150(): IPipsPagerSelectedIndexChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPipsPagerSelectedIndexChangedEventArgs.ABI.makeIPipsPagerSelectedIndexChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPipsPagerSelectedIndexChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPipsPagerSelectedIndexChangedEventArgs.ABI.makeIPipsPagerSelectedIndexChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PipsPagerSelectedIndexChangedEventArgs> {
    public override fun getValue() = PipsPagerSelectedIndexChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PipsPagerSelectedIndexChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PipsPagerSelectedIndexChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PipsPagerSelectedIndexChangedEventArgs {
      val address = segment.toRawLongValue()
      return PipsPagerSelectedIndexChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PipsPagerSelectedIndexChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
