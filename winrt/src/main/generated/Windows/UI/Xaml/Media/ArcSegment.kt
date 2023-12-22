package Windows.UI.Xaml.Media

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

@ABIMarker(ArcSegment.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.ArcSegment;{07940c5f-63fb-4469-91be-f1097c168052})")
@WinRTByReference(brClass = ArcSegment.ByReference::class)
public class ArcSegment(
  ptr: JNAPointer? = NULL
) : PathSegment(ptr), IArcSegment.WithDefault, IWinRTObject {
  private val __779967619_Interface: IArcSegment.WithDefault by lazy {
    as_779967619()
  }


  public override val __779967619_Ptr: JNAPointer? by lazy {
    __779967619_Interface.__779967619_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__779967619_Interface)

  public constructor() : this(ABI.activate())

  private fun as_779967619(): IArcSegment.WithDefault {
    if(pointer == NULL) {
      return(IArcSegment.ABI.makeIArcSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IArcSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IArcSegment.ABI.makeIArcSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ArcSegment> {
    public override fun getValue() = ArcSegment(pointer.getPointer(0))

    public fun setValue(value: ArcSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ArcSegment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IArcSegmentStatics_Instance: IArcSegmentStatics by lazy {
      createIArcSegmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.ArcSegment".toHandle(),
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

    public fun createIArcSegmentStatics(): IArcSegmentStatics {
      val refiid = Guid.REFIID(IArcSegmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.ArcSegment".toHandle(),refiid,interfacePtr)
      val result = IArcSegmentStatics.ABI.makeIArcSegmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ArcSegment {
      val address = segment.toRawLongValue()
      return ArcSegment(Pointer(address))
    }

    public override fun toNative(obj: ArcSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PointProperty() = ABI.IArcSegmentStatics_Instance.get_PointProperty()

    public fun get_SizeProperty() = ABI.IArcSegmentStatics_Instance.get_SizeProperty()

    public fun get_RotationAngleProperty() =
        ABI.IArcSegmentStatics_Instance.get_RotationAngleProperty()

    public fun get_IsLargeArcProperty() = ABI.IArcSegmentStatics_Instance.get_IsLargeArcProperty()

    public fun get_SweepDirectionProperty() =
        ABI.IArcSegmentStatics_Instance.get_SweepDirectionProperty()
  }
}
