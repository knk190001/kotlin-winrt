package Windows.UI.Xaml.Input

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

@ABIMarker(PointerRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.PointerRoutedEventArgs;{da628f0a-9752-49e2-bde2-49eccab9194d})")
@WinRTByReference(brClass = PointerRoutedEventArgs.ByReference::class)
public class PointerRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IPointerRoutedEventArgs.WithDefault, IPointerRoutedEventArgs2.WithDefault,
    IWinRTObject {
  private val __712093685_Interface: IPointerRoutedEventArgs.WithDefault by lazy {
    as_712093685()
  }


  private val __600067805_Interface: IPointerRoutedEventArgs2.WithDefault by lazy {
    as_600067805()
  }


  public override val __712093685_Ptr: JNAPointer? by lazy {
    __712093685_Interface.__712093685_Ptr
  }


  public override val __600067805_Ptr: JNAPointer? by lazy {
    __600067805_Interface.__600067805_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__712093685_Interface, __600067805_Interface)

  private fun as_712093685(): IPointerRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPointerRoutedEventArgs.ABI.makeIPointerRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerRoutedEventArgs.ABI.makeIPointerRoutedEventArgs(ref.value))
  }

  private fun as_600067805(): IPointerRoutedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IPointerRoutedEventArgs2.ABI.makeIPointerRoutedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerRoutedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerRoutedEventArgs2.ABI.makeIPointerRoutedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerRoutedEventArgs> {
    public override fun getValue() = PointerRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PointerRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PointerRoutedEventArgs {
      val address = segment.toRawLongValue()
      return PointerRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PointerRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
