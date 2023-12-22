package Windows.Devices.Input

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

@ABIMarker(PenUndockedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.PenUndockedEventArgs;{ccd09150-261b-59e6-a5d4-c1964cd03feb})")
@WinRTByReference(brClass = PenUndockedEventArgs.ByReference::class)
public class PenUndockedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenUndockedEventArgs.WithDefault, IWinRTObject {
  private val __1348625550_Interface: IPenUndockedEventArgs.WithDefault by lazy {
    as_1348625550()
  }


  public override val __1348625550_Ptr: JNAPointer? by lazy {
    __1348625550_Interface.__1348625550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1348625550_Interface)

  private fun as_1348625550(): IPenUndockedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPenUndockedEventArgs.ABI.makeIPenUndockedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenUndockedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenUndockedEventArgs.ABI.makeIPenUndockedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenUndockedEventArgs> {
    public override fun getValue() = PenUndockedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PenUndockedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenUndockedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PenUndockedEventArgs {
      val address = segment.toRawLongValue()
      return PenUndockedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PenUndockedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
