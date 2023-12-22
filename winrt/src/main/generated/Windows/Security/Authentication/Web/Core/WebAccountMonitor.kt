package Windows.Security.Authentication.Web.Core

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

@ABIMarker(WebAccountMonitor.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebAccountMonitor;{7445f5fd-aa9d-4619-8d5d-c138a4ede3e5})")
@WinRTByReference(brClass = WebAccountMonitor.ByReference::class)
public class WebAccountMonitor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountMonitor.WithDefault, IWebAccountMonitor2.WithDefault, IWinRTObject
    {
  private val __1062977276_Interface: IWebAccountMonitor.WithDefault by lazy {
    as_1062977276()
  }


  private val __1407442862_Interface: IWebAccountMonitor2.WithDefault by lazy {
    as_1407442862()
  }


  public override val __1062977276_Ptr: JNAPointer? by lazy {
    __1062977276_Interface.__1062977276_Ptr
  }


  public override val __1407442862_Ptr: JNAPointer? by lazy {
    __1407442862_Interface.__1407442862_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1062977276_Interface, __1407442862_Interface)

  private fun as_1062977276(): IWebAccountMonitor.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountMonitor.ABI.makeIWebAccountMonitor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountMonitor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountMonitor.ABI.makeIWebAccountMonitor(ref.value))
  }

  private fun as_1407442862(): IWebAccountMonitor2.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountMonitor2.ABI.makeIWebAccountMonitor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountMonitor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountMonitor2.ABI.makeIWebAccountMonitor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountMonitor> {
    public override fun getValue() = WebAccountMonitor(pointer.getPointer(0))

    public fun setValue(value: WebAccountMonitor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountMonitor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAccountMonitor {
      val address = segment.toRawLongValue()
      return WebAccountMonitor(Pointer(address))
    }

    public override fun toNative(obj: WebAccountMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
