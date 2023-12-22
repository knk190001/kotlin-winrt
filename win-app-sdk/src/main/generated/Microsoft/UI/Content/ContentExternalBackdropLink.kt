package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.ICompositionSupportsSystemBackdrop
import Windows.Foundation.IClosable
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

@ABIMarker(ContentExternalBackdropLink.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentExternalBackdropLink;{1054bf83-b35b-5fde-8dd7-ac3bb3e6ce27})")
@WinRTByReference(brClass = ContentExternalBackdropLink.ByReference::class)
public class ContentExternalBackdropLink(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentExternalBackdropLink.WithDefault, IClosable.WithDefault,
    ICompositionSupportsSystemBackdrop.WithDefault, IWinRTObject {
  private val __1143741302_Interface: IContentExternalBackdropLink.WithDefault by lazy {
    as_1143741302()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1941813094_Interface: ICompositionSupportsSystemBackdrop.WithDefault by lazy {
    as_1941813094()
  }


  public override val __1143741302_Ptr: JNAPointer? by lazy {
    __1143741302_Interface.__1143741302_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1941813094_Ptr: JNAPointer? by lazy {
    __1941813094_Interface.__1941813094_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1143741302_Interface, __1260617006_Interface, __1941813094_Interface)

  private fun as_1143741302(): IContentExternalBackdropLink.WithDefault {
    if(pointer == NULL) {
      return(IContentExternalBackdropLink.ABI.makeIContentExternalBackdropLink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentExternalBackdropLink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentExternalBackdropLink.ABI.makeIContentExternalBackdropLink(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1941813094(): ICompositionSupportsSystemBackdrop.WithDefault {
    if(pointer == NULL) {
      return(ICompositionSupportsSystemBackdrop.ABI.makeICompositionSupportsSystemBackdrop(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionSupportsSystemBackdrop>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionSupportsSystemBackdrop.ABI.makeICompositionSupportsSystemBackdrop(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentExternalBackdropLink> {
    public override fun getValue() = ContentExternalBackdropLink(pointer.getPointer(0))

    public fun setValue(value: ContentExternalBackdropLink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentExternalBackdropLink, MemoryAddress> {
    public val IContentExternalBackdropLinkStatics_Instance: IContentExternalBackdropLinkStatics by
        lazy {
      createIContentExternalBackdropLinkStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentExternalBackdropLinkStatics(): IContentExternalBackdropLinkStatics {
      val refiid = Guid.REFIID(IContentExternalBackdropLinkStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.ContentExternalBackdropLink".toHandle(),refiid,interfacePtr)
      val result =
          IContentExternalBackdropLinkStatics.ABI.makeIContentExternalBackdropLinkStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentExternalBackdropLink {
      val address = segment.toRawLongValue()
      return ContentExternalBackdropLink(Pointer(address))
    }

    public override fun toNative(obj: ContentExternalBackdropLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IContentExternalBackdropLinkStatics_Instance.Create(compositor)
  }
}
