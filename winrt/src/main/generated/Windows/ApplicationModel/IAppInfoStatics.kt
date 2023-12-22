package Windows.ApplicationModel

import Windows.System.User
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

@ABIMarker(IAppInfoStatics.ABI::class)
@Signature("{cf1f782a-e48b-4f0c-9b0b-79c3f8957dd7}")
@Guid("cf1f782ae48b4f0c9b0b79c3f8957dd7")
@WinRTInterface("cf1f782ae48b4f0c9b0b79c3f8957dd7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInfoStatics.ByReference::class)
public interface IAppInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): AppInfo?

  @InterfaceMethod(1)
  public fun GetFromAppUserModelId(appUserModelId: String?): AppInfo?

  @InterfaceMethod(2)
  public fun GetFromAppUserModelIdForUser(user: User?, appUserModelId: String?): AppInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInfoStatics> {
    public override fun getValue() = ABI.makeIAppInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IAppInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInfoStatics {
    public val __732788101_Ptr: Pointer?

    public val _732788101_VtblPtr: Pointer?
      get() = __732788101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): AppInfo? {
      val fnPtr = _732788101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__732788101_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFromAppUserModelId(appUserModelId: String?): AppInfo? {
      val fnPtr = _732788101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__732788101_Ptr, marshalToNative(appUserModelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetFromAppUserModelIdForUser(user: User?, appUserModelId: String?):
        AppInfo? {
      val fnPtr = _732788101_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__732788101_Ptr, marshalToNative(user),
          marshalToNative(appUserModelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __732788101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf1f782ae48b4f0c9b0b79c3f8957dd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInfoStatics(ptr: Pointer?): WithDefault = IAppInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInfoStatics {
      val address = segment.toRawLongValue()
      return makeIAppInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__732788101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfoStatics): Array<IAppInfoStatics?> = (elements as
        Array<IAppInfoStatics?>).castToImpl<IAppInfoStatics,IAppInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfoStatics?> =
        arrayOfNulls<IAppInfoStatics_Impl>(size) as Array<IAppInfoStatics?>
  }
}
