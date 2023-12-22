package Windows.Graphics.Holographic

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

@ABIMarker(IHolographicSpaceCameraRemovedEventArgs.ABI::class)
@Signature("{805444a8-f2ae-322e-8da9-836a0a95a4c1}")
@Guid("805444a8f2ae322e8da9836a0a95a4c1")
@WinRTInterface("805444a8f2ae322e8da9836a0a95a4c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpaceCameraRemovedEventArgs.ByReference::class)
public interface IHolographicSpaceCameraRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Camera(): HolographicCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpaceCameraRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIHolographicSpaceCameraRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpaceCameraRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpaceCameraRemovedEventArgs {
    public val __1825117561_Ptr: Pointer?

    public val _1825117561_VtblPtr: Pointer?
      get() = __1825117561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Camera(): HolographicCamera? {
      val fnPtr = _1825117561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCamera>()
      val hr = fn.invokeHR(arrayOf(__1825117561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCamera>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicSpaceCameraRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1825117561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpaceCameraRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("805444a8f2ae322e8da9836a0a95a4c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpaceCameraRemovedEventArgs(ptr: Pointer?): WithDefault =
        IHolographicSpaceCameraRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHolographicSpaceCameraRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHolographicSpaceCameraRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpaceCameraRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1825117561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpaceCameraRemovedEventArgs):
        Array<IHolographicSpaceCameraRemovedEventArgs?> = (elements as
        Array<IHolographicSpaceCameraRemovedEventArgs?>).castToImpl<IHolographicSpaceCameraRemovedEventArgs,IHolographicSpaceCameraRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpaceCameraRemovedEventArgs?> =
        arrayOfNulls<IHolographicSpaceCameraRemovedEventArgs_Impl>(size) as
        Array<IHolographicSpaceCameraRemovedEventArgs?>
  }
}
