package Windows.ApplicationModel.ExtendedExecution.Foreground

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

@ABIMarker(ExtendedExecutionForegroundRevokedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundRevokedEventArgs;{b07cd940-9557-aea4-2c99-bdd56d9be461})")
@WinRTByReference(brClass = ExtendedExecutionForegroundRevokedEventArgs.ByReference::class)
public class ExtendedExecutionForegroundRevokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExtendedExecutionForegroundRevokedEventArgs.WithDefault, IWinRTObject {
  private val __816999118_Interface: IExtendedExecutionForegroundRevokedEventArgs.WithDefault by
      lazy {
    as_816999118()
  }


  public override val __816999118_Ptr: JNAPointer? by lazy {
    __816999118_Interface.__816999118_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__816999118_Interface)

  private fun as_816999118(): IExtendedExecutionForegroundRevokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExtendedExecutionForegroundRevokedEventArgs.ABI.makeIExtendedExecutionForegroundRevokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExtendedExecutionForegroundRevokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExtendedExecutionForegroundRevokedEventArgs.ABI.makeIExtendedExecutionForegroundRevokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExtendedExecutionForegroundRevokedEventArgs> {
    public override fun getValue() =
        ExtendedExecutionForegroundRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExtendedExecutionForegroundRevokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExtendedExecutionForegroundRevokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ExtendedExecutionForegroundRevokedEventArgs {
      val address = segment.toRawLongValue()
      return ExtendedExecutionForegroundRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExtendedExecutionForegroundRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
