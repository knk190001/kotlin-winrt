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

@ABIMarker(PolyBezierSegment.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.PolyBezierSegment;{d7f760a0-b93a-562a-8118-6330ed22c307})")
@WinRTByReference(brClass = PolyBezierSegment.ByReference::class)
public class PolyBezierSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IPolyBezierSegment.WithDefault, IWinRTObject {
  private val __1867268823_Interface: IPolyBezierSegment.WithDefault by lazy {
    as_1867268823()
  }


  public override val __1867268823_Ptr: JNAPointer? by lazy {
    __1867268823_Interface.__1867268823_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1867268823_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1867268823(): IPolyBezierSegment.WithDefault {
    if(pointer == NULL) {
      return(IPolyBezierSegment.ABI.makeIPolyBezierSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPolyBezierSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPolyBezierSegment.ABI.makeIPolyBezierSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PolyBezierSegment> {
    public override fun getValue() = PolyBezierSegment(pointer.getPointer(0))

    public fun setValue(value: PolyBezierSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PolyBezierSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPolyBezierSegmentStatics_Instance: IPolyBezierSegmentStatics by lazy {
      createIPolyBezierSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PolyBezierSegment".toHandle(),
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

    public fun createIPolyBezierSegmentStatics(): IPolyBezierSegmentStatics {
      val refiid = Guid.REFIID(IPolyBezierSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.PolyBezierSegment".toHandle(),refiid,interfacePtr)
      val result = IPolyBezierSegmentStatics.ABI.makeIPolyBezierSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PolyBezierSegment {
      val address = segment.toRawLongValue()
      return PolyBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: PolyBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PointsProperty() = ABI.IPolyBezierSegmentStatics_Instance.get_PointsProperty()
  }
}
