package Windows.Security.Cryptography.Core

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(HashAlgorithmNames.ABI::class)
@WinRTByReference(brClass = HashAlgorithmNames.ByReference::class)
public class HashAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HashAlgorithmNames> {
    public override fun getValue() = HashAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: HashAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HashAlgorithmNames, MemoryAddress> {
    public val IHashAlgorithmNamesStatics_Instance: IHashAlgorithmNamesStatics by lazy {
      createIHashAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHashAlgorithmNamesStatics(): IHashAlgorithmNamesStatics {
      val refiid = Guid.REFIID(IHashAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.HashAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result = IHashAlgorithmNamesStatics.ABI.makeIHashAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HashAlgorithmNames {
      val address = segment.toRawLongValue()
      return HashAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: HashAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Md5() = ABI.IHashAlgorithmNamesStatics_Instance.get_Md5()

    public fun get_Sha1() = ABI.IHashAlgorithmNamesStatics_Instance.get_Sha1()

    public fun get_Sha256() = ABI.IHashAlgorithmNamesStatics_Instance.get_Sha256()

    public fun get_Sha384() = ABI.IHashAlgorithmNamesStatics_Instance.get_Sha384()

    public fun get_Sha512() = ABI.IHashAlgorithmNamesStatics_Instance.get_Sha512()
  }
}
