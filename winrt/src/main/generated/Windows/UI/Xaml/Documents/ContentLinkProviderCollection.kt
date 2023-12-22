package Windows.UI.Xaml.Documents

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ContentLinkProviderCollection.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.ContentLinkProviderCollection;{f5b84d0c-a9f4-4d1a-a13c-10def1843734})")
@WinRTByReference(brClass = ContentLinkProviderCollection.ByReference::class)
public class ContentLinkProviderCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentLinkProviderCollection.WithDefault, IVector<ContentLinkProvider?>,
    IIterable<ContentLinkProvider?>, IWinRTObject {
  private val __1965661254_Interface: IContentLinkProviderCollection.WithDefault by lazy {
    as_1965661254()
  }


  private val __1070388601_Interface: IVector<ContentLinkProvider?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<ContentLinkProvider?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<ContentLinkProvider?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<ContentLinkProvider?>>()

  public override val __1965661254_Ptr: JNAPointer? by lazy {
    __1965661254_Interface.__1965661254_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1965661254_Interface, __1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1965661254(): IContentLinkProviderCollection.WithDefault {
    if(pointer == NULL) {
      return(IContentLinkProviderCollection.ABI.makeIContentLinkProviderCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentLinkProviderCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentLinkProviderCollection.ABI.makeIContentLinkProviderCollection(ref.value))
  }

  private fun as_1070388601(): IVector<ContentLinkProvider?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<ContentLinkProvider?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<ContentLinkProvider?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<ContentLinkProvider?>(ref.value))
  }

  private fun as_1449643190(): IIterable<ContentLinkProvider?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<ContentLinkProvider?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<ContentLinkProvider?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<ContentLinkProvider?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentLinkProviderCollection> {
    public override fun getValue() = ContentLinkProviderCollection(pointer.getPointer(0))

    public fun setValue(value: ContentLinkProviderCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentLinkProviderCollection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.ContentLinkProviderCollection".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ContentLinkProviderCollection {
      val address = segment.toRawLongValue()
      return ContentLinkProviderCollection(Pointer(address))
    }

    public override fun toNative(obj: ContentLinkProviderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
