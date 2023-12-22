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

@ABIMarker(CryptographicKey.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Core.CryptographicKey;{ed2a3b70-8e7b-4009-8401-ffd1a62eeb27})")
@WinRTByReference(brClass = CryptographicKey.ByReference::class)
public class CryptographicKey(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICryptographicKey.WithDefault, IWinRTObject {
  private val __1011511619_Interface: ICryptographicKey.WithDefault by lazy {
    as_1011511619()
  }


  public override val __1011511619_Ptr: JNAPointer? by lazy {
    __1011511619_Interface.__1011511619_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1011511619_Interface)

  private fun as_1011511619(): ICryptographicKey.WithDefault {
    if(pointer == NULL) {
      return(ICryptographicKey.ABI.makeICryptographicKey(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICryptographicKey>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICryptographicKey.ABI.makeICryptographicKey(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CryptographicKey> {
    public override fun getValue() = CryptographicKey(pointer.getPointer(0))

    public fun setValue(value: CryptographicKey): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CryptographicKey, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CryptographicKey {
      val address = segment.toRawLongValue()
      return CryptographicKey(Pointer(address))
    }

    public override fun toNative(obj: CryptographicKey): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
