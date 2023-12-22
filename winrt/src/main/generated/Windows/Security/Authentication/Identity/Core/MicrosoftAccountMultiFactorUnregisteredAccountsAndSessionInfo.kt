package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo;{aa7ec5fb-da3f-4088-a20d-5618afadb2e5})")
@WinRTByReference(brClass =
    MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ByReference::class)
public class MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.WithDefault,
    IWinRTObject {
  private val __95509482_Interface:
      IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.WithDefault by lazy {
    as_95509482()
  }


  public override val __95509482_Ptr: JNAPointer? by lazy {
    __95509482_Interface.__95509482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__95509482_Interface)

  private fun as_95509482():
      IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.WithDefault {
    if(pointer == NULL) {
      return(IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ABI.makeIMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ABI.makeIMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo> {
    public override fun getValue() =
        MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(pointer.getPointer(0))

    public fun setValue(value: MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo {
      val address = segment.toRawLongValue()
      return MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(Pointer(address))
    }

    public override
        fun toNative(obj: MicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
