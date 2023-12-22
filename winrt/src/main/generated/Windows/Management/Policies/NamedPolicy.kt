package Windows.Management.Policies

import Windows.System.User
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NamedPolicy.ABI::class)
@WinRTByReference(brClass = NamedPolicy.ByReference::class)
public class NamedPolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<NamedPolicy> {
    public override fun getValue() = NamedPolicy(pointer.getPointer(0))

    public fun setValue(value: NamedPolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NamedPolicy, MemoryAddress> {
    public val INamedPolicyStatics_Instance: INamedPolicyStatics by lazy {
      createINamedPolicyStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINamedPolicyStatics(): INamedPolicyStatics {
      val refiid = Guid.REFIID(INamedPolicyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Policies.NamedPolicy".toHandle(),refiid,interfacePtr)
      val result = INamedPolicyStatics.ABI.makeINamedPolicyStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NamedPolicy {
      val address = segment.toRawLongValue()
      return NamedPolicy(Pointer(address))
    }

    public override fun toNative(obj: NamedPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetPolicyFromPath(area: String, name: String) =
        ABI.INamedPolicyStatics_Instance.GetPolicyFromPath(area, name)

    public fun GetPolicyFromPathForUser(
      user: User,
      area: String,
      name: String
    ) = ABI.INamedPolicyStatics_Instance.GetPolicyFromPathForUser(user, area, name)
  }
}
