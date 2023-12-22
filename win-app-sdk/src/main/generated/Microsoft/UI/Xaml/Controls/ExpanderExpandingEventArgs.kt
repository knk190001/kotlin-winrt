package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ExpanderExpandingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ExpanderExpandingEventArgs;{433f2e36-19e7-579c-b4ce-9ce5d510d001})")
@WinRTByReference(brClass = ExpanderExpandingEventArgs.ByReference::class)
public class ExpanderExpandingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpanderExpandingEventArgs.WithDefault, IWinRTObject {
  private val __635903843_Interface: IExpanderExpandingEventArgs.WithDefault by lazy {
    as_635903843()
  }


  public override val __635903843_Ptr: JNAPointer? by lazy {
    __635903843_Interface.__635903843_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__635903843_Interface)

  private fun as_635903843(): IExpanderExpandingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExpanderExpandingEventArgs.ABI.makeIExpanderExpandingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpanderExpandingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpanderExpandingEventArgs.ABI.makeIExpanderExpandingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpanderExpandingEventArgs> {
    public override fun getValue() = ExpanderExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExpanderExpandingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpanderExpandingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpanderExpandingEventArgs {
      val address = segment.toRawLongValue()
      return ExpanderExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExpanderExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
