package Windows.System

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

@ABIMarker(AppUriHandlerRegistration.ABI::class)
@Signature("rc(Windows.System.AppUriHandlerRegistration;{6f73aeb1-4569-5c3f-9ba0-99123eea32c3})")
@WinRTByReference(brClass = AppUriHandlerRegistration.ByReference::class)
public class AppUriHandlerRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppUriHandlerRegistration.WithDefault,
    IAppUriHandlerRegistration2.WithDefault, IWinRTObject {
  private val __1889956617_Interface: IAppUriHandlerRegistration.WithDefault by lazy {
    as_1889956617()
  }


  private val __1540886967_Interface: IAppUriHandlerRegistration2.WithDefault by lazy {
    as_1540886967()
  }


  public override val __1889956617_Ptr: JNAPointer? by lazy {
    __1889956617_Interface.__1889956617_Ptr
  }


  public override val __1540886967_Ptr: JNAPointer? by lazy {
    __1540886967_Interface.__1540886967_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1889956617_Interface, __1540886967_Interface)

  private fun as_1889956617(): IAppUriHandlerRegistration.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerRegistration.ABI.makeIAppUriHandlerRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerRegistration.ABI.makeIAppUriHandlerRegistration(ref.value))
  }

  private fun as_1540886967(): IAppUriHandlerRegistration2.WithDefault {
    if(pointer == NULL) {
      return(IAppUriHandlerRegistration2.ABI.makeIAppUriHandlerRegistration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppUriHandlerRegistration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppUriHandlerRegistration2.ABI.makeIAppUriHandlerRegistration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppUriHandlerRegistration> {
    public override fun getValue() = AppUriHandlerRegistration(pointer.getPointer(0))

    public fun setValue(value: AppUriHandlerRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppUriHandlerRegistration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppUriHandlerRegistration {
      val address = segment.toRawLongValue()
      return AppUriHandlerRegistration(Pointer(address))
    }

    public override fun toNative(obj: AppUriHandlerRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
