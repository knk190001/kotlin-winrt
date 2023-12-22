package Windows.UI.Input.Spatial

import Windows.UI.Input.Spatial.ISpatialGestureRecognizerFactory.ABI.IID
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

@ABIMarker(SpatialGestureRecognizer.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialGestureRecognizer;{71605bcc-0c35-4673-adbd-cc04caa6ef45})")
@WinRTByReference(brClass = SpatialGestureRecognizer.ByReference::class)
public class SpatialGestureRecognizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialGestureRecognizer.WithDefault, IWinRTObject {
  private val __985673921_Interface: ISpatialGestureRecognizer.WithDefault by lazy {
    as_985673921()
  }


  public override val __985673921_Ptr: JNAPointer? by lazy {
    __985673921_Interface.__985673921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__985673921_Interface)

  public constructor(settings: SpatialGestureSettings) : this(ABI.activate(settings))

  private fun as_985673921(): ISpatialGestureRecognizer.WithDefault {
    if(pointer == NULL) {
      return(ISpatialGestureRecognizer.ABI.makeISpatialGestureRecognizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialGestureRecognizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialGestureRecognizer.ABI.makeISpatialGestureRecognizer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialGestureRecognizer> {
    public override fun getValue() = SpatialGestureRecognizer(pointer.getPointer(0))

    public fun setValue(value: SpatialGestureRecognizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialGestureRecognizer, MemoryAddress> {
    public val ISpatialGestureRecognizerFactory_Instance: ISpatialGestureRecognizerFactory by lazy {
      createISpatialGestureRecognizerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialGestureRecognizerFactory(): ISpatialGestureRecognizerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Spatial.SpatialGestureRecognizer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpatialGestureRecognizerFactory.ABI.makeISpatialGestureRecognizerFactory(factoryActivatorPtr.value))
    }

    public fun activate(settings: SpatialGestureSettings): JNAPointer? =
        ISpatialGestureRecognizerFactory_Instance.Create(settings)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpatialGestureRecognizer {
      val address = segment.toRawLongValue()
      return SpatialGestureRecognizer(Pointer(address))
    }

    public override fun toNative(obj: SpatialGestureRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
