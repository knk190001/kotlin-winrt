package Windows.System

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAppDiagnosticInfo2.ABI::class)
@Signature("{df46fbd7-191a-446c-9473-8fbc2374a354}")
@Guid("df46fbd7191a446c94738fbc2374a354")
@WinRTInterface("df46fbd7191a446c94738fbc2374a354")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDiagnosticInfo2.ByReference::class)
public interface IAppDiagnosticInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetResourceGroups(): IVector<AppResourceGroupInfo?>?

  @InterfaceMethod(1)
  public fun CreateResourceGroupWatcher(): AppResourceGroupInfoWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDiagnosticInfo2> {
    public override fun getValue() = ABI.makeIAppDiagnosticInfo2(pointer.getPointer(0))

    public fun setValue(value: IAppDiagnosticInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDiagnosticInfo2 {
    public val __503052075_Ptr: Pointer?

    public val _503052075_VtblPtr: Pointer?
      get() = __503052075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetResourceGroups(): IVector<AppResourceGroupInfo?>? {
      val fnPtr = _503052075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AppResourceGroupInfo?>>()
      val hr = fn.invokeHR(arrayOf(__503052075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AppResourceGroupInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateResourceGroupWatcher(): AppResourceGroupInfoWatcher? {
      val fnPtr = _503052075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupInfoWatcher>()
      val hr = fn.invokeHR(arrayOf(__503052075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupInfoWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IAppDiagnosticInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503052075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDiagnosticInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df46fbd7191a446c94738fbc2374a354")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDiagnosticInfo2(ptr: Pointer?): WithDefault = IAppDiagnosticInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDiagnosticInfo2 {
      val address = segment.toRawLongValue()
      return makeIAppDiagnosticInfo2(Pointer(address))
    }

    public override fun toNative(obj: IAppDiagnosticInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503052075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDiagnosticInfo2): Array<IAppDiagnosticInfo2?> =
        (elements as
        Array<IAppDiagnosticInfo2?>).castToImpl<IAppDiagnosticInfo2,IAppDiagnosticInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDiagnosticInfo2?> =
        arrayOfNulls<IAppDiagnosticInfo2_Impl>(size) as Array<IAppDiagnosticInfo2?>
  }
}
