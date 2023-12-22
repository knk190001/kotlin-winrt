package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.IObjectKeyFrameFactory.ABI.IID
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

@ABIMarker(ObjectKeyFrame.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ObjectKeyFrame;{c5a9f65b-fc69-5a88-a797-34f46d761381})")
@WinRTByReference(brClass = ObjectKeyFrame.ByReference::class)
public open class ObjectKeyFrame(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IObjectKeyFrame.WithDefault, IWinRTObject {
  private val __1525100904_Interface: IObjectKeyFrame.WithDefault by lazy {
    as_1525100904()
  }


  public override val __1525100904_Ptr: JNAPointer? by lazy {
    __1525100904_Interface.__1525100904_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1525100904_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1525100904(): IObjectKeyFrame.WithDefault {
    if(pointer == NULL) {
      return(IObjectKeyFrame.ABI.makeIObjectKeyFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObjectKeyFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObjectKeyFrame.ABI.makeIObjectKeyFrame(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ObjectKeyFrame>
      {
    public override fun getValue() = ObjectKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ObjectKeyFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ObjectKeyFrame, MemoryAddress> {
    public val IObjectKeyFrameStatics_Instance: IObjectKeyFrameStatics by lazy {
      createIObjectKeyFrameStatics()
    }


    public val IObjectKeyFrameFactory_Instance: IObjectKeyFrameFactory by lazy {
      createIObjectKeyFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIObjectKeyFrameStatics(): IObjectKeyFrameStatics {
      val refiid = Guid.REFIID(IObjectKeyFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ObjectKeyFrame".toHandle(),refiid,interfacePtr)
      val result = IObjectKeyFrameStatics.ABI.makeIObjectKeyFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIObjectKeyFrameFactory(): IObjectKeyFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ObjectKeyFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IObjectKeyFrameFactory.ABI.makeIObjectKeyFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IObjectKeyFrameFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ObjectKeyFrame {
      val address = segment.toRawLongValue()
      return ObjectKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ObjectKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ValueProperty() = ABI.IObjectKeyFrameStatics_Instance.get_ValueProperty()

    public fun get_KeyTimeProperty() = ABI.IObjectKeyFrameStatics_Instance.get_KeyTimeProperty()
  }
}
