package Windows.UI.Xaml.Controls

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

@ABIMarker(ContentDialogOpenedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ContentDialogOpenedEventArgs;{0966b315-5f59-4999-9e3e-374c0f174b04})")
@WinRTByReference(brClass = ContentDialogOpenedEventArgs.ByReference::class)
public class ContentDialogOpenedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogOpenedEventArgs.WithDefault, IWinRTObject {
  private val __445400297_Interface: IContentDialogOpenedEventArgs.WithDefault by lazy {
    as_445400297()
  }


  public override val __445400297_Ptr: JNAPointer? by lazy {
    __445400297_Interface.__445400297_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__445400297_Interface)

  private fun as_445400297(): IContentDialogOpenedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogOpenedEventArgs.ABI.makeIContentDialogOpenedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogOpenedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogOpenedEventArgs.ABI.makeIContentDialogOpenedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogOpenedEventArgs> {
    public override fun getValue() = ContentDialogOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentDialogOpenedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogOpenedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogOpenedEventArgs {
      val address = segment.toRawLongValue()
      return ContentDialogOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
