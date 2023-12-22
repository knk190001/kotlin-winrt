package Windows.Security.Cryptography.Core

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

@ABIMarker(CryptographicHash.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.CryptographicHash;{5904d1b6-ad31-4603-a3a4-b1bda98e2562})")
@WinRTByReference(brClass = CryptographicHash.ByReference::class)
public class CryptographicHash(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHashComputation.WithDefault, IWinRTObject {
  private val __149737714_Interface: IHashComputation.WithDefault by lazy {
    as_149737714()
  }


  public override val __149737714_Ptr: JNAPointer? by lazy {
    __149737714_Interface.__149737714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__149737714_Interface)

  private fun as_149737714(): IHashComputation.WithDefault {
    if(pointer == NULL) {
      return(IHashComputation.ABI.makeIHashComputation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHashComputation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHashComputation.ABI.makeIHashComputation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CryptographicHash> {
    public override fun getValue() = CryptographicHash(pointer.getPointer(0))

    public fun setValue(value: CryptographicHash): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CryptographicHash, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CryptographicHash {
      val address = segment.toRawLongValue()
      return CryptographicHash(Pointer(address))
    }

    public override fun toNative(obj: CryptographicHash): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
