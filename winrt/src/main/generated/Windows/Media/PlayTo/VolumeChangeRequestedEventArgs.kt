package Windows.Media.PlayTo

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

@ABIMarker(VolumeChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.VolumeChangeRequestedEventArgs;{6f026d5c-cf75-4c2b-913e-6d7c6c329179})")
@WinRTByReference(brClass = VolumeChangeRequestedEventArgs.ByReference::class)
public class VolumeChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVolumeChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __496850424_Interface: IVolumeChangeRequestedEventArgs.WithDefault by lazy {
    as_496850424()
  }


  public override val __496850424_Ptr: JNAPointer? by lazy {
    __496850424_Interface.__496850424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__496850424_Interface)

  private fun as_496850424(): IVolumeChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVolumeChangeRequestedEventArgs.ABI.makeIVolumeChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVolumeChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVolumeChangeRequestedEventArgs.ABI.makeIVolumeChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VolumeChangeRequestedEventArgs> {
    public override fun getValue() = VolumeChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VolumeChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VolumeChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VolumeChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return VolumeChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VolumeChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
