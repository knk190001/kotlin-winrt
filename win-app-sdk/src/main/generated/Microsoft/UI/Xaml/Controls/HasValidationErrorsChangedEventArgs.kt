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

@ABIMarker(HasValidationErrorsChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.HasValidationErrorsChangedEventArgs;{e1f0f2cf-b0ef-5f56-b597-f0771f5cffd2})")
@WinRTByReference(brClass = HasValidationErrorsChangedEventArgs.ByReference::class)
public class HasValidationErrorsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHasValidationErrorsChangedEventArgs.WithDefault, IWinRTObject {
  private val __721365190_Interface: IHasValidationErrorsChangedEventArgs.WithDefault by lazy {
    as_721365190()
  }


  public override val __721365190_Ptr: JNAPointer? by lazy {
    __721365190_Interface.__721365190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__721365190_Interface)

  private fun as_721365190(): IHasValidationErrorsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHasValidationErrorsChangedEventArgs.ABI.makeIHasValidationErrorsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHasValidationErrorsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHasValidationErrorsChangedEventArgs.ABI.makeIHasValidationErrorsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HasValidationErrorsChangedEventArgs> {
    public override fun getValue() = HasValidationErrorsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HasValidationErrorsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HasValidationErrorsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HasValidationErrorsChangedEventArgs {
      val address = segment.toRawLongValue()
      return HasValidationErrorsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HasValidationErrorsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
