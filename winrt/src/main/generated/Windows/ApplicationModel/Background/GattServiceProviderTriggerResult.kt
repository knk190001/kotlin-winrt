package Windows.ApplicationModel.Background

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

@ABIMarker(GattServiceProviderTriggerResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.GattServiceProviderTriggerResult;{3c4691b1-b198-4e84-bad4-cf4ad299ed3a})")
@WinRTByReference(brClass = GattServiceProviderTriggerResult.ByReference::class)
public class GattServiceProviderTriggerResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderTriggerResult.WithDefault, IWinRTObject {
  private val __16444858_Interface: IGattServiceProviderTriggerResult.WithDefault by lazy {
    as_16444858()
  }


  public override val __16444858_Ptr: JNAPointer? by lazy {
    __16444858_Interface.__16444858_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__16444858_Interface)

  private fun as_16444858(): IGattServiceProviderTriggerResult.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderTriggerResult.ABI.makeIGattServiceProviderTriggerResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderTriggerResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderTriggerResult.ABI.makeIGattServiceProviderTriggerResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderTriggerResult> {
    public override fun getValue() = GattServiceProviderTriggerResult(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderTriggerResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderTriggerResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattServiceProviderTriggerResult {
      val address = segment.toRawLongValue()
      return GattServiceProviderTriggerResult(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderTriggerResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
