package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(DetectionConfigurationAvailabilityChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.DetectionConfigurationAvailabilityChangedEventArgs;{5129c9fb-4be8-5f14-af2b-88d62b1b4462})")
@WinRTByReference(brClass = DetectionConfigurationAvailabilityChangedEventArgs.ByReference::class)
public class DetectionConfigurationAvailabilityChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDetectionConfigurationAvailabilityChangedEventArgs.WithDefault, IWinRTObject
    {
  private val __1860853035_Interface:
      IDetectionConfigurationAvailabilityChangedEventArgs.WithDefault by lazy {
    as_1860853035()
  }


  public override val __1860853035_Ptr: JNAPointer? by lazy {
    __1860853035_Interface.__1860853035_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1860853035_Interface)

  private fun as_1860853035(): IDetectionConfigurationAvailabilityChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDetectionConfigurationAvailabilityChangedEventArgs.ABI.makeIDetectionConfigurationAvailabilityChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDetectionConfigurationAvailabilityChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDetectionConfigurationAvailabilityChangedEventArgs.ABI.makeIDetectionConfigurationAvailabilityChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DetectionConfigurationAvailabilityChangedEventArgs> {
    public override fun getValue() =
        DetectionConfigurationAvailabilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DetectionConfigurationAvailabilityChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DetectionConfigurationAvailabilityChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DetectionConfigurationAvailabilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return DetectionConfigurationAvailabilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DetectionConfigurationAvailabilityChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
