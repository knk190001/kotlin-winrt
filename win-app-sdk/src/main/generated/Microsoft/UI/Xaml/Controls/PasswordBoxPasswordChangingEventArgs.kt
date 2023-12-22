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

@ABIMarker(PasswordBoxPasswordChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PasswordBoxPasswordChangingEventArgs;{9a2f3b79-c00c-5d27-bb67-92cab3db0477})")
@WinRTByReference(brClass = PasswordBoxPasswordChangingEventArgs.ByReference::class)
public class PasswordBoxPasswordChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPasswordBoxPasswordChangingEventArgs.WithDefault, IWinRTObject {
  private val __1173592646_Interface: IPasswordBoxPasswordChangingEventArgs.WithDefault by lazy {
    as_1173592646()
  }


  public override val __1173592646_Ptr: JNAPointer? by lazy {
    __1173592646_Interface.__1173592646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1173592646_Interface)

  private fun as_1173592646(): IPasswordBoxPasswordChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPasswordBoxPasswordChangingEventArgs.ABI.makeIPasswordBoxPasswordChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPasswordBoxPasswordChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPasswordBoxPasswordChangingEventArgs.ABI.makeIPasswordBoxPasswordChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PasswordBoxPasswordChangingEventArgs> {
    public override fun getValue() = PasswordBoxPasswordChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PasswordBoxPasswordChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PasswordBoxPasswordChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PasswordBoxPasswordChangingEventArgs {
      val address = segment.toRawLongValue()
      return PasswordBoxPasswordChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PasswordBoxPasswordChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
