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

@ABIMarker(DisplayStateOperationResult.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayStateOperationResult;{fcadbfdf-dc27-5638-b7f2-ebdfa4f7ea93})")
@WinRTByReference(brClass = DisplayStateOperationResult.ByReference::class)
public class DisplayStateOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayStateOperationResult.WithDefault, IWinRTObject {
  private val __1813875379_Interface: IDisplayStateOperationResult.WithDefault by lazy {
    as_1813875379()
  }


  public override val __1813875379_Ptr: JNAPointer? by lazy {
    __1813875379_Interface.__1813875379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1813875379_Interface)

  private fun as_1813875379(): IDisplayStateOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IDisplayStateOperationResult.ABI.makeIDisplayStateOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayStateOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayStateOperationResult.ABI.makeIDisplayStateOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayStateOperationResult> {
    public override fun getValue() = DisplayStateOperationResult(pointer.getPointer(0))

    public fun setValue(value: DisplayStateOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayStateOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayStateOperationResult {
      val address = segment.toRawLongValue()
      return DisplayStateOperationResult(Pointer(address))
    }

    public override fun toNative(obj: DisplayStateOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
