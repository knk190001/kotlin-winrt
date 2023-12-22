package Microsoft.UI.Content

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

@ABIMarker(ContentSiteView.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentSiteView;{2d5d8dd5-358e-5b05-993b-b2666d1786b3})")
@WinRTByReference(brClass = ContentSiteView.ByReference::class)
public class ContentSiteView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentSiteView.WithDefault, IWinRTObject {
  private val __498824379_Interface: IContentSiteView.WithDefault by lazy {
    as_498824379()
  }


  public override val __498824379_Ptr: JNAPointer? by lazy {
    __498824379_Interface.__498824379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__498824379_Interface)

  private fun as_498824379(): IContentSiteView.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteView.ABI.makeIContentSiteView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteView.ABI.makeIContentSiteView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentSiteView> {
    public override fun getValue() = ContentSiteView(pointer.getPointer(0))

    public fun setValue(value: ContentSiteView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentSiteView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentSiteView {
      val address = segment.toRawLongValue()
      return ContentSiteView(Pointer(address))
    }

    public override fun toNative(obj: ContentSiteView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
