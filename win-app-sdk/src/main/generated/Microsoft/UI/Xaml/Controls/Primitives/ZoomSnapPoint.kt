package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IZoomSnapPointFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ZoomSnapPoint.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ZoomSnapPoint;{8101d353-8db3-5ac6-a7f8-b18eb9c123ac})")
@WinRTByReference(brClass = ZoomSnapPoint.ByReference::class)
public open class ZoomSnapPoint(
  ptr: JNAPointer? = NULL
) : ZoomSnapPointBase(ptr), IZoomSnapPoint.WithDefault, IWinRTObject {
  private val __794560350_Interface: IZoomSnapPoint.WithDefault by lazy {
    as_794560350()
  }


  public override val __794560350_Ptr: JNAPointer? by lazy {
    __794560350_Interface.__794560350_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__794560350_Interface)

  public constructor(snapPointValue: Double) : this(ABI.activate(snapPointValue))

  private fun as_794560350(): IZoomSnapPoint.WithDefault {
    if(pointer == NULL) {
      return(IZoomSnapPoint.ABI.makeIZoomSnapPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IZoomSnapPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IZoomSnapPoint.ABI.makeIZoomSnapPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ZoomSnapPoint>
      {
    public override fun getValue() = ZoomSnapPoint(pointer.getPointer(0))

    public fun setValue(value: ZoomSnapPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ZoomSnapPoint, MemoryAddress> {
    public val IZoomSnapPointFactory_Instance: IZoomSnapPointFactory by lazy {
      createIZoomSnapPointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIZoomSnapPointFactory(): IZoomSnapPointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ZoomSnapPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IZoomSnapPointFactory.ABI.makeIZoomSnapPointFactory(factoryActivatorPtr.value))
    }

    public fun activate(snapPointValue: Double): JNAPointer? =
        IZoomSnapPointFactory_Instance.CreateInstance(snapPointValue, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ZoomSnapPoint {
      val address = segment.toRawLongValue()
      return ZoomSnapPoint(Pointer(address))
    }

    public override fun toNative(obj: ZoomSnapPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
