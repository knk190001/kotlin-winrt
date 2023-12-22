package Windows.Devices.Display.Core

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

@ABIMarker(DisplayManagerPathsFailedOrInvalidatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManagerPathsFailedOrInvalidatedEventArgs;{03a65659-1dec-5c15-b2a2-8fe9129869fe})")
@WinRTByReference(brClass = DisplayManagerPathsFailedOrInvalidatedEventArgs.ByReference::class)
public class DisplayManagerPathsFailedOrInvalidatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManagerPathsFailedOrInvalidatedEventArgs.WithDefault, IWinRTObject {
  private val __1683554769_Interface: IDisplayManagerPathsFailedOrInvalidatedEventArgs.WithDefault
      by lazy {
    as_1683554769()
  }


  public override val __1683554769_Ptr: JNAPointer? by lazy {
    __1683554769_Interface.__1683554769_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1683554769_Interface)

  private fun as_1683554769(): IDisplayManagerPathsFailedOrInvalidatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManagerPathsFailedOrInvalidatedEventArgs.ABI.makeIDisplayManagerPathsFailedOrInvalidatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManagerPathsFailedOrInvalidatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManagerPathsFailedOrInvalidatedEventArgs.ABI.makeIDisplayManagerPathsFailedOrInvalidatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayManagerPathsFailedOrInvalidatedEventArgs> {
    public override fun getValue() =
        DisplayManagerPathsFailedOrInvalidatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DisplayManagerPathsFailedOrInvalidatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManagerPathsFailedOrInvalidatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DisplayManagerPathsFailedOrInvalidatedEventArgs {
      val address = segment.toRawLongValue()
      return DisplayManagerPathsFailedOrInvalidatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DisplayManagerPathsFailedOrInvalidatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
