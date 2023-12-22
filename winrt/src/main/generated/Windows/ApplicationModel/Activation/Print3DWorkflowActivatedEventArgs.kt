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

@ABIMarker(Print3DWorkflowActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.Print3DWorkflowActivatedEventArgs;{3f57e78b-f2ac-4619-8302-ef855e1c9b90})")
@WinRTByReference(brClass = Print3DWorkflowActivatedEventArgs.ByReference::class)
public class Print3DWorkflowActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrint3DWorkflowActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __1331609722_Interface: IPrint3DWorkflowActivatedEventArgs.WithDefault by lazy {
    as_1331609722()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __1331609722_Ptr: JNAPointer? by lazy {
    __1331609722_Interface.__1331609722_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1331609722_Interface, __1721660047_Interface)

  private fun as_1331609722(): IPrint3DWorkflowActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrint3DWorkflowActivatedEventArgs.ABI.makeIPrint3DWorkflowActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrint3DWorkflowActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrint3DWorkflowActivatedEventArgs.ABI.makeIPrint3DWorkflowActivatedEventArgs(ref.value))
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
      IByReference<Print3DWorkflowActivatedEventArgs> {
    public override fun getValue() = Print3DWorkflowActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: Print3DWorkflowActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Print3DWorkflowActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Print3DWorkflowActivatedEventArgs {
      val address = segment.toRawLongValue()
      return Print3DWorkflowActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: Print3DWorkflowActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
