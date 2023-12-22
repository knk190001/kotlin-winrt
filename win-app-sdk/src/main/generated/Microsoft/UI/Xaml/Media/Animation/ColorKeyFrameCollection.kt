package Microsoft.UI.Xaml.Media.Animation

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ColorKeyFrameCollection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ColorKeyFrameCollection;pinterface({913337e9-11a1-4345-a3a2-4e7f956e222d};rc(Microsoft.UI.Xaml.Media.Animation.ColorKeyFrame;{02848c7e-c772-5f66-842b-fd494d0da669})))")
@WinRTByReference(brClass = ColorKeyFrameCollection.ByReference::class)
public class ColorKeyFrameCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVector<ColorKeyFrame?>, IIterable<ColorKeyFrame?>, IWinRTObject {
  private val __1070388601_Interface: IVector<ColorKeyFrame?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<ColorKeyFrame?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<ColorKeyFrame?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<ColorKeyFrame?>>()

  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1070388601(): IVector<ColorKeyFrame?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<ColorKeyFrame?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<ColorKeyFrame?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<ColorKeyFrame?>(ref.value))
  }

  private fun as_1449643190(): IIterable<ColorKeyFrame?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<ColorKeyFrame?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<ColorKeyFrame?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<ColorKeyFrame?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorKeyFrameCollection> {
    public override fun getValue() = ColorKeyFrameCollection(pointer.getPointer(0))

    public fun setValue(value: ColorKeyFrameCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorKeyFrameCollection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ColorKeyFrameCollection".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ColorKeyFrameCollection {
      val address = segment.toRawLongValue()
      return ColorKeyFrameCollection(Pointer(address))
    }

    public override fun toNative(obj: ColorKeyFrameCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
