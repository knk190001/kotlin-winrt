package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(ITargetApplicationChosenEventArgs.ABI::class)
@Signature("{ca6fb8ac-2987-4ee3-9c54-d8afbcb86c1d}")
@Guid("ca6fb8ac29874ee39c54d8afbcb86c1d")
@WinRTInterface("ca6fb8ac29874ee39c54d8afbcb86c1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetApplicationChosenEventArgs.ByReference::class)
public interface ITargetApplicationChosenEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ApplicationName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetApplicationChosenEventArgs> {
    public override fun getValue() =
        ABI.makeITargetApplicationChosenEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITargetApplicationChosenEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetApplicationChosenEventArgs {
    public val __1464256272_Ptr: Pointer?

    public val _1464256272_VtblPtr: Pointer?
      get() = __1464256272_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ApplicationName(): String? {
      val fnPtr = _1464256272_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1464256272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ITargetApplicationChosenEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1464256272_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetApplicationChosenEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca6fb8ac29874ee39c54d8afbcb86c1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetApplicationChosenEventArgs(ptr: Pointer?): WithDefault =
        ITargetApplicationChosenEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetApplicationChosenEventArgs {
      val address = segment.toRawLongValue()
      return makeITargetApplicationChosenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITargetApplicationChosenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1464256272_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetApplicationChosenEventArgs):
        Array<ITargetApplicationChosenEventArgs?> = (elements as
        Array<ITargetApplicationChosenEventArgs?>).castToImpl<ITargetApplicationChosenEventArgs,ITargetApplicationChosenEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetApplicationChosenEventArgs?> =
        arrayOfNulls<ITargetApplicationChosenEventArgs_Impl>(size) as
        Array<ITargetApplicationChosenEventArgs?>
  }
}
