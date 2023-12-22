package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ContentDialogClosingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentDialogClosingEventArgs;{12782103-3b80-511c-9128-12cb8cdac444})")
@WinRTByReference(brClass = ContentDialogClosingEventArgs.ByReference::class)
public class ContentDialogClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogClosingEventArgs.WithDefault, IWinRTObject {
  private val __1600858564_Interface: IContentDialogClosingEventArgs.WithDefault by lazy {
    as_1600858564()
  }


  public override val __1600858564_Ptr: JNAPointer? by lazy {
    __1600858564_Interface.__1600858564_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1600858564_Interface)

  private fun as_1600858564(): IContentDialogClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogClosingEventArgs.ABI.makeIContentDialogClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogClosingEventArgs.ABI.makeIContentDialogClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogClosingEventArgs> {
    public override fun getValue() = ContentDialogClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentDialogClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogClosingEventArgs {
      val address = segment.toRawLongValue()
      return ContentDialogClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
