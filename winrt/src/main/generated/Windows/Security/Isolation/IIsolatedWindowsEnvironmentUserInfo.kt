package Windows.Security.Isolation

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IIsolatedWindowsEnvironmentUserInfo.ABI::class)
@Signature("{8a9c75ae-69ba-4001-96fc-19a02703b340}")
@Guid("8a9c75ae69ba400196fc19a02703b340")
@WinRTInterface("8a9c75ae69ba400196fc19a02703b340")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentUserInfo.ByReference::class)
public interface IIsolatedWindowsEnvironmentUserInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnvironmentUserSid(): String?

  @InterfaceMethod(1)
  public fun get_EnvironmentUserName(): String?

  @InterfaceMethod(2)
  public fun TryWaitForSignInAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentUserInfo> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentUserInfo(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentUserInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentUserInfo {
    public val __1791633920_Ptr: Pointer?

    public val _1791633920_VtblPtr: Pointer?
      get() = __1791633920_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnvironmentUserSid(): String? {
      val fnPtr = _1791633920_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1791633920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EnvironmentUserName(): String? {
      val fnPtr = _1791633920_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1791633920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryWaitForSignInAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1791633920_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1791633920_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentUserInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1791633920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentUserInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a9c75ae69ba400196fc19a02703b340")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentUserInfo(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentUserInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentUserInfo {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentUserInfo(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentUserInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1791633920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentUserInfo):
        Array<IIsolatedWindowsEnvironmentUserInfo?> = (elements as
        Array<IIsolatedWindowsEnvironmentUserInfo?>).castToImpl<IIsolatedWindowsEnvironmentUserInfo,IIsolatedWindowsEnvironmentUserInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentUserInfo?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentUserInfo_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentUserInfo?>
  }
}
