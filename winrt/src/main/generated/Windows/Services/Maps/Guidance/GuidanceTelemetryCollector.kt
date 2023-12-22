package Windows.Services.Maps.Guidance

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(GuidanceTelemetryCollector.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceTelemetryCollector;{db1f8da5-b878-4d92-98dd-347d23d38262})")
@WinRTByReference(brClass = GuidanceTelemetryCollector.ByReference::class)
public class GuidanceTelemetryCollector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceTelemetryCollector.WithDefault, IWinRTObject {
  private val __213213163_Interface: IGuidanceTelemetryCollector.WithDefault by lazy {
    as_213213163()
  }


  public override val __213213163_Ptr: JNAPointer? by lazy {
    __213213163_Interface.__213213163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__213213163_Interface)

  private fun as_213213163(): IGuidanceTelemetryCollector.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceTelemetryCollector.ABI.makeIGuidanceTelemetryCollector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceTelemetryCollector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceTelemetryCollector.ABI.makeIGuidanceTelemetryCollector(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GuidanceTelemetryCollector> {
    public override fun getValue() = GuidanceTelemetryCollector(pointer.getPointer(0))

    public fun setValue(value: GuidanceTelemetryCollector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceTelemetryCollector, MemoryAddress> {
    public val IGuidanceTelemetryCollectorStatics_Instance: IGuidanceTelemetryCollectorStatics by
        lazy {
      createIGuidanceTelemetryCollectorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGuidanceTelemetryCollectorStatics(): IGuidanceTelemetryCollectorStatics {
      val refiid = Guid.REFIID(IGuidanceTelemetryCollectorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.Guidance.GuidanceTelemetryCollector".toHandle(),refiid,interfacePtr)
      val result =
          IGuidanceTelemetryCollectorStatics.ABI.makeIGuidanceTelemetryCollectorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GuidanceTelemetryCollector {
      val address = segment.toRawLongValue()
      return GuidanceTelemetryCollector(Pointer(address))
    }

    public override fun toNative(obj: GuidanceTelemetryCollector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrent() = ABI.IGuidanceTelemetryCollectorStatics_Instance.GetCurrent()
  }
}
