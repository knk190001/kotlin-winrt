package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(TimelineMarker.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.TimelineMarker;{a68ef02d-45ba-4e50-8cad-aaea3a227af5})")
@WinRTByReference(brClass = TimelineMarker.ByReference::class)
public class TimelineMarker(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITimelineMarker.WithDefault, IWinRTObject {
  private val __1803569367_Interface: ITimelineMarker.WithDefault by lazy {
    as_1803569367()
  }


  public override val __1803569367_Ptr: JNAPointer? by lazy {
    __1803569367_Interface.__1803569367_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1803569367_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1803569367(): ITimelineMarker.WithDefault {
    if(pointer == NULL) {
      return(ITimelineMarker.ABI.makeITimelineMarker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimelineMarker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimelineMarker.ABI.makeITimelineMarker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimelineMarker>
      {
    public override fun getValue() = TimelineMarker(pointer.getPointer(0))

    public fun setValue(value: TimelineMarker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimelineMarker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITimelineMarkerStatics_Instance: ITimelineMarkerStatics by lazy {
      createITimelineMarkerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.TimelineMarker".toHandle(),
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

    public fun createITimelineMarkerStatics(): ITimelineMarkerStatics {
      val refiid = Guid.REFIID(ITimelineMarkerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.TimelineMarker".toHandle(),refiid,interfacePtr)
      val result = ITimelineMarkerStatics.ABI.makeITimelineMarkerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimelineMarker {
      val address = segment.toRawLongValue()
      return TimelineMarker(Pointer(address))
    }

    public override fun toNative(obj: TimelineMarker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TimeProperty() = ABI.ITimelineMarkerStatics_Instance.get_TimeProperty()

    public fun get_TypeProperty() = ABI.ITimelineMarkerStatics_Instance.get_TypeProperty()

    public fun get_TextProperty() = ABI.ITimelineMarkerStatics_Instance.get_TextProperty()
  }
}
