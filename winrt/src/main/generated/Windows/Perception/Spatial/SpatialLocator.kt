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

@ABIMarker(SpatialLocator.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialLocator;{f6478925-9e0c-3bb6-997e-b64ecca24cf4})")
@WinRTByReference(brClass = SpatialLocator.ByReference::class)
public class SpatialLocator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialLocator.WithDefault, IWinRTObject {
  private val __1218046133_Interface: ISpatialLocator.WithDefault by lazy {
    as_1218046133()
  }


  public override val __1218046133_Ptr: JNAPointer? by lazy {
    __1218046133_Interface.__1218046133_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1218046133_Interface)

  private fun as_1218046133(): ISpatialLocator.WithDefault {
    if(pointer == NULL) {
      return(ISpatialLocator.ABI.makeISpatialLocator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialLocator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialLocator.ABI.makeISpatialLocator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpatialLocator>
      {
    public override fun getValue() = SpatialLocator(pointer.getPointer(0))

    public fun setValue(value: SpatialLocator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialLocator, MemoryAddress> {
    public val ISpatialLocatorStatics_Instance: ISpatialLocatorStatics by lazy {
      createISpatialLocatorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialLocatorStatics(): ISpatialLocatorStatics {
      val refiid = Guid.REFIID(ISpatialLocatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialLocator".toHandle(),refiid,interfacePtr)
      val result = ISpatialLocatorStatics.ABI.makeISpatialLocatorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialLocator {
      val address = segment.toRawLongValue()
      return SpatialLocator(Pointer(address))
    }

    public override fun toNative(obj: SpatialLocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.ISpatialLocatorStatics_Instance.GetDefault()
  }
}
