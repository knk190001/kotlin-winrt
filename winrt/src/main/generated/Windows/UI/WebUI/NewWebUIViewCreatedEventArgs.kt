package Windows.UI.WebUI

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

@ABIMarker(NewWebUIViewCreatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.NewWebUIViewCreatedEventArgs;{e8e1b216-be2b-4c9e-85e7-083143ec4be7})")
@WinRTByReference(brClass = NewWebUIViewCreatedEventArgs.ByReference::class)
public class NewWebUIViewCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INewWebUIViewCreatedEventArgs.WithDefault, IWinRTObject {
  private val __2105389044_Interface: INewWebUIViewCreatedEventArgs.WithDefault by lazy {
    as_2105389044()
  }


  public override val __2105389044_Ptr: JNAPointer? by lazy {
    __2105389044_Interface.__2105389044_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2105389044_Interface)

  private fun as_2105389044(): INewWebUIViewCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INewWebUIViewCreatedEventArgs.ABI.makeINewWebUIViewCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INewWebUIViewCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INewWebUIViewCreatedEventArgs.ABI.makeINewWebUIViewCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NewWebUIViewCreatedEventArgs> {
    public override fun getValue() = NewWebUIViewCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NewWebUIViewCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NewWebUIViewCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NewWebUIViewCreatedEventArgs {
      val address = segment.toRawLongValue()
      return NewWebUIViewCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NewWebUIViewCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
