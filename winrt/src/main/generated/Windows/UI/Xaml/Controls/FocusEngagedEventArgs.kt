package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.RoutedEventArgs
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FocusEngagedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.FocusEngagedEventArgs;{a69fc352-da66-404c-823f-5358594e70bb})")
@WinRTByReference(brClass = FocusEngagedEventArgs.ByReference::class)
public class FocusEngagedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IFocusEngagedEventArgs.WithDefault, IFocusEngagedEventArgs2.WithDefault,
    IWinRTObject {
  private val __1142388496_Interface: IFocusEngagedEventArgs.WithDefault by lazy {
    as_1142388496()
  }


  private val __1054305058_Interface: IFocusEngagedEventArgs2.WithDefault by lazy {
    as_1054305058()
  }


  public override val __1142388496_Ptr: JNAPointer? by lazy {
    __1142388496_Interface.__1142388496_Ptr
  }


  public override val __1054305058_Ptr: JNAPointer? by lazy {
    __1054305058_Interface.__1054305058_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1142388496_Interface, __1054305058_Interface)

  private fun as_1142388496(): IFocusEngagedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFocusEngagedEventArgs.ABI.makeIFocusEngagedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusEngagedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusEngagedEventArgs.ABI.makeIFocusEngagedEventArgs(ref.value))
  }

  private fun as_1054305058(): IFocusEngagedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IFocusEngagedEventArgs2.ABI.makeIFocusEngagedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusEngagedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusEngagedEventArgs2.ABI.makeIFocusEngagedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusEngagedEventArgs> {
    public override fun getValue() = FocusEngagedEventArgs(pointer.getPointer(0))

    public fun setValue(value: FocusEngagedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusEngagedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusEngagedEventArgs {
      val address = segment.toRawLongValue()
      return FocusEngagedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FocusEngagedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
