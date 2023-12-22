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

@ABIMarker(ShareProviderOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareProviderOperation;{19cef937-d435-4179-b6af-14e0492b69f6})")
@WinRTByReference(brClass = ShareProviderOperation.ByReference::class)
public class ShareProviderOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareProviderOperation.WithDefault, IWinRTObject {
  private val __618575455_Interface: IShareProviderOperation.WithDefault by lazy {
    as_618575455()
  }


  public override val __618575455_Ptr: JNAPointer? by lazy {
    __618575455_Interface.__618575455_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__618575455_Interface)

  private fun as_618575455(): IShareProviderOperation.WithDefault {
    if(pointer == NULL) {
      return(IShareProviderOperation.ABI.makeIShareProviderOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareProviderOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareProviderOperation.ABI.makeIShareProviderOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShareProviderOperation> {
    public override fun getValue() = ShareProviderOperation(pointer.getPointer(0))

    public fun setValue(value: ShareProviderOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareProviderOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShareProviderOperation {
      val address = segment.toRawLongValue()
      return ShareProviderOperation(Pointer(address))
    }

    public override fun toNative(obj: ShareProviderOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
