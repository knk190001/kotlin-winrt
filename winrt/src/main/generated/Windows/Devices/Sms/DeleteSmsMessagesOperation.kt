package Windows.Devices.Sms

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncInfo
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

@ABIMarker(DeleteSmsMessagesOperation.ABI::class)
@Signature("rc(Windows.Devices.Sms.DeleteSmsMessagesOperation;{5a648006-843a-4da9-865b-9d26e5dfad7b})")
@WinRTByReference(brClass = DeleteSmsMessagesOperation.ByReference::class)
public class DeleteSmsMessagesOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAsyncAction.WithDefault, IAsyncInfo.WithDefault, IWinRTObject {
  private val __2120156153_Interface: IAsyncAction.WithDefault by lazy {
    as_2120156153()
  }


  private val __1646648641_Interface: IAsyncInfo.WithDefault by lazy {
    as_1646648641()
  }


  public override val __2120156153_Ptr: JNAPointer? by lazy {
    __2120156153_Interface.__2120156153_Ptr
  }


  public override val __1646648641_Ptr: JNAPointer? by lazy {
    __1646648641_Interface.__1646648641_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2120156153_Interface, __1646648641_Interface)

  private fun as_2120156153(): IAsyncAction.WithDefault {
    if(pointer == NULL) {
      return(IAsyncAction.ABI.makeIAsyncAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsyncAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsyncAction.ABI.makeIAsyncAction(ref.value))
  }

  private fun as_1646648641(): IAsyncInfo.WithDefault {
    if(pointer == NULL) {
      return(IAsyncInfo.ABI.makeIAsyncInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsyncInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsyncInfo.ABI.makeIAsyncInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeleteSmsMessagesOperation> {
    public override fun getValue() = DeleteSmsMessagesOperation(pointer.getPointer(0))

    public fun setValue(value: DeleteSmsMessagesOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeleteSmsMessagesOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DeleteSmsMessagesOperation {
      val address = segment.toRawLongValue()
      return DeleteSmsMessagesOperation(Pointer(address))
    }

    public override fun toNative(obj: DeleteSmsMessagesOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
