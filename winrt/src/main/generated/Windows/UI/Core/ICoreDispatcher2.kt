package Windows.UI.Core

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreDispatcher2.ABI::class)
@Signature("{6f5e63c7-e3aa-4eae-b0e0-dcf321ca4b2f}")
@Guid("6f5e63c7e3aa4eaeb0e0dcf321ca4b2f")
@WinRTInterface("6f5e63c7e3aa4eaeb0e0dcf321ca4b2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreDispatcher2.ByReference::class)
public interface ICoreDispatcher2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryRunAsync(priority: CoreDispatcherPriority?, agileCallback: DispatchedHandler?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun TryRunIdleAsync(agileCallback: IdleDispatchedHandler?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreDispatcher2> {
    public override fun getValue() = ABI.makeICoreDispatcher2(pointer.getPointer(0))

    public fun setValue(value: ICoreDispatcher2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreDispatcher2 {
    public val __1494339567_Ptr: Pointer?

    public val _1494339567_VtblPtr: Pointer?
      get() = __1494339567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryRunAsync(priority: CoreDispatcherPriority?,
        agileCallback: DispatchedHandler?): IAsyncOperation<Boolean>? {
      val fnPtr = _1494339567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1494339567_Ptr, marshalToNative(priority),
          marshalToNative(agileCallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryRunIdleAsync(agileCallback: IdleDispatchedHandler?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1494339567_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1494339567_Ptr, marshalToNative(agileCallback), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreDispatcher2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1494339567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreDispatcher2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f5e63c7e3aa4eaeb0e0dcf321ca4b2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreDispatcher2(ptr: Pointer?): WithDefault = ICoreDispatcher2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreDispatcher2 {
      val address = segment.toRawLongValue()
      return makeICoreDispatcher2(Pointer(address))
    }

    public override fun toNative(obj: ICoreDispatcher2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1494339567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreDispatcher2): Array<ICoreDispatcher2?> = (elements as
        Array<ICoreDispatcher2?>).castToImpl<ICoreDispatcher2,ICoreDispatcher2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreDispatcher2?> =
        arrayOfNulls<ICoreDispatcher2_Impl>(size) as Array<ICoreDispatcher2?>
  }
}
