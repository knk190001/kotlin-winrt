package Windows.Security.Isolation

import Windows.Foundation.IAsyncAction
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IIsolatedWindowsEnvironmentProcess.ABI::class)
@Signature("{a858c3ef-8172-4f10-af93-cbe60af88d09}")
@Guid("a858c3ef81724f10af93cbe60af88d09")
@WinRTInterface("a858c3ef81724f10af93cbe60af88d09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentProcess.ByReference::class)
public interface IIsolatedWindowsEnvironmentProcess : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): IsolatedWindowsEnvironmentProcessState?

  @InterfaceMethod(1)
  public fun get_ExitCode(): WinDef.UINT

  @InterfaceMethod(2)
  public fun WaitForExit(): Unit

  @InterfaceMethod(3)
  public fun WaitForExitWithTimeout(timeoutMilliseconds: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun WaitForExitAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentProcess> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentProcess(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentProcess_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentProcess {
    public val __104570200_Ptr: Pointer?

    public val _104570200_VtblPtr: Pointer?
      get() = __104570200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): IsolatedWindowsEnvironmentProcessState? {
      val fnPtr = _104570200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentProcessState>()
      val hr = fn.invokeHR(arrayOf(__104570200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IsolatedWindowsEnvironmentProcessState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExitCode(): WinDef.UINT {
      val fnPtr = _104570200_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__104570200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun WaitForExit(): Unit {
      val fnPtr = _104570200_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104570200_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun WaitForExitWithTimeout(timeoutMilliseconds: WinDef.UINT): Unit {
      val fnPtr = _104570200_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__104570200_Ptr, timeoutMilliseconds,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun WaitForExitAsync(): IAsyncAction? {
      val fnPtr = _104570200_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__104570200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentProcess_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __104570200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentProcess, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a858c3ef81724f10af93cbe60af88d09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentProcess(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentProcess_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsolatedWindowsEnvironmentProcess {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentProcess(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentProcess): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__104570200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentProcess):
        Array<IIsolatedWindowsEnvironmentProcess?> = (elements as
        Array<IIsolatedWindowsEnvironmentProcess?>).castToImpl<IIsolatedWindowsEnvironmentProcess,IIsolatedWindowsEnvironmentProcess_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsolatedWindowsEnvironmentProcess?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentProcess_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentProcess?>
  }
}
