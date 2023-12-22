package Windows.System

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

@ABIMarker(LaunchUriResult.ABI::class)
@Signature("rc(Windows.System.LaunchUriResult;{ec27a8df-f6d5-45ca-913a-70a40c5c8221})")
@WinRTByReference(brClass = LaunchUriResult.ByReference::class)
public class LaunchUriResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILaunchUriResult.WithDefault, IWinRTObject {
  private val __34495207_Interface: ILaunchUriResult.WithDefault by lazy {
    as_34495207()
  }


  public override val __34495207_Ptr: JNAPointer? by lazy {
    __34495207_Interface.__34495207_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__34495207_Interface)

  private fun as_34495207(): ILaunchUriResult.WithDefault {
    if(pointer == NULL) {
      return(ILaunchUriResult.ABI.makeILaunchUriResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILaunchUriResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILaunchUriResult.ABI.makeILaunchUriResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LaunchUriResult> {
    public override fun getValue() = LaunchUriResult(pointer.getPointer(0))

    public fun setValue(value: LaunchUriResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LaunchUriResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LaunchUriResult {
      val address = segment.toRawLongValue()
      return LaunchUriResult(Pointer(address))
    }

    public override fun toNative(obj: LaunchUriResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
