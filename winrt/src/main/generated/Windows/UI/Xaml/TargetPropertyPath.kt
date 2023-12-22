package Windows.UI.Xaml

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TargetPropertyPath.ABI::class)
@Signature("rc(Windows.UI.Xaml.TargetPropertyPath;{40740f8e-085f-4ced-be70-6f47acf15ad0})")
@WinRTByReference(brClass = TargetPropertyPath.ByReference::class)
public class TargetPropertyPath(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetPropertyPath.WithDefault, IWinRTObject {
  private val __1997582947_Interface: ITargetPropertyPath.WithDefault by lazy {
    as_1997582947()
  }


  public override val __1997582947_Ptr: JNAPointer? by lazy {
    __1997582947_Interface.__1997582947_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1997582947_Interface)

  public constructor() : this(ABI.activate())

  public constructor(targetProperty: DependencyProperty) : this(ABI.activate(targetProperty))

  private fun as_1997582947(): ITargetPropertyPath.WithDefault {
    if(pointer == NULL) {
      return(ITargetPropertyPath.ABI.makeITargetPropertyPath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetPropertyPath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetPropertyPath.ABI.makeITargetPropertyPath(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetPropertyPath> {
    public override fun getValue() = TargetPropertyPath(pointer.getPointer(0))

    public fun setValue(value: TargetPropertyPath): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetPropertyPath, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ITargetPropertyPathFactory_Instance: ITargetPropertyPathFactory by lazy {
      createITargetPropertyPathFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.TargetPropertyPath".toHandle(),
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

    public fun createITargetPropertyPathFactory(): ITargetPropertyPathFactory {
      val refiid = Guid.REFIID(ITargetPropertyPathFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.TargetPropertyPath".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITargetPropertyPathFactory.ABI.makeITargetPropertyPathFactory(factoryActivatorPtr.value))
    }

    public fun activate(targetProperty: DependencyProperty): JNAPointer? =
        ITargetPropertyPathFactory_Instance.CreateInstance(targetProperty)?.pointer

    public override fun fromNative(segment: MemoryAddress): TargetPropertyPath {
      val address = segment.toRawLongValue()
      return TargetPropertyPath(Pointer(address))
    }

    public override fun toNative(obj: TargetPropertyPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
