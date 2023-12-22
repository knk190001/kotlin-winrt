package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INetworkOperatorNotificationTrigger.ABI::class)
@Signature("{90089cc6-63cd-480c-95d1-6e6aef801e4a}")
@Guid("90089cc663cd480c95d16e6aef801e4a")
@WinRTInterface("90089cc663cd480c95d16e6aef801e4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorNotificationTrigger.ByReference::class)
public interface INetworkOperatorNotificationTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_NetworkAccountId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorNotificationTrigger> {
    public override fun getValue() =
        ABI.makeINetworkOperatorNotificationTrigger(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorNotificationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorNotificationTrigger, IBackgroundTrigger.WithDefault
      {
    public val __1265972652_Ptr: Pointer?

    public val _1265972652_VtblPtr: Pointer?
      get() = __1265972652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkAccountId(): String? {
      val fnPtr = _1265972652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1265972652_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorNotificationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1265972652_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1265972652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorNotificationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90089cc663cd480c95d16e6aef801e4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorNotificationTrigger(ptr: Pointer?): WithDefault =
        INetworkOperatorNotificationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INetworkOperatorNotificationTrigger {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorNotificationTrigger(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorNotificationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1265972652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorNotificationTrigger):
        Array<INetworkOperatorNotificationTrigger?> = (elements as
        Array<INetworkOperatorNotificationTrigger?>).castToImpl<INetworkOperatorNotificationTrigger,INetworkOperatorNotificationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorNotificationTrigger?> =
        arrayOfNulls<INetworkOperatorNotificationTrigger_Impl>(size) as
        Array<INetworkOperatorNotificationTrigger?>
  }
}
