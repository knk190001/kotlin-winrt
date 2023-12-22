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

@ABIMarker(ContentSiteEnvironmentView.ABI::class)
@Signature("rc(Microsoft.UI.Content.ContentSiteEnvironmentView;{5b6fe420-0bb3-54dd-8589-786cf02e38f1})")
@WinRTByReference(brClass = ContentSiteEnvironmentView.ByReference::class)
public class ContentSiteEnvironmentView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentSiteEnvironmentView.WithDefault, IWinRTObject {
  private val __1424251778_Interface: IContentSiteEnvironmentView.WithDefault by lazy {
    as_1424251778()
  }


  public override val __1424251778_Ptr: JNAPointer? by lazy {
    __1424251778_Interface.__1424251778_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1424251778_Interface)

  private fun as_1424251778(): IContentSiteEnvironmentView.WithDefault {
    if(pointer == NULL) {
      return(IContentSiteEnvironmentView.ABI.makeIContentSiteEnvironmentView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentSiteEnvironmentView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentSiteEnvironmentView.ABI.makeIContentSiteEnvironmentView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentSiteEnvironmentView> {
    public override fun getValue() = ContentSiteEnvironmentView(pointer.getPointer(0))

    public fun setValue(value: ContentSiteEnvironmentView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentSiteEnvironmentView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentSiteEnvironmentView {
      val address = segment.toRawLongValue()
      return ContentSiteEnvironmentView(Pointer(address))
    }

    public override fun toNative(obj: ContentSiteEnvironmentView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
