package Windows.Networking.NetworkOperators

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

@ABIMarker(KnownRuimFilePaths.ABI::class)
@WinRTByReference(brClass = KnownRuimFilePaths.ByReference::class)
public class KnownRuimFilePaths(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownRuimFilePaths> {
    public override fun getValue() = KnownRuimFilePaths(pointer.getPointer(0))

    public fun setValue(value: KnownRuimFilePaths): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownRuimFilePaths, MemoryAddress> {
    public val IKnownRuimFilePathsStatics_Instance: IKnownRuimFilePathsStatics by lazy {
      createIKnownRuimFilePathsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownRuimFilePathsStatics(): IKnownRuimFilePathsStatics {
      val refiid = Guid.REFIID(IKnownRuimFilePathsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.KnownRuimFilePaths".toHandle(),refiid,interfacePtr)
      val result = IKnownRuimFilePathsStatics.ABI.makeIKnownRuimFilePathsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownRuimFilePaths {
      val address = segment.toRawLongValue()
      return KnownRuimFilePaths(Pointer(address))
    }

    public override fun toNative(obj: KnownRuimFilePaths): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EFSpn() = ABI.IKnownRuimFilePathsStatics_Instance.get_EFSpn()

    public fun get_Gid1() = ABI.IKnownRuimFilePathsStatics_Instance.get_Gid1()

    public fun get_Gid2() = ABI.IKnownRuimFilePathsStatics_Instance.get_Gid2()
  }
}
