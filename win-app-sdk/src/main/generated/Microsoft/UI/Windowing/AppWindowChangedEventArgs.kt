package Microsoft.UI.Windowing

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

@ABIMarker(AppWindowChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.AppWindowChangedEventArgs;{2182bc5d-fdac-5c3e-bf37-7d8d684e9d1d})")
@WinRTByReference(brClass = AppWindowChangedEventArgs.ByReference::class)
public class AppWindowChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindowChangedEventArgs.WithDefault,
    IAppWindowChangedEventArgs2.WithDefault, IWinRTObject {
  private val __300815267_Interface: IAppWindowChangedEventArgs.WithDefault by lazy {
    as_300815267()
  }


  private val __735338735_Interface: IAppWindowChangedEventArgs2.WithDefault by lazy {
    as_735338735()
  }


  public override val __300815267_Ptr: JNAPointer? by lazy {
    __300815267_Interface.__300815267_Ptr
  }


  public override val __735338735_Ptr: JNAPointer? by lazy {
    __735338735_Interface.__735338735_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__300815267_Interface, __735338735_Interface)

  private fun as_300815267(): IAppWindowChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowChangedEventArgs.ABI.makeIAppWindowChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowChangedEventArgs.ABI.makeIAppWindowChangedEventArgs(ref.value))
  }

  private fun as_735338735(): IAppWindowChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAppWindowChangedEventArgs2.ABI.makeIAppWindowChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindowChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindowChangedEventArgs2.ABI.makeIAppWindowChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppWindowChangedEventArgs> {
    public override fun getValue() = AppWindowChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppWindowChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindowChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppWindowChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppWindowChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppWindowChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
