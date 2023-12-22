package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Documents.IContentLinkProviderFactory.ABI.IID
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

@ABIMarker(ContentLinkProvider.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.ContentLinkProvider;{730587fd-bfdc-4cb3-904d-b65ab339bbf5})")
@WinRTByReference(brClass = ContentLinkProvider.ByReference::class)
public open class ContentLinkProvider(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IContentLinkProvider.WithDefault, IWinRTObject {
  private val __710845436_Interface: IContentLinkProvider.WithDefault by lazy {
    as_710845436()
  }


  public override val __710845436_Ptr: JNAPointer? by lazy {
    __710845436_Interface.__710845436_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__710845436_Interface)

  public constructor() : this(ABI.activate())

  private fun as_710845436(): IContentLinkProvider.WithDefault {
    if(pointer == NULL) {
      return(IContentLinkProvider.ABI.makeIContentLinkProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentLinkProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentLinkProvider.ABI.makeIContentLinkProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentLinkProvider> {
    public override fun getValue() = ContentLinkProvider(pointer.getPointer(0))

    public fun setValue(value: ContentLinkProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentLinkProvider, MemoryAddress> {
    public val IContentLinkProviderFactory_Instance: IContentLinkProviderFactory by lazy {
      createIContentLinkProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentLinkProviderFactory(): IContentLinkProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.ContentLinkProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContentLinkProviderFactory.ABI.makeIContentLinkProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IContentLinkProviderFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContentLinkProvider {
      val address = segment.toRawLongValue()
      return ContentLinkProvider(Pointer(address))
    }

    public override fun toNative(obj: ContentLinkProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
