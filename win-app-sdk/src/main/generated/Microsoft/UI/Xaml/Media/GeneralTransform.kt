package Microsoft.UI.Xaml.Media

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.IGeneralTransformFactory.ABI.IID
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

@ABIMarker(GeneralTransform.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.GeneralTransform;{04eedeeb-31e5-54c0-ae3f-8bd06645d339})")
@WinRTByReference(brClass = GeneralTransform.ByReference::class)
public open class GeneralTransform(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IGeneralTransform.WithDefault, IGeneralTransformOverrides.WithDefault,
    IWinRTObject {
  private val __475759211_Interface: IGeneralTransform.WithDefault by lazy {
    as_475759211()
  }


  private val __1251309586_Interface: IGeneralTransformOverrides.WithDefault by lazy {
    as_1251309586()
  }


  public override val __475759211_Ptr: JNAPointer? by lazy {
    __475759211_Interface.__475759211_Ptr
  }


  public override val __1251309586_Ptr: JNAPointer? by lazy {
    __1251309586_Interface.__1251309586_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__475759211_Interface, __1251309586_Interface)

  public constructor() : this(ABI.activate())

  private fun as_475759211(): IGeneralTransform.WithDefault {
    if(pointer == NULL) {
      return(IGeneralTransform.ABI.makeIGeneralTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeneralTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeneralTransform.ABI.makeIGeneralTransform(ref.value))
  }

  private fun as_1251309586(): IGeneralTransformOverrides.WithDefault {
    if(pointer == NULL) {
      return(IGeneralTransformOverrides.ABI.makeIGeneralTransformOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeneralTransformOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeneralTransformOverrides.ABI.makeIGeneralTransformOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeneralTransform> {
    public override fun getValue() = GeneralTransform(pointer.getPointer(0))

    public fun setValue(value: GeneralTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeneralTransform, MemoryAddress> {
    public val IGeneralTransformFactory_Instance: IGeneralTransformFactory by lazy {
      createIGeneralTransformFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeneralTransformFactory(): IGeneralTransformFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.GeneralTransform".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeneralTransformFactory.ABI.makeIGeneralTransformFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IGeneralTransformFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): GeneralTransform {
      val address = segment.toRawLongValue()
      return GeneralTransform(Pointer(address))
    }

    public override fun toNative(obj: GeneralTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
