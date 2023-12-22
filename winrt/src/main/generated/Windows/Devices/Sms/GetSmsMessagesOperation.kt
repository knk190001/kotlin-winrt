package Windows.Devices.Sms

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncInfo
import Windows.Foundation.IAsyncOperationWithProgress
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(GetSmsMessagesOperation.ABI::class)
@Signature("rc(Windows.Devices.Sms.GetSmsMessagesOperation;pinterface({b5d036d7-e297-498f-ba60-0289e76e23dd};pinterface({bbe1fa4c-b0e3-4583-baef-1f1b2e483e56};{ed3c5e28-6984-4b07-811d-8d5906ed3cea});i4))")
@WinRTByReference(brClass = GetSmsMessagesOperation.ByReference::class)
public class GetSmsMessagesOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>,
    IAsyncInfo.WithDefault, IWinRTObject {
  private val __1501168087_Interface: IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>
      by lazy {
    as_1501168087()
  }


  private val __1646648641_Interface: IAsyncInfo.WithDefault by lazy {
    as_1646648641()
  }


  public override val __1501168087_Type: KType =
      typeOf<IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>>()

  public override val __1501168087_Ptr: JNAPointer? by lazy {
    __1501168087_Interface.__1501168087_Ptr
  }


  public override val __1646648641_Ptr: JNAPointer? by lazy {
    __1646648641_Interface.__1646648641_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1501168087_Interface, __1646648641_Interface)

  private fun as_1501168087(): IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int> {
    if(pointer == NULL) {
      return(IAsyncOperationWithProgress.ABI.makeIAsyncOperationWithProgress<IVectorView<ISmsMessage?>?,
          Int>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAsyncOperationWithProgress.ABI.makeIAsyncOperationWithProgress<IVectorView<ISmsMessage?>?,
        Int>(ref.value))
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
      IByReference<GetSmsMessagesOperation> {
    public override fun getValue() = GetSmsMessagesOperation(pointer.getPointer(0))

    public fun setValue(value: GetSmsMessagesOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GetSmsMessagesOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GetSmsMessagesOperation {
      val address = segment.toRawLongValue()
      return GetSmsMessagesOperation(Pointer(address))
    }

    public override fun toNative(obj: GetSmsMessagesOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
