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

@ABIMarker(DisplayManagerChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManagerChangedEventArgs;{6abfa285-6cca-5731-bcdc-42e5d2f5c50f})")
@WinRTByReference(brClass = DisplayManagerChangedEventArgs.ByReference::class)
public class DisplayManagerChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManagerChangedEventArgs.WithDefault, IWinRTObject {
  private val __1355062512_Interface: IDisplayManagerChangedEventArgs.WithDefault by lazy {
    as_1355062512()
  }


  public override val __1355062512_Ptr: JNAPointer? by lazy {
    __1355062512_Interface.__1355062512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1355062512_Interface)

  private fun as_1355062512(): IDisplayManagerChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManagerChangedEventArgs.ABI.makeIDisplayManagerChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManagerChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManagerChangedEventArgs.ABI.makeIDisplayManagerChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayManagerChangedEventArgs> {
    public override fun getValue() = DisplayManagerChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DisplayManagerChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManagerChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayManagerChangedEventArgs {
      val address = segment.toRawLongValue()
      return DisplayManagerChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DisplayManagerChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
