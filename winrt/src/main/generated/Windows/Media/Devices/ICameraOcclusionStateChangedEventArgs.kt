package Windows.Media.Devices

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

@ABIMarker(ICameraOcclusionStateChangedEventArgs.ABI::class)
@Signature("{8512d848-c0de-57ca-a1ca-fb2c3d23df55}")
@Guid("8512d848c0de57caa1cafb2c3d23df55")
@WinRTInterface("8512d848c0de57caa1cafb2c3d23df55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraOcclusionStateChangedEventArgs.ByReference::class)
public interface ICameraOcclusionStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): CameraOcclusionState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraOcclusionStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICameraOcclusionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICameraOcclusionStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraOcclusionStateChangedEventArgs {
    public val __2038500723_Ptr: Pointer?

    public val _2038500723_VtblPtr: Pointer?
      get() = __2038500723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): CameraOcclusionState? {
      val fnPtr = _2038500723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CameraOcclusionState>()
      val hr = fn.invokeHR(arrayOf(__2038500723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CameraOcclusionState>(result.getValue())
      return resultValue
    }
  }

  public class ICameraOcclusionStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2038500723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraOcclusionStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8512d848c0de57caa1cafb2c3d23df55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraOcclusionStateChangedEventArgs(ptr: Pointer?): WithDefault =
        ICameraOcclusionStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraOcclusionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICameraOcclusionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICameraOcclusionStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2038500723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraOcclusionStateChangedEventArgs):
        Array<ICameraOcclusionStateChangedEventArgs?> = (elements as
        Array<ICameraOcclusionStateChangedEventArgs?>).castToImpl<ICameraOcclusionStateChangedEventArgs,ICameraOcclusionStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraOcclusionStateChangedEventArgs?> =
        arrayOfNulls<ICameraOcclusionStateChangedEventArgs_Impl>(size) as
        Array<ICameraOcclusionStateChangedEventArgs?>
  }
}
