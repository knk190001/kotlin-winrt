package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(ShareCompletedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareCompletedEventArgs;{4574c442-f913-4f60-9df7-cc4060ab1916})")
@WinRTByReference(brClass = ShareCompletedEventArgs.ByReference::class)
public class ShareCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareCompletedEventArgs.WithDefault, IWinRTObject {
  private val __1540812095_Interface: IShareCompletedEventArgs.WithDefault by lazy {
    as_1540812095()
  }


  public override val __1540812095_Ptr: JNAPointer? by lazy {
    __1540812095_Interface.__1540812095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1540812095_Interface)

  private fun as_1540812095(): IShareCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IShareCompletedEventArgs.ABI.makeIShareCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareCompletedEventArgs.ABI.makeIShareCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShareCompletedEventArgs> {
    public override fun getValue() = ShareCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ShareCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShareCompletedEventArgs {
      val address = segment.toRawLongValue()
      return ShareCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ShareCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
