package Windows.ApplicationModel.Store.LicenseManagement

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

@ABIMarker(LicenseSatisfactionResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.LicenseManagement.LicenseSatisfactionResult;{3c674f73-3c87-4ee1-8201-f428359bd3af})")
@WinRTByReference(brClass = LicenseSatisfactionResult.ByReference::class)
public class LicenseSatisfactionResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILicenseSatisfactionResult.WithDefault, IWinRTObject {
  private val __922870478_Interface: ILicenseSatisfactionResult.WithDefault by lazy {
    as_922870478()
  }


  public override val __922870478_Ptr: JNAPointer? by lazy {
    __922870478_Interface.__922870478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922870478_Interface)

  private fun as_922870478(): ILicenseSatisfactionResult.WithDefault {
    if(pointer == NULL) {
      return(ILicenseSatisfactionResult.ABI.makeILicenseSatisfactionResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILicenseSatisfactionResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILicenseSatisfactionResult.ABI.makeILicenseSatisfactionResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LicenseSatisfactionResult> {
    public override fun getValue() = LicenseSatisfactionResult(pointer.getPointer(0))

    public fun setValue(value: LicenseSatisfactionResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LicenseSatisfactionResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LicenseSatisfactionResult {
      val address = segment.toRawLongValue()
      return LicenseSatisfactionResult(Pointer(address))
    }

    public override fun toNative(obj: LicenseSatisfactionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
