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

@ABIMarker(KnownUSimFilePaths.ABI::class)
@WinRTByReference(brClass = KnownUSimFilePaths.ByReference::class)
public class KnownUSimFilePaths(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownUSimFilePaths> {
    public override fun getValue() = KnownUSimFilePaths(pointer.getPointer(0))

    public fun setValue(value: KnownUSimFilePaths): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownUSimFilePaths, MemoryAddress> {
    public val IKnownUSimFilePathsStatics_Instance: IKnownUSimFilePathsStatics by lazy {
      createIKnownUSimFilePathsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownUSimFilePathsStatics(): IKnownUSimFilePathsStatics {
      val refiid = Guid.REFIID(IKnownUSimFilePathsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.KnownUSimFilePaths".toHandle(),refiid,interfacePtr)
      val result = IKnownUSimFilePathsStatics.ABI.makeIKnownUSimFilePathsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownUSimFilePaths {
      val address = segment.toRawLongValue()
      return KnownUSimFilePaths(Pointer(address))
    }

    public override fun toNative(obj: KnownUSimFilePaths): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EFSpn() = ABI.IKnownUSimFilePathsStatics_Instance.get_EFSpn()

    public fun get_EFOpl() = ABI.IKnownUSimFilePathsStatics_Instance.get_EFOpl()

    public fun get_EFPnn() = ABI.IKnownUSimFilePathsStatics_Instance.get_EFPnn()

    public fun get_Gid1() = ABI.IKnownUSimFilePathsStatics_Instance.get_Gid1()

    public fun get_Gid2() = ABI.IKnownUSimFilePathsStatics_Instance.get_Gid2()
  }
}
