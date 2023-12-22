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

@ABIMarker(PolyLineSegment.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.PolyLineSegment;{426ef287-0287-536f-ad9e-6a05ecbb323a})")
@WinRTByReference(brClass = PolyLineSegment.ByReference::class)
public class PolyLineSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IPolyLineSegment.WithDefault, IWinRTObject {
  private val __1570675486_Interface: IPolyLineSegment.WithDefault by lazy {
    as_1570675486()
  }


  public override val __1570675486_Ptr: JNAPointer? by lazy {
    __1570675486_Interface.__1570675486_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1570675486_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1570675486(): IPolyLineSegment.WithDefault {
    if(pointer == NULL) {
      return(IPolyLineSegment.ABI.makeIPolyLineSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPolyLineSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPolyLineSegment.ABI.makeIPolyLineSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PolyLineSegment> {
    public override fun getValue() = PolyLineSegment(pointer.getPointer(0))

    public fun setValue(value: PolyLineSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PolyLineSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPolyLineSegmentStatics_Instance: IPolyLineSegmentStatics by lazy {
      createIPolyLineSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PolyLineSegment".toHandle(),
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

    public fun createIPolyLineSegmentStatics(): IPolyLineSegmentStatics {
      val refiid = Guid.REFIID(IPolyLineSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PolyLineSegment".toHandle(),refiid,interfacePtr)
      val result = IPolyLineSegmentStatics.ABI.makeIPolyLineSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PolyLineSegment {
      val address = segment.toRawLongValue()
      return PolyLineSegment(Pointer(address))
    }

    public override fun toNative(obj: PolyLineSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PointsProperty() = ABI.IPolyLineSegmentStatics_Instance.get_PointsProperty()
  }
}
