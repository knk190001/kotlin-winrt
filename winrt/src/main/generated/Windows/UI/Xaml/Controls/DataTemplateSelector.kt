package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IDataTemplateSelectorFactory.ABI.IID
import Windows.UI.Xaml.IElementFactory
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
@Signature("rc(Windows.UI.Xaml.Controls.DataTemplateSelector;{a907d496-46a0-4cd7-8dbe-f9a581df60b1})")
@WinRTByReference(brClass = DataTemplateSelector.ByReference::class)
public open class DataTemplateSelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataTemplateSelector.WithDefault, IDataTemplateSelector2.WithDefault,
    IDataTemplateSelectorOverrides.WithDefault, IDataTemplateSelectorOverrides2.WithDefault,
    IElementFactory.WithDefault, IWinRTObject {
  private val __1268899935_Interface: IDataTemplateSelector.WithDefault by lazy {
    as_1268899935()
  }


  private val __681192371_Interface: IDataTemplateSelector2.WithDefault by lazy {
    as_681192371()
  }


  private val __1853462664_Interface: IDataTemplateSelectorOverrides.WithDefault by lazy {
    as_1853462664()
  }


  private val __1622767786_Interface: IDataTemplateSelectorOverrides2.WithDefault by lazy {
    as_1622767786()
  }


  private val __1017931072_Interface: IElementFactory.WithDefault by lazy {
    as_1017931072()
  }


  public override val __1268899935_Ptr: JNAPointer? by lazy {
    __1268899935_Interface.__1268899935_Ptr
  }


  public override val __681192371_Ptr: JNAPointer? by lazy {
    __681192371_Interface.__681192371_Ptr
  }


  public override val __1853462664_Ptr: JNAPointer? by lazy {
    __1853462664_Interface.__1853462664_Ptr
  }


  public override val __1622767786_Ptr: JNAPointer? by lazy {
    __1622767786_Interface.__1622767786_Ptr
  }


  public override val __1017931072_Ptr: JNAPointer? by lazy {
    __1017931072_Interface.__1017931072_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1268899935_Interface, __681192371_Interface, __1853462664_Interface,
        __1622767786_Interface, __1017931072_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1268899935(): IDataTemplateSelector.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelector.ABI.makeIDataTemplateSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelector.ABI.makeIDataTemplateSelector(ref.value))
  }

  private fun as_681192371(): IDataTemplateSelector2.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelector2.ABI.makeIDataTemplateSelector2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelector2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelector2.ABI.makeIDataTemplateSelector2(ref.value))
  }

  private fun as_1853462664(): IDataTemplateSelectorOverrides.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelectorOverrides.ABI.makeIDataTemplateSelectorOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelectorOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelectorOverrides.ABI.makeIDataTemplateSelectorOverrides(ref.value))
  }

  private fun as_1622767786(): IDataTemplateSelectorOverrides2.WithDefault {
    if(pointer == NULL) {
      return(IDataTemplateSelectorOverrides2.ABI.makeIDataTemplateSelectorOverrides2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataTemplateSelectorOverrides2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataTemplateSelectorOverrides2.ABI.makeIDataTemplateSelectorOverrides2(ref.value))
  }

  private fun as_1017931072(): IElementFactory.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DataTemplateSelector".toHandle(),refiid,factoryActivatorPtr)
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
