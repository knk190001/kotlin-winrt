package Microsoft.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DependencyProperty.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DependencyProperty;{960eab49-9672-58a0-995b-3a42e5ea6278})")
@WinRTByReference(brClass = DependencyProperty.ByReference::class)
public class DependencyProperty(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDependencyProperty.WithDefault, IWinRTObject {
  private val __82940217_Interface: IDependencyProperty.WithDefault by lazy {
    as_82940217()
  }


  public override val __82940217_Ptr: JNAPointer? by lazy {
    __82940217_Interface.__82940217_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__82940217_Interface)

  private fun as_82940217(): IDependencyProperty.WithDefault {
    if(pointer == NULL) {
      return(IDependencyProperty.ABI.makeIDependencyProperty(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDependencyProperty>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDependencyProperty.ABI.makeIDependencyProperty(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DependencyProperty> {
    public override fun getValue() = DependencyProperty(pointer.getPointer(0))

    public fun setValue(value: DependencyProperty): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DependencyProperty, MemoryAddress> {
    public val IDependencyPropertyStatics_Instance: IDependencyPropertyStatics by lazy {
      createIDependencyPropertyStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDependencyPropertyStatics(): IDependencyPropertyStatics {
      val refiid = Guid.REFIID(IDependencyPropertyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DependencyProperty".toHandle(),refiid,interfacePtr)
      val result = IDependencyPropertyStatics.ABI.makeIDependencyPropertyStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DependencyProperty {
      val address = segment.toRawLongValue()
      return DependencyProperty(Pointer(address))
    }

    public override fun toNative(obj: DependencyProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UnsetValue() = ABI.IDependencyPropertyStatics_Instance.get_UnsetValue()

    public fun Register(
      name: String,
      propertyType: TypeName,
      ownerType: TypeName,
      typeMetadata: PropertyMetadata
    ) = ABI.IDependencyPropertyStatics_Instance.Register(name, propertyType, ownerType,
        typeMetadata)

    public fun RegisterAttached(
      name: String,
      propertyType: TypeName,
      ownerType: TypeName,
      defaultMetadata: PropertyMetadata
    ) = ABI.IDependencyPropertyStatics_Instance.RegisterAttached(name, propertyType, ownerType,
        defaultMetadata)
  }
}
