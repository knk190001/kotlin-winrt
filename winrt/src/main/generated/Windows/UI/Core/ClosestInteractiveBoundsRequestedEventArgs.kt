package Windows.UI.Core

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

@ABIMarker(ClosestInteractiveBoundsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.ClosestInteractiveBoundsRequestedEventArgs;{347c11d7-f6f8-40e3-b29f-ae50d3e86486})")
@WinRTByReference(brClass = ClosestInteractiveBoundsRequestedEventArgs.ByReference::class)
public class ClosestInteractiveBoundsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClosestInteractiveBoundsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __320605086_Interface: IClosestInteractiveBoundsRequestedEventArgs.WithDefault by
      lazy {
    as_320605086()
  }


  public override val __320605086_Ptr: JNAPointer? by lazy {
    __320605086_Interface.__320605086_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__320605086_Interface)

  private fun as_320605086(): IClosestInteractiveBoundsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClosestInteractiveBoundsRequestedEventArgs.ABI.makeIClosestInteractiveBoundsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosestInteractiveBoundsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosestInteractiveBoundsRequestedEventArgs.ABI.makeIClosestInteractiveBoundsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClosestInteractiveBoundsRequestedEventArgs> {
    public override fun getValue() =
        ClosestInteractiveBoundsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClosestInteractiveBoundsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClosestInteractiveBoundsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ClosestInteractiveBoundsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ClosestInteractiveBoundsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClosestInteractiveBoundsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
