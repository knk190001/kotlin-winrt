package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.Animation.IColorKeyFrameFactory.ABI.IID
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

@ABIMarker(ColorKeyFrame.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.ColorKeyFrame;{b51d82d9-0910-4589-a284-b0c9205858e9})")
@WinRTByReference(brClass = ColorKeyFrame.ByReference::class)
public open class ColorKeyFrame(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IColorKeyFrame.WithDefault, IWinRTObject {
  private val __584224117_Interface: IColorKeyFrame.WithDefault by lazy {
    as_584224117()
  }


  public override val __584224117_Ptr: JNAPointer? by lazy {
    __584224117_Interface.__584224117_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__584224117_Interface)

  public constructor() : this(ABI.activate())

  private fun as_584224117(): IColorKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IColorKeyFrame.ABI.makeIColorKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorKeyFrame.ABI.makeIColorKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ColorKeyFrame>
      {
    public override fun getValue() = ColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ColorKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorKeyFrame, MemoryAddress> {
    public val IColorKeyFrameStatics_Instance: IColorKeyFrameStatics by lazy {
      createIColorKeyFrameStatics()
    }


    public val IColorKeyFrameFactory_Instance: IColorKeyFrameFactory by lazy {
      createIColorKeyFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorKeyFrameStatics(): IColorKeyFrameStatics {
      val refiid = Guid.REFIID(IColorKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ColorKeyFrame".toHandle(),refiid,interfacePtr)
      val result = IColorKeyFrameStatics.ABI.makeIColorKeyFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIColorKeyFrameFactory(): IColorKeyFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.ColorKeyFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColorKeyFrameFactory.ABI.makeIColorKeyFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IColorKeyFrameFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColorKeyFrame {
      val address = segment.toRawLongValue()
      return ColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ValueProperty() = ABI.IColorKeyFrameStatics_Instance.get_ValueProperty()

    public fun get_KeyTimeProperty() = ABI.IColorKeyFrameStatics_Instance.get_KeyTimeProperty()
  }
}
