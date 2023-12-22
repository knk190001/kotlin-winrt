package Windows.UI.Xaml.Media

import Windows.UI.Composition.IAnimationObject
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.IBrushFactory.ABI.IID
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

@ABIMarker(Brush.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Brush;{8806a321-1e06-422c-a1cc-01696559e021})")
@WinRTByReference(brClass = Brush.ByReference::class)
public open class Brush(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IBrush.WithDefault, IBrushOverrides2.WithDefault,
    IAnimationObject.WithDefault, IWinRTObject {
  private val __1235051198_Interface: IBrush.WithDefault by lazy {
    as_1235051198()
  }


  private val __996618167_Interface: IBrushOverrides2.WithDefault by lazy {
    as_996618167()
  }


  private val __1365507701_Interface: IAnimationObject.WithDefault by lazy {
    as_1365507701()
  }


  public override val __1235051198_Ptr: JNAPointer? by lazy {
    __1235051198_Interface.__1235051198_Ptr
  }


  public override val __996618167_Ptr: JNAPointer? by lazy {
    __996618167_Interface.__996618167_Ptr
  }


  public override val __1365507701_Ptr: JNAPointer? by lazy {
    __1365507701_Interface.__1365507701_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1235051198_Interface, __996618167_Interface, __1365507701_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1235051198(): IBrush.WithDefault {
    if(pointer == NULL) {
      return(IBrush.ABI.makeIBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBrush.ABI.makeIBrush(ref.value))
  }

  private fun as_996618167(): IBrushOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IBrushOverrides2.ABI.makeIBrushOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBrushOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBrushOverrides2.ABI.makeIBrushOverrides2(ref.value))
  }

  private fun as_1365507701(): IAnimationObject.WithDefault {
    if(pointer == NULL) {
      return(IAnimationObject.ABI.makeIAnimationObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationObject.ABI.makeIAnimationObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Brush> {
    public override fun getValue() = Brush(pointer.getPointer(0))

    public fun setValue(value: Brush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Brush, MemoryAddress> {
    public val IBrushStatics_Instance: IBrushStatics by lazy {
      createIBrushStatics()
    }


    public val IBrushFactory_Instance: IBrushFactory by lazy {
      createIBrushFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBrushStatics(): IBrushStatics {
      val refiid = Guid.REFIID(IBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Brush".toHandle(),refiid,interfacePtr)
      val result = IBrushStatics.ABI.makeIBrushStatics(interfacePtr.value)
      return result
    }

    public fun createIBrushFactory(): IBrushFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Brush".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBrushFactory.ABI.makeIBrushFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBrushFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Brush {
      val address = segment.toRawLongValue()
      return Brush(Pointer(address))
    }

    public override fun toNative(obj: Brush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OpacityProperty() = ABI.IBrushStatics_Instance.get_OpacityProperty()

    public fun get_TransformProperty() = ABI.IBrushStatics_Instance.get_TransformProperty()

    public fun get_RelativeTransformProperty() =
        ABI.IBrushStatics_Instance.get_RelativeTransformProperty()
  }
}
