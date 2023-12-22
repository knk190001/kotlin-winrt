package Windows.Services.Store

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

@ABIMarker(StoreSendRequestResult.ABI::class)
@Signature("rc(Windows.Services.Store.StoreSendRequestResult;{c73abe60-8272-4502-8a69-6e75153a4299})")
@WinRTByReference(brClass = StoreSendRequestResult.ByReference::class)
public class StoreSendRequestResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreSendRequestResult.WithDefault, IStoreSendRequestResult2.WithDefault,
    IWinRTObject {
  private val __1272856560_Interface: IStoreSendRequestResult.WithDefault by lazy {
    as_1272856560()
  }


  private val __803847746_Interface: IStoreSendRequestResult2.WithDefault by lazy {
    as_803847746()
  }


  public override val __1272856560_Ptr: JNAPointer? by lazy {
    __1272856560_Interface.__1272856560_Ptr
  }


  public override val __803847746_Ptr: JNAPointer? by lazy {
    __803847746_Interface.__803847746_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1272856560_Interface, __803847746_Interface)

  private fun as_1272856560(): IStoreSendRequestResult.WithDefault {
    if(pointer == NULL) {
      return(IStoreSendRequestResult.ABI.makeIStoreSendRequestResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreSendRequestResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreSendRequestResult.ABI.makeIStoreSendRequestResult(ref.value))
  }

  private fun as_803847746(): IStoreSendRequestResult2.WithDefault {
    if(pointer == NULL) {
      return(IStoreSendRequestResult2.ABI.makeIStoreSendRequestResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreSendRequestResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreSendRequestResult2.ABI.makeIStoreSendRequestResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StoreSendRequestResult> {
    public override fun getValue() = StoreSendRequestResult(pointer.getPointer(0))

    public fun setValue(value: StoreSendRequestResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreSendRequestResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreSendRequestResult {
      val address = segment.toRawLongValue()
      return StoreSendRequestResult(Pointer(address))
    }

    public override fun toNative(obj: StoreSendRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
