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

@ABIMarker(RotateTransform.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.RotateTransform;{688ea9b9-1e4e-4596-86e3-428b27334faf})")
@WinRTByReference(brClass = RotateTransform.ByReference::class)
public class RotateTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), IRotateTransform.WithDefault, IWinRTObject {
  private val __1216789205_Interface: IRotateTransform.WithDefault by lazy {
    as_1216789205()
  }


  public override val __1216789205_Ptr: JNAPointer? by lazy {
    __1216789205_Interface.__1216789205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1216789205_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1216789205(): IRotateTransform.WithDefault {
    if(pointer == NULL) {
      return(IRotateTransform.ABI.makeIRotateTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRotateTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRotateTransform.ABI.makeIRotateTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RotateTransform> {
    public override fun getValue() = RotateTransform(pointer.getPointer(0))

    public fun setValue(value: RotateTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RotateTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRotateTransformStatics_Instance: IRotateTransformStatics by lazy {
      createIRotateTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RotateTransform".toHandle(),
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

    public fun createIRotateTransformStatics(): IRotateTransformStatics {
      val refiid = Guid.REFIID(IRotateTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.RotateTransform".toHandle(),refiid,interfacePtr)
      val result = IRotateTransformStatics.ABI.makeIRotateTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RotateTransform {
      val address = segment.toRawLongValue()
      return RotateTransform(Pointer(address))
    }

    public override fun toNative(obj: RotateTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterXProperty() = ABI.IRotateTransformStatics_Instance.get_CenterXProperty()

    public fun get_CenterYProperty() = ABI.IRotateTransformStatics_Instance.get_CenterYProperty()

    public fun get_AngleProperty() = ABI.IRotateTransformStatics_Instance.get_AngleProperty()
  }
}
