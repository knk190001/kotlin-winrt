package Windows.ApplicationModel

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

@ABIMarker(FullTrustProcessLaunchResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.FullTrustProcessLaunchResult;{8917d888-edfb-515f-8e22-5ebceb69dfd9})")
@WinRTByReference(brClass = FullTrustProcessLaunchResult.ByReference::class)
public class FullTrustProcessLaunchResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFullTrustProcessLaunchResult.WithDefault, IWinRTObject {
  private val __2021753179_Interface: IFullTrustProcessLaunchResult.WithDefault by lazy {
    as_2021753179()
  }


  public override val __2021753179_Ptr: JNAPointer? by lazy {
    __2021753179_Interface.__2021753179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2021753179_Interface)

  private fun as_2021753179(): IFullTrustProcessLaunchResult.WithDefault {
    if(pointer == NULL) {
      return(IFullTrustProcessLaunchResult.ABI.makeIFullTrustProcessLaunchResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFullTrustProcessLaunchResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFullTrustProcessLaunchResult.ABI.makeIFullTrustProcessLaunchResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FullTrustProcessLaunchResult> {
    public override fun getValue() = FullTrustProcessLaunchResult(pointer.getPointer(0))

    public fun setValue(value: FullTrustProcessLaunchResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FullTrustProcessLaunchResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FullTrustProcessLaunchResult {
      val address = segment.toRawLongValue()
      return FullTrustProcessLaunchResult(Pointer(address))
    }

    public override fun toNative(obj: FullTrustProcessLaunchResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
