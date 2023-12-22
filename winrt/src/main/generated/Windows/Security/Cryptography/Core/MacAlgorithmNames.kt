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

@ABIMarker(MacAlgorithmNames.ABI::class)
@WinRTByReference(brClass = MacAlgorithmNames.ByReference::class)
public class MacAlgorithmNames(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MacAlgorithmNames> {
    public override fun getValue() = MacAlgorithmNames(pointer.getPointer(0))

    public fun setValue(value: MacAlgorithmNames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MacAlgorithmNames, MemoryAddress> {
    public val IMacAlgorithmNamesStatics_Instance: IMacAlgorithmNamesStatics by lazy {
      createIMacAlgorithmNamesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMacAlgorithmNamesStatics(): IMacAlgorithmNamesStatics {
      val refiid = Guid.REFIID(IMacAlgorithmNamesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Core.MacAlgorithmNames".toHandle(),refiid,interfacePtr)
      val result = IMacAlgorithmNamesStatics.ABI.makeIMacAlgorithmNamesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MacAlgorithmNames {
      val address = segment.toRawLongValue()
      return MacAlgorithmNames(Pointer(address))
    }

    public override fun toNative(obj: MacAlgorithmNames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HmacMd5() = ABI.IMacAlgorithmNamesStatics_Instance.get_HmacMd5()

    public fun get_HmacSha1() = ABI.IMacAlgorithmNamesStatics_Instance.get_HmacSha1()

    public fun get_HmacSha256() = ABI.IMacAlgorithmNamesStatics_Instance.get_HmacSha256()

    public fun get_HmacSha384() = ABI.IMacAlgorithmNamesStatics_Instance.get_HmacSha384()

    public fun get_HmacSha512() = ABI.IMacAlgorithmNamesStatics_Instance.get_HmacSha512()

    public fun get_AesCmac() = ABI.IMacAlgorithmNamesStatics_Instance.get_AesCmac()
  }
}
