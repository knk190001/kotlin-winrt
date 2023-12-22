package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(ContentExternalOutputLink.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentExternalOutputLink;{fed9a1e8-f804-5a26-a8b0-ed077215d422})")
@WinRTByReference(brClass = ContentExternalOutputLink.ByReference::class)
public class ContentExternalOutputLink(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentExternalOutputLink.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __786807243_Interface: IContentExternalOutputLink.WithDefault by lazy {
    as_786807243()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __786807243_Ptr: JNAPointer? by lazy {
    __786807243_Interface.__786807243_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__786807243_Interface, __1260617006_Interface)

  private fun as_786807243(): IContentExternalOutputLink.WithDefault {
    if(pointer == NULL) {
      return(IContentExternalOutputLink.ABI.makeIContentExternalOutputLink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentExternalOutputLink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentExternalOutputLink.ABI.makeIContentExternalOutputLink(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentExternalOutputLink> {
    public override fun getValue() = ContentExternalOutputLink(pointer.getPointer(0))

    public fun setValue(value: ContentExternalOutputLink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentExternalOutputLink, MemoryAddress> {
    public val IContentExternalOutputLinkStatics_Instance: IContentExternalOutputLinkStatics by
        lazy {
      createIContentExternalOutputLinkStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentExternalOutputLinkStatics(): IContentExternalOutputLinkStatics {
      val refiid = Guid.REFIID(IContentExternalOutputLinkStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Content.ContentExternalOutputLink".toHandle(),refiid,interfacePtr)
      val result =
          IContentExternalOutputLinkStatics.ABI.makeIContentExternalOutputLinkStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentExternalOutputLink {
      val address = segment.toRawLongValue()
      return ContentExternalOutputLink(Pointer(address))
    }

    public override fun toNative(obj: ContentExternalOutputLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IContentExternalOutputLinkStatics_Instance.Create(compositor)

    public fun IsSupported() = ABI.IContentExternalOutputLinkStatics_Instance.IsSupported()
  }
}
