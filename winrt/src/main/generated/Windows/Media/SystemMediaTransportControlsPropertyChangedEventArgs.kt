package Windows.Media

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

@ABIMarker(SystemMediaTransportControlsPropertyChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.SystemMediaTransportControlsPropertyChangedEventArgs;{d0ca0936-339b-4cb3-8eeb-737607f56e08})")
@WinRTByReference(brClass = SystemMediaTransportControlsPropertyChangedEventArgs.ByReference::class)
public class SystemMediaTransportControlsPropertyChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMediaTransportControlsPropertyChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __684866034_Interface:
      ISystemMediaTransportControlsPropertyChangedEventArgs.WithDefault by lazy {
    as_684866034()
  }


  public override val __684866034_Ptr: JNAPointer? by lazy {
    __684866034_Interface.__684866034_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__684866034_Interface)

  private fun as_684866034(): ISystemMediaTransportControlsPropertyChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControlsPropertyChangedEventArgs.ABI.makeISystemMediaTransportControlsPropertyChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControlsPropertyChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControlsPropertyChangedEventArgs.ABI.makeISystemMediaTransportControlsPropertyChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMediaTransportControlsPropertyChangedEventArgs> {
    public override fun getValue() =
        SystemMediaTransportControlsPropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemMediaTransportControlsPropertyChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMediaTransportControlsPropertyChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SystemMediaTransportControlsPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return SystemMediaTransportControlsPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemMediaTransportControlsPropertyChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
