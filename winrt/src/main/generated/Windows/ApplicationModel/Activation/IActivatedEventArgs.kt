package Windows.ApplicationModel.Activation

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

@ABIMarker(IActivatedEventArgs.ABI::class)
@Signature("{cf651713-cd08-4fd8-b697-a281b6544e2e}")
@Guid("cf651713cd084fd8b697a281b6544e2e")
@WinRTInterface("cf651713cd084fd8b697a281b6544e2e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivatedEventArgs.ByReference::class)
public interface IActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): ActivationKind?

  @InterfaceMethod(1)
  public fun get_PreviousExecutionState(): ApplicationExecutionState?

  @InterfaceMethod(2)
  public fun get_SplashScreen(): SplashScreen?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivatedEventArgs> {
    public override fun getValue() = ABI.makeIActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivatedEventArgs {
    public val __1721660047_Ptr: Pointer?

    public val _1721660047_VtblPtr: Pointer?
      get() = __1721660047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): ActivationKind? {
      val fnPtr = _1721660047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivationKind>()
      val hr = fn.invokeHR(arrayOf(__1721660047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivationKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PreviousExecutionState(): ApplicationExecutionState? {
      val fnPtr = _1721660047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationExecutionState>()
      val hr = fn.invokeHR(arrayOf(__1721660047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationExecutionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SplashScreen(): SplashScreen? {
      val fnPtr = _1721660047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SplashScreen>()
      val hr = fn.invokeHR(arrayOf(__1721660047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SplashScreen>(result.getValue())
      return resultValue
    }
  }

  public class IActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1721660047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf651713cd084fd8b697a281b6544e2e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivatedEventArgs(ptr: Pointer?): WithDefault = IActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1721660047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivatedEventArgs): Array<IActivatedEventArgs?> =
        (elements as
        Array<IActivatedEventArgs?>).castToImpl<IActivatedEventArgs,IActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivatedEventArgs?> =
        arrayOfNulls<IActivatedEventArgs_Impl>(size) as Array<IActivatedEventArgs?>
  }
}
