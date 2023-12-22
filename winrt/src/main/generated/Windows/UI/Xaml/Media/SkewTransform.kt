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

@ABIMarker(SkewTransform.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.SkewTransform;{4e8a3b15-7a0f-4617-9e98-1e65bdc92115})")
@WinRTByReference(brClass = SkewTransform.ByReference::class)
public class SkewTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), ISkewTransform.WithDefault, IWinRTObject {
  private val __939243782_Interface: ISkewTransform.WithDefault by lazy {
    as_939243782()
  }


  public override val __939243782_Ptr: JNAPointer? by lazy {
    __939243782_Interface.__939243782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__939243782_Interface)

  public constructor() : this(ABI.activate())

  private fun as_939243782(): ISkewTransform.WithDefault {
    if(pointer == NULL) {
      return(ISkewTransform.ABI.makeISkewTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISkewTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISkewTransform.ABI.makeISkewTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SkewTransform>
      {
    public override fun getValue() = SkewTransform(pointer.getPointer(0))

    public fun setValue(value: SkewTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SkewTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISkewTransformStatics_Instance: ISkewTransformStatics by lazy {
      createISkewTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.SkewTransform".toHandle(),
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

    public fun createISkewTransformStatics(): ISkewTransformStatics {
      val refiid = Guid.REFIID(ISkewTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.SkewTransform".toHandle(),refiid,interfacePtr)
      val result = ISkewTransformStatics.ABI.makeISkewTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SkewTransform {
      val address = segment.toRawLongValue()
      return SkewTransform(Pointer(address))
    }

    public override fun toNative(obj: SkewTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CenterXProperty() = ABI.ISkewTransformStatics_Instance.get_CenterXProperty()

    public fun get_CenterYProperty() = ABI.ISkewTransformStatics_Instance.get_CenterYProperty()

    public fun get_AngleXProperty() = ABI.ISkewTransformStatics_Instance.get_AngleXProperty()

    public fun get_AngleYProperty() = ABI.ISkewTransformStatics_Instance.get_AngleYProperty()
  }
}
