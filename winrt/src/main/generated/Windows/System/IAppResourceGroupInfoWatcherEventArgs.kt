package Windows.System

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAppResourceGroupInfoWatcherEventArgs.ABI::class)
@Signature("{7a787637-6302-4d2f-bf89-1c12d0b2a6b9}")
@Guid("7a78763763024d2fbf891c12d0b2a6b9")
@WinRTInterface("7a78763763024d2fbf891c12d0b2a6b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupInfoWatcherEventArgs.ByReference::class)
public interface IAppResourceGroupInfoWatcherEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppDiagnosticInfos(): IVectorView<AppDiagnosticInfo?>?

  @InterfaceMethod(1)
  public fun get_AppResourceGroupInfo(): AppResourceGroupInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupInfoWatcherEventArgs> {
    public override fun getValue() =
        ABI.makeIAppResourceGroupInfoWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupInfoWatcherEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupInfoWatcherEventArgs {
    public val __326002568_Ptr: Pointer?

    public val _326002568_VtblPtr: Pointer?
      get() = __326002568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppDiagnosticInfos(): IVectorView<AppDiagnosticInfo?>? {
      val fnPtr = _326002568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppDiagnosticInfo?>>()
      val hr = fn.invokeHR(arrayOf(__326002568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppDiagnosticInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppResourceGroupInfo(): AppResourceGroupInfo? {
      val fnPtr = _326002568_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupInfo>()
      val hr = fn.invokeHR(arrayOf(__326002568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupInfo>(result.getValue())
      return resultValue
    }
  }

  public class IAppResourceGroupInfoWatcherEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __326002568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupInfoWatcherEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a78763763024d2fbf891c12d0b2a6b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupInfoWatcherEventArgs(ptr: Pointer?): WithDefault =
        IAppResourceGroupInfoWatcherEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupInfoWatcherEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupInfoWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupInfoWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326002568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupInfoWatcherEventArgs):
        Array<IAppResourceGroupInfoWatcherEventArgs?> = (elements as
        Array<IAppResourceGroupInfoWatcherEventArgs?>).castToImpl<IAppResourceGroupInfoWatcherEventArgs,IAppResourceGroupInfoWatcherEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupInfoWatcherEventArgs?> =
        arrayOfNulls<IAppResourceGroupInfoWatcherEventArgs_Impl>(size) as
        Array<IAppResourceGroupInfoWatcherEventArgs?>
  }
}
