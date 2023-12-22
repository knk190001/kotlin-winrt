package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentStateChangedEventArgs;{9a1cef3d-8073-4416-8df2-546835a6414f})")
@WinRTByReference(brClass = TargetedContentStateChangedEventArgs.ByReference::class)
public class TargetedContentStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __639740528_Interface: ITargetedContentStateChangedEventArgs.WithDefault by lazy {
    as_639740528()
  }


  public override val __639740528_Ptr: JNAPointer? by lazy {
    __639740528_Interface.__639740528_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__639740528_Interface)

  private fun as_639740528(): ITargetedContentStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentStateChangedEventArgs.ABI.makeITargetedContentStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentStateChangedEventArgs.ABI.makeITargetedContentStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentStateChangedEventArgs> {
    public override fun getValue() = TargetedContentStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TargetedContentStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return TargetedContentStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
