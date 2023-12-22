package Windows.Devices.PointOfService

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

@ABIMarker(CashDrawerStatusUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerStatusUpdatedEventArgs;{30aae98a-0d70-459c-9553-87e124c52488})")
@WinRTByReference(brClass = CashDrawerStatusUpdatedEventArgs.ByReference::class)
public class CashDrawerStatusUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerStatusUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1432413583_Interface: ICashDrawerStatusUpdatedEventArgs.WithDefault by lazy {
    as_1432413583()
  }


  public override val __1432413583_Ptr: JNAPointer? by lazy {
    __1432413583_Interface.__1432413583_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432413583_Interface)

  private fun as_1432413583(): ICashDrawerStatusUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerStatusUpdatedEventArgs.ABI.makeICashDrawerStatusUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerStatusUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerStatusUpdatedEventArgs.ABI.makeICashDrawerStatusUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerStatusUpdatedEventArgs> {
    public override fun getValue() = CashDrawerStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CashDrawerStatusUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerStatusUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return CashDrawerStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
