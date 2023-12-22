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

@ABIMarker(DetectionConfigurationAvailabilityInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.DetectionConfigurationAvailabilityInfo;{b5affeb0-40f0-5398-b838-91979c2c6208})")
@WinRTByReference(brClass = DetectionConfigurationAvailabilityInfo.ByReference::class)
public class DetectionConfigurationAvailabilityInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDetectionConfigurationAvailabilityInfo.WithDefault,
    IDetectionConfigurationAvailabilityInfo2.WithDefault, IWinRTObject {
  private val __541031318_Interface: IDetectionConfigurationAvailabilityInfo.WithDefault by lazy {
    as_541031318()
  }


  private val __407898276_Interface: IDetectionConfigurationAvailabilityInfo2.WithDefault by lazy {
    as_407898276()
  }


  public override val __541031318_Ptr: JNAPointer? by lazy {
    __541031318_Interface.__541031318_Ptr
  }


  public override val __407898276_Ptr: JNAPointer? by lazy {
    __407898276_Interface.__407898276_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__541031318_Interface, __407898276_Interface)

  private fun as_541031318(): IDetectionConfigurationAvailabilityInfo.WithDefault {
    if(pointer == NULL) {
      return(IDetectionConfigurationAvailabilityInfo.ABI.makeIDetectionConfigurationAvailabilityInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDetectionConfigurationAvailabilityInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDetectionConfigurationAvailabilityInfo.ABI.makeIDetectionConfigurationAvailabilityInfo(ref.value))
  }

  private fun as_407898276(): IDetectionConfigurationAvailabilityInfo2.WithDefault {
    if(pointer == NULL) {
      return(IDetectionConfigurationAvailabilityInfo2.ABI.makeIDetectionConfigurationAvailabilityInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDetectionConfigurationAvailabilityInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDetectionConfigurationAvailabilityInfo2.ABI.makeIDetectionConfigurationAvailabilityInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DetectionConfigurationAvailabilityInfo> {
    public override fun getValue() = DetectionConfigurationAvailabilityInfo(pointer.getPointer(0))

    public fun setValue(value: DetectionConfigurationAvailabilityInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DetectionConfigurationAvailabilityInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DetectionConfigurationAvailabilityInfo {
      val address = segment.toRawLongValue()
      return DetectionConfigurationAvailabilityInfo(Pointer(address))
    }

    public override fun toNative(obj: DetectionConfigurationAvailabilityInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
