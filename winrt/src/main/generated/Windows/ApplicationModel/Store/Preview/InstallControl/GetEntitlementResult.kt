package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(GetEntitlementResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.GetEntitlementResult;{74fc843f-1a9e-4609-8e4d-819086d08a3d})")
@WinRTByReference(brClass = GetEntitlementResult.ByReference::class)
public class GetEntitlementResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGetEntitlementResult.WithDefault, IWinRTObject {
  private val __1284798046_Interface: IGetEntitlementResult.WithDefault by lazy {
    as_1284798046()
  }


  public override val __1284798046_Ptr: JNAPointer? by lazy {
    __1284798046_Interface.__1284798046_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1284798046_Interface)

  private fun as_1284798046(): IGetEntitlementResult.WithDefault {
    if(pointer == NULL) {
      return(IGetEntitlementResult.ABI.makeIGetEntitlementResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGetEntitlementResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGetEntitlementResult.ABI.makeIGetEntitlementResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GetEntitlementResult> {
    public override fun getValue() = GetEntitlementResult(pointer.getPointer(0))

    public fun setValue(value: GetEntitlementResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GetEntitlementResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GetEntitlementResult {
      val address = segment.toRawLongValue()
      return GetEntitlementResult(Pointer(address))
    }

    public override fun toNative(obj: GetEntitlementResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
