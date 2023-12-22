package Windows.ApplicationModel.Core

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

@ABIMarker(HostedViewClosingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Core.HostedViewClosingEventArgs;{d238943c-b24e-4790-acb5-3e4243c4ff87})")
@WinRTByReference(brClass = HostedViewClosingEventArgs.ByReference::class)
public class HostedViewClosingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHostedViewClosingEventArgs.WithDefault, IWinRTObject {
  private val __1085403950_Interface: IHostedViewClosingEventArgs.WithDefault by lazy {
    as_1085403950()
  }


  public override val __1085403950_Ptr: JNAPointer? by lazy {
    __1085403950_Interface.__1085403950_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1085403950_Interface)

  private fun as_1085403950(): IHostedViewClosingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHostedViewClosingEventArgs.ABI.makeIHostedViewClosingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHostedViewClosingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHostedViewClosingEventArgs.ABI.makeIHostedViewClosingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HostedViewClosingEventArgs> {
    public override fun getValue() = HostedViewClosingEventArgs(pointer.getPointer(0))

    public fun setValue(value: HostedViewClosingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HostedViewClosingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HostedViewClosingEventArgs {
      val address = segment.toRawLongValue()
      return HostedViewClosingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HostedViewClosingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
