package Microsoft.UI.Xaml.Media

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

@ABIMarker(ScaleTransform.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.ScaleTransform;{94b064a4-34f0-5ef9-8b67-444f5699f52a})")
@WinRTByReference(brClass = ScaleTransform.ByReference::class)
public class ScaleTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), IScaleTransform.WithDefault, IWinRTObject {
  private val __1985061811_Interface: IScaleTransform.WithDefault by lazy {
    as_1985061811()
  }


  public override val __1985061811_Ptr: JNAPointer? by lazy {
    __1985061811_Interface.__1985061811_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1985061811_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1985061811(): IScaleTransform.WithDefault {
    if(pointer == NULL) {
      return(IScaleTransform.ABI.makeIScaleTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScaleTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScaleTransform.ABI.makeIScaleTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ScaleTransform>
      {
    public override fun getValue() = ScaleTransform(pointer.getPointer(0))

    public fun setValue(value: ScaleTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScaleTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IScaleTransformStatics_Instance: IScaleTransformStatics by lazy {
      createIScaleTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.ScaleTransform".toHandle(),
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

    public fun createIScaleTransformStatics(): IScaleTransformStatics {
      val refiid = Guid.REFIID(IScaleTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.ScaleTransform".toHandle(),refiid,interfacePtr)
      val result = IScaleTransformStatics.ABI.makeIScaleTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ScaleTransform {
      val address = segment.toRawLongValue()
      return ScaleTransform(Pointer(address))
    }

    public override fun toNative(obj: ScaleTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterXProperty() = ABI.IScaleTransformStatics_Instance.get_CenterXProperty()

    public fun get_CenterYProperty() = ABI.IScaleTransformStatics_Instance.get_CenterYProperty()

    public fun get_ScaleXProperty() = ABI.IScaleTransformStatics_Instance.get_ScaleXProperty()

    public fun get_ScaleYProperty() = ABI.IScaleTransformStatics_Instance.get_ScaleYProperty()
  }
}
