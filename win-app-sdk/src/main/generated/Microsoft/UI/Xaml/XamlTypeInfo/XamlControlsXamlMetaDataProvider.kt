package Microsoft.UI.Xaml.XamlTypeInfo

import Microsoft.UI.Xaml.Markup.IXamlMetadataProvider
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

@ABIMarker(XamlControlsXamlMetaDataProvider.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider;{17fa3f58-3472-5aa2-a0f8-1ab8a519573d})")
@WinRTByReference(brClass = XamlControlsXamlMetaDataProvider.ByReference::class)
public class XamlControlsXamlMetaDataProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlControlsXamlMetaDataProvider.WithDefault,
    IXamlMetadataProvider.WithDefault, IWinRTObject {
  private val __1524660397_Interface: IXamlControlsXamlMetaDataProvider.WithDefault by lazy {
    as_1524660397()
  }


  private val __103617981_Interface: IXamlMetadataProvider.WithDefault by lazy {
    as_103617981()
  }


  public override val __1524660397_Ptr: JNAPointer? by lazy {
    __1524660397_Interface.__1524660397_Ptr
  }


  public override val __103617981_Ptr: JNAPointer? by lazy {
    __103617981_Interface.__103617981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1524660397_Interface, __103617981_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1524660397(): IXamlControlsXamlMetaDataProvider.WithDefault {
    if(pointer == NULL) {
      return(IXamlControlsXamlMetaDataProvider.ABI.makeIXamlControlsXamlMetaDataProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlControlsXamlMetaDataProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlControlsXamlMetaDataProvider.ABI.makeIXamlControlsXamlMetaDataProvider(ref.value))
  }

  private fun as_103617981(): IXamlMetadataProvider.WithDefault {
    if(pointer == NULL) {
      return(IXamlMetadataProvider.ABI.makeIXamlMetadataProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlMetadataProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlMetadataProvider.ABI.makeIXamlMetadataProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlControlsXamlMetaDataProvider> {
    public override fun getValue() = XamlControlsXamlMetaDataProvider(pointer.getPointer(0))

    public fun setValue(value: XamlControlsXamlMetaDataProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlControlsXamlMetaDataProvider, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IXamlControlsXamlMetaDataProviderStatics_Instance:
        IXamlControlsXamlMetaDataProviderStatics by lazy {
      createIXamlControlsXamlMetaDataProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider".toHandle(),
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

    public fun createIXamlControlsXamlMetaDataProviderStatics():
        IXamlControlsXamlMetaDataProviderStatics {
      val refiid = Guid.REFIID(IXamlControlsXamlMetaDataProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider".toHandle(),refiid,interfacePtr)
      val result =
          IXamlControlsXamlMetaDataProviderStatics.ABI.makeIXamlControlsXamlMetaDataProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlControlsXamlMetaDataProvider {
      val address = segment.toRawLongValue()
      return XamlControlsXamlMetaDataProvider(Pointer(address))
    }

    public override fun toNative(obj: XamlControlsXamlMetaDataProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Initialize() = ABI.IXamlControlsXamlMetaDataProviderStatics_Instance.Initialize()
  }
}
