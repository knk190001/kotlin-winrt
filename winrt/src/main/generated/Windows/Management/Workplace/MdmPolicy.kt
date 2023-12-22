package Windows.Management.Workplace

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(MdmPolicy.ABI::class)
@WinRTByReference(brClass = MdmPolicy.ByReference::class)
public class MdmPolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MdmPolicy> {
    public override fun getValue() = MdmPolicy(pointer.getPointer(0))

    public fun setValue(value: MdmPolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MdmPolicy, MemoryAddress> {
    public val IMdmAllowPolicyStatics_Instance: IMdmAllowPolicyStatics by lazy {
      createIMdmAllowPolicyStatics()
    }


    public val IMdmPolicyStatics2_Instance: IMdmPolicyStatics2 by lazy {
      createIMdmPolicyStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMdmAllowPolicyStatics(): IMdmAllowPolicyStatics {
      val refiid = Guid.REFIID(IMdmAllowPolicyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Workplace.MdmPolicy".toHandle(),refiid,interfacePtr)
      val result = IMdmAllowPolicyStatics.ABI.makeIMdmAllowPolicyStatics(interfacePtr.value)
      return result
    }

    public fun createIMdmPolicyStatics2(): IMdmPolicyStatics2 {
      val refiid = Guid.REFIID(IMdmPolicyStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Workplace.MdmPolicy".toHandle(),refiid,interfacePtr)
      val result = IMdmPolicyStatics2.ABI.makeIMdmPolicyStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MdmPolicy {
      val address = segment.toRawLongValue()
      return MdmPolicy(Pointer(address))
    }

    public override fun toNative(obj: MdmPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsBrowserAllowed() = ABI.IMdmAllowPolicyStatics_Instance.IsBrowserAllowed()

    public fun IsCameraAllowed() = ABI.IMdmAllowPolicyStatics_Instance.IsCameraAllowed()

    public fun IsMicrosoftAccountAllowed() =
        ABI.IMdmAllowPolicyStatics_Instance.IsMicrosoftAccountAllowed()

    public fun IsStoreAllowed() = ABI.IMdmAllowPolicyStatics_Instance.IsStoreAllowed()

    public fun GetMessagingSyncPolicy() = ABI.IMdmPolicyStatics2_Instance.GetMessagingSyncPolicy()
  }
}
