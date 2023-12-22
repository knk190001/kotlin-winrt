package Windows.Devices.Display.Core

import Windows.Foundation.HResult
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

@ABIMarker(IDisplayManagerResultWithState.ABI::class)
@Signature("{8e656aa6-6614-54be-bfef-4994547f7be1}")
@Guid("8e656aa6661454bebfef4994547f7be1")
@WinRTInterface("8e656aa6661454bebfef4994547f7be1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManagerResultWithState.ByReference::class)
public interface IDisplayManagerResultWithState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorCode(): DisplayManagerResult?

  @InterfaceMethod(1)
  public fun get_ExtendedErrorCode(): HResult?

  @InterfaceMethod(2)
  public fun get_State(): DisplayState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManagerResultWithState> {
    public override fun getValue() = ABI.makeIDisplayManagerResultWithState(pointer.getPointer(0))

    public fun setValue(value: IDisplayManagerResultWithState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManagerResultWithState {
    public val __1270410367_Ptr: Pointer?

    public val _1270410367_VtblPtr: Pointer?
      get() = __1270410367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorCode(): DisplayManagerResult? {
      val fnPtr = _1270410367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResult>()
      val hr = fn.invokeHR(arrayOf(__1270410367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedErrorCode(): HResult? {
      val fnPtr = _1270410367_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1270410367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_State(): DisplayState? {
      val fnPtr = _1270410367_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayState>()
      val hr = fn.invokeHR(arrayOf(__1270410367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayState>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayManagerResultWithState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270410367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManagerResultWithState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e656aa6661454bebfef4994547f7be1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManagerResultWithState(ptr: Pointer?): WithDefault =
        IDisplayManagerResultWithState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayManagerResultWithState {
      val address = segment.toRawLongValue()
      return makeIDisplayManagerResultWithState(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManagerResultWithState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270410367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManagerResultWithState):
        Array<IDisplayManagerResultWithState?> = (elements as
        Array<IDisplayManagerResultWithState?>).castToImpl<IDisplayManagerResultWithState,IDisplayManagerResultWithState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManagerResultWithState?> =
        arrayOfNulls<IDisplayManagerResultWithState_Impl>(size) as
        Array<IDisplayManagerResultWithState?>
  }
}
