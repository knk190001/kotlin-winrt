package Windows.Devices.Geolocation

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

@ABIMarker(StatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.StatusChangedEventArgs;{3453d2da-8c93-4111-a205-9aecfc9be5c0})")
@WinRTByReference(brClass = StatusChangedEventArgs.ByReference::class)
public class StatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStatusChangedEventArgs.WithDefault, IWinRTObject {
  private val __106034324_Interface: IStatusChangedEventArgs.WithDefault by lazy {
    as_106034324()
  }


  public override val __106034324_Ptr: JNAPointer? by lazy {
    __106034324_Interface.__106034324_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__106034324_Interface)

  private fun as_106034324(): IStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IStatusChangedEventArgs.ABI.makeIStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStatusChangedEventArgs.ABI.makeIStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StatusChangedEventArgs> {
    public override fun getValue() = StatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: StatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return StatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: StatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
