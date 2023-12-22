package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IDataTemplateSelectorFactory.ABI.IID
import Microsoft.UI.Xaml.IElementFactory
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

@ABIMarker(DataTemplateSelector.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.DataTemplateSelector;{86ca4fa4-7de0-5049-82f5-39ec78569028})")
@WinRTByReference(brClass = DataTemplateSelector.ByReference::class)
public open class DataTemplateSelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataTemplateSelector.WithDefault, IDataTemplateSelectorOverrides.WithDefault,
    IElementFactory.WithDefault, IWinRTObject {
  private val __561303178_Interface: IDataTemplateSelector.WithDefault by lazy {
    as_561303178()
  }


  private val __1416129213_Interface: IDataTemplateSelectorOverrides.WithDefault by lazy {
    as_1416129213()
  }


  private val __1007794571_Interface: IElementFactory.WithDefault by lazy {
    as_1007794571()
  }


  public override val __561303178_Ptr: JNAPointer? by lazy {
    __561303178_Interface.__561303178_Ptr
  }


  public override val __1416129213_Ptr: JNAPointer? by lazy {
    __1416129213_Interface.__1416129213_Ptr
  }


  public override val __1007794571_Ptr: JNAPointer? by lazy {
    __1007794571_Interface.__1007794571_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__561303178_Interface, __1416129213_Interface, __1007794571_Interface)

  public constructor() : this(ABI.activate())

  private fun as_561303178(): IDataTemplateSelector.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelector.ABI.makeIDataTemplateSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelector.ABI.makeIDataTemplateSelector(ref.value))
  }

  private fun as_1416129213(): IDataTemplateSelectorOverrides.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelectorOverrides.ABI.makeIDataTemplateSelectorOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelectorOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelectorOverrides.ABI.makeIDataTemplateSelectorOverrides(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataTemplateSelector> {
    public override fun getValue() = DataTemplateSelector(pointer.getPointer(0))

    public fun setValue(value: DataTemplateSelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataTemplateSelector, MemoryAddress> {
    public val IDataTemplateSelectorFactory_Instance: IDataTemplateSelectorFactory by lazy {
      createIDataTemplateSelectorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDataTemplateSelectorFactory(): IDataTemplateSelectorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.DataTemplateSelector".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDataTemplateSelectorFactory.ABI.makeIDataTemplateSelectorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDataTemplateSelectorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DataTemplateSelector {
      val address = segment.toRawLongValue()
      return DataTemplateSelector(Pointer(address))
    }

    public override fun toNative(obj: DataTemplateSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
