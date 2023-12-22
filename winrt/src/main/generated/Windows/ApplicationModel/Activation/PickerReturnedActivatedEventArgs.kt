package Windows.ApplicationModel.Activation

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

@ABIMarker(PickerReturnedActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs;{360defb9-a9d3-4984-a4ed-9ec734604921})")
@WinRTByReference(brClass = PickerReturnedActivatedEventArgs.ByReference::class)
public class PickerReturnedActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPickerReturnedActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __2015260116_Interface: IPickerReturnedActivatedEventArgs.WithDefault by lazy {
    as_2015260116()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __2015260116_Ptr: JNAPointer? by lazy {
    __2015260116_Interface.__2015260116_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2015260116_Interface, __1721660047_Interface)

  private fun as_2015260116(): IPickerReturnedActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPickerReturnedActivatedEventArgs.ABI.makeIPickerReturnedActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPickerReturnedActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPickerReturnedActivatedEventArgs.ABI.makeIPickerReturnedActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PickerReturnedActivatedEventArgs> {
    public override fun getValue() = PickerReturnedActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PickerReturnedActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PickerReturnedActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PickerReturnedActivatedEventArgs {
      val address = segment.toRawLongValue()
      return PickerReturnedActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PickerReturnedActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
