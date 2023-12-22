package Windows.UI.Xaml.Documents

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

@ABIMarker(ContentLinkInvokedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.ContentLinkInvokedEventArgs;{546717c1-e8df-4593-9639-97595fdf8310})")
@WinRTByReference(brClass = ContentLinkInvokedEventArgs.ByReference::class)
public class ContentLinkInvokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentLinkInvokedEventArgs.WithDefault, IWinRTObject {
  private val __1438147562_Interface: IContentLinkInvokedEventArgs.WithDefault by lazy {
    as_1438147562()
  }


  public override val __1438147562_Ptr: JNAPointer? by lazy {
    __1438147562_Interface.__1438147562_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1438147562_Interface)

  private fun as_1438147562(): IContentLinkInvokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentLinkInvokedEventArgs.ABI.makeIContentLinkInvokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentLinkInvokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentLinkInvokedEventArgs.ABI.makeIContentLinkInvokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentLinkInvokedEventArgs> {
    public override fun getValue() = ContentLinkInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentLinkInvokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentLinkInvokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentLinkInvokedEventArgs {
      val address = segment.toRawLongValue()
      return ContentLinkInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentLinkInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
