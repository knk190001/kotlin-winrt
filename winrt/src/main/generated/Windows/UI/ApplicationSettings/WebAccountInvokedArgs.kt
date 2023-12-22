package Windows.UI.ApplicationSettings

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

@ABIMarker(WebAccountInvokedArgs.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.WebAccountInvokedArgs;{e7abcc40-a1d8-4c5d-9a7f-1d34b2f90ad2})")
@WinRTByReference(brClass = WebAccountInvokedArgs.ByReference::class)
public class WebAccountInvokedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccountInvokedArgs.WithDefault, IWinRTObject {
  private val __179510059_Interface: IWebAccountInvokedArgs.WithDefault by lazy {
    as_179510059()
  }


  public override val __179510059_Ptr: JNAPointer? by lazy {
    __179510059_Interface.__179510059_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__179510059_Interface)

  private fun as_179510059(): IWebAccountInvokedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebAccountInvokedArgs.ABI.makeIWebAccountInvokedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccountInvokedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccountInvokedArgs.ABI.makeIWebAccountInvokedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountInvokedArgs> {
    public override fun getValue() = WebAccountInvokedArgs(pointer.getPointer(0))

    public fun setValue(value: WebAccountInvokedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountInvokedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebAccountInvokedArgs {
      val address = segment.toRawLongValue()
      return WebAccountInvokedArgs(Pointer(address))
    }

    public override fun toNative(obj: WebAccountInvokedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
