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

@ABIMarker(TranslateTransform.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.TranslateTransform;{cfa21ca9-b79f-5450-b459-a96c48cb2c8f})")
@WinRTByReference(brClass = TranslateTransform.ByReference::class)
public class TranslateTransform(
  ptr: JNAPointer? = NULL
) : Transform(ptr), ITranslateTransform.WithDefault, IWinRTObject {
  private val __1002446929_Interface: ITranslateTransform.WithDefault by lazy {
    as_1002446929()
  }


  public override val __1002446929_Ptr: JNAPointer? by lazy {
    __1002446929_Interface.__1002446929_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1002446929_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1002446929(): ITranslateTransform.WithDefault {
    if(pointer == NULL) {
      return(ITranslateTransform.ABI.makeITranslateTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITranslateTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITranslateTransform.ABI.makeITranslateTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TranslateTransform> {
    public override fun getValue() = TranslateTransform(pointer.getPointer(0))

    public fun setValue(value: TranslateTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TranslateTransform, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITranslateTransformStatics_Instance: ITranslateTransformStatics by lazy {
      createITranslateTransformStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TranslateTransform".toHandle(),
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

    public fun createITranslateTransformStatics(): ITranslateTransformStatics {
      val refiid = Guid.REFIID(ITranslateTransformStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.TranslateTransform".toHandle(),refiid,interfacePtr)
      val result = ITranslateTransformStatics.ABI.makeITranslateTransformStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TranslateTransform {
      val address = segment.toRawLongValue()
      return TranslateTransform(Pointer(address))
    }

    public override fun toNative(obj: TranslateTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_XProperty() = ABI.ITranslateTransformStatics_Instance.get_XProperty()

    public fun get_YProperty() = ABI.ITranslateTransformStatics_Instance.get_YProperty()
  }
}
