package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IDataTemplateFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DataTemplate.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DataTemplate;{08fa70fa-ee75-5e92-a101-f52d0e1e9fab})")
@WinRTByReference(brClass = DataTemplate.ByReference::class)
public open class DataTemplate(
  ptr: JNAPointer? = NULL
) : FrameworkTemplate(ptr), IDataTemplate.WithDefault, IElementFactory.WithDefault, IWinRTObject {
  private val __1262199797_Interface: IDataTemplate.WithDefault by lazy {
    as_1262199797()
  }


  private val __1007794571_Interface: IElementFactory.WithDefault by lazy {
    as_1007794571()
  }


  public override val __1262199797_Ptr: JNAPointer? by lazy {
    __1262199797_Interface.__1262199797_Ptr
  }


  public override val __1007794571_Ptr: JNAPointer? by lazy {
    __1007794571_Interface.__1007794571_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1262199797_Interface, __1007794571_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1262199797(): IDataTemplate.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplate.ABI.makeIDataTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplate.ABI.makeIDataTemplate(ref.value))
  }

  private fun as_1007794571(): IElementFactory.WithDefault {
    if(pointer == NULL) {
      return(IElementFactory.ABI.makeIElementFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElementFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElementFactory.ABI.makeIElementFactory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataTemplate> {
    public override fun getValue() = DataTemplate(pointer.getPointer(0))

    public fun setValue(value: DataTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataTemplate, MemoryAddress> {
    public val IDataTemplateStatics_Instance: IDataTemplateStatics by lazy {
      createIDataTemplateStatics()
    }


    public val IDataTemplateFactory_Instance: IDataTemplateFactory by lazy {
      createIDataTemplateFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataTemplateStatics(): IDataTemplateStatics {
      val refiid = Guid.REFIID(IDataTemplateStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DataTemplate".toHandle(),refiid,interfacePtr)
      val result = IDataTemplateStatics.ABI.makeIDataTemplateStatics(interfacePtr.value)
      return result
    }

    public fun createIDataTemplateFactory(): IDataTemplateFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.DataTemplate".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataTemplateFactory.ABI.makeIDataTemplateFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDataTemplateFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataTemplate {
      val address = segment.toRawLongValue()
      return DataTemplate(Pointer(address))
    }

    public override fun toNative(obj: DataTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExtensionInstanceProperty() =
        ABI.IDataTemplateStatics_Instance.get_ExtensionInstanceProperty()

    public fun GetExtensionInstance(element: FrameworkElement) =
        ABI.IDataTemplateStatics_Instance.GetExtensionInstance(element)

    public fun SetExtensionInstance(element: FrameworkElement, value: IDataTemplateExtension) =
        ABI.IDataTemplateStatics_Instance.SetExtensionInstance(element, value)
  }
}
