package Windows.UI.Xaml.Resources

import Windows.UI.Xaml.Resources.ICustomXamlResourceLoaderFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CustomXamlResourceLoader.ABI::class)
@Signature("rc(Windows.UI.Xaml.Resources.CustomXamlResourceLoader;{511a84ab-4a88-419f-852e-54083b90b078})")
@WinRTByReference(brClass = CustomXamlResourceLoader.ByReference::class)
public open class CustomXamlResourceLoader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomXamlResourceLoader.WithDefault,
    ICustomXamlResourceLoaderOverrides.WithDefault, IWinRTObject {
  private val __123508437_Interface: ICustomXamlResourceLoader.WithDefault by lazy {
    as_123508437()
  }


  private val __340117202_Interface: ICustomXamlResourceLoaderOverrides.WithDefault by lazy {
    as_340117202()
  }


  public override val __123508437_Ptr: JNAPointer? by lazy {
    __123508437_Interface.__123508437_Ptr
  }


  public override val __340117202_Ptr: JNAPointer? by lazy {
    __340117202_Interface.__340117202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__123508437_Interface, __340117202_Interface)

  public constructor() : this(ABI.activate())

  private fun as_123508437(): ICustomXamlResourceLoader.WithDefault {
    if(pointer == NULL) {
      return(ICustomXamlResourceLoader.ABI.makeICustomXamlResourceLoader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomXamlResourceLoader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomXamlResourceLoader.ABI.makeICustomXamlResourceLoader(ref.value))
  }

  private fun as_340117202(): ICustomXamlResourceLoaderOverrides.WithDefault {
    if(pointer == NULL) {
      return(ICustomXamlResourceLoaderOverrides.ABI.makeICustomXamlResourceLoaderOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomXamlResourceLoaderOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomXamlResourceLoaderOverrides.ABI.makeICustomXamlResourceLoaderOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CustomXamlResourceLoader> {
    public override fun getValue() = CustomXamlResourceLoader(pointer.getPointer(0))

    public fun setValue(value: CustomXamlResourceLoader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomXamlResourceLoader, MemoryAddress> {
    public val ICustomXamlResourceLoaderStatics_Instance: ICustomXamlResourceLoaderStatics by lazy {
      createICustomXamlResourceLoaderStatics()
    }


    public val ICustomXamlResourceLoaderFactory_Instance: ICustomXamlResourceLoaderFactory by lazy {
      createICustomXamlResourceLoaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICustomXamlResourceLoaderStatics(): ICustomXamlResourceLoaderStatics {
      val refiid = Guid.REFIID(ICustomXamlResourceLoaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Resources.CustomXamlResourceLoader".toHandle(),refiid,interfacePtr)
      val result =
          ICustomXamlResourceLoaderStatics.ABI.makeICustomXamlResourceLoaderStatics(interfacePtr.value)
      return result
    }

    public fun createICustomXamlResourceLoaderFactory(): ICustomXamlResourceLoaderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Resources.CustomXamlResourceLoader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICustomXamlResourceLoaderFactory.ABI.makeICustomXamlResourceLoaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ICustomXamlResourceLoaderFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CustomXamlResourceLoader {
      val address = segment.toRawLongValue()
      return CustomXamlResourceLoader(Pointer(address))
    }

    public override fun toNative(obj: CustomXamlResourceLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.ICustomXamlResourceLoaderStatics_Instance.get_Current()

    public fun put_Current(value: CustomXamlResourceLoader) =
        ABI.ICustomXamlResourceLoaderStatics_Instance.put_Current(value)
  }
}
