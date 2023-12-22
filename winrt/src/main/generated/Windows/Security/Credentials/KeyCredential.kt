package Windows.Security.Credentials

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

@ABIMarker(KeyCredential.ABI::class)
@Signature("rc(Windows.Security.Credentials.KeyCredential;{9585ef8d-457b-4847-b11a-fa960bbdb138})")
@WinRTByReference(brClass = KeyCredential.ByReference::class)
public class KeyCredential(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyCredential.WithDefault, IWinRTObject {
  private val __1289381242_Interface: IKeyCredential.WithDefault by lazy {
    as_1289381242()
  }


  public override val __1289381242_Ptr: JNAPointer? by lazy {
    __1289381242_Interface.__1289381242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1289381242_Interface)

  private fun as_1289381242(): IKeyCredential.WithDefault {
    if(pointer == NULL) {
      return(IKeyCredential.ABI.makeIKeyCredential(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyCredential>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyCredential.ABI.makeIKeyCredential(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KeyCredential>
      {
    public override fun getValue() = KeyCredential(pointer.getPointer(0))

    public fun setValue(value: KeyCredential): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyCredential, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyCredential {
      val address = segment.toRawLongValue()
      return KeyCredential(Pointer(address))
    }

    public override fun toNative(obj: KeyCredential): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
