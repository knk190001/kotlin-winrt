package Windows.Phone.Notification.Management

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailFolderInfo.ABI::class)
@Signature("{c207150e-e237-46d6-90e6-4f529eeac1e2}")
@Guid("c207150ee23746d690e64f529eeac1e2")
@WinRTInterface("c207150ee23746d690e64f529eeac1e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailFolderInfo.ByReference::class)
public interface IEmailFolderInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_IsNotificationEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailFolderInfo> {
    public override fun getValue() = ABI.makeIEmailFolderInfo(pointer.getPointer(0))

    public fun setValue(value: IEmailFolderInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailFolderInfo {
    public val __1005620138_Ptr: Pointer?

    public val _1005620138_VtblPtr: Pointer?
      get() = __1005620138_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1005620138_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1005620138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsNotificationEnabled(): Boolean {
      val fnPtr = _1005620138_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1005620138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailFolderInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1005620138_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailFolderInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c207150ee23746d690e64f529eeac1e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailFolderInfo(ptr: Pointer?): WithDefault = IEmailFolderInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailFolderInfo {
      val address = segment.toRawLongValue()
      return makeIEmailFolderInfo(Pointer(address))
    }

    public override fun toNative(obj: IEmailFolderInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005620138_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailFolderInfo): Array<IEmailFolderInfo?> = (elements as
        Array<IEmailFolderInfo?>).castToImpl<IEmailFolderInfo,IEmailFolderInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailFolderInfo?> =
        arrayOfNulls<IEmailFolderInfo_Impl>(size) as Array<IEmailFolderInfo?>
  }
}
