package Windows.ApplicationModel.Background

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(INetworkOperatorNotificationTriggerFactory.ABI::class)
@Signature("{0a223e00-27d7-4353-adb9-9265aaea579d}")
@Guid("0a223e0027d74353adb99265aaea579d")
@WinRTInterface("0a223e0027d74353adb99265aaea579d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorNotificationTriggerFactory.ByReference::class)
public interface INetworkOperatorNotificationTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(networkAccountId: String?): NetworkOperatorNotificationTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorNotificationTriggerFactory> {
    public override fun getValue() =
        ABI.makeINetworkOperatorNotificationTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorNotificationTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorNotificationTriggerFactory {
    public val __1654856126_Ptr: Pointer?

    public val _1654856126_VtblPtr: Pointer?
      get() = __1654856126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(networkAccountId: String?): NetworkOperatorNotificationTrigger? {
      val fnPtr = _1654856126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorNotificationTrigger>()
      val hr = fn.invokeHR(arrayOf(__1654856126_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkOperatorNotificationTrigger>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorNotificationTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1654856126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorNotificationTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a223e0027d74353adb99265aaea579d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorNotificationTriggerFactory(ptr: Pointer?): WithDefault =
        INetworkOperatorNotificationTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorNotificationTriggerFactory {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorNotificationTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorNotificationTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1654856126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorNotificationTriggerFactory):
        Array<INetworkOperatorNotificationTriggerFactory?> = (elements as
        Array<INetworkOperatorNotificationTriggerFactory?>).castToImpl<INetworkOperatorNotificationTriggerFactory,INetworkOperatorNotificationTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorNotificationTriggerFactory?> =
        arrayOfNulls<INetworkOperatorNotificationTriggerFactory_Impl>(size) as
        Array<INetworkOperatorNotificationTriggerFactory?>
  }
}
