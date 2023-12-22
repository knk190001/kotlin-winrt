package Windows.Networking.NetworkOperators

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

@ABIMarker(HotspotCredentialsAuthenticationResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.HotspotCredentialsAuthenticationResult;{e756c791-1005-4de5-83c7-de61d88831d0})")
@WinRTByReference(brClass = HotspotCredentialsAuthenticationResult.ByReference::class)
public class HotspotCredentialsAuthenticationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHotspotCredentialsAuthenticationResult.WithDefault, IWinRTObject {
  private val __22950853_Interface: IHotspotCredentialsAuthenticationResult.WithDefault by lazy {
    as_22950853()
  }


  public override val __22950853_Ptr: JNAPointer? by lazy {
    __22950853_Interface.__22950853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__22950853_Interface)

  private fun as_22950853(): IHotspotCredentialsAuthenticationResult.WithDefault {
    if(pointer == NULL) {
      return(IHotspotCredentialsAuthenticationResult.ABI.makeIHotspotCredentialsAuthenticationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHotspotCredentialsAuthenticationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHotspotCredentialsAuthenticationResult.ABI.makeIHotspotCredentialsAuthenticationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HotspotCredentialsAuthenticationResult> {
    public override fun getValue() = HotspotCredentialsAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: HotspotCredentialsAuthenticationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HotspotCredentialsAuthenticationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HotspotCredentialsAuthenticationResult {
      val address = segment.toRawLongValue()
      return HotspotCredentialsAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: HotspotCredentialsAuthenticationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
