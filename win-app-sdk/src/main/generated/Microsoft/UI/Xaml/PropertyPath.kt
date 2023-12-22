package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IPropertyPathFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PropertyPath.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.PropertyPath;{8b0712f6-9e57-53b0-80b1-966a79f60b96})")
@WinRTByReference(brClass = PropertyPath.ByReference::class)
public class PropertyPath(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPropertyPath.WithDefault, IWinRTObject {
  private val __2132522655_Interface: IPropertyPath.WithDefault by lazy {
    as_2132522655()
  }


  public override val __2132522655_Ptr: JNAPointer? by lazy {
    __2132522655_Interface.__2132522655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2132522655_Interface)

  public constructor(path: String) : this(ABI.activate(path))

  private fun as_2132522655(): IPropertyPath.WithDefault {
    if(pointer == NULL) {
      return(IPropertyPath.ABI.makeIPropertyPath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPropertyPath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertyPath.ABI.makeIPropertyPath(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PropertyPath> {
    public override fun getValue() = PropertyPath(pointer.getPointer(0))

    public fun setValue(value: PropertyPath): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PropertyPath, MemoryAddress> {
    public val IPropertyPathFactory_Instance: IPropertyPathFactory by lazy {
      createIPropertyPathFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPropertyPathFactory(): IPropertyPathFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.PropertyPath".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPropertyPathFactory.ABI.makeIPropertyPathFactory(factoryActivatorPtr.value))
    }

    public fun activate(path: String): JNAPointer? =
        IPropertyPathFactory_Instance.CreateInstance(path)?.pointer

    public override fun fromNative(segment: MemoryAddress): PropertyPath {
      val address = segment.toRawLongValue()
      return PropertyPath(Pointer(address))
    }

    public override fun toNative(obj: PropertyPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
