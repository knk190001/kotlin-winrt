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

@ABIMarker(MicrosoftAccountMultiFactorOneTimeCodedInfo.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorOneTimeCodedInfo;{82ba264b-d87c-4668-a976-40cfae547d08})")
@WinRTByReference(brClass = MicrosoftAccountMultiFactorOneTimeCodedInfo.ByReference::class)
public class MicrosoftAccountMultiFactorOneTimeCodedInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMicrosoftAccountMultiFactorOneTimeCodedInfo.WithDefault, IWinRTObject {
  private val __1285354478_Interface: IMicrosoftAccountMultiFactorOneTimeCodedInfo.WithDefault by
      lazy {
    as_1285354478()
  }


  public override val __1285354478_Ptr: JNAPointer? by lazy {
    __1285354478_Interface.__1285354478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1285354478_Interface)

  private fun as_1285354478(): IMicrosoftAccountMultiFactorOneTimeCodedInfo.WithDefault {
    if(pointer == NULL) {
      return(IMicrosoftAccountMultiFactorOneTimeCodedInfo.ABI.makeIMicrosoftAccountMultiFactorOneTimeCodedInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicrosoftAccountMultiFactorOneTimeCodedInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicrosoftAccountMultiFactorOneTimeCodedInfo.ABI.makeIMicrosoftAccountMultiFactorOneTimeCodedInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MicrosoftAccountMultiFactorOneTimeCodedInfo> {
    public override fun getValue() =
        MicrosoftAccountMultiFactorOneTimeCodedInfo(pointer.getPointer(0))

    public fun setValue(value: MicrosoftAccountMultiFactorOneTimeCodedInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorOneTimeCodedInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MicrosoftAccountMultiFactorOneTimeCodedInfo {
      val address = segment.toRawLongValue()
      return MicrosoftAccountMultiFactorOneTimeCodedInfo(Pointer(address))
    }

    public override fun toNative(obj: MicrosoftAccountMultiFactorOneTimeCodedInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
