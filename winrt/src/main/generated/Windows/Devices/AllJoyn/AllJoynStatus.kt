package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynStatus.ABI::class)
@WinRTByReference(brClass = AllJoynStatus.ByReference::class)
public class AllJoynStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AllJoynStatus>
      {
    public override fun getValue() = AllJoynStatus(pointer.getPointer(0))

    public fun setValue(value: AllJoynStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynStatus, MemoryAddress> {
    public val IAllJoynStatusStatics_Instance: IAllJoynStatusStatics by lazy {
      createIAllJoynStatusStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynStatusStatics(): IAllJoynStatusStatics {
      val refiid = Guid.REFIID(IAllJoynStatusStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynStatus".toHandle(),refiid,interfacePtr)
      val result = IAllJoynStatusStatics.ABI.makeIAllJoynStatusStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AllJoynStatus {
      val address = segment.toRawLongValue()
      return AllJoynStatus(Pointer(address))
    }

    public override fun toNative(obj: AllJoynStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Ok() = ABI.IAllJoynStatusStatics_Instance.get_Ok()

    public fun get_Fail() = ABI.IAllJoynStatusStatics_Instance.get_Fail()

    public fun get_OperationTimedOut() = ABI.IAllJoynStatusStatics_Instance.get_OperationTimedOut()

    public fun get_OtherEndClosed() = ABI.IAllJoynStatusStatics_Instance.get_OtherEndClosed()

    public fun get_ConnectionRefused() = ABI.IAllJoynStatusStatics_Instance.get_ConnectionRefused()

    public fun get_AuthenticationFailed() =
        ABI.IAllJoynStatusStatics_Instance.get_AuthenticationFailed()

    public fun get_AuthenticationRejectedByUser() =
        ABI.IAllJoynStatusStatics_Instance.get_AuthenticationRejectedByUser()

    public fun get_SslConnectFailed() = ABI.IAllJoynStatusStatics_Instance.get_SslConnectFailed()

    public fun get_SslIdentityVerificationFailed() =
        ABI.IAllJoynStatusStatics_Instance.get_SslIdentityVerificationFailed()

    public fun get_InsufficientSecurity() =
        ABI.IAllJoynStatusStatics_Instance.get_InsufficientSecurity()

    public fun get_InvalidArgument1() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument1()

    public fun get_InvalidArgument2() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument2()

    public fun get_InvalidArgument3() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument3()

    public fun get_InvalidArgument4() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument4()

    public fun get_InvalidArgument5() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument5()

    public fun get_InvalidArgument6() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument6()

    public fun get_InvalidArgument7() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument7()

    public fun get_InvalidArgument8() = ABI.IAllJoynStatusStatics_Instance.get_InvalidArgument8()
  }
}
