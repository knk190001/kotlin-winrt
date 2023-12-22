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

@ABIMarker(CompositeTransform.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.CompositeTransform;{c8a4385b-f24a-4701-a265-a78846f142b9})")
@WinRTByReference(brClass = CompositeTransform.ByReference::class)
public class CompositeTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), ICompositeTransform.WithDefault, IWinRTObject {
  private val __1213533089_Interface: ICompositeTransform.WithDefault by lazy {
    as_1213533089()
  }


  public override val __1213533089_Ptr: JNAPointer? by lazy {
    __1213533089_Interface.__1213533089_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1213533089_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1213533089(): ICompositeTransform.WithDefault {
    if(pointer == NULL) {
      return(ICompositeTransform.ABI.makeICompositeTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositeTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositeTransform.ABI.makeICompositeTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositeTransform> {
    public override fun getValue() = CompositeTransform(pointer.getPointer(0))

    public fun setValue(value: CompositeTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositeTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICompositeTransformStatics_Instance: ICompositeTransformStatics by lazy {
      createICompositeTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.CompositeTransform".toHandle(),
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

    public fun createICompositeTransformStatics(): ICompositeTransformStatics {
      val refiid = Guid.REFIID(ICompositeTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.CompositeTransform".toHandle(),refiid,interfacePtr)
      val result = ICompositeTransformStatics.ABI.makeICompositeTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositeTransform {
      val address = segment.toRawLongValue()
      return CompositeTransform(Pointer(address))
    }

    public override fun toNative(obj: CompositeTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterXProperty() = ABI.ICompositeTransformStatics_Instance.get_CenterXProperty()

    public fun get_CenterYProperty() = ABI.ICompositeTransformStatics_Instance.get_CenterYProperty()

    public fun get_ScaleXProperty() = ABI.ICompositeTransformStatics_Instance.get_ScaleXProperty()

    public fun get_ScaleYProperty() = ABI.ICompositeTransformStatics_Instance.get_ScaleYProperty()

    public fun get_SkewXProperty() = ABI.ICompositeTransformStatics_Instance.get_SkewXProperty()

    public fun get_SkewYProperty() = ABI.ICompositeTransformStatics_Instance.get_SkewYProperty()

    public fun get_RotationProperty() =
        ABI.ICompositeTransformStatics_Instance.get_RotationProperty()

    public fun get_TranslateXProperty() =
        ABI.ICompositeTransformStatics_Instance.get_TranslateXProperty()

    public fun get_TranslateYProperty() =
        ABI.ICompositeTransformStatics_Instance.get_TranslateYProperty()
  }
}
