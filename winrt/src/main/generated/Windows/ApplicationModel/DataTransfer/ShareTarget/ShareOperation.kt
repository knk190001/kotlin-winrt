package Windows.ApplicationModel.DataTransfer.ShareTarget

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

@ABIMarker(ShareOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation;{2246bab8-d0f8-41c1-a82a-4137db6504fb})")
@WinRTByReference(brClass = ShareOperation.ByReference::class)
public class ShareOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShareOperation.WithDefault, IShareOperation2.WithDefault,
    IShareOperation3.WithDefault, IWinRTObject {
  private val __431149936_Interface: IShareOperation.WithDefault by lazy {
    as_431149936()
  }


  private val __480746078_Interface: IShareOperation2.WithDefault by lazy {
    as_480746078()
  }


  private val __480746077_Interface: IShareOperation3.WithDefault by lazy {
    as_480746077()
  }


  public override val __431149936_Ptr: JNAPointer? by lazy {
    __431149936_Interface.__431149936_Ptr
  }


  public override val __480746078_Ptr: JNAPointer? by lazy {
    __480746078_Interface.__480746078_Ptr
  }


  public override val __480746077_Ptr: JNAPointer? by lazy {
    __480746077_Interface.__480746077_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__431149936_Interface, __480746078_Interface, __480746077_Interface)

  private fun as_431149936(): IShareOperation.WithDefault {
    if(pointer == NULL) {
      return(IShareOperation.ABI.makeIShareOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareOperation.ABI.makeIShareOperation(ref.value))
  }

  private fun as_480746078(): IShareOperation2.WithDefault {
    if(pointer == NULL) {
      return(IShareOperation2.ABI.makeIShareOperation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareOperation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareOperation2.ABI.makeIShareOperation2(ref.value))
  }

  private fun as_480746077(): IShareOperation3.WithDefault {
    if(pointer == NULL) {
      return(IShareOperation3.ABI.makeIShareOperation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShareOperation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShareOperation3.ABI.makeIShareOperation3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ShareOperation>
      {
    public override fun getValue() = ShareOperation(pointer.getPointer(0))

    public fun setValue(value: ShareOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShareOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShareOperation {
      val address = segment.toRawLongValue()
      return ShareOperation(Pointer(address))
    }

    public override fun toNative(obj: ShareOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
