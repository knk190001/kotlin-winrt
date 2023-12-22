package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.Animation.IDoubleKeyFrameFactory.ABI.IID
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

@ABIMarker(DoubleKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DoubleKeyFrame;{674456fd-e81e-4f4e-b4ad-0acfed9ecd68})")
@WinRTByReference(brClass = DoubleKeyFrame.ByReference::class)
public open class DoubleKeyFrame(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IDoubleKeyFrame.WithDefault, IWinRTObject {
  private val __1526890693_Interface: IDoubleKeyFrame.WithDefault by lazy {
    as_1526890693()
  }


  public override val __1526890693_Ptr: JNAPointer? by lazy {
    __1526890693_Interface.__1526890693_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1526890693_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1526890693(): IDoubleKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IDoubleKeyFrame.ABI.makeIDoubleKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDoubleKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDoubleKeyFrame.ABI.makeIDoubleKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DoubleKeyFrame>
      {
    public override fun getValue() = DoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: DoubleKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DoubleKeyFrame, MemoryAddress> {
    public val IDoubleKeyFrameStatics_Instance: IDoubleKeyFrameStatics by lazy {
      createIDoubleKeyFrameStatics()
    }


    public val IDoubleKeyFrameFactory_Instance: IDoubleKeyFrameFactory by lazy {
      createIDoubleKeyFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDoubleKeyFrameStatics(): IDoubleKeyFrameStatics {
      val refiid = Guid.REFIID(IDoubleKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DoubleKeyFrame".toHandle(),refiid,interfacePtr)
      val result = IDoubleKeyFrameStatics.ABI.makeIDoubleKeyFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIDoubleKeyFrameFactory(): IDoubleKeyFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DoubleKeyFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDoubleKeyFrameFactory.ABI.makeIDoubleKeyFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDoubleKeyFrameFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DoubleKeyFrame {
      val address = segment.toRawLongValue()
      return DoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: DoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ValueProperty() = ABI.IDoubleKeyFrameStatics_Instance.get_ValueProperty()

    public fun get_KeyTimeProperty() = ABI.IDoubleKeyFrameStatics_Instance.get_KeyTimeProperty()
  }
}
