package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.IPointKeyFrameFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PointKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.PointKeyFrame;{59d5c07d-a3a7-5450-9dfb-4b7e77d58f93})")
@WinRTByReference(brClass = PointKeyFrame.ByReference::class)
public open class PointKeyFrame(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPointKeyFrame.WithDefault, IWinRTObject {
  private val __1161365987_Interface: IPointKeyFrame.WithDefault by lazy {
    as_1161365987()
  }


  public override val __1161365987_Ptr: JNAPointer? by lazy {
    __1161365987_Interface.__1161365987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1161365987_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1161365987(): IPointKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IPointKeyFrame.ABI.makeIPointKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointKeyFrame.ABI.makeIPointKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PointKeyFrame>
      {
    public override fun getValue() = PointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: PointKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointKeyFrame, MemoryAddress> {
    public val IPointKeyFrameStatics_Instance: IPointKeyFrameStatics by lazy {
      createIPointKeyFrameStatics()
    }


    public val IPointKeyFrameFactory_Instance: IPointKeyFrameFactory by lazy {
      createIPointKeyFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPointKeyFrameStatics(): IPointKeyFrameStatics {
      val refiid = Guid.REFIID(IPointKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointKeyFrame".toHandle(),refiid,interfacePtr)
      val result = IPointKeyFrameStatics.ABI.makeIPointKeyFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIPointKeyFrameFactory(): IPointKeyFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointKeyFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPointKeyFrameFactory.ABI.makeIPointKeyFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPointKeyFrameFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PointKeyFrame {
      val address = segment.toRawLongValue()
      return PointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: PointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ValueProperty() = ABI.IPointKeyFrameStatics_Instance.get_ValueProperty()

    public fun get_KeyTimeProperty() = ABI.IPointKeyFrameStatics_Instance.get_KeyTimeProperty()
  }
}
