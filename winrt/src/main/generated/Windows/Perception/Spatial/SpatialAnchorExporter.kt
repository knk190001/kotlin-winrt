package Windows.Perception.Spatial

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

@ABIMarker(SpatialAnchorExporter.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialAnchorExporter;{9a2a4338-24fb-4269-89c5-88304aeef20f})")
@WinRTByReference(brClass = SpatialAnchorExporter.ByReference::class)
public class SpatialAnchorExporter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialAnchorExporter.WithDefault, IWinRTObject {
  private val __1048475593_Interface: ISpatialAnchorExporter.WithDefault by lazy {
    as_1048475593()
  }


  public override val __1048475593_Ptr: JNAPointer? by lazy {
    __1048475593_Interface.__1048475593_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1048475593_Interface)

  private fun as_1048475593(): ISpatialAnchorExporter.WithDefault {
    if(pointer == NULL) {
      return(ISpatialAnchorExporter.ABI.makeISpatialAnchorExporter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialAnchorExporter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialAnchorExporter.ABI.makeISpatialAnchorExporter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialAnchorExporter> {
    public override fun getValue() = SpatialAnchorExporter(pointer.getPointer(0))

    public fun setValue(value: SpatialAnchorExporter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialAnchorExporter, MemoryAddress> {
    public val ISpatialAnchorExporterStatics_Instance: ISpatialAnchorExporterStatics by lazy {
      createISpatialAnchorExporterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialAnchorExporterStatics(): ISpatialAnchorExporterStatics {
      val refiid = Guid.REFIID(ISpatialAnchorExporterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialAnchorExporter".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialAnchorExporterStatics.ABI.makeISpatialAnchorExporterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialAnchorExporter {
      val address = segment.toRawLongValue()
      return SpatialAnchorExporter(Pointer(address))
    }

    public override fun toNative(obj: SpatialAnchorExporter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ISpatialAnchorExporterStatics_Instance.GetDefault()

    public fun RequestAccessAsync() =
        ABI.ISpatialAnchorExporterStatics_Instance.RequestAccessAsync()
  }
}
