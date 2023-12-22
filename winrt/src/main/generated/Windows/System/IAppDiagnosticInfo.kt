package Windows.System

import Windows.ApplicationModel.AppInfo
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppDiagnosticInfo.ABI::class)
@Signature("{e348a69a-8889-4ca3-be07-d5ffff5f0804}")
@Guid("e348a69a88894ca3be07d5ffff5f0804")
@WinRTInterface("e348a69a88894ca3be07d5ffff5f0804")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDiagnosticInfo.ByReference::class)
public interface IAppDiagnosticInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppInfo(): AppInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDiagnosticInfo> {
    public override fun getValue() = ABI.makeIAppDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: IAppDiagnosticInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDiagnosticInfo {
    public val __1784887833_Ptr: Pointer?

    public val _1784887833_VtblPtr: Pointer?
      get() = __1784887833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppInfo(): AppInfo? {
      val fnPtr = _1784887833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInfo>()
      val hr = fn.invokeHR(arrayOf(__1784887833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppDiagnosticInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1784887833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDiagnosticInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e348a69a88894ca3be07d5ffff5f0804")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDiagnosticInfo(ptr: Pointer?): WithDefault = IAppDiagnosticInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDiagnosticInfo {
      val address = segment.toRawLongValue()
      return makeIAppDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: IAppDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1784887833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDiagnosticInfo): Array<IAppDiagnosticInfo?> =
        (elements as
        Array<IAppDiagnosticInfo?>).castToImpl<IAppDiagnosticInfo,IAppDiagnosticInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDiagnosticInfo?> =
        arrayOfNulls<IAppDiagnosticInfo_Impl>(size) as Array<IAppDiagnosticInfo?>
  }
}
