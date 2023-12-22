package Windows.Media.Devices

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

@ABIMarker(DefaultAudioCaptureDeviceChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs;{110f882f-1c05-4657-a18e-47c9b69f07ab})")
@WinRTByReference(brClass = DefaultAudioCaptureDeviceChangedEventArgs.ByReference::class)
public class DefaultAudioCaptureDeviceChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDefaultAudioDeviceChangedEventArgs.WithDefault, IWinRTObject {
  private val __1536666097_Interface: IDefaultAudioDeviceChangedEventArgs.WithDefault by lazy {
    as_1536666097()
  }


  public override val __1536666097_Ptr: JNAPointer? by lazy {
    __1536666097_Interface.__1536666097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1536666097_Interface)

  private fun as_1536666097(): IDefaultAudioDeviceChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDefaultAudioDeviceChangedEventArgs.ABI.makeIDefaultAudioDeviceChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDefaultAudioDeviceChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDefaultAudioDeviceChangedEventArgs.ABI.makeIDefaultAudioDeviceChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DefaultAudioCaptureDeviceChangedEventArgs> {
    public override fun getValue() =
        DefaultAudioCaptureDeviceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DefaultAudioCaptureDeviceChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DefaultAudioCaptureDeviceChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DefaultAudioCaptureDeviceChangedEventArgs {
      val address = segment.toRawLongValue()
      return DefaultAudioCaptureDeviceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DefaultAudioCaptureDeviceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
