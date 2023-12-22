package Windows.Storage.Pickers.Provider

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

@ABIMarker(PickerClosingDeferral.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.PickerClosingDeferral;{7af7f71e-1a67-4a31-ae80-e907708a619b})")
@WinRTByReference(brClass = PickerClosingDeferral.ByReference::class)
public class PickerClosingDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPickerClosingDeferral.WithDefault, IWinRTObject {
  private val __813433151_Interface: IPickerClosingDeferral.WithDefault by lazy {
    as_813433151()
  }


  public override val __813433151_Ptr: JNAPointer? by lazy {
    __813433151_Interface.__813433151_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__813433151_Interface)

  private fun as_813433151(): IPickerClosingDeferral.WithDefault {
    if(pointer == NULL) {
      return(IPickerClosingDeferral.ABI.makeIPickerClosingDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerClosingDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerClosingDeferral.ABI.makeIPickerClosingDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerClosingDeferral> {
    public override fun getValue() = PickerClosingDeferral(pointer.getPointer(0))

    public fun setValue(value: PickerClosingDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerClosingDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerClosingDeferral {
      val address = segment.toRawLongValue()
      return PickerClosingDeferral(Pointer(address))
    }

    public override fun toNative(obj: PickerClosingDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
