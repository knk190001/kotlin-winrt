package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.ITimelineFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Timeline.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.Timeline;{d0f9b330-cc2a-5b05-9786-2da4c6584581})")
@WinRTByReference(brClass = Timeline.ByReference::class)
public open class Timeline(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ITimeline.WithDefault, IWinRTObject {
  private val __2079271108_Interface: ITimeline.WithDefault by lazy {
    as_2079271108()
  }


  public override val __2079271108_Ptr: JNAPointer? by lazy {
    __2079271108_Interface.__2079271108_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2079271108_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2079271108(): ITimeline.WithDefault {
    if(pointer == NULL) {
      return(ITimeline.ABI.makeITimeline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimeline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimeline.ABI.makeITimeline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Timeline> {
    public override fun getValue() = Timeline(pointer.getPointer(0))

    public fun setValue(value: Timeline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Timeline, MemoryAddress> {
    public val ITimelineStatics_Instance: ITimelineStatics by lazy {
      createITimelineStatics()
    }


    public val ITimelineFactory_Instance: ITimelineFactory by lazy {
      createITimelineFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimelineStatics(): ITimelineStatics {
      val refiid = Guid.REFIID(ITimelineStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.Timeline".toHandle(),refiid,interfacePtr)
      val result = ITimelineStatics.ABI.makeITimelineStatics(interfacePtr.value)
      return result
    }

    public fun createITimelineFactory(): ITimelineFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.Timeline".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimelineFactory.ABI.makeITimelineFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITimelineFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Timeline {
      val address = segment.toRawLongValue()
      return Timeline(Pointer(address))
    }

    public override fun toNative(obj: Timeline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AllowDependentAnimations() =
        ABI.ITimelineStatics_Instance.get_AllowDependentAnimations()

    public fun put_AllowDependentAnimations(value: Boolean) =
        ABI.ITimelineStatics_Instance.put_AllowDependentAnimations(value)

    public fun get_AutoReverseProperty() = ABI.ITimelineStatics_Instance.get_AutoReverseProperty()

    public fun get_BeginTimeProperty() = ABI.ITimelineStatics_Instance.get_BeginTimeProperty()

    public fun get_DurationProperty() = ABI.ITimelineStatics_Instance.get_DurationProperty()

    public fun get_SpeedRatioProperty() = ABI.ITimelineStatics_Instance.get_SpeedRatioProperty()

    public fun get_FillBehaviorProperty() = ABI.ITimelineStatics_Instance.get_FillBehaviorProperty()

    public fun get_RepeatBehaviorProperty() =
        ABI.ITimelineStatics_Instance.get_RepeatBehaviorProperty()
  }
}
