package Windows.Security.EnterpriseData

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

@ABIMarker(ProtectedContentRevokedEventArgs.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs;{63686821-58b9-47ee-93d9-f0f741cf43f0})")
@WinRTByReference(brClass = ProtectedContentRevokedEventArgs.ByReference::class)
public class ProtectedContentRevokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectedContentRevokedEventArgs.WithDefault, IWinRTObject {
  private val __1749137983_Interface: IProtectedContentRevokedEventArgs.WithDefault by lazy {
    as_1749137983()
  }


  public override val __1749137983_Ptr: JNAPointer? by lazy {
    __1749137983_Interface.__1749137983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1749137983_Interface)

  private fun as_1749137983(): IProtectedContentRevokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProtectedContentRevokedEventArgs.ABI.makeIProtectedContentRevokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectedContentRevokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectedContentRevokedEventArgs.ABI.makeIProtectedContentRevokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectedContentRevokedEventArgs> {
    public override fun getValue() = ProtectedContentRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProtectedContentRevokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectedContentRevokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtectedContentRevokedEventArgs {
      val address = segment.toRawLongValue()
      return ProtectedContentRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProtectedContentRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
