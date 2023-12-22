package Microsoft.UI.Xaml.Media

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LineSegment.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.LineSegment;{0c618e54-d883-588c-8875-bd8dfd6a6a3e})")
@WinRTByReference(brClass = LineSegment.ByReference::class)
public class LineSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), ILineSegment.WithDefault, IWinRTObject {
  private val __711597006_Interface: ILineSegment.WithDefault by lazy {
    as_711597006()
  }


  public override val __711597006_Ptr: JNAPointer? by lazy {
    __711597006_Interface.__711597006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__711597006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_711597006(): ILineSegment.WithDefault {
    if(pointer == NULL) {
      return(ILineSegment.ABI.makeILineSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineSegment.ABI.makeILineSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LineSegment> {
    public override fun getValue() = LineSegment(pointer.getPointer(0))

    public fun setValue(value: LineSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILineSegmentStatics_Instance: ILineSegmentStatics by lazy {
      createILineSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.LineSegment".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createILineSegmentStatics(): ILineSegmentStatics {
      val refiid = Guid.REFIID(ILineSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.LineSegment".toHandle(),refiid,interfacePtr)
      val result = ILineSegmentStatics.ABI.makeILineSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LineSegment {
      val address = segment.toRawLongValue()
      return LineSegment(Pointer(address))
    }

    public override fun toNative(obj: LineSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PointProperty() = ABI.ILineSegmentStatics_Instance.get_PointProperty()
  }
}
