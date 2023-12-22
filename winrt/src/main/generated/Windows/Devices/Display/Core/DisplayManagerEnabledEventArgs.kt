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

@ABIMarker(DisplayManagerEnabledEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManagerEnabledEventArgs;{f0cf3f6f-42fa-59a2-b297-26e1713de848})")
@WinRTByReference(brClass = DisplayManagerEnabledEventArgs.ByReference::class)
public class DisplayManagerEnabledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManagerEnabledEventArgs.WithDefault, IWinRTObject {
  private val __660652803_Interface: IDisplayManagerEnabledEventArgs.WithDefault by lazy {
    as_660652803()
  }


  public override val __660652803_Ptr: JNAPointer? by lazy {
    __660652803_Interface.__660652803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__660652803_Interface)

  private fun as_660652803(): IDisplayManagerEnabledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManagerEnabledEventArgs.ABI.makeIDisplayManagerEnabledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManagerEnabledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManagerEnabledEventArgs.ABI.makeIDisplayManagerEnabledEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayManagerEnabledEventArgs> {
    public override fun getValue() = DisplayManagerEnabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: DisplayManagerEnabledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManagerEnabledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayManagerEnabledEventArgs {
      val address = segment.toRawLongValue()
      return DisplayManagerEnabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DisplayManagerEnabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
