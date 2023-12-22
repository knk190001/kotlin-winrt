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

@ABIMarker(DisplayManagerResultWithState.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayManagerResultWithState;{8e656aa6-6614-54be-bfef-4994547f7be1})")
@WinRTByReference(brClass = DisplayManagerResultWithState.ByReference::class)
public class DisplayManagerResultWithState(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayManagerResultWithState.WithDefault, IWinRTObject {
  private val __1270410367_Interface: IDisplayManagerResultWithState.WithDefault by lazy {
    as_1270410367()
  }


  public override val __1270410367_Ptr: JNAPointer? by lazy {
    __1270410367_Interface.__1270410367_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1270410367_Interface)

  private fun as_1270410367(): IDisplayManagerResultWithState.WithDefault {
    if(pointer == NULL) {
      return(IDisplayManagerResultWithState.ABI.makeIDisplayManagerResultWithState(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayManagerResultWithState>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayManagerResultWithState.ABI.makeIDisplayManagerResultWithState(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayManagerResultWithState> {
    public override fun getValue() = DisplayManagerResultWithState(pointer.getPointer(0))

    public fun setValue(value: DisplayManagerResultWithState): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayManagerResultWithState, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayManagerResultWithState {
      val address = segment.toRawLongValue()
      return DisplayManagerResultWithState(Pointer(address))
    }

    public override fun toNative(obj: DisplayManagerResultWithState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
