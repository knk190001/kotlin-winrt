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

@ABIMarker(ContentDialogClosedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ContentDialogClosedEventArgs;{905522ef-2cba-4af8-b666-cc36c22732fb})")
@WinRTByReference(brClass = ContentDialogClosedEventArgs.ByReference::class)
public class ContentDialogClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentDialogClosedEventArgs.WithDefault, IWinRTObject {
  private val __731734202_Interface: IContentDialogClosedEventArgs.WithDefault by lazy {
    as_731734202()
  }


  public override val __731734202_Ptr: JNAPointer? by lazy {
    __731734202_Interface.__731734202_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__731734202_Interface)

  private fun as_731734202(): IContentDialogClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContentDialogClosedEventArgs.ABI.makeIContentDialogClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentDialogClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentDialogClosedEventArgs.ABI.makeIContentDialogClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentDialogClosedEventArgs> {
    public override fun getValue() = ContentDialogClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ContentDialogClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentDialogClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentDialogClosedEventArgs {
      val address = segment.toRawLongValue()
      return ContentDialogClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ContentDialogClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
