package Windows.Graphics.Holographic

import Windows.Foundation.Deferral
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

@ABIMarker(IHolographicSpaceCameraAddedEventArgs.ABI::class)
@Signature("{58f1da35-bbb3-3c8f-993d-6c80e7feb99f}")
@Guid("58f1da35bbb33c8f993d6c80e7feb99f")
@WinRTInterface("58f1da35bbb33c8f993d6c80e7feb99f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpaceCameraAddedEventArgs.ByReference::class)
public interface IHolographicSpaceCameraAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Camera(): HolographicCamera?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpaceCameraAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIHolographicSpaceCameraAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpaceCameraAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpaceCameraAddedEventArgs {
    public val __1769393689_Ptr: Pointer?

    public val _1769393689_VtblPtr: Pointer?
      get() = __1769393689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Camera(): HolographicCamera? {
      val fnPtr = _1769393689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicCamera>()
      val hr = fn.invokeHR(arrayOf(__1769393689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1769393689_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1769393689_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicSpaceCameraAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1769393689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpaceCameraAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58f1da35bbb33c8f993d6c80e7feb99f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpaceCameraAddedEventArgs(ptr: Pointer?): WithDefault =
        IHolographicSpaceCameraAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpaceCameraAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHolographicSpaceCameraAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpaceCameraAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1769393689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpaceCameraAddedEventArgs):
        Array<IHolographicSpaceCameraAddedEventArgs?> = (elements as
        Array<IHolographicSpaceCameraAddedEventArgs?>).castToImpl<IHolographicSpaceCameraAddedEventArgs,IHolographicSpaceCameraAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpaceCameraAddedEventArgs?> =
        arrayOfNulls<IHolographicSpaceCameraAddedEventArgs_Impl>(size) as
        Array<IHolographicSpaceCameraAddedEventArgs?>
  }
}
