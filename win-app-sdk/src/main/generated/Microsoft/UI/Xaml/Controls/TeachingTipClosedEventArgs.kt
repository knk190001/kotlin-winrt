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

@ABIMarker(TeachingTipClosedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TeachingTipClosedEventArgs;{2536f506-4038-59db-9e35-a9252fb5adb2})")
@WinRTByReference(brClass = TeachingTipClosedEventArgs.ByReference::class)
public class TeachingTipClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITeachingTipClosedEventArgs.WithDefault, IWinRTObject {
  private val __1335162276_Interface: ITeachingTipClosedEventArgs.WithDefault by lazy {
    as_1335162276()
  }


  public override val __1335162276_Ptr: JNAPointer? by lazy {
    __1335162276_Interface.__1335162276_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1335162276_Interface)

  private fun as_1335162276(): ITeachingTipClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITeachingTipClosedEventArgs.ABI.makeITeachingTipClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITeachingTipClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITeachingTipClosedEventArgs.ABI.makeITeachingTipClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TeachingTipClosedEventArgs> {
    public override fun getValue() = TeachingTipClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TeachingTipClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TeachingTipClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TeachingTipClosedEventArgs {
      val address = segment.toRawLongValue()
      return TeachingTipClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TeachingTipClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
