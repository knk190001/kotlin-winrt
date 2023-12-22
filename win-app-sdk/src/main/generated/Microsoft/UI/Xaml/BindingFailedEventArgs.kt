package Microsoft.UI.Xaml

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

@ABIMarker(BindingFailedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.BindingFailedEventArgs;{a7bf50f3-dbc0-5b44-be74-56e8f80fd716})")
@WinRTByReference(brClass = BindingFailedEventArgs.ByReference::class)
public class BindingFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBindingFailedEventArgs.WithDefault, IWinRTObject {
  private val __817388900_Interface: IBindingFailedEventArgs.WithDefault by lazy {
    as_817388900()
  }


  public override val __817388900_Ptr: JNAPointer? by lazy {
    __817388900_Interface.__817388900_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__817388900_Interface)

  private fun as_817388900(): IBindingFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBindingFailedEventArgs.ABI.makeIBindingFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBindingFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBindingFailedEventArgs.ABI.makeIBindingFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BindingFailedEventArgs> {
    public override fun getValue() = BindingFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BindingFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BindingFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BindingFailedEventArgs {
      val address = segment.toRawLongValue()
      return BindingFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BindingFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
