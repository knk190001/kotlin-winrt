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

@ABIMarker(SystemMediaTransportControlsButtonPressedEventArgs.ABI::class)
@Signature("rc(Windows.Media.SystemMediaTransportControlsButtonPressedEventArgs;{b7f47116-a56f-4dc8-9e11-92031f4a87c2})")
@WinRTByReference(brClass = SystemMediaTransportControlsButtonPressedEventArgs.ByReference::class)
public class SystemMediaTransportControlsButtonPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemMediaTransportControlsButtonPressedEventArgs.WithDefault, IWinRTObject
    {
  private val __906969633_Interface: ISystemMediaTransportControlsButtonPressedEventArgs.WithDefault
      by lazy {
    as_906969633()
  }


  public override val __906969633_Ptr: JNAPointer? by lazy {
    __906969633_Interface.__906969633_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__906969633_Interface)

  private fun as_906969633(): ISystemMediaTransportControlsButtonPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISystemMediaTransportControlsButtonPressedEventArgs.ABI.makeISystemMediaTransportControlsButtonPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemMediaTransportControlsButtonPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemMediaTransportControlsButtonPressedEventArgs.ABI.makeISystemMediaTransportControlsButtonPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemMediaTransportControlsButtonPressedEventArgs> {
    public override fun getValue() =
        SystemMediaTransportControlsButtonPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SystemMediaTransportControlsButtonPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemMediaTransportControlsButtonPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SystemMediaTransportControlsButtonPressedEventArgs {
      val address = segment.toRawLongValue()
      return SystemMediaTransportControlsButtonPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SystemMediaTransportControlsButtonPressedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
