package Windows.UI.Xaml.Data

import Windows.UI.Xaml.Data.IPropertyChangedEventArgsFactory.ABI.IID
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

@ABIMarker(PropertyChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.PropertyChangedEventArgs;{4f33a9a0-5cf4-47a4-b16f-d7faaf17457e})")
@WinRTByReference(brClass = PropertyChangedEventArgs.ByReference::class)
public open class PropertyChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPropertyChangedEventArgs.WithDefault, IWinRTObject {
  private val __1472638880_Interface: IPropertyChangedEventArgs.WithDefault by lazy {
    as_1472638880()
  }


  public override val __1472638880_Ptr: JNAPointer? by lazy {
    __1472638880_Interface.__1472638880_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1472638880_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_1472638880(): IPropertyChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPropertyChangedEventArgs.ABI.makeIPropertyChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPropertyChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertyChangedEventArgs.ABI.makeIPropertyChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PropertyChangedEventArgs> {
    public override fun getValue() = PropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PropertyChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PropertyChangedEventArgs, MemoryAddress> {
    public val IPropertyChangedEventArgsFactory_Instance: IPropertyChangedEventArgsFactory by lazy {
      createIPropertyChangedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPropertyChangedEventArgsFactory(): IPropertyChangedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.PropertyChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPropertyChangedEventArgsFactory.ABI.makeIPropertyChangedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IPropertyChangedEventArgsFactory_Instance.CreateInstance(name, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return PropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PropertyChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
